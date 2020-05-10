package typingsSlinky.agGrid.dragAndDropServiceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragItem extends js.Object {
  var columns: js.UndefOr[js.Array[Column]] = js.native
  var rowNode: js.UndefOr[RowNode] = js.native
  var visibleState: js.UndefOr[StringDictionary[Boolean]] = js.native
}

object DragItem {
  @scala.inline
  def apply(): DragItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragItem]
  }
  @scala.inline
  implicit class DragItemOps[Self <: DragItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withRowNode(value: RowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNode")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleState(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleState")(js.undefined)
        ret
    }
  }
  
}

