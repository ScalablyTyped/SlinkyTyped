package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRoomSkillParameterRequest extends js.Object {
  /**
    * The room skill parameter key for which to remove details.
    */
  var ParameterKey: RoomSkillParameterKey = js.native
  /**
    * The ARN of the room from which to remove the room skill parameter details.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The ID of the skill from which to remove the room skill parameter details.
    */
  var SkillId: typingsSlinky.awsSdk.alexaforbusinessMod.SkillId = js.native
}

object DeleteRoomSkillParameterRequest {
  @scala.inline
  def apply(ParameterKey: RoomSkillParameterKey, SkillId: SkillId): DeleteRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoomSkillParameterRequest]
  }
  @scala.inline
  implicit class DeleteRoomSkillParameterRequestOps[Self <: DeleteRoomSkillParameterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameterKey(value: RoomSkillParameterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkillId(value: SkillId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillId")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

