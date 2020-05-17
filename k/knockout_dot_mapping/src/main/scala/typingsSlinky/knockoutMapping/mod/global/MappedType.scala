package typingsSlinky.knockoutMapping.mod.global

import typingsSlinky.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.knockoutMapping.mod.global.KnockoutObservableType[T]
  - typingsSlinky.knockout.KnockoutObservable[T]
*/
trait MappedType[T] extends js.Object

object MappedType {
  @scala.inline
  implicit def apply[T](value: KnockoutObservable[T]): MappedType[T] = value.asInstanceOf[MappedType[T]]
  @scala.inline
  implicit def apply[T](value: KnockoutObservableType[T]): MappedType[T] = value.asInstanceOf[MappedType[T]]
}

