package typingsSlinky.awsLambda.cloudformationCustomResourceMod

import typingsSlinky.awsLambda.awsLambdaStrings.FAILED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationCustomResourceFailedResponse
  extends CloudFormationCustomResourceResponseCommon
     with CloudFormationCustomResourceResponse {
  var Reason: String = js.native
  var Status: FAILED = js.native
}

object CloudFormationCustomResourceFailedResponse {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    Reason: String,
    RequestId: String,
    StackId: String,
    Status: FAILED
  ): CloudFormationCustomResourceFailedResponse = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceFailedResponse]
  }
  @scala.inline
  implicit class CloudFormationCustomResourceFailedResponseOps[Self <: CloudFormationCustomResourceFailedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: FAILED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

