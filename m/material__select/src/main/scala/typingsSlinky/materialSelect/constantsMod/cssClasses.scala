package typingsSlinky.materialSelect.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialSelect.materialSelectStrings.`mdc-select--box`
import typingsSlinky.materialSelect.materialSelectStrings.`mdc-select--disabled`
import typingsSlinky.materialSelect.materialSelectStrings.`mdc-select`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var BOX: `mdc-select--box` = js.native
  var DISABLED: `mdc-select--disabled` = js.native
  var ROOT: `mdc-select` = js.native
}

object cssClasses {
  @scala.inline
  def apply(BOX: `mdc-select--box`, DISABLED: `mdc-select--disabled`, ROOT: `mdc-select`): cssClasses = {
    val __obj = js.Dynamic.literal(BOX = BOX.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBOX(value: `mdc-select--box`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISABLED(value: `mdc-select--disabled`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT(value: `mdc-select`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

