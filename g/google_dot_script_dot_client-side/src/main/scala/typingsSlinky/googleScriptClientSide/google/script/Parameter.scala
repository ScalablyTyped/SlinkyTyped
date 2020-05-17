package typingsSlinky.googleScriptClientSide.google.script

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - scala.Boolean
  - java.lang.String
  - org.scalablytyped.runtime.NumberDictionary[
/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias google.script.client-side.google.script.Parameter * / js.Object]
  - org.scalablytyped.runtime.StringDictionary[
/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias google.script.client-side.google.script.Parameter * / js.Object]
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait Parameter extends js.Object

object Parameter {
  @scala.inline
  implicit def apply(value: Boolean): Parameter = value.asInstanceOf[Parameter]
  @scala.inline
  implicit def apply(value: Double): Parameter = value.asInstanceOf[Parameter]
  @scala.inline
  implicit def apply(value: Null): Parameter = value.asInstanceOf[Parameter]
  @scala.inline
  implicit def apply(
    value: NumberDictionary[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias google.script.client-side.google.script.Parameter */ js.Object
    ]
  ): Parameter = value.asInstanceOf[Parameter]
  @scala.inline
  implicit def apply(value: String): Parameter = value.asInstanceOf[Parameter]
  @scala.inline
  implicit def apply(
    value: StringDictionary[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias google.script.client-side.google.script.Parameter */ js.Object
    ]
  ): Parameter = value.asInstanceOf[Parameter]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Parameter): Parameter = value.asInstanceOf[Parameter]
}

