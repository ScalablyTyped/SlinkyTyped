package typingsSlinky.rbx.panelBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelBlockModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
}

object PanelBlockModifierProps {
  @scala.inline
  def apply(): PanelBlockModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelBlockModifierProps]
  }
  @scala.inline
  implicit class PanelBlockModifierPropsOps[Self <: PanelBlockModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
  }
  
}

