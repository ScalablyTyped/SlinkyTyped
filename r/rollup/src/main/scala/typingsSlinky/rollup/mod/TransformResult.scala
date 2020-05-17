package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.rollup.mod.TransformSourceDescription
*/
trait TransformResult extends js.Object

object TransformResult {
  @scala.inline
  implicit def apply(value: Null): TransformResult = value.asInstanceOf[TransformResult]
  @scala.inline
  implicit def apply(value: String): TransformResult = value.asInstanceOf[TransformResult]
  @scala.inline
  implicit def apply(value: TransformSourceDescription): TransformResult = value.asInstanceOf[TransformResult]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => TransformResult): TransformResult = value.asInstanceOf[TransformResult]
}

