package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiskConfigurationType extends js.Object {
  /**
    * The account takeover risk configuration object including the NotifyConfiguration object and Actions to take in the case of an account takeover.
    */
  var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.native
  /**
    * The app client ID.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  /**
    * The compromised credentials risk configuration object including the EventFilter and the EventAction 
    */
  var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.native
  /**
    * The last modified date.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The configuration to override the risk decision.
    */
  var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object RiskConfigurationType {
  @scala.inline
  def apply(): RiskConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskConfigurationType]
  }
  @scala.inline
  implicit class RiskConfigurationTypeOps[Self <: RiskConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountTakeoverRiskConfiguration(value: AccountTakeoverRiskConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountTakeoverRiskConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountTakeoverRiskConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountTakeoverRiskConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: ClientIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withCompromisedCredentialsRiskConfiguration(value: CompromisedCredentialsRiskConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompromisedCredentialsRiskConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompromisedCredentialsRiskConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompromisedCredentialsRiskConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskExceptionConfiguration(value: RiskExceptionConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RiskExceptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskExceptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RiskExceptionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(js.undefined)
        ret
    }
  }
  
}

