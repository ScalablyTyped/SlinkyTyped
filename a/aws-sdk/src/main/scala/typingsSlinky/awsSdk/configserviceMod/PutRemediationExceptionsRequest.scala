package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRemediationExceptionsRequest extends js.Object {
  /**
    * The name of the AWS Config rule for which you want to create remediation exception.
    */
  var ConfigRuleName: typingsSlinky.awsSdk.configserviceMod.ConfigRuleName = js.native
  /**
    * The exception is automatically deleted after the expiration date.
    */
  var ExpirationTime: js.UndefOr[js.Date] = js.native
  /**
    * The message contains an explanation of the exception.
    */
  var Message: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys. 
    */
  var ResourceKeys: RemediationExceptionResourceKeys = js.native
}

object PutRemediationExceptionsRequest {
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName, ResourceKeys: RemediationExceptionResourceKeys): PutRemediationExceptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceKeys = ResourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRemediationExceptionsRequest]
  }
  @scala.inline
  implicit class PutRemediationExceptionsRequestOps[Self <: PutRemediationExceptionsRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withExpirationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: StringWithCharLimit1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

