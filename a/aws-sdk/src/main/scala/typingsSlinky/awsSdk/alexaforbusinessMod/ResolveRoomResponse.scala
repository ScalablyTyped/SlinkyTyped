package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveRoomResponse extends js.Object {
  /**
    * The ARN of the room from which the skill request was invoked.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the room from which the skill request was invoked.
    */
  var RoomName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.RoomName] = js.native
  /**
    * Response to get the room profile request. Required.
    */
  var RoomSkillParameters: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.RoomSkillParameters] = js.native
}

object ResolveRoomResponse {
  @scala.inline
  def apply(): ResolveRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveRoomResponse]
  }
  @scala.inline
  implicit class ResolveRoomResponseOps[Self <: ResolveRoomResponse] (val x: Self) extends AnyVal {
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
    def withRoomName(value: RoomName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomName")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomSkillParameters(value: RoomSkillParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomSkillParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomSkillParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomSkillParameters")(js.undefined)
        ret
    }
  }
  
}

