package typingsSlinky.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForbiddenExceptionDetails extends js.Object {
  /**
    * The error message that's returned from the API.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The unique message body ID.
    */
  var RequestID: js.UndefOr[String] = js.native
}

object ForbiddenExceptionDetails {
  @scala.inline
  def apply(): ForbiddenExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForbiddenExceptionDetails]
  }
  @scala.inline
  implicit class ForbiddenExceptionDetailsOps[Self <: ForbiddenExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestID")(js.undefined)
        ret
    }
  }
  
}

