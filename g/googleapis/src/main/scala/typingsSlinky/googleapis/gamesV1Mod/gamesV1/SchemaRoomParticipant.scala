package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a participant in a room.
  */
@js.native
trait SchemaRoomParticipant extends js.Object {
  /**
    * True if this participant was auto-matched with the requesting player.
    */
  var autoMatched: js.UndefOr[Boolean] = js.native
  /**
    * Information about a player that has been anonymously auto-matched against
    * the requesting player. (Either player or autoMatchedPlayer will be set.)
    */
  var autoMatchedPlayer: js.UndefOr[SchemaAnonymousPlayer] = js.native
  /**
    * The capabilities which can be used when communicating with this
    * participant.
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Client address for the participant.
    */
  var clientAddress: js.UndefOr[SchemaRoomClientAddress] = js.native
  /**
    * True if this participant is in the fully connected set of peers in the
    * room.
    */
  var connected: js.UndefOr[Boolean] = js.native
  /**
    * An identifier for the participant in the scope of the room. Cannot be
    * used to identify a player across rooms or in other contexts.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomParticipant.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The reason the participant left the room; populated if the participant
    * status is PARTICIPANT_LEFT. Possible values are:   -
    * &quot;PLAYER_LEFT&quot; - The player explicitly chose to leave the room.
    * - &quot;GAME_LEFT&quot; - The game chose to remove the player from the
    * room.  - &quot;ABANDONED&quot; - The player switched to another
    * application and abandoned the room. - &quot;PEER_CONNECTION_FAILURE&quot;
    * - The client was unable to establish or maintain a connection to other
    * peer(s) in the room. - &quot;SERVER_ERROR&quot; - The client received an
    * error response when it tried to communicate with the server.  -
    * &quot;TIMEOUT&quot; - The client timed out while waiting for players to
    * join and connect.  - &quot;PRESENCE_FAILURE&quot; - The client&#39;s XMPP
    * connection ended abruptly.
    */
  var leaveReason: js.UndefOr[String] = js.native
  /**
    * Information about the player. Not populated if this player was
    * anonymously auto-matched against the requesting player. (Either player or
    * autoMatchedPlayer will be set.)
    */
  var player: js.UndefOr[SchemaPlayer] = js.native
  /**
    * The status of the participant with respect to the room. Possible values
    * are:   - &quot;PARTICIPANT_INVITED&quot; - The participant has been
    * invited to join the room, but has not yet responded.  -
    * &quot;PARTICIPANT_JOINED&quot; - The participant has joined the room
    * (either after creating it or accepting an invitation.)  -
    * &quot;PARTICIPANT_DECLINED&quot; - The participant declined an invitation
    * to join the room.  - &quot;PARTICIPANT_LEFT&quot; - The participant
    * joined the room and then left it.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaRoomParticipant {
  @scala.inline
  def apply(): SchemaRoomParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomParticipant]
  }
  @scala.inline
  implicit class SchemaRoomParticipantOps[Self <: SchemaRoomParticipant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMatched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMatched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatched")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMatchedPlayer(value: SchemaAnonymousPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatchedPlayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMatchedPlayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatchedPlayer")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withClientAddress(value: SchemaRoomClientAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withLeaveReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaveReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveReason")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayer(value: SchemaPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(js.undefined)
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
  }
  
}

