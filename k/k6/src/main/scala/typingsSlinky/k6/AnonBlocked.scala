package typingsSlinky.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlocked extends js.Object {
  /** Milliseconds spent blocked before initiating request. */
  var blocked: Double = js.native
  /** Milliseconds spent setting up TCP connection to host. */
  var connecting: Double = js.native
  /** Total time in milliseconds. `sending+waiting+receiving` */
  var duration: Double = js.native
  /** Milliseconds spent receiving response data. */
  var receiving: Double = js.native
  /** Milliseconds spent sending request. */
  var sending: Double = js.native
  /** Milliseconds spent handshaking TLS session with host. */
  var tls_handshaking: Double = js.native
  /** Milliseconds spent waiting for server response (TTFB). */
  var waiting: Double = js.native
}

object AnonBlocked {
  @scala.inline
  def apply(
    blocked: Double,
    connecting: Double,
    duration: Double,
    receiving: Double,
    sending: Double,
    tls_handshaking: Double,
    waiting: Double
  ): AnonBlocked = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], receiving = receiving.asInstanceOf[js.Any], sending = sending.asInstanceOf[js.Any], tls_handshaking = tls_handshaking.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlocked]
  }
  @scala.inline
  implicit class AnonBlockedOps[Self <: AnonBlocked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnecting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connecting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiving(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTls_handshaking(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls_handshaking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

