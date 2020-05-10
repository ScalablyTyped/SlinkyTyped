package typingsSlinky.rbx.overlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayHelpersProps extends js.Object {
  var overlay: js.UndefOr[Boolean] = js.native
}

object OverlayHelpersProps {
  @scala.inline
  def apply(): OverlayHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayHelpersProps]
  }
  @scala.inline
  implicit class OverlayHelpersPropsOps[Self <: OverlayHelpersProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
  }
  
}

