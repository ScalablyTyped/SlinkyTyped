package typingsSlinky.nano

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(config: java.lang.String): typingsSlinky.nano.mod.ServerScope = typingsSlinky.nano.mod.^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nano.mod.ServerScope]
  @scala.inline
  def apply(config: typingsSlinky.nano.mod.Configuration): typingsSlinky.nano.mod.ServerScope = typingsSlinky.nano.mod.^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nano.mod.ServerScope]
  
  type Callback[R] = js.Function3[/* error */ js.Any, /* response */ R, /* headers */ js.UndefOr[js.Any], scala.Unit]
  
  // -------------------------------------
  // View
  // -------------------------------------
  type DocumentInfer[D] = js.Function1[/* doc */ D with typingsSlinky.nano.mod.Document, scala.Unit]
  
  type MangoSelector = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in nano.nano.MangoOperator | string ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nano.nano.MangoSelector * / object | std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nano.nano.MangoSelector * / object> | nano.nano.MangoValue | std.Array<nano.nano.MangoValue>}
    */ typingsSlinky.nano.nanoStrings.MangoSelector with org.scalablytyped.runtime.TopLevel[js.Any]
  
  // http://docs.couchdb.org/en/latest/api/database/find.html#selector-syntax
  type MangoValue = scala.Double | java.lang.String | js.Date | scala.Boolean | js.Object | scala.Null
  
  // http://docs.couchdb.org/en/latest/api/database/find.html#sort-syntax
  type SortOrder = java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[typingsSlinky.nano.nanoStrings.asc | typingsSlinky.nano.nanoStrings.desc])
}
