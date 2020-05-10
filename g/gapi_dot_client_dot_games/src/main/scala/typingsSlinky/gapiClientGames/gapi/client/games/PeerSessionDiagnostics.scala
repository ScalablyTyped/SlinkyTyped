package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeerSessionDiagnostics extends js.Object {
  /** Connected time in milliseconds. */
  var connectedTimestampMillis: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#peerSessionDiagnostics. */
  var kind: js.UndefOr[String] = js.native
  /** The participant ID of the peer. */
  var participantId: js.UndefOr[String] = js.native
  /** Reliable channel diagnostics. */
  var reliableChannel: js.UndefOr[PeerChannelDiagnostics] = js.native
  /** Unreliable channel diagnostics. */
  var unreliableChannel: js.UndefOr[PeerChannelDiagnostics] = js.native
}

object PeerSessionDiagnostics {
  @scala.inline
  def apply(): PeerSessionDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerSessionDiagnostics]
  }
  @scala.inline
  implicit class PeerSessionDiagnosticsOps[Self <: PeerSessionDiagnostics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectedTimestampMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedTimestampMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedTimestampMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedTimestampMillis")(js.undefined)
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
    def withReliableChannel(value: PeerChannelDiagnostics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reliableChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReliableChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reliableChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withUnreliableChannel(value: PeerChannelDiagnostics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreliableChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnreliableChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreliableChannel")(js.undefined)
        ret
    }
  }
  
}

