package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRiskConfigurationRequest extends js.Object {
  /**
    * The account takeover risk configuration.
    */
  var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.native
  /**
    * The app client ID. If ClientId is null, then the risk configuration is mapped to userPoolId. When the client ID is null, the same risk configuration is applied to all the clients in the userPool. Otherwise, ClientId is mapped to the client. When the client ID is not null, the user pool configuration is overridden and the risk configuration for the client is used instead.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  /**
    * The compromised credentials risk configuration.
    */
  var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.native
  /**
    * The configuration to override the risk decision.
    */
  var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.native
  /**
    * The user pool ID. 
    */
  var UserPoolId: UserPoolIdType = js.native
}

object SetRiskConfigurationRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): SetRiskConfigurationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRiskConfigurationRequest]
  }
  @scala.inline
  implicit class SetRiskConfigurationRequestOps[Self <: SetRiskConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

