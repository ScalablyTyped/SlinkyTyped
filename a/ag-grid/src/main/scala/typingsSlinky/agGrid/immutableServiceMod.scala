package typingsSlinky.agGrid

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.agGrid.clientSideRowModelMod.RowDataTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immutableServiceMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/clientSide/immutableService", "ImmutableService")
  @js.native
  class ImmutableService () extends StObject {
    
    var clientSideRowModel: js.Any = js.native
    
    def createTransactionForRowData(data: js.Array[_]): js.Tuple2[RowDataTransaction, StringDictionary[Double]] = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    var rowModel: js.Any = js.native
  }
}
