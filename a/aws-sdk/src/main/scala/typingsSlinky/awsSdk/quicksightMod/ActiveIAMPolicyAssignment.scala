package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveIAMPolicyAssignment extends js.Object {
  /**
    * A name for the IAM policy assignment.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
}

object ActiveIAMPolicyAssignment {
  @scala.inline
  def apply(): ActiveIAMPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveIAMPolicyAssignment]
  }
  @scala.inline
  implicit class ActiveIAMPolicyAssignmentOps[Self <: ActiveIAMPolicyAssignment] (val x: Self) extends AnyVal {
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
    def withoutAssignmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentName")(js.undefined)
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

