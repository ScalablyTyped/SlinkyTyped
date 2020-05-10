package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAMPolicyAssignment extends js.Object {
  /**
    * Assignment ID.
    */
  var AssignmentId: js.UndefOr[String] = js.native
  /**
    * Assignment name.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  /**
    * Assignment status.
    */
  var AssignmentStatus: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AssignmentStatus] = js.native
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AwsAccountId] = js.native
  /**
    * Identities.
    */
  var Identities: js.UndefOr[IdentityMap] = js.native
  /**
    * The Amazon Resource Name (ARN) for the IAM policy.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
}

object IAMPolicyAssignment {
  @scala.inline
  def apply(): IAMPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAMPolicyAssignment]
  }
  @scala.inline
  implicit class IAMPolicyAssignmentOps[Self <: IAMPolicyAssignment] (val x: Self) extends AnyVal {
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
    def withAwsAccountId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(js.undefined)
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

