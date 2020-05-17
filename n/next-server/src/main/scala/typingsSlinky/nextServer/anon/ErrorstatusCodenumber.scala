package typingsSlinky.nextServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  statusCode ? :number} */
@js.native
trait ErrorstatusCodenumber extends js.Object {
  var message: String = js.native
  var name: String = js.native
  var stack: js.UndefOr[String] = js.native
  var statusCode: js.UndefOr[Double] = js.native
}

object ErrorstatusCodenumber {
  @scala.inline
  def apply(message: String, name: String): ErrorstatusCodenumber = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorstatusCodenumber]
  }
  @scala.inline
  implicit class ErrorstatusCodenumberOps[Self <: ErrorstatusCodenumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

