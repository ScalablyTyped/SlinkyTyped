package typingsSlinky.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T]
*/
trait TypeOrArray[T] extends js.Object

object TypeOrArray {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): TypeOrArray[T] = value.asInstanceOf[TypeOrArray[T]]
  @scala.inline
  implicit def apply[T](value: T): TypeOrArray[T] = value.asInstanceOf[TypeOrArray[T]]
}

