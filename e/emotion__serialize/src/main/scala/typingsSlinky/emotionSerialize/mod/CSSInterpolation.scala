package typingsSlinky.emotionSerialize.mod

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
  - typingsSlinky.emotionSerialize.mod.CSSObject
  - typingsSlinky.emotionSerialize.mod.ArrayCSSInterpolation
*/
trait CSSInterpolation extends js.Object

object CSSInterpolation {
  @scala.inline
  implicit def apply(value: Keyframes | String): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
  @scala.inline
  implicit def apply(value: ArrayCSSInterpolation): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
  @scala.inline
  implicit def apply(value: Boolean): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
  @scala.inline
  implicit def apply(value: CSSObject): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
  @scala.inline
  implicit def apply(value: ComponentSelector): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
  @scala.inline
  implicit def apply(value: Double): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
  @scala.inline
  implicit def apply(value: Null): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
  @scala.inline
  implicit def apply(value: SerializedStyles): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => CSSInterpolation): CSSInterpolation = value.asInstanceOf[CSSInterpolation]
}

