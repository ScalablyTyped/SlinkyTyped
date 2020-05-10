package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRoomSkillParameterRequest extends js.Object {
  /**
    * The ARN of the room associated with the room skill parameter. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The updated room skill parameter. Required.
    */
  var RoomSkillParameter: typingsSlinky.awsSdk.alexaforbusinessMod.RoomSkillParameter = js.native
  /**
    * The ARN of the skill associated with the room skill parameter. Required.
    */
  var SkillId: typingsSlinky.awsSdk.alexaforbusinessMod.SkillId = js.native
}

object PutRoomSkillParameterRequest {
  @scala.inline
  def apply(RoomSkillParameter: RoomSkillParameter, SkillId: SkillId): PutRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(RoomSkillParameter = RoomSkillParameter.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRoomSkillParameterRequest]
  }
  @scala.inline
  implicit class PutRoomSkillParameterRequestOps[Self <: PutRoomSkillParameterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoomSkillParameter(value: RoomSkillParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomSkillParameter")(value.asInstanceOf[js.Any])
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

