package typingsSlinky.mobx.observablesetMod

import typingsSlinky.mobx.anon.NewValueObject
import typingsSlinky.mobx.anon.ObjectOldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mobx.anon.NewValueObject[T]
  - typingsSlinky.mobx.anon.ObjectOldValue[T]
*/
trait ISetDidChange[T] extends js.Object

object ISetDidChange {
  @scala.inline
  implicit def apply[T](value: NewValueObject[T]): ISetDidChange[T] = value.asInstanceOf[ISetDidChange[T]]
  @scala.inline
  implicit def apply[T](value: ObjectOldValue[T]): ISetDidChange[T] = value.asInstanceOf[ISetDidChange[T]]
}

