package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.addTask
import typingsSlinky.devextreme.devextremeStrings.collapseAll
import typingsSlinky.devextreme.devextremeStrings.deleteTask
import typingsSlinky.devextreme.devextremeStrings.expandAll
import typingsSlinky.devextreme.devextremeStrings.redo
import typingsSlinky.devextreme.devextremeStrings.separator
import typingsSlinky.devextreme.devextremeStrings.undo
import typingsSlinky.devextreme.devextremeStrings.zoomIn
import typingsSlinky.devextreme.devextremeStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxGanttToolbar extends js.Object {
  
  /** @name dxGanttToolbar.items */
  var items: js.UndefOr[
    js.Array[
      dxGanttToolbarItem | separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut
    ]
  ] = js.native
}
object dxGanttToolbar {
  
  @scala.inline
  def apply(): dxGanttToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttToolbar]
  }
  
  @scala.inline
  implicit class dxGanttToolbarOps[Self <: dxGanttToolbar] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(
      value: (dxGanttToolbarItem | separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut)*
    ): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(
      value: js.Array[
          dxGanttToolbarItem | separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
