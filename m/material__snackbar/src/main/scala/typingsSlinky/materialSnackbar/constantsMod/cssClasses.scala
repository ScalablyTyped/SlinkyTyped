package typingsSlinky.materialSnackbar.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialSnackbar.materialSnackbarStrings.`mdc-snackbar--action-on-bottom`
import typingsSlinky.materialSnackbar.materialSnackbarStrings.`mdc-snackbar--active`
import typingsSlinky.materialSnackbar.materialSnackbarStrings.`mdc-snackbar--multiline`
import typingsSlinky.materialSnackbar.materialSnackbarStrings.`mdc-snackbar__action-button`
import typingsSlinky.materialSnackbar.materialSnackbarStrings.`mdc-snackbar__action-wrapper`
import typingsSlinky.materialSnackbar.materialSnackbarStrings.`mdc-snackbar__text`
import typingsSlinky.materialSnackbar.materialSnackbarStrings.`mdc-snackbar`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var ACTION_BUTTON: `mdc-snackbar__action-button` = js.native
  var ACTION_ON_BOTTOM: `mdc-snackbar--action-on-bottom` = js.native
  var ACTION_WRAPPER: `mdc-snackbar__action-wrapper` = js.native
  var ACTIVE: `mdc-snackbar--active` = js.native
  var MULTILINE: `mdc-snackbar--multiline` = js.native
  var ROOT: `mdc-snackbar` = js.native
  var TEXT: `mdc-snackbar__text` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    ACTION_BUTTON: `mdc-snackbar__action-button`,
    ACTION_ON_BOTTOM: `mdc-snackbar--action-on-bottom`,
    ACTION_WRAPPER: `mdc-snackbar__action-wrapper`,
    ACTIVE: `mdc-snackbar--active`,
    MULTILINE: `mdc-snackbar--multiline`,
    ROOT: `mdc-snackbar`,
    TEXT: `mdc-snackbar__text`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ACTION_BUTTON = ACTION_BUTTON.asInstanceOf[js.Any], ACTION_ON_BOTTOM = ACTION_ON_BOTTOM.asInstanceOf[js.Any], ACTION_WRAPPER = ACTION_WRAPPER.asInstanceOf[js.Any], ACTIVE = ACTIVE.asInstanceOf[js.Any], MULTILINE = MULTILINE.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], TEXT = TEXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACTION_BUTTON(value: `mdc-snackbar__action-button`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTION_BUTTON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withACTION_ON_BOTTOM(value: `mdc-snackbar--action-on-bottom`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTION_ON_BOTTOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withACTION_WRAPPER(value: `mdc-snackbar__action-wrapper`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTION_WRAPPER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withACTIVE(value: `mdc-snackbar--active`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMULTILINE(value: `mdc-snackbar--multiline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MULTILINE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT(value: `mdc-snackbar`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTEXT(value: `mdc-snackbar__text`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEXT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

