package typingsSlinky.materialTextfield.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTextfield.materialTextfieldStrings.`mdc-text-field--box`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`mdc-text-field--dense`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`mdc-text-field--disabled`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`mdc-text-field--focused`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`mdc-text-field--invalid`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`mdc-text-field--outlined`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`mdc-text-field--upgraded`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`mdc-text-field`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var BOX: `mdc-text-field--box` = js.native
  var DENSE: `mdc-text-field--dense` = js.native
  var DISABLED: `mdc-text-field--disabled` = js.native
  var FOCUSED: `mdc-text-field--focused` = js.native
  var INVALID: `mdc-text-field--invalid` = js.native
  var OUTLINED: `mdc-text-field--outlined` = js.native
  var ROOT: `mdc-text-field` = js.native
  var UPGRADED: `mdc-text-field--upgraded` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    BOX: `mdc-text-field--box`,
    DENSE: `mdc-text-field--dense`,
    DISABLED: `mdc-text-field--disabled`,
    FOCUSED: `mdc-text-field--focused`,
    INVALID: `mdc-text-field--invalid`,
    OUTLINED: `mdc-text-field--outlined`,
    ROOT: `mdc-text-field`,
    UPGRADED: `mdc-text-field--upgraded`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(BOX = BOX.asInstanceOf[js.Any], DENSE = DENSE.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], FOCUSED = FOCUSED.asInstanceOf[js.Any], INVALID = INVALID.asInstanceOf[js.Any], OUTLINED = OUTLINED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], UPGRADED = UPGRADED.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBOX(value: `mdc-text-field--box`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDENSE(value: `mdc-text-field--dense`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DENSE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISABLED(value: `mdc-text-field--disabled`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFOCUSED(value: `mdc-text-field--focused`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FOCUSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINVALID(value: `mdc-text-field--invalid`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INVALID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOUTLINED(value: `mdc-text-field--outlined`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OUTLINED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT(value: `mdc-text-field`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPGRADED(value: `mdc-text-field--upgraded`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPGRADED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

