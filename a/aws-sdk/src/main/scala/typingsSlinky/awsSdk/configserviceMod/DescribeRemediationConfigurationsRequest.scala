package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationConfigurationsRequest extends js.Object {
  /**
    * A list of AWS Config rule names of remediation configurations for which you want details. 
    */
  var ConfigRuleNames: typingsSlinky.awsSdk.configserviceMod.ConfigRuleNames = js.native
}

object DescribeRemediationConfigurationsRequest {
  @scala.inline
  def apply(ConfigRuleNames: ConfigRuleNames): DescribeRemediationConfigurationsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleNames = ConfigRuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationConfigurationsRequest]
  }
  @scala.inline
  implicit class DescribeRemediationConfigurationsRequestOps[Self <: DescribeRemediationConfigurationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigRuleNames(value: ConfigRuleNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

