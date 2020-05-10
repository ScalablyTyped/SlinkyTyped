package typingsSlinky.materialIconToggle.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialIconToggle.materialIconToggleStrings.`mdc-icon-toggle--disabled`
import typingsSlinky.materialIconToggle.materialIconToggleStrings.`mdc-icon-toggle`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var DISABLED: `mdc-icon-toggle--disabled` = js.native
  var ROOT: `mdc-icon-toggle` = js.native
}

object cssClasses {
  @scala.inline
  def apply(DISABLED: `mdc-icon-toggle--disabled`, ROOT: `mdc-icon-toggle`): cssClasses = {
    val __obj = js.Dynamic.literal(DISABLED = DISABLED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDISABLED(value: `mdc-icon-toggle--disabled`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT(value: `mdc-icon-toggle`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

