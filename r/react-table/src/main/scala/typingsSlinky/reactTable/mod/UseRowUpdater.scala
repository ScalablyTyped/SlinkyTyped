package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Function1[/ * prev * / T, T]
*/
trait UseRowUpdater[T] extends js.Object

object UseRowUpdater {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* prev */ T, T]): UseRowUpdater[T] = value.asInstanceOf[UseRowUpdater[T]]
  @scala.inline
  implicit def apply[T](value: T): UseRowUpdater[T] = value.asInstanceOf[UseRowUpdater[T]]
}

