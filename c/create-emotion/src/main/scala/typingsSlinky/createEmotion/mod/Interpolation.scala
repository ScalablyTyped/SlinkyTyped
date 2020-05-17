package typingsSlinky.createEmotion.mod

import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - scala.Boolean
  - java.lang.String
  - scala.Double
  - typingsSlinky.std.TemplateStringsArray
  - typingsSlinky.createEmotion.mod.CSSObject
  - typingsSlinky.createEmotion.mod.ArrayInterpolation
  - typingsSlinky.createEmotion.mod.ClassInterpolation
*/
trait Interpolation extends js.Object

object Interpolation {
  @scala.inline
  implicit def apply(value: ArrayInterpolation): Interpolation = value.asInstanceOf[Interpolation]
  @scala.inline
  implicit def apply(value: Boolean): Interpolation = value.asInstanceOf[Interpolation]
  @scala.inline
  implicit def apply(value: CSSObject): Interpolation = value.asInstanceOf[Interpolation]
  @scala.inline
  implicit def apply(value: ClassInterpolation): Interpolation = value.asInstanceOf[Interpolation]
  @scala.inline
  implicit def apply(value: Double): Interpolation = value.asInstanceOf[Interpolation]
  @scala.inline
  implicit def apply(value: Null): Interpolation = value.asInstanceOf[Interpolation]
  @scala.inline
  implicit def apply(value: String): Interpolation = value.asInstanceOf[Interpolation]
  @scala.inline
  implicit def apply(value: TemplateStringsArray): Interpolation = value.asInstanceOf[Interpolation]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Interpolation): Interpolation = value.asInstanceOf[Interpolation]
}

