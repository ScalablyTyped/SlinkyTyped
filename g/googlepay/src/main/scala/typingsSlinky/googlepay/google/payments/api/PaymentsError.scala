package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains details about errors returned by client JavaScript
  * methods. Errors might not be displayed in a user-facing dialog.
  */
@js.native
trait PaymentsError extends js.Object {
  /**
    * Short code that describes the type of error.
    */
  var statusCode: PaymentsErrorStatusCode | String = js.native
  /**
    * Developer-facing message that describes the error encountered and
    * possible steps to correct it.
    */
  var statusMessage: String = js.native
}

object PaymentsError {
  @scala.inline
  def apply(statusCode: PaymentsErrorStatusCode | String, statusMessage: String): PaymentsError = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsError]
  }
  @scala.inline
  implicit class PaymentsErrorOps[Self <: PaymentsError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusCode(value: PaymentsErrorStatusCode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

