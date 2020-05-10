package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRemediationExecutionRequest extends js.Object {
  /**
    * The list of names of AWS Config rules that you want to run remediation execution for.
    */
  var ConfigRuleName: typingsSlinky.awsSdk.configserviceMod.ConfigRuleName = js.native
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID. 
    */
  var ResourceKeys: typingsSlinky.awsSdk.configserviceMod.ResourceKeys = js.native
}

object StartRemediationExecutionRequest {
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName, ResourceKeys: ResourceKeys): StartRemediationExecutionRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceKeys = ResourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRemediationExecutionRequest]
  }
  @scala.inline
  implicit class StartRemediationExecutionRequestOps[Self <: StartRemediationExecutionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigRuleName(value: ConfigRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceKeys(value: ResourceKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

