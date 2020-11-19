package typingsSlinky.agGrid

import typingsSlinky.agGrid.colDefMod.ColGroupDef
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.iEventEmitterMod.IEventEmitter
import typingsSlinky.agGrid.originalColumnGroupChildMod.OriginalColumnGroupChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/entities/originalColumnGroup", JSImport.Namespace)
@js.native
object originalColumnGroupMod extends js.Object {
  
  @js.native
  class OriginalColumnGroup protected ()
    extends OriginalColumnGroupChild
       with IEventEmitter {
    def this(colGroupDef: ColGroupDef, groupId: String, padding: Boolean, level: Double) = this()
    
    /* private */ def addLeafColumns(leafColumns: js.Any): js.Any = js.native
    
    var children: js.Any = js.native
    
    var colGroupDef: js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var expandable: js.Any = js.native
    
    var expanded: js.Any = js.native
    
    def getChildren(): js.Array[OriginalColumnGroupChild] = js.native
    
    def getColGroupDef(): ColGroupDef = js.native
    
    def getGroupId(): String = js.native
    
    def getLeafColumns(): js.Array[Column] = js.native
    
    def getLevel(): Double = js.native
    
    var gridApi: js.Any = js.native
    
    var groupId: js.Any = js.native
    
    def isExpandable(): Boolean = js.native
    
    def isExpanded(): Boolean = js.native
    
    def isPadding(): Boolean = js.native
    
    var level: js.Any = js.native
    
    var localEventService: js.Any = js.native
    
    /* private */ def onColumnVisibilityChanged(): js.Any = js.native
    
    var padding: js.Any = js.native
    
    def setChildren(children: js.Array[OriginalColumnGroupChild]): Unit = js.native
    
    def setExpandable(): Unit = js.native
    
    def setExpanded(expanded: Boolean): Unit = js.native
    
    def setupExpandable(): Unit = js.native
  }
  /* static members */
  @js.native
  object OriginalColumnGroup extends js.Object {
    
    var EVENT_EXPANDABLE_CHANGED: String = js.native
    
    var EVENT_EXPANDED_CHANGED: String = js.native
  }
}
