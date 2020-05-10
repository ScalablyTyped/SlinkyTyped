package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoomSkillParameterResponse extends js.Object {
  /**
    * The details of the room skill parameter requested. Required.
    */
  var RoomSkillParameter: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.RoomSkillParameter] = js.native
}

object GetRoomSkillParameterResponse {
  @scala.inline
  def apply(): GetRoomSkillParameterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoomSkillParameterResponse]
  }
  @scala.inline
  implicit class GetRoomSkillParameterResponseOps[Self <: GetRoomSkillParameterResponse] (val x: Self) extends AnyVal {
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
    def withoutRoomSkillParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomSkillParameter")(js.undefined)
        ret
    }
  }
  
}

