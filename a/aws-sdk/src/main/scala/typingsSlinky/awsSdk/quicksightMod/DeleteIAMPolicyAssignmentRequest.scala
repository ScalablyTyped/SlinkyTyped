package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIAMPolicyAssignmentRequest extends js.Object {
  /**
    * The name of the assignment. 
    */
  var AssignmentName: IAMPolicyAssignmentName = js.native
  /**
    * The AWS account ID where you want to delete the IAM policy assignment.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The namespace that contains the assignment.
    */
  var Namespace: typingsSlinky.awsSdk.quicksightMod.Namespace = js.native
}

object DeleteIAMPolicyAssignmentRequest {
  @scala.inline
  def apply(AssignmentName: IAMPolicyAssignmentName, AwsAccountId: AwsAccountId, Namespace: Namespace): DeleteIAMPolicyAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentName = AssignmentName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIAMPolicyAssignmentRequest]
  }
  @scala.inline
  implicit class DeleteIAMPolicyAssignmentRequestOps[Self <: DeleteIAMPolicyAssignmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignmentName(value: IAMPolicyAssignmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAwsAccountId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: Namespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

