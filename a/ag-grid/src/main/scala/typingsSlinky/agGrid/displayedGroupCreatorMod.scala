package typingsSlinky.agGrid

import typingsSlinky.agGrid.columnGroupChildMod.ColumnGroupChild
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.groupInstanceIdCreatorMod.GroupInstanceIdCreator
import typingsSlinky.agGrid.originalColumnGroupChildMod.OriginalColumnGroupChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/columnController/displayedGroupCreator", JSImport.Namespace)
@js.native
object displayedGroupCreatorMod extends js.Object {
  
  @js.native
  class DisplayedGroupCreator () extends js.Object {
    
    var columnUtils: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createColumnGroup(originalGroup: js.Any, groupInstanceIdCreator: js.Any, oldColumnsMapped: js.Any): js.Any = js.native
    
    def createDisplayedGroups(
      sortedVisibleColumns: js.Array[Column],
      balancedColumnTree: js.Array[OriginalColumnGroupChild],
      groupInstanceIdCreator: GroupInstanceIdCreator
    ): js.Array[ColumnGroupChild] = js.native
    def createDisplayedGroups(
      sortedVisibleColumns: js.Array[Column],
      balancedColumnTree: js.Array[OriginalColumnGroupChild],
      groupInstanceIdCreator: GroupInstanceIdCreator,
      oldDisplayedGroups: js.Array[ColumnGroupChild]
    ): js.Array[ColumnGroupChild] = js.native
    
    /* private */ def getOriginalPathForColumn(balancedColumnTree: js.Any, column: js.Any): js.Any = js.native
    
    /* private */ def mapOldGroupsById(displayedGroups: js.Any): js.Any = js.native
    
    /* private */ def setupParentsIntoColumns(columnsOrGroups: js.Any, parent: js.Any): js.Any = js.native
  }
}
