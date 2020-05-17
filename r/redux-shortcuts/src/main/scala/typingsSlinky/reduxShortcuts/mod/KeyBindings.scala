package typingsSlinky.reduxShortcuts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait KeyBindings extends js.Object

object KeyBindings {
  @scala.inline
  implicit def apply(value: js.Array[String]): KeyBindings = value.asInstanceOf[KeyBindings]
  @scala.inline
  implicit def apply(value: String): KeyBindings = value.asInstanceOf[KeyBindings]
}

