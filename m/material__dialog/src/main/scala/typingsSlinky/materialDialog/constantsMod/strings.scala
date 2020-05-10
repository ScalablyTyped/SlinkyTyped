package typingsSlinky.materialDialog.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialDialog.materialDialogStrings.MDCDialogColonaccept
import typingsSlinky.materialDialog.materialDialogStrings.MDCDialogColoncancel
import typingsSlinky.materialDialog.materialDialogStrings.`Dotmdc-dialog--open`
import typingsSlinky.materialDialog.materialDialogStrings.`Dotmdc-dialog__footer__button--accept`
import typingsSlinky.materialDialog.materialDialogStrings.`Dotmdc-dialog__surface`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var ACCEPT_EVENT: MDCDialogColonaccept = js.native
  var ACCEPT_SELECTOR: `Dotmdc-dialog__footer__button--accept` = js.native
  var CANCEL_EVENT: MDCDialogColoncancel = js.native
  var DIALOG_SURFACE_SELECTOR: `Dotmdc-dialog__surface` = js.native
  var OPEN_DIALOG_SELECTOR: `Dotmdc-dialog--open` = js.native
}

object strings {
  @scala.inline
  def apply(
    ACCEPT_EVENT: MDCDialogColonaccept,
    ACCEPT_SELECTOR: `Dotmdc-dialog__footer__button--accept`,
    CANCEL_EVENT: MDCDialogColoncancel,
    DIALOG_SURFACE_SELECTOR: `Dotmdc-dialog__surface`,
    OPEN_DIALOG_SELECTOR: `Dotmdc-dialog--open`
  ): strings = {
    val __obj = js.Dynamic.literal(ACCEPT_EVENT = ACCEPT_EVENT.asInstanceOf[js.Any], ACCEPT_SELECTOR = ACCEPT_SELECTOR.asInstanceOf[js.Any], CANCEL_EVENT = CANCEL_EVENT.asInstanceOf[js.Any], DIALOG_SURFACE_SELECTOR = DIALOG_SURFACE_SELECTOR.asInstanceOf[js.Any], OPEN_DIALOG_SELECTOR = OPEN_DIALOG_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACCEPT_EVENT(value: MDCDialogColonaccept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACCEPT_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withACCEPT_SELECTOR(value: `Dotmdc-dialog__footer__button--accept`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACCEPT_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCANCEL_EVENT(value: MDCDialogColoncancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CANCEL_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDIALOG_SURFACE_SELECTOR(value: `Dotmdc-dialog__surface`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIALOG_SURFACE_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN_DIALOG_SELECTOR(value: `Dotmdc-dialog--open`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN_DIALOG_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

