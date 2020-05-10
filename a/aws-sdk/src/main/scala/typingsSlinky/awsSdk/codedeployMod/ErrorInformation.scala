package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorInformation extends js.Object {
  /**
    * For more information, see Error Codes for AWS CodeDeploy in the AWS CodeDeploy User Guide. The error code:   APPLICATION_MISSING: The application was missing. This error code is most likely raised if the application is deleted after the deployment is created, but before it is started.   DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code is most likely raised if the deployment group is deleted after the deployment is created, but before it is started.   HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the instance health constraints specified.   HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health constraints specified.   IAM_ROLE_MISSING: The service role cannot be accessed.   IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.   INTERNAL_ERROR: There was an internal error.   NO_EC2_SUBSCRIPTION: The calling account is not subscribed to Amazon EC2.   NO_INSTANCES: No instances were specified, or no instances can be found.   OVER_MAX_INSTANCES: The maximum number of instances was exceeded.   THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one or more AWS services.   TIMEOUT: The deployment has timed out.   REVISION_MISSING: The revision ID was missing. This error code is most likely raised if the revision is deleted after the deployment is created, but before it is started.  
    */
  var code: js.UndefOr[ErrorCode] = js.native
  /**
    * An accompanying error message.
    */
  var message: js.UndefOr[ErrorMessage] = js.native
}

object ErrorInformation {
  @scala.inline
  def apply(): ErrorInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorInformation]
  }
  @scala.inline
  implicit class ErrorInformationOps[Self <: ErrorInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

