package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMember extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the group member (user).
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The name of the group member (user).
    */
  var MemberName: js.UndefOr[GroupMemberName] = js.native
}

object GroupMember {
  @scala.inline
  def apply(): GroupMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupMember]
  }
  @scala.inline
  implicit class GroupMemberOps[Self <: GroupMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberName(value: GroupMemberName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberName")(js.undefined)
        ret
    }
  }
  
}

