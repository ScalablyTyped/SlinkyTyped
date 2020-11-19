package typingsSlinky.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type QueryColumns = typingsSlinky.pgPromise.mod.Column[js.Any] | typingsSlinky.pgPromise.mod.ColumnSet[js.Any] | (js.Array[
    java.lang.String | typingsSlinky.pgPromise.mod.IColumnConfig[js.Any] | typingsSlinky.pgPromise.mod.Column[js.Any]
  ])
  
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
  type QueryParam = typingsSlinky.pgPromise.mod._QueryParam | (js.Function1[
    /* values */ js.UndefOr[js.Any], 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias pg-promise.pg-promise.QueryParam */ js.Object
  ]) | java.lang.String
  
  type ValidSchema = java.lang.String | js.Array[java.lang.String] | scala.Null | scala.Unit
  
  type XPromise[T] = js.Promise[T]
}
