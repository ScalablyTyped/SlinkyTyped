package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[js.Any]
  - typingsSlinky.ractive.mod.ParseFn
  - typingsSlinky.ractive.mod.Macro
*/
trait Partial extends js.Object

object Partial {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): Partial = value.asInstanceOf[Partial]
  @scala.inline
  implicit def apply(value: Macro): Partial = value.asInstanceOf[Partial]
  @scala.inline
  implicit def apply(value: ParseFn): Partial = value.asInstanceOf[Partial]
  @scala.inline
  implicit def apply(value: String): Partial = value.asInstanceOf[Partial]
}

