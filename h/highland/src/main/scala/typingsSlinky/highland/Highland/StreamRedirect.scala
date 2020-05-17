package typingsSlinky.highland.Highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Used as a Redirect marker when writing to a Stream's incoming buffer
	 */
// TODO is this public?
@js.native
trait StreamRedirect[R] extends js.Object {
  var to: Stream[R] = js.native
}

object StreamRedirect {
  @scala.inline
  def apply[R](to: Stream[R]): StreamRedirect[R] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamRedirect[R]]
  }
  @scala.inline
  implicit class StreamRedirectOps[Self[r] <: StreamRedirect[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def withTo(value: Stream[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

