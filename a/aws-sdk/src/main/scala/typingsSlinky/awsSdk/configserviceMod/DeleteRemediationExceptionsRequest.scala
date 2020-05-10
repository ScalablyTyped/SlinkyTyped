package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRemediationExceptionsRequest extends js.Object {
  /**
    * The name of the AWS Config rule for which you want to delete remediation exception configuration.
    */
  var ConfigRuleName: typingsSlinky.awsSdk.configserviceMod.ConfigRuleName = js.native
  /**
    * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys. 
    */
  var ResourceKeys: RemediationExceptionResourceKeys = js.native
}

object DeleteRemediationExceptionsRequest {
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName, ResourceKeys: RemediationExceptionResourceKeys): DeleteRemediationExceptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceKeys = ResourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRemediationExceptionsRequest]
  }
  @scala.inline
  implicit class DeleteRemediationExceptionsRequestOps[Self <: DeleteRemediationExceptionsRequest] (val x: Self) extends AnyVal {
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
    def withResourceKeys(value: RemediationExceptionResourceKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

