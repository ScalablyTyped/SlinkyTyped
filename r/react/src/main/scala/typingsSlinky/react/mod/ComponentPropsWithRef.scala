package typingsSlinky.react.mod

import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.PropsWithRef[typingsSlinky.react.mod.ComponentProps[T]]
  - typingsSlinky.react.mod.PropsWithoutRef[_] with typingsSlinky.react.mod.RefAttributes[typingsSlinky.std.InstanceType[T]]
*/
trait ComponentPropsWithRef[T /* <: slinky.core.facade.ReactElement */] extends js.Object

object ComponentPropsWithRef {
  @scala.inline
  implicit def apply[T](value: PropsWithoutRef[_] with RefAttributes[InstanceType[T]]): ComponentPropsWithRef[T] = value.asInstanceOf[ComponentPropsWithRef[T]]
  @scala.inline
  implicit def apply[T](value: PropsWithRef[ComponentProps[T]]): ComponentPropsWithRef[T] = value.asInstanceOf[ComponentPropsWithRef[T]]
}

