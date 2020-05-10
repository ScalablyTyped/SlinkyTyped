package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoomRequest extends js.Object {
  /**
    * The updated description for the room.
    */
  var Description: js.UndefOr[RoomDescription] = js.native
  /**
    * The updated profile ARN for the room.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
  /**
    * The updated provider calendar ARN for the room.
    */
  var ProviderCalendarId: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ProviderCalendarId] = js.native
  /**
    * The ARN of the room to update. 
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The updated name for the room.
    */
  var RoomName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.RoomName] = js.native
}

object UpdateRoomRequest {
  @scala.inline
  def apply(): UpdateRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoomRequest]
  }
  @scala.inline
  implicit class UpdateRoomRequestOps[Self <: UpdateRoomRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: RoomDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderCalendarId(value: ProviderCalendarId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderCalendarId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderCalendarId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProviderCalendarId")(js.undefined)
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
  }
  
}

