package typingsSlinky.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  // Whether the error is fatal. Fatal errors cannot be recovered
  // from and require the document to be reloaded.
  var isFatal: Boolean = js.native
  // A message describing the error.
  var message: String = js.native
  // The type of the error that occurred.
  var `type`: ErrorType = js.native
}

object Error {
  @scala.inline
  def apply(isFatal: Boolean, message: String, `type`: ErrorType): Error = {
    val __obj = js.Dynamic.literal(isFatal = isFatal.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFatal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFatal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ErrorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

