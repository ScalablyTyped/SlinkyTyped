package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.reactNative.mod.RegisteredStyle[T]
  - typingsSlinky.reactNative.mod.RecursiveArray[
T | typingsSlinky.reactNative.mod.RegisteredStyle[T] | typingsSlinky.reactNative.mod.Falsy]
  - typingsSlinky.reactNative.mod.Falsy
*/
trait StyleProp[T] extends js.Object

object StyleProp {
  @scala.inline
  implicit def apply[T](value: Falsy): StyleProp[T] = value.asInstanceOf[StyleProp[T]]
  @scala.inline
  implicit def apply[T](value: RecursiveArray[T | RegisteredStyle[T] | Falsy]): StyleProp[T] = value.asInstanceOf[StyleProp[T]]
  @scala.inline
  implicit def apply[T](value: RegisteredStyle[T]): StyleProp[T] = value.asInstanceOf[StyleProp[T]]
  @scala.inline
  implicit def apply[T](value: T): StyleProp[T] = value.asInstanceOf[StyleProp[T]]
}

