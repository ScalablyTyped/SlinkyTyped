package typingsSlinky.monacoEditor.mod.languages.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Array[scala.Double | java.lang.String]
  - typingsSlinky.monacoEditor.mod.languages.typescript.MapLike[js.Array[java.lang.String]]
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait CompilerOptionsValue extends js.Object

object CompilerOptionsValue {
  @scala.inline
  implicit def apply(value: js.Array[Double | String]): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def apply(value: Boolean): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def apply(value: Double): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def apply(value: MapLike[js.Array[String]]): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def apply(value: Null): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def apply(value: String): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => CompilerOptionsValue): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
}

