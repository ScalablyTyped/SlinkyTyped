package typingsSlinky.materialDialog.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialDialog.materialDialogStrings.`mdc-dialog--animating`
import typingsSlinky.materialDialog.materialDialogStrings.`mdc-dialog--open`
import typingsSlinky.materialDialog.materialDialogStrings.`mdc-dialog-scroll-lock`
import typingsSlinky.materialDialog.materialDialogStrings.`mdc-dialog__backdrop`
import typingsSlinky.materialDialog.materialDialogStrings.`mdc-dialog__footer__button--accept`
import typingsSlinky.materialDialog.materialDialogStrings.`mdc-dialog__footer__button--cancel`
import typingsSlinky.materialDialog.materialDialogStrings.`mdc-dialog`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var ACCEPT_BTN: `mdc-dialog__footer__button--accept` = js.native
  var ANIMATING: `mdc-dialog--animating` = js.native
  var BACKDROP: `mdc-dialog__backdrop` = js.native
  var CANCEL_BTN: `mdc-dialog__footer__button--cancel` = js.native
  var OPEN: `mdc-dialog--open` = js.native
  var ROOT: `mdc-dialog` = js.native
  var SCROLL_LOCK: `mdc-dialog-scroll-lock` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    ACCEPT_BTN: `mdc-dialog__footer__button--accept`,
    ANIMATING: `mdc-dialog--animating`,
    BACKDROP: `mdc-dialog__backdrop`,
    CANCEL_BTN: `mdc-dialog__footer__button--cancel`,
    OPEN: `mdc-dialog--open`,
    ROOT: `mdc-dialog`,
    SCROLL_LOCK: `mdc-dialog-scroll-lock`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ACCEPT_BTN = ACCEPT_BTN.asInstanceOf[js.Any], ANIMATING = ANIMATING.asInstanceOf[js.Any], BACKDROP = BACKDROP.asInstanceOf[js.Any], CANCEL_BTN = CANCEL_BTN.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], SCROLL_LOCK = SCROLL_LOCK.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACCEPT_BTN(value: `mdc-dialog__footer__button--accept`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACCEPT_BTN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANIMATING(value: `mdc-dialog--animating`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBACKDROP(value: `mdc-dialog__backdrop`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BACKDROP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCANCEL_BTN(value: `mdc-dialog__footer__button--cancel`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CANCEL_BTN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN(value: `mdc-dialog--open`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT(value: `mdc-dialog`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCROLL_LOCK(value: `mdc-dialog-scroll-lock`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_LOCK")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

