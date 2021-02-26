package typingsSlinky.pgPromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Default library interface (before initialization)
  // API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
  @scala.inline
  def apply[Ext, C /* <: typingsSlinky.pgPromise.pgSubsetMod.IClient */](): typingsSlinky.pgPromise.mod.IMain[Ext, C] = typingsSlinky.pgPromise.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsSlinky.pgPromise.mod.IMain[Ext, C]]
  @scala.inline
  def apply[Ext, C /* <: typingsSlinky.pgPromise.pgSubsetMod.IClient */](options: typingsSlinky.pgPromise.mod.IInitOptions[Ext, C]): typingsSlinky.pgPromise.mod.IMain[Ext, C] = typingsSlinky.pgPromise.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.pgPromise.mod.IMain[Ext, C]]
  
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
  
  @scala.inline
  def as: typingsSlinky.pgPromise.mod.IFormatting = typingsSlinky.pgPromise.mod.^.asInstanceOf[js.Dynamic].selectDynamic("as").asInstanceOf[typingsSlinky.pgPromise.mod.IFormatting]
  
  @scala.inline
  def minify(sql: java.lang.String): java.lang.String = typingsSlinky.pgPromise.mod.^.asInstanceOf[js.Dynamic].applyDynamic("minify")(sql.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def minify(sql: java.lang.String, options: typingsSlinky.pgMinify.mod.IMinifyOptions): java.lang.String = (typingsSlinky.pgPromise.mod.^.asInstanceOf[js.Dynamic].applyDynamic("minify")(sql.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def utils: typingsSlinky.pgPromise.mod.IUtils = typingsSlinky.pgPromise.mod.^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[typingsSlinky.pgPromise.mod.IUtils]
}
