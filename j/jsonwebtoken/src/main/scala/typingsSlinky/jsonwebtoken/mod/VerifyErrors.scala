package typingsSlinky.jsonwebtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonwebtoken.mod.JsonWebTokenError
  - typingsSlinky.jsonwebtoken.mod.NotBeforeError
  - typingsSlinky.jsonwebtoken.mod.TokenExpiredError
*/
trait VerifyErrors extends js.Object

object VerifyErrors {
  @scala.inline
  implicit def apply(value: JsonWebTokenError): VerifyErrors = value.asInstanceOf[VerifyErrors]
  @scala.inline
  implicit def apply(value: NotBeforeError): VerifyErrors = value.asInstanceOf[VerifyErrors]
  @scala.inline
  implicit def apply(value: TokenExpiredError): VerifyErrors = value.asInstanceOf[VerifyErrors]
}

