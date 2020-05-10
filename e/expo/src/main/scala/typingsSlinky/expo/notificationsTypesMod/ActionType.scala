package typingsSlinky.expo.notificationsTypesMod

import typingsSlinky.expo.AnonPlaceholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionType extends js.Object {
  var actionId: String = js.native
  var buttonTitle: String = js.native
  var doNotOpenInForeground: js.UndefOr[Boolean] = js.native
  var isAuthenticationRequired: js.UndefOr[Boolean] = js.native
  var isDestructive: js.UndefOr[Boolean] = js.native
  var textInput: js.UndefOr[AnonPlaceholder] = js.native
}

object ActionType {
  @scala.inline
  def apply(actionId: String, buttonTitle: String): ActionType = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], buttonTitle = buttonTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionType]
  }
  @scala.inline
  implicit class ActionTypeOps[Self <: ActionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoNotOpenInForeground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotOpenInForeground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotOpenInForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotOpenInForeground")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAuthenticationRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuthenticationRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAuthenticationRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuthenticationRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDestructive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDestructive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDestructive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDestructive")(js.undefined)
        ret
    }
    @scala.inline
    def withTextInput(value: AnonPlaceholder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInput")(js.undefined)
        ret
    }
  }
  
}

