package typingsSlinky.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Object
  - scala.Boolean
  - scala.Double
  - scala.Null
  - js.Array[
/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-query.react-query.QueryKeyPart * / js.Object]
  - js.UndefOr[scala.Nothing]
*/
trait QueryKeyPart extends js.Object

object QueryKeyPart {
  @scala.inline
  implicit def apply(
    value: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-query.react-query.QueryKeyPart */ js.Object
    ]
  ): QueryKeyPart = value.asInstanceOf[QueryKeyPart]
  @scala.inline
  implicit def apply(value: Boolean): QueryKeyPart = value.asInstanceOf[QueryKeyPart]
  @scala.inline
  implicit def apply(value: Double): QueryKeyPart = value.asInstanceOf[QueryKeyPart]
  @scala.inline
  implicit def apply(value: Null): QueryKeyPart = value.asInstanceOf[QueryKeyPart]
  @scala.inline
  implicit def apply(value: js.Object): QueryKeyPart = value.asInstanceOf[QueryKeyPart]
  @scala.inline
  implicit def apply(value: String): QueryKeyPart = value.asInstanceOf[QueryKeyPart]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => QueryKeyPart): QueryKeyPart = value.asInstanceOf[QueryKeyPart]
}

