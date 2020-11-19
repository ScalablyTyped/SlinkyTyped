package typingsSlinky.agGrid

import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.colDefMod.ColGroupDef
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.originalColumnGroupChildMod.OriginalColumnGroupChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/columnController/balancedColumnTreeBuilder", JSImport.Namespace)
@js.native
object balancedColumnTreeBuilderMod extends js.Object {
  
  @js.native
  class BalancedColumnTreeBuilder () extends js.Object {
    
    /* private */ def assignColumnTypes(colDef: js.Any, colDefMerged: js.Any): js.Any = js.native
    
    /* private */ def balanceColumnTree(unbalancedTree: js.Any, currentDept: js.Any, columnDept: js.Any, columnKeyCreator: js.Any): js.Any = js.native
    
    /* private */ def checkForDeprecatedItems(colDef: js.Any): js.Any = js.native
    
    var columnUtils: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createAutoGroupTreeItem(balancedColumnTree: js.Any, column: js.Any): js.Any = js.native
    
    def createBalancedColumnGroups(abstractColDefs: js.Array[ColDef | ColGroupDef], primaryColumns: Boolean): js.Any = js.native
    
    /* private */ def createColumn(columnKeyCreator: js.Any, primaryColumns: js.Any, colDef: js.Any): js.Any = js.native
    
    /* private */ def createColumnGroup(columnKeyCreator: js.Any, primaryColumns: js.Any, colGroupDef: js.Any, level: js.Any): js.Any = js.native
    
    def createForAutoGroups(autoGroupCols: js.Array[Column], gridBalancedTree: js.Array[OriginalColumnGroupChild]): js.Array[OriginalColumnGroupChild] = js.native
    
    /* private */ def createMergedColGroupDef(colGroupDef: js.Any): js.Any = js.native
    
    /* private */ def findDept(balancedColumnTree: js.Any): js.Any = js.native
    
    /* private */ def findMaxDept(treeChildren: js.Any, dept: js.Any): js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def isColumnGroup(abstractColDef: js.Any): js.Any = js.native
    
    var logger: js.Any = js.native
    
    def mergeColDefs(colDef: ColDef): ColDef = js.native
    
    /* private */ def recursivelyCreateColumns(abstractColDefs: js.Any, level: js.Any, columnKeyCreator: js.Any, primaryColumns: js.Any): js.Any = js.native
    
    /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
  }
}
