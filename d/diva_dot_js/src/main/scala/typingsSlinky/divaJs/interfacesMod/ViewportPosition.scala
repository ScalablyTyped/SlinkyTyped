package typingsSlinky.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportPosition extends js.Object {
  var anchorPage: Boolean = js.native
  var horizontalOffset: Double = js.native
  var verticalOffset: Double = js.native
  var zoomLevel: Null | Double = js.native
}

object ViewportPosition {
  @scala.inline
  def apply(anchorPage: Boolean, horizontalOffset: Double, verticalOffset: Double): ViewportPosition = {
    val __obj = js.Dynamic.literal(anchorPage = anchorPage.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], verticalOffset = verticalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportPosition]
  }
  @scala.inline
  implicit class ViewportPositionOps[Self <: ViewportPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomLevelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(null)
        ret
    }
  }
  
}

