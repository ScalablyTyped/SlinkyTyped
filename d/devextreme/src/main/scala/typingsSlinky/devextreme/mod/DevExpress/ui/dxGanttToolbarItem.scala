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
import scala.scalajs.js.annotation._

@js.native
trait dxGanttToolbarItem extends dxToolbarItem {
  /** @name dxGanttToolbarItem.name */
  var name: js.UndefOr[
    separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | String
  ] = js.native
}

object dxGanttToolbarItem {
  @scala.inline
  def apply(): dxGanttToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttToolbarItem]
  }
  @scala.inline
  implicit class dxGanttToolbarItemOps[Self <: dxGanttToolbarItem] (val x: Self) extends AnyVal {
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
    def setName(
      value: separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | String
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

