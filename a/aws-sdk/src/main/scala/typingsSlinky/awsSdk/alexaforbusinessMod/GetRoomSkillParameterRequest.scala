package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoomSkillParameterRequest extends js.Object {
  /**
    * The room skill parameter key for which to get details. Required.
    */
  var ParameterKey: RoomSkillParameterKey = js.native
  /**
    * The ARN of the room from which to get the room skill parameter details. 
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the skill from which to get the room skill parameter details. Required.
    */
  var SkillId: typingsSlinky.awsSdk.alexaforbusinessMod.SkillId = js.native
}

object GetRoomSkillParameterRequest {
  @scala.inline
  def apply(ParameterKey: RoomSkillParameterKey, SkillId: SkillId): GetRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoomSkillParameterRequest]
  }
  @scala.inline
  implicit class GetRoomSkillParameterRequestOps[Self <: GetRoomSkillParameterRequest] (val x: Self) extends AnyVal {
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

