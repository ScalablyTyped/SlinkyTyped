package typingsSlinky.materialSnackbar.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialSnackbar.materialSnackbarStrings.MDCSnackbarColonhide
import typingsSlinky.materialSnackbar.materialSnackbarStrings.MDCSnackbarColonshow
import typingsSlinky.materialSnackbar.materialSnackbarStrings.`Dotmdc-snackbar__action-button`
import typingsSlinky.materialSnackbar.materialSnackbarStrings.`Dotmdc-snackbar__action-wrapper`
import typingsSlinky.materialSnackbar.materialSnackbarStrings.`Dotmdc-snackbar__text`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var ACTION_BUTTON_SELECTOR: `Dotmdc-snackbar__action-button` = js.native
  var ACTION_WRAPPER_SELECTOR: `Dotmdc-snackbar__action-wrapper` = js.native
  var HIDE_EVENT: MDCSnackbarColonhide = js.native
  var SHOW_EVENT: MDCSnackbarColonshow = js.native
  var TEXT_SELECTOR: `Dotmdc-snackbar__text` = js.native
}

object strings {
  @scala.inline
  def apply(
    ACTION_BUTTON_SELECTOR: `Dotmdc-snackbar__action-button`,
    ACTION_WRAPPER_SELECTOR: `Dotmdc-snackbar__action-wrapper`,
    HIDE_EVENT: MDCSnackbarColonhide,
    SHOW_EVENT: MDCSnackbarColonshow,
    TEXT_SELECTOR: `Dotmdc-snackbar__text`
  ): strings = {
    val __obj = js.Dynamic.literal(ACTION_BUTTON_SELECTOR = ACTION_BUTTON_SELECTOR.asInstanceOf[js.Any], ACTION_WRAPPER_SELECTOR = ACTION_WRAPPER_SELECTOR.asInstanceOf[js.Any], HIDE_EVENT = HIDE_EVENT.asInstanceOf[js.Any], SHOW_EVENT = SHOW_EVENT.asInstanceOf[js.Any], TEXT_SELECTOR = TEXT_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACTION_BUTTON_SELECTOR(value: `Dotmdc-snackbar__action-button`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTION_BUTTON_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withACTION_WRAPPER_SELECTOR(value: `Dotmdc-snackbar__action-wrapper`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTION_WRAPPER_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHIDE_EVENT(value: MDCSnackbarColonhide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HIDE_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHOW_EVENT(value: MDCSnackbarColonshow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHOW_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTEXT_SELECTOR(value: `Dotmdc-snackbar__text`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

