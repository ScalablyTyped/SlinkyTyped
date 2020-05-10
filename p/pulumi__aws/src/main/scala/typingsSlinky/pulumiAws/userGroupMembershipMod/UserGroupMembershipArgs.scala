package typingsSlinky.pulumiAws.userGroupMembershipMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserGroupMembershipArgs extends js.Object {
  /**
    * A list of [IAM Groups][1] to add the user to
    */
  val groups: Input[js.Array[Input[String]]] = js.native
  /**
    * The name of the [IAM User][2] to add to groups
    */
  val user: Input[String] = js.native
}

object UserGroupMembershipArgs {
  @scala.inline
  def apply(groups: Input[js.Array[Input[String]]], user: Input[String]): UserGroupMembershipArgs = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGroupMembershipArgs]
  }
  @scala.inline
  implicit class UserGroupMembershipArgsOps[Self <: UserGroupMembershipArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

