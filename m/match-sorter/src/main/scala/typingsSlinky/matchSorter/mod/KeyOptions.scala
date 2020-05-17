package typingsSlinky.matchSorter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function1[/ * item * / T, java.lang.String | js.Array[java.lang.String]]
*/
trait KeyOptions[T] extends js.Object

object KeyOptions {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* item */ T, String | js.Array[String]]): KeyOptions[T] = value.asInstanceOf[KeyOptions[T]]
  @scala.inline
  implicit def apply[T](value: String): KeyOptions[T] = value.asInstanceOf[KeyOptions[T]]
}

