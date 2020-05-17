package typingsSlinky.farbtastic.JQueryFarbtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.farbtastic.JQueryFarbtastic.CallbackFunction
  - typingsSlinky.farbtastic.JQueryFarbtastic.Placeholder
*/
trait Callback extends js.Object

object Callback {
  @scala.inline
  implicit def apply(value: CallbackFunction): Callback = value.asInstanceOf[Callback]
  @scala.inline
  implicit def apply(value: Placeholder): Callback = value.asInstanceOf[Callback]
}

