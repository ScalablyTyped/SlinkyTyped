package typingsSlinky.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOnScrollProps extends js.Object {
  var scrollDirection: ScrollDirection = js.native
  var scrollOffset: Double = js.native
  var scrollUpdateWasRequested: Boolean = js.native
}

object ListOnScrollProps {
  @scala.inline
  def apply(scrollDirection: ScrollDirection, scrollOffset: Double, scrollUpdateWasRequested: Boolean): ListOnScrollProps = {
    val __obj = js.Dynamic.literal(scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollUpdateWasRequested = scrollUpdateWasRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOnScrollProps]
  }
  @scala.inline
  implicit class ListOnScrollPropsOps[Self <: ListOnScrollProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollDirection(value: ScrollDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollUpdateWasRequested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollUpdateWasRequested")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

