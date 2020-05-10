package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIAMPolicyAssignmentResponse extends js.Object {
  /**
    * The ID of the assignment.
    */
  var AssignmentId: js.UndefOr[String] = js.native
  /**
    * The name of the assignment. 
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  /**
    * The status of the assignment. Possible values are as follows:    ENABLED - Anything specified in this assignment is used when creating the data source.    DISABLED - This assignment isn't used when creating the data source.    DRAFT - This assignment is an unfinished draft and isn't used when creating the data source.  
    */
  var AssignmentStatus: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AssignmentStatus] = js.native
  /**
    * The QuickSight users, groups, or both that the IAM policy is assigned to.
    */
  var Identities: js.UndefOr[IdentityMap] = js.native
  /**
    * The ARN for the IAM policy applied to the QuickSight users and groups specified in this assignment.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object UpdateIAMPolicyAssignmentResponse {
  @scala.inline
  def apply(): UpdateIAMPolicyAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateIAMPolicyAssignmentResponse]
  }
  @scala.inline
  implicit class UpdateIAMPolicyAssignmentResponseOps[Self <: UpdateIAMPolicyAssignmentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentName(value: IAMPolicyAssignmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentStatus(value: AssignmentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentStatus")(js.undefined)
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
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: StatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

