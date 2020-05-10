package typingsSlinky.connectTimeout.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * @summary true if timeout fired; false otherwise.
    */
  var timedout: Boolean = js.native
  /**
    * @summary Clears the timeout on the request.
    */
  def clearTimeout(): Unit = js.native
}

object Request {
  @scala.inline
  def apply(clearTimeout: () => Unit, timedout: Boolean): Request = {
    val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction0(clearTimeout), timedout = timedout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearTimeout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTimedout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

