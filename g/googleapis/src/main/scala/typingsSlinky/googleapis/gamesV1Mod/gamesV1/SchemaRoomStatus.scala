package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the status of a room that the player has
  * joined.
  */
@js.native
trait SchemaRoomStatus extends js.Object {
  /**
    * Auto-matching status for this room. Not set if the room is not currently
    * in the automatching queue.
    */
  var autoMatchingStatus: js.UndefOr[SchemaRoomAutoMatchStatus] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomStatus.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The participants involved in the room, along with their statuses.
    * Includes participants who have left or declined invitations.
    */
  var participants: js.UndefOr[js.Array[SchemaRoomParticipant]] = js.native
  /**
    * Globally unique ID for a room.
    */
  var roomId: js.UndefOr[String] = js.native
  /**
    * The status of the room. Possible values are:   -
    * &quot;ROOM_INVITING&quot; - One or more players have been invited and not
    * responded.  - &quot;ROOM_AUTO_MATCHING&quot; - One or more slots need to
    * be filled by auto-matching.  - &quot;ROOM_CONNECTING&quot; - Players have
    * joined are connecting to each other (either before or after
    * auto-matching).  - &quot;ROOM_ACTIVE&quot; - All players have joined and
    * connected to each other.  - &quot;ROOM_DELETED&quot; - All joined players
    * have left.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The version of the status for the room: an increasing counter, used by
    * the client to ignore out-of-order updates to room status.
    */
  var statusVersion: js.UndefOr[Double] = js.native
}

object SchemaRoomStatus {
  @scala.inline
  def apply(): SchemaRoomStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomStatus]
  }
  @scala.inline
  implicit class SchemaRoomStatusOps[Self <: SchemaRoomStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMatchingStatus(value: SchemaRoomAutoMatchStatus): Self = {
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
    def withParticipants(value: js.Array[SchemaRoomParticipant]): Self = {
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

