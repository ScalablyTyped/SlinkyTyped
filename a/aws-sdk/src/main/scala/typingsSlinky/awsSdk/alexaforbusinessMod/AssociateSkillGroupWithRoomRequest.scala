package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateSkillGroupWithRoomRequest extends js.Object {
  /**
    * The ARN of the room with which to associate the skill group. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the skill group to associate with a room. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
}

object AssociateSkillGroupWithRoomRequest {
  @scala.inline
  def apply(): AssociateSkillGroupWithRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateSkillGroupWithRoomRequest]
  }
  @scala.inline
  implicit class AssociateSkillGroupWithRoomRequestOps[Self <: AssociateSkillGroupWithRoomRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoomArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSkillGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroupArn")(js.undefined)
        ret
    }
  }
  
}

