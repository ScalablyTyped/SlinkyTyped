package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.baiduApp.swan.PropOptions[T]
  - typingsSlinky.baiduApp.swan.Prop[T]
  - js.Array[typingsSlinky.baiduApp.swan.Prop[T]]
*/
trait PropValidator[T] extends js.Object

object PropValidator {
  @scala.inline
  implicit def apply[T](value: js.Array[Prop[T]]): PropValidator[T] = value.asInstanceOf[PropValidator[T]]
  @scala.inline
  implicit def apply[T](value: Prop[T]): PropValidator[T] = value.asInstanceOf[PropValidator[T]]
  @scala.inline
  implicit def apply[T](value: PropOptions[T]): PropValidator[T] = value.asInstanceOf[PropValidator[T]]
}

