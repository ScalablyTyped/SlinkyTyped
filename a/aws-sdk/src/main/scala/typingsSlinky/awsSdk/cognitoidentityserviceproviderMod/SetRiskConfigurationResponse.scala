package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRiskConfigurationResponse extends js.Object {
  /**
    * The risk configuration.
    */
  var RiskConfiguration: RiskConfigurationType = js.native
}

object SetRiskConfigurationResponse {
  @scala.inline
  def apply(RiskConfiguration: RiskConfigurationType): SetRiskConfigurationResponse = {
    val __obj = js.Dynamic.literal(RiskConfiguration = RiskConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRiskConfigurationResponse]
  }
  @scala.inline
  implicit class SetRiskConfigurationResponseOps[Self <: SetRiskConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRiskConfiguration(value: RiskConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RiskConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

