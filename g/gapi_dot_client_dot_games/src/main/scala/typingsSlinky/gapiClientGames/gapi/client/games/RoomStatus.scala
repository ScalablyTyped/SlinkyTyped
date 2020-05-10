package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomStatus extends js.Object {
  /** Auto-matching status for this room. Not set if the room is not currently in the automatching queue. */
  var autoMatchingStatus: js.UndefOr[RoomAutoMatchStatus] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomStatus. */
  var kind: js.UndefOr[String] = js.native
  /** The participants involved in the room, along with their statuses. Includes participants who have left or declined invitations. */
  var participants: js.UndefOr[js.Array[RoomParticipant]] = js.native
  /** Globally unique ID for a room. */
  var roomId: js.UndefOr[String] = js.native
  /**
    * The status of the room.
    * Possible values are:
    * - "ROOM_INVITING" - One or more players have been invited and not responded.
    * - "ROOM_AUTO_MATCHING" - One or more slots need to be filled by auto-matching.
    * - "ROOM_CONNECTING" - Players have joined are connecting to each other (either before or after auto-matching).
    * - "ROOM_ACTIVE" - All players have joined and connected to each other.
    * - "ROOM_DELETED" - All joined players have left.
    */
  var status: js.UndefOr[String] = js.native
  /** The version of the status for the room: an increasing counter, used by the client to ignore out-of-order updates to room status. */
  var statusVersion: js.UndefOr[Double] = js.native
}

object RoomStatus {
  @scala.inline
  def apply(): RoomStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomStatus]
  }
  @scala.inline
  implicit class RoomStatusOps[Self <: RoomStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMatchingStatus(value: RoomAutoMatchStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatchingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMatchingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatchingStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withParticipants(value: js.Array[RoomParticipant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participants")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusVersion")(js.undefined)
        ret
    }
  }
  
}

