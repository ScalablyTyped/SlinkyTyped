package typingsSlinky.mobx.observablesetMod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Set[T]
  - js.Array[T]
*/
trait IObservableSetInitialValues[T] extends js.Object

object IObservableSetInitialValues {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): IObservableSetInitialValues[T] = value.asInstanceOf[IObservableSetInitialValues[T]]
  @scala.inline
  implicit def apply[T](value: Set[T]): IObservableSetInitialValues[T] = value.asInstanceOf[IObservableSetInitialValues[T]]
}

