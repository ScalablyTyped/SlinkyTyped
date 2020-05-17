package typingsSlinky.expressValidator.baseMod

import typingsSlinky.expressValidator.anon.Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expressValidator.anon.Location
  - typingsSlinky.expressValidator.anon.Msg
*/
trait ValidationError extends js.Object

object ValidationError {
  @scala.inline
  implicit def apply(value: typingsSlinky.expressValidator.anon.Location): ValidationError = value.asInstanceOf[ValidationError]
  @scala.inline
  implicit def apply(value: Msg): ValidationError = value.asInstanceOf[ValidationError]
}

