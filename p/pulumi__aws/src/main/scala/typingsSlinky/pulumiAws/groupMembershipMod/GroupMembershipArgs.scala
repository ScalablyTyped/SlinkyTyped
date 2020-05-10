package typingsSlinky.pulumiAws.groupMembershipMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMembershipArgs extends js.Object {
  /**
    * The IAM Group name to attach the list of `users` to
    */
  val group: Input[String] = js.native
  /**
    * The name to identify the Group Membership
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of IAM User names to associate with the Group
    */
  val users: Input[js.Array[Input[String]]] = js.native
}

object GroupMembershipArgs {
  @scala.inline
  def apply(group: Input[String], users: Input[js.Array[Input[String]]]): GroupMembershipArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMembershipArgs]
  }
  @scala.inline
  implicit class GroupMembershipArgsOps[Self <: GroupMembershipArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

