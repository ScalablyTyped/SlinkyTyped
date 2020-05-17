package typingsSlinky.sailthruClient.anon

import typingsSlinky.sailthruClient.mod.SailthruError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends SailthruError {
  var error: String = js.native
  var errormsg: String = js.native
  var statusCode: String = js.native
}

object Error {
  @scala.inline
  def apply(error: String, errormsg: String, statusCode: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errormsg = errormsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrormsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errormsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

