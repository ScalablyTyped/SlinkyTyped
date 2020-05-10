package typingsSlinky.pusherJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackoff extends js.Object {
  def backoff(): Unit = js.native
  def refused(): Unit = js.native
  def retry(): Unit = js.native
  def ssl_only(): Unit = js.native
}

object AnonBackoff {
  @scala.inline
  def apply(backoff: () => Unit, refused: () => Unit, retry: () => Unit, ssl_only: () => Unit): AnonBackoff = {
    val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
    __obj.asInstanceOf[AnonBackoff]
  }
  @scala.inline
  implicit class AnonBackoffOps[Self <: AnonBackoff] (val x: Self) extends AnyVal {
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

