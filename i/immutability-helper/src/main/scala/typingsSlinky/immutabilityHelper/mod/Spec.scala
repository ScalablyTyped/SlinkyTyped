package typingsSlinky.immutabilityHelper.mod

import typingsSlinky.immutabilityHelper.anon.Apply
import typingsSlinky.immutabilityHelper.anon.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.immutabilityHelper.mod.ObjectSpec[T, C]
  - typingsSlinky.immutabilityHelper.mod.SetSpec[js.Any]
  - typingsSlinky.immutabilityHelper.mod.MapSpec[js.Any, js.Any]
  - typingsSlinky.immutabilityHelper.mod.ArraySpec[js.Any, C]
  - typingsSlinky.immutabilityHelper.anon.Set[T]
  - typingsSlinky.immutabilityHelper.anon.Apply[T]
  - js.Function1[/ * v * / T, T]
  - js.Any
*/
trait Spec[T, C /* <: CustomCommands[js.Object] */] extends js.Object

object Spec {
  @scala.inline
  implicit def apply[T, C](value: js.Any): Spec[T, C] = value.asInstanceOf[Spec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: Apply[T]): Spec[T, C] = value.asInstanceOf[Spec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: ArraySpec[js.Any, C]): Spec[T, C] = value.asInstanceOf[Spec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: js.Function1[/* v */ T, T]): Spec[T, C] = value.asInstanceOf[Spec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: MapSpec[js.Any, js.Any]): Spec[T, C] = value.asInstanceOf[Spec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: ObjectSpec[T, C]): Spec[T, C] = value.asInstanceOf[Spec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: Set[T]): Spec[T, C] = value.asInstanceOf[Spec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: SetSpec[js.Any]): Spec[T, C] = value.asInstanceOf[Spec[T, C]]
}

