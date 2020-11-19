package typingsSlinky.agGrid

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.agGrid.clientSideRowModelMod.RowDataTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rowModels/clientSide/immutableService", JSImport.Namespace)
@js.native
object immutableServiceMod extends js.Object {
  
  @js.native
  class ImmutableService () extends js.Object {
    
    var clientSideRowModel: js.Any = js.native
    
    def createTransactionForRowData(data: js.Array[_]): js.Tuple2[RowDataTransaction, StringDictionary[Double]] = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    var rowModel: js.Any = js.native
  }
}
