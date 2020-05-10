package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomP2PStatus extends js.Object {
  /** The amount of time in milliseconds it took to establish connections with this peer. */
  var connectionSetupLatencyMillis: js.UndefOr[Double] = js.native
  /**
    * The error code in event of a failure.
    * Possible values are:
    * - "P2P_FAILED" - The client failed to establish a P2P connection with the peer.
    * - "PRESENCE_FAILED" - The client failed to register to receive P2P connections.
    * - "RELAY_SERVER_FAILED" - The client received an error when trying to use the relay server to establish a P2P connection with the peer.
    */
  var error: js.UndefOr[String] = js.native
  /** More detailed diagnostic message returned in event of a failure. */
  var error_reason: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomP2PStatus. */
  var kind: js.UndefOr[String] = js.native
  /** The ID of the participant. */
  var participantId: js.UndefOr[String] = js.native
  /**
    * The status of the peer in the room.
    * Possible values are:
    * - "CONNECTION_ESTABLISHED" - The client established a P2P connection with the peer.
    * - "CONNECTION_FAILED" - The client failed to establish directed presence with the peer.
    */
  var status: js.UndefOr[String] = js.native
  /** The amount of time in milliseconds it took to send packets back and forth on the unreliable channel with this peer. */
  var unreliableRoundtripLatencyMillis: js.UndefOr[Double] = js.native
}

object RoomP2PStatus {
  @scala.inline
  def apply(): RoomP2PStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomP2PStatus]
  }
  @scala.inline
  implicit class RoomP2PStatusOps[Self <: RoomP2PStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionSetupLatencyMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionSetupLatencyMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionSetupLatencyMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionSetupLatencyMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withError_reason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_reason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_reason")(js.undefined)
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
    def withParticipantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantId")(js.undefined)
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
    def withUnreliableRoundtripLatencyMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreliableRoundtripLatencyMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnreliableRoundtripLatencyMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreliableRoundtripLatencyMillis")(js.undefined)
        ret
    }
  }
  
}

