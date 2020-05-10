package typingsSlinky.feathersjsErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors_ extends js.Object {
  var BadGateway: typingsSlinky.feathersjsErrors.mod.BadGateway = js.native
  var BadRequest: typingsSlinky.feathersjsErrors.mod.BadRequest = js.native
  var Conflict: typingsSlinky.feathersjsErrors.mod.Conflict = js.native
  var FeathersError: typingsSlinky.feathersjsErrors.mod.FeathersError = js.native
  var Forbidden: typingsSlinky.feathersjsErrors.mod.Forbidden = js.native
  var GeneralError: typingsSlinky.feathersjsErrors.mod.GeneralError = js.native
  var LengthRequired: typingsSlinky.feathersjsErrors.mod.LengthRequired = js.native
  var MethodNotAllowed: typingsSlinky.feathersjsErrors.mod.MethodNotAllowed = js.native
  var NotAcceptable: typingsSlinky.feathersjsErrors.mod.NotAcceptable = js.native
  var NotAuthenticated: typingsSlinky.feathersjsErrors.mod.NotAuthenticated = js.native
  var NotFound: typingsSlinky.feathersjsErrors.mod.NotFound = js.native
  var NotImplemented: typingsSlinky.feathersjsErrors.mod.NotImplemented = js.native
  var PaymentError: typingsSlinky.feathersjsErrors.mod.PaymentError = js.native
  var Timeout: typingsSlinky.feathersjsErrors.mod.Timeout = js.native
  var TooManyRequests: typingsSlinky.feathersjsErrors.mod.TooManyRequests = js.native
  var Unavailable: typingsSlinky.feathersjsErrors.mod.Unavailable = js.native
  var Unprocessable: typingsSlinky.feathersjsErrors.mod.Unprocessable = js.native
}

object Errors_ {
  @scala.inline
  def apply(
    BadGateway: BadGateway,
    BadRequest: BadRequest,
    Conflict: Conflict,
    FeathersError: FeathersError,
    Forbidden: Forbidden,
    GeneralError: GeneralError,
    LengthRequired: LengthRequired,
    MethodNotAllowed: MethodNotAllowed,
    NotAcceptable: NotAcceptable,
    NotAuthenticated: NotAuthenticated,
    NotFound: NotFound,
    NotImplemented: NotImplemented,
    PaymentError: PaymentError,
    Timeout: Timeout,
    TooManyRequests: TooManyRequests,
    Unavailable: Unavailable,
    Unprocessable: Unprocessable
  ): Errors_ = {
    val __obj = js.Dynamic.literal(BadGateway = BadGateway.asInstanceOf[js.Any], BadRequest = BadRequest.asInstanceOf[js.Any], Conflict = Conflict.asInstanceOf[js.Any], FeathersError = FeathersError.asInstanceOf[js.Any], Forbidden = Forbidden.asInstanceOf[js.Any], GeneralError = GeneralError.asInstanceOf[js.Any], LengthRequired = LengthRequired.asInstanceOf[js.Any], MethodNotAllowed = MethodNotAllowed.asInstanceOf[js.Any], NotAcceptable = NotAcceptable.asInstanceOf[js.Any], NotAuthenticated = NotAuthenticated.asInstanceOf[js.Any], NotFound = NotFound.asInstanceOf[js.Any], NotImplemented = NotImplemented.asInstanceOf[js.Any], PaymentError = PaymentError.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], TooManyRequests = TooManyRequests.asInstanceOf[js.Any], Unavailable = Unavailable.asInstanceOf[js.Any], Unprocessable = Unprocessable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors_]
  }
  @scala.inline
  implicit class Errors_Ops[Self <: Errors_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadGateway(value: BadGateway): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BadGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadRequest(value: BadRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BadRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConflict(value: Conflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Conflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeathersError(value: FeathersError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeathersError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForbidden(value: Forbidden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Forbidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneralError(value: GeneralError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeneralError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLengthRequired(value: LengthRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LengthRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodNotAllowed(value: MethodNotAllowed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MethodNotAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotAcceptable(value: NotAcceptable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotAcceptable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotAuthenticated(value: NotAuthenticated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotFound(value: NotFound): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotImplemented(value: NotImplemented): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotImplemented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentError(value: PaymentError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Timeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooManyRequests(value: TooManyRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TooManyRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnavailable(value: Unavailable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessable(value: Unprocessable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unprocessable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

