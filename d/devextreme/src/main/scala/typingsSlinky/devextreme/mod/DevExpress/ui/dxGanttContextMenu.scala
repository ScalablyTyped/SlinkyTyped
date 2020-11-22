package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.addTask
import typingsSlinky.devextreme.devextremeStrings.collapseAll
import typingsSlinky.devextreme.devextremeStrings.deleteDependency
import typingsSlinky.devextreme.devextremeStrings.deleteTask
import typingsSlinky.devextreme.devextremeStrings.expandAll
import typingsSlinky.devextreme.devextremeStrings.redo
import typingsSlinky.devextreme.devextremeStrings.taskDetails
import typingsSlinky.devextreme.devextremeStrings.undo
import typingsSlinky.devextreme.devextremeStrings.zoomIn
import typingsSlinky.devextreme.devextremeStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxGanttContextMenu extends js.Object {
  
  /**
    * [descr:dxGanttContextMenu.enabled]
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxGanttContextMenu.items]
    */
  var items: js.UndefOr[
    js.Array[
      dxGanttContextMenuItem | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | deleteDependency | taskDetails
    ]
  ] = js.native
}
object dxGanttContextMenu {
  
  @scala.inline
  def apply(): dxGanttContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttContextMenu]
  }
  
  @scala.inline
  implicit class dxGanttContextMenuOps[Self <: dxGanttContextMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setItemsVarargs(
      value: (dxGanttContextMenuItem | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | deleteDependency | taskDetails)*
    ): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(
      value: js.Array[
          dxGanttContextMenuItem | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | deleteDependency | taskDetails
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
