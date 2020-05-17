package typingsSlinky.mobx.observablesetMod

import typingsSlinky.mobx.anon.NewValueObjectType
import typingsSlinky.mobx.anon.OldValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mobx.anon.OldValueType[T]
  - typingsSlinky.mobx.anon.NewValueObjectType[T]
*/
trait ISetWillChange[T] extends js.Object

object ISetWillChange {
  @scala.inline
  implicit def apply[T](value: NewValueObjectType[T]): ISetWillChange[T] = value.asInstanceOf[ISetWillChange[T]]
  @scala.inline
  implicit def apply[T](value: OldValueType[T]): ISetWillChange[T] = value.asInstanceOf[ISetWillChange[T]]
}

