package typingsSlinky.clownface.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[T]
*/
trait SingleOrArray[T] extends SingleOrArrayOfTerms[T]

object SingleOrArray {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): SingleOrArray[T] = value.asInstanceOf[SingleOrArray[T]]
  @scala.inline
  implicit def apply[T](value: T): SingleOrArray[T] = value.asInstanceOf[SingleOrArray[T]]
}

