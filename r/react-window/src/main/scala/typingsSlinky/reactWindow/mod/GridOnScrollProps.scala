package typingsSlinky.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOnScrollProps extends js.Object {
  var horizontalScrollDirection: ScrollDirection = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  var scrollUpdateWasRequested: Boolean = js.native
  var verticalScrollDirection: ScrollDirection = js.native
}

object GridOnScrollProps {
  @scala.inline
  def apply(
    horizontalScrollDirection: ScrollDirection,
    scrollLeft: Double,
    scrollTop: Double,
    scrollUpdateWasRequested: Boolean,
    verticalScrollDirection: ScrollDirection
  ): GridOnScrollProps = {
    val __obj = js.Dynamic.literal(horizontalScrollDirection = horizontalScrollDirection.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollUpdateWasRequested = scrollUpdateWasRequested.asInstanceOf[js.Any], verticalScrollDirection = verticalScrollDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOnScrollProps]
  }
  @scala.inline
  implicit class GridOnScrollPropsOps[Self <: GridOnScrollProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalScrollDirection(value: ScrollDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalScrollDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollUpdateWasRequested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollUpdateWasRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalScrollDirection(value: ScrollDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScrollDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

