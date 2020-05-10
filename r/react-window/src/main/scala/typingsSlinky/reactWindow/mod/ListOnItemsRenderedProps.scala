package typingsSlinky.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOnItemsRenderedProps extends js.Object {
  var overscanStartIndex: Double = js.native
  var overscanStopIndex: Double = js.native
  var visibleStartIndex: Double = js.native
  var visibleStopIndex: Double = js.native
}

object ListOnItemsRenderedProps {
  @scala.inline
  def apply(
    overscanStartIndex: Double,
    overscanStopIndex: Double,
    visibleStartIndex: Double,
    visibleStopIndex: Double
  ): ListOnItemsRenderedProps = {
    val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex.asInstanceOf[js.Any], overscanStopIndex = overscanStopIndex.asInstanceOf[js.Any], visibleStartIndex = visibleStartIndex.asInstanceOf[js.Any], visibleStopIndex = visibleStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOnItemsRenderedProps]
  }
  @scala.inline
  implicit class ListOnItemsRenderedPropsOps[Self <: ListOnItemsRenderedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverscanStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverscanStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleStopIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

