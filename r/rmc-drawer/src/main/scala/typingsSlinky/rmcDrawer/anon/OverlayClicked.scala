package typingsSlinky.rmcDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayClicked extends js.Object {
  var overlayClicked: Boolean = js.native
}

object OverlayClicked {
  @scala.inline
  def apply(overlayClicked: Boolean): OverlayClicked = {
    val __obj = js.Dynamic.literal(overlayClicked = overlayClicked.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayClicked]
  }
  @scala.inline
  implicit class OverlayClickedOps[Self <: OverlayClicked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverlayClicked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClicked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

