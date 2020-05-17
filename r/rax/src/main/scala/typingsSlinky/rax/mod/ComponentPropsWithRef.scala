package typingsSlinky.rax.mod

import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rax.mod.PropsWithRef[typingsSlinky.rax.mod.ComponentProps[T]]
  - typingsSlinky.rax.mod.PropsWithoutRef[_] with typingsSlinky.rax.mod.RefAttributes[typingsSlinky.std.InstanceType[T]]
*/
trait ComponentPropsWithRef[T /* <: ElementType[_] */] extends js.Object

object ComponentPropsWithRef {
  @scala.inline
  implicit def apply[T](value: PropsWithoutRef[_] with RefAttributes[InstanceType[T]]): ComponentPropsWithRef[T] = value.asInstanceOf[ComponentPropsWithRef[T]]
  @scala.inline
  implicit def apply[T](value: PropsWithRef[ComponentProps[T]]): ComponentPropsWithRef[T] = value.asInstanceOf[ComponentPropsWithRef[T]]
}

