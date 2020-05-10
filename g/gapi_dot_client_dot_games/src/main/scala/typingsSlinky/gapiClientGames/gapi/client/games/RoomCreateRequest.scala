package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomCreateRequest extends js.Object {
  /** Criteria for auto-matching players into this room. */
  var autoMatchingCriteria: js.UndefOr[RoomAutoMatchingCriteria] = js.native
  /** The capabilities that this client supports for realtime communication. */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  /** Client address for the player creating the room. */
  var clientAddress: js.UndefOr[RoomClientAddress] = js.native
  /** The player IDs to invite to the room. */
  var invitedPlayerIds: js.UndefOr[js.Array[String]] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomCreateRequest. */
  var kind: js.UndefOr[String] = js.native
  /** Network diagnostics for the client creating the room. */
  var networkDiagnostics: js.UndefOr[NetworkDiagnostics] = js.native
  /** A randomly generated numeric ID. This number is used at the server to ensure that the request is handled correctly across retries. */
  var requestId: js.UndefOr[String] = js.native
  /**
    * The variant / mode of the application to be played. This can be any integer value, or left blank. You should use a small number of variants to keep the
    * auto-matching pool as large as possible.
    */
  var variant: js.UndefOr[Double] = js.native
}

object RoomCreateRequest {
  @scala.inline
  def apply(): RoomCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomCreateRequest]
  }
  @scala.inline
  implicit class RoomCreateRequestOps[Self <: RoomCreateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMatchingCriteria(value: RoomAutoMatchingCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatchingCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMatchingCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatchingCriteria")(js.undefined)
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
    def withClientAddress(value: RoomClientAddress): Self = {
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
    def withInvitedPlayerIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedPlayerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedPlayerIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedPlayerIds")(js.undefined)
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
    def withNetworkDiagnostics(value: NetworkDiagnostics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkDiagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
  }
  
}

