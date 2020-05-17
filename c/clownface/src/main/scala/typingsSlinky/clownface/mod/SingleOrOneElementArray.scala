package typingsSlinky.clownface.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T]
*/
trait SingleOrOneElementArray[T] extends js.Object

object SingleOrOneElementArray {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): SingleOrOneElementArray[T] = value.asInstanceOf[SingleOrOneElementArray[T]]
  @scala.inline
  implicit def apply[T](value: T): SingleOrOneElementArray[T] = value.asInstanceOf[SingleOrOneElementArray[T]]
}

