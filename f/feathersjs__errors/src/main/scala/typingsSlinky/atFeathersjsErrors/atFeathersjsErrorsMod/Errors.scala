package typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var BadGateway: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.BadGateway
  var BadRequest: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.BadRequest
  var Conflict: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.Conflict
  var FeathersError: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.FeathersError
  var Forbidden: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.Forbidden
  var GeneralError: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.GeneralError
  var LengthRequired: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.LengthRequired
  var MethodNotAllowed: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.MethodNotAllowed
  var NotAcceptable: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.NotAcceptable
  var NotAuthenticated: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.NotAuthenticated
  var NotFound: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.NotFound
  var NotImplemented: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.NotImplemented
  var PaymentError: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.PaymentError
  var Timeout: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.Timeout
  var TooManyRequests: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.TooManyRequests
  var Unavailable: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.Unavailable
  var Unprocessable: typingsSlinky.atFeathersjsErrors.atFeathersjsErrorsMod.Unprocessable
}

object Errors {
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
  ): Errors = {
    val __obj = js.Dynamic.literal(BadGateway = BadGateway.asInstanceOf[js.Any], BadRequest = BadRequest.asInstanceOf[js.Any], Conflict = Conflict.asInstanceOf[js.Any], FeathersError = FeathersError.asInstanceOf[js.Any], Forbidden = Forbidden.asInstanceOf[js.Any], GeneralError = GeneralError.asInstanceOf[js.Any], LengthRequired = LengthRequired.asInstanceOf[js.Any], MethodNotAllowed = MethodNotAllowed.asInstanceOf[js.Any], NotAcceptable = NotAcceptable.asInstanceOf[js.Any], NotAuthenticated = NotAuthenticated.asInstanceOf[js.Any], NotFound = NotFound.asInstanceOf[js.Any], NotImplemented = NotImplemented.asInstanceOf[js.Any], PaymentError = PaymentError.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], TooManyRequests = TooManyRequests.asInstanceOf[js.Any], Unavailable = Unavailable.asInstanceOf[js.Any], Unprocessable = Unprocessable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Errors]
  }
}

@JSImport("@feathersjs/errors", "errors")
@js.native
object errors extends TopLevel[Errors]

