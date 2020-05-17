package typingsSlinky.nodeValidator.ValidatorOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeValidator.ValidatorOptions.IsStringOptions
  - typingsSlinky.nodeValidator.ValidatorOptions.IsNumberOptions
  - typingsSlinky.nodeValidator.ValidatorOptions.IsDateOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(value: IsDateOptions): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: IsNumberOptions): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: IsStringOptions): Options = value.asInstanceOf[Options]
}

