package typingsSlinky.jestConfig.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T]
*/
trait OrArray[T] extends js.Object

object OrArray {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): OrArray[T] = value.asInstanceOf[OrArray[T]]
  @scala.inline
  implicit def apply[T](value: T): OrArray[T] = value.asInstanceOf[OrArray[T]]
}

