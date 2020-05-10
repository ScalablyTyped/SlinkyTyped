package typingsSlinky.agGrid.groupCellRendererMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.colDefMod.ColDef
import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.iCellRendererMod.ICellRendererParams
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupCellRendererParams extends ICellRendererParams {
  var actualValue: String = js.native
  var checkbox: js.Any = js.native
  var footerValueGetter: js.Any = js.native
  var fullWidth: Boolean = js.native
  var padding: Double = js.native
  var pinned: String = js.native
  var scope: js.Any = js.native
  var suppressCount: Boolean = js.native
  var suppressDoubleClickExpand: Boolean = js.native
  var suppressPadding: Boolean = js.native
}

object GroupCellRendererParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    actualValue: String,
    addRenderedRowListener: (String, js.Function) => Unit,
    api: GridApi,
    checkbox: js.Any,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    eGridCell: HTMLElement,
    eParentOfValue: HTMLElement,
    footerValueGetter: js.Any,
    formatValue: js.Any => js.Any,
    fullWidth: Boolean,
    getValue: () => js.Any,
    node: RowNode,
    padding: Double,
    pinned: String,
    refreshCell: () => Unit,
    rowIndex: Double,
    scope: js.Any,
    setValue: js.Any => Unit,
    suppressCount: Boolean,
    suppressDoubleClickExpand: Boolean,
    suppressPadding: Boolean,
    value: js.Any,
    valueFormatted: js.Any
  ): GroupCellRendererParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], actualValue = actualValue.asInstanceOf[js.Any], addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eGridCell = eGridCell.asInstanceOf[js.Any], eParentOfValue = eParentOfValue.asInstanceOf[js.Any], footerValueGetter = footerValueGetter.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), fullWidth = fullWidth.asInstanceOf[js.Any], getValue = js.Any.fromFunction0(getValue), node = node.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], refreshCell = js.Any.fromFunction0(refreshCell), rowIndex = rowIndex.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue), suppressCount = suppressCount.asInstanceOf[js.Any], suppressDoubleClickExpand = suppressDoubleClickExpand.asInstanceOf[js.Any], suppressPadding = suppressPadding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueFormatted = valueFormatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCellRendererParams]
  }
  @scala.inline
  implicit class GroupCellRendererParamsOps[Self <: GroupCellRendererParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckbox(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterValueGetter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerValueGetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressDoubleClickExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressDoubleClickExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressPadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPadding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

