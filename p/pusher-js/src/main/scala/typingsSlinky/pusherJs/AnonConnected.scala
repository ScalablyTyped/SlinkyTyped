package typingsSlinky.pusherJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConnected extends js.Object {
  def backoff(): Unit = js.native
  def connected(handshake: js.Any): Unit = js.native
  def refused(): Unit = js.native
  def retry(): Unit = js.native
  def ssl_only(): Unit = js.native
}

object AnonConnected {
  @scala.inline
  def apply(
    backoff: () => Unit,
    connected: js.Any => Unit,
    refused: () => Unit,
    retry: () => Unit,
    ssl_only: () => Unit
  ): AnonConnected = {
    val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), connected = js.Any.fromFunction1(connected), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
    __obj.asInstanceOf[AnonConnected]
  }
  @scala.inline
  implicit class AnonConnectedOps[Self <: AnonConnected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackoff(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoff")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnected(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefused(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRetry(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSsl_only(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl_only")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

