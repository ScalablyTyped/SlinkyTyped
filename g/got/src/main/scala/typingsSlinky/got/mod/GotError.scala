package typingsSlinky.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.got.mod.RequestError
  - typingsSlinky.got.mod.ReadError
  - typingsSlinky.got.mod.ParseError
  - typingsSlinky.got.mod.HTTPError
  - typingsSlinky.got.mod.MaxRedirectsError
  - typingsSlinky.got.mod.UnsupportedProtocolError
  - typingsSlinky.got.mod.CancelError
  - typingsSlinky.got.mod.TimeoutError
*/
trait GotError extends js.Object

object GotError {
  @scala.inline
  implicit def apply(value: CancelError): GotError = value.asInstanceOf[GotError]
  @scala.inline
  implicit def apply(value: HTTPError): GotError = value.asInstanceOf[GotError]
  @scala.inline
  implicit def apply(value: MaxRedirectsError): GotError = value.asInstanceOf[GotError]
  @scala.inline
  implicit def apply(value: ParseError): GotError = value.asInstanceOf[GotError]
  @scala.inline
  implicit def apply(value: ReadError): GotError = value.asInstanceOf[GotError]
  @scala.inline
  implicit def apply(value: RequestError): GotError = value.asInstanceOf[GotError]
  @scala.inline
  implicit def apply(value: TimeoutError): GotError = value.asInstanceOf[GotError]
  @scala.inline
  implicit def apply(value: UnsupportedProtocolError): GotError = value.asInstanceOf[GotError]
}

