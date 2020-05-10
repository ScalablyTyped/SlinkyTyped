package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupMembershipRequest extends js.Object {
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The name of the group that you want to add the user to.
    */
  var GroupName: typingsSlinky.awsSdk.quicksightMod.GroupName = js.native
  /**
    * The name of the user that you want to add to the group membership.
    */
  var MemberName: GroupMemberName = js.native
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typingsSlinky.awsSdk.quicksightMod.Namespace = js.native
}

object CreateGroupMembershipRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    GroupName: GroupName,
    MemberName: GroupMemberName,
    Namespace: Namespace
  ): CreateGroupMembershipRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], MemberName = MemberName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupMembershipRequest]
  }
  @scala.inline
  implicit class CreateGroupMembershipRequestOps[Self <: CreateGroupMembershipRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupName(value: GroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberName(value: GroupMemberName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberName")(value.asInstanceOf[js.Any])
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

