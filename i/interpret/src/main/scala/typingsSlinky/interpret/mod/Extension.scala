package typingsSlinky.interpret.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.interpret.mod.ExtensionDescriptor
  - js.Array[java.lang.String | typingsSlinky.interpret.mod.ExtensionDescriptor]
*/
trait Extension extends js.Object

object Extension {
  @scala.inline
  implicit def apply(value: js.Array[String | ExtensionDescriptor]): Extension = value.asInstanceOf[Extension]
  @scala.inline
  implicit def apply(value: ExtensionDescriptor): Extension = value.asInstanceOf[Extension]
  @scala.inline
  implicit def apply(value: String): Extension = value.asInstanceOf[Extension]
}

