package typingsSlinky.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - js.Function1[/ * data * / java.lang.String, scala.Boolean | js.Thenable[js.Any]]
*/
trait FormatValidator extends js.Object

object FormatValidator {
  @scala.inline
  implicit def apply(value: js.Function1[/* data */ String, Boolean | js.Thenable[js.Any]]): FormatValidator = value.asInstanceOf[FormatValidator]
  @scala.inline
  implicit def apply(value: js.RegExp): FormatValidator = value.asInstanceOf[FormatValidator]
  @scala.inline
  implicit def apply(value: String): FormatValidator = value.asInstanceOf[FormatValidator]
}

