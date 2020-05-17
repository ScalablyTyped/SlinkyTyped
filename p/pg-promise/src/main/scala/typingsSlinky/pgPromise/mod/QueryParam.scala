package typingsSlinky.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.pgPromise.mod.QueryFile
  - typingsSlinky.pgPromise.mod.IPreparedStatement
  - typingsSlinky.pgPromise.mod.IParameterizedQuery
  - typingsSlinky.pgPromise.mod.PreparedStatement
  - typingsSlinky.pgPromise.mod.ParameterizedQuery
  - js.Function1[
/ * values * / js.UndefOr[js.Any], 
/ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias pg-promise.pg-promise.QueryParam * / js.Object]
*/
trait QueryParam extends js.Object

object QueryParam {
  @scala.inline
  implicit def apply(
    value: js.Function1[
      /* values */ js.UndefOr[js.Any], 
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias pg-promise.pg-promise.QueryParam */ js.Object
    ]
  ): QueryParam = value.asInstanceOf[QueryParam]
  @scala.inline
  implicit def apply(value: IParameterizedQuery): QueryParam = value.asInstanceOf[QueryParam]
  @scala.inline
  implicit def apply(value: IPreparedStatement): QueryParam = value.asInstanceOf[QueryParam]
  @scala.inline
  implicit def apply(value: ParameterizedQuery): QueryParam = value.asInstanceOf[QueryParam]
  @scala.inline
  implicit def apply(value: PreparedStatement): QueryParam = value.asInstanceOf[QueryParam]
  @scala.inline
  implicit def apply(value: QueryFile): QueryParam = value.asInstanceOf[QueryParam]
  @scala.inline
  implicit def apply(value: String): QueryParam = value.asInstanceOf[QueryParam]
}

