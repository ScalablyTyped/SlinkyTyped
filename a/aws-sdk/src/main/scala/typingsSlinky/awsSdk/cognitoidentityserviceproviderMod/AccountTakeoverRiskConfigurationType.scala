package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountTakeoverRiskConfigurationType extends js.Object {
  /**
    * Account takeover risk configuration actions
    */
  var Actions: AccountTakeoverActionsType = js.native
  /**
    * The notify configuration used to construct email notifications.
    */
  var NotifyConfiguration: js.UndefOr[NotifyConfigurationType] = js.native
}

object AccountTakeoverRiskConfigurationType {
  @scala.inline
  def apply(Actions: AccountTakeoverActionsType): AccountTakeoverRiskConfigurationType = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTakeoverRiskConfigurationType]
  }
  @scala.inline
  implicit class AccountTakeoverRiskConfigurationTypeOps[Self <: AccountTakeoverRiskConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: AccountTakeoverActionsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifyConfiguration(value: NotifyConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotifyConfiguration")(js.undefined)
        ret
    }
  }
  
}

