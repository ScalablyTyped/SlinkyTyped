package typingsSlinky.emberObject.typesMod

import typingsSlinky.emberObject.mixinMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emberObject.mixinMod.default[T, Base]
  - T
*/
trait MixinOrLiteral[T, Base] extends js.Object

object MixinOrLiteral {
  @scala.inline
  implicit def apply[T, Base](value: T): MixinOrLiteral[T, Base] = value.asInstanceOf[MixinOrLiteral[T, Base]]
  @scala.inline
  implicit def apply[T, Base](value: default[T, Base]): MixinOrLiteral[T, Base] = value.asInstanceOf[MixinOrLiteral[T, Base]]
}

