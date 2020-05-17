package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ractive.mod.ParsedTemplate
  - java.lang.String
  - js.Array[js.Any]
  - typingsSlinky.ractive.mod.ParseFn
*/
trait Template extends js.Object

object Template {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): Template = value.asInstanceOf[Template]
  @scala.inline
  implicit def apply(value: ParseFn): Template = value.asInstanceOf[Template]
  @scala.inline
  implicit def apply(value: ParsedTemplate): Template = value.asInstanceOf[Template]
  @scala.inline
  implicit def apply(value: String): Template = value.asInstanceOf[Template]
}

