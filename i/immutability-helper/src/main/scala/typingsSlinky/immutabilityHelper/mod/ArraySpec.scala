package typingsSlinky.immutabilityHelper.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.immutabilityHelper.anon.Push
import typingsSlinky.immutabilityHelper.anon.Splice
import typingsSlinky.immutabilityHelper.anon.Unshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.immutabilityHelper.anon.Push[T]
  - typingsSlinky.immutabilityHelper.anon.Unshift[T]
  - typingsSlinky.immutabilityHelper.anon.Splice[T]
  - org.scalablytyped.runtime.StringDictionary[typingsSlinky.immutabilityHelper.mod.Spec[T, C]]
*/
trait ArraySpec[T, C /* <: CustomCommands[js.Object] */]
  extends Spec[js.Any, C]

object ArraySpec {
  @scala.inline
  implicit def apply[T, C](value: Push[T]): ArraySpec[T, C] = value.asInstanceOf[ArraySpec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: Splice[T]): ArraySpec[T, C] = value.asInstanceOf[ArraySpec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: StringDictionary[Spec[T, C]]): ArraySpec[T, C] = value.asInstanceOf[ArraySpec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: Unshift[T]): ArraySpec[T, C] = value.asInstanceOf[ArraySpec[T, C]]
}

