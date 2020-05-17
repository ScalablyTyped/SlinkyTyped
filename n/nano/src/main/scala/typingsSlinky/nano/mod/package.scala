package typingsSlinky.nano

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[R] = js.Function3[/* error */ js.Any, /* response */ R, /* headers */ js.UndefOr[js.Any], scala.Unit]
  // -------------------------------------
  // View
  // -------------------------------------
  type DocumentInfer[D] = js.Function1[/* doc */ D with typingsSlinky.nano.mod.Document, scala.Unit]
  type FollowUpdatesParamsFilterFunction = js.Function2[/* doc */ js.Any, /* req */ js.Any, scala.Boolean]
  type MangoSelector = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in nano.nano.MangoOperator | string ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nano.nano.MangoSelector * / object | nano.nano.MangoValue | std.Array<nano.nano.MangoValue>}
    */ typingsSlinky.nano.nanoStrings.MangoSelector with org.scalablytyped.runtime.TopLevel[js.Any]
  type RequestFunction = js.Function2[
    /* options */ js.UndefOr[typingsSlinky.nano.mod.RequestOptions | java.lang.String], 
    /* callback */ js.UndefOr[typingsSlinky.nano.mod.Callback[js.Any]], 
    scala.Unit
  ]
}
