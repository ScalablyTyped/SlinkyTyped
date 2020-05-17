package typingsSlinky.exprEval.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - js.Function1[
/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value * / / * repeated * / js.Object, 
/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value * / js.Object]
  - org.scalablytyped.runtime.StringDictionary[
/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value * / js.Object]
*/
trait Value extends js.Object

object Value {
  @scala.inline
  implicit def apply(value: Double): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(
    value: js.Function1[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ /* repeated */ js.Object, 
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ js.Object
    ]
  ): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(value: String): Value = value.asInstanceOf[Value]
  @scala.inline
  implicit def apply(
    value: StringDictionary[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias expr-eval.expr-eval.Value */ js.Object
    ]
  ): Value = value.asInstanceOf[Value]
}

