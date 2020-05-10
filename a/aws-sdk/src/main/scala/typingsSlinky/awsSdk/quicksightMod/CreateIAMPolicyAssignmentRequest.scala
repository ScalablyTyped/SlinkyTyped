package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIAMPolicyAssignmentRequest extends js.Object {
  /**
    * The name of the assignment. It must be unique within an AWS account.
    */
  var AssignmentName: IAMPolicyAssignmentName = js.native
  /**
    * The status of the assignment. Possible values are as follows:    ENABLED - Anything specified in this assignment is used when creating the data source.    DISABLED - This assignment isn't used when creating the data source.    DRAFT - This assignment is an unfinished draft and isn't used when creating the data source.  
    */
  var AssignmentStatus: typingsSlinky.awsSdk.quicksightMod.AssignmentStatus = js.native
  /**
    * The ID of the AWS account where you want to assign an IAM policy to QuickSight users or groups.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The QuickSight users, groups, or both that you want to assign the policy to.
    */
  var Identities: js.UndefOr[IdentityMap] = js.native
  /**
    * The namespace that contains the assignment.
    */
  var Namespace: typingsSlinky.awsSdk.quicksightMod.Namespace = js.native
  /**
    * The ARN for the IAM policy to apply to the QuickSight users and groups specified in this assignment.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
}

object CreateIAMPolicyAssignmentRequest {
  @scala.inline
  def apply(
    AssignmentName: IAMPolicyAssignmentName,
    AssignmentStatus: AssignmentStatus,
    AwsAccountId: AwsAccountId,
    Namespace: Namespace
  ): CreateIAMPolicyAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentName = AssignmentName.asInstanceOf[js.Any], AssignmentStatus = AssignmentStatus.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIAMPolicyAssignmentRequest]
  }
  @scala.inline
  implicit class CreateIAMPolicyAssignmentRequestOps[Self <: CreateIAMPolicyAssignmentRequest] (val x: Self) extends AnyVal {
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
    def withAssignmentStatus(value: AssignmentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentStatus")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withIdentities(value: IdentityMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identities")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyArn")(js.undefined)
        ret
    }
  }
  
}

