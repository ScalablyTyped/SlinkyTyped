package typingsSlinky.emotionSerialize.mod

import typingsSlinky.emotionSerialize.helperMod.Equal
import typingsSlinky.emotionUtils.mod.SerializedStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - typingsSlinky.emotionSerialize.mod.ComponentSelector
  - typingsSlinky.emotionSerialize.mod.Keyframes
  - typingsSlinky.emotionUtils.mod.SerializedStyles
  - typingsSlinky.emotionSerialize.mod.ArrayInterpolation[MP]
  - typingsSlinky.emotionSerialize.mod.ObjectInterpolation[MP]
  - typingsSlinky.emotionSerialize.helperMod.Equal[
MP, 
js.UndefOr[scala.Nothing], 
scala.Nothing, 
typingsSlinky.emotionSerialize.mod.FunctionInterpolation[MP]]
*/
trait Interpolation[MP] extends js.Object

object Interpolation {
  @scala.inline
  implicit def apply[MP](value: Keyframes | String): Interpolation[MP] = value.asInstanceOf[Interpolation[MP]]
  @scala.inline
  implicit def apply[MP](value: ArrayInterpolation[MP]): Interpolation[MP] = value.asInstanceOf[Interpolation[MP]]
  @scala.inline
  implicit def apply[MP](value: Boolean): Interpolation[MP] = value.asInstanceOf[Interpolation[MP]]
  @scala.inline
  implicit def apply[MP](value: ComponentSelector): Interpolation[MP] = value.asInstanceOf[Interpolation[MP]]
  @scala.inline
  implicit def apply[MP](value: Double): Interpolation[MP] = value.asInstanceOf[Interpolation[MP]]
  @scala.inline
  implicit def apply[MP](value: Equal[MP, js.UndefOr[scala.Nothing], scala.Nothing, FunctionInterpolation[MP]]): Interpolation[MP] = value.asInstanceOf[Interpolation[MP]]
  @scala.inline
  implicit def apply[MP](value: Null): Interpolation[MP] = value.asInstanceOf[Interpolation[MP]]
  @scala.inline
  implicit def apply[MP](value: ObjectInterpolation[MP]): Interpolation[MP] = value.asInstanceOf[Interpolation[MP]]
  @scala.inline
  implicit def apply[MP](value: SerializedStyles): Interpolation[MP] = value.asInstanceOf[Interpolation[MP]]
  @scala.inline
  implicit def fromUndef[MP, T](value: js.UndefOr[T])(implicit ev: T => Interpolation[MP]): Interpolation[MP] = value.asInstanceOf[Interpolation[MP]]
}

