package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowConfig extends js.Object {
  var enableCellSelection: Boolean = js.native
  var enableRowSelection: Boolean = js.native
  var jqueryUITheme: Boolean = js.native
  var rowClasses: js.Array[String] = js.native
  var rowHeight: Double = js.native
  var selectWithCheckboxOnly: Boolean = js.native
  var selectedItems: js.Array[_] = js.native
  def afterSelectionChangeCallback(): Unit = js.native
  def beforeSelectionChangeCallback(): Unit = js.native
}

object IRowConfig {
  @scala.inline
  def apply(
    afterSelectionChangeCallback: () => Unit,
    beforeSelectionChangeCallback: () => Unit,
    enableCellSelection: Boolean,
    enableRowSelection: Boolean,
    jqueryUITheme: Boolean,
    rowClasses: js.Array[String],
    rowHeight: Double,
    selectWithCheckboxOnly: Boolean,
    selectedItems: js.Array[_]
  ): IRowConfig = {
    val __obj = js.Dynamic.literal(afterSelectionChangeCallback = js.Any.fromFunction0(afterSelectionChangeCallback), beforeSelectionChangeCallback = js.Any.fromFunction0(beforeSelectionChangeCallback), enableCellSelection = enableCellSelection.asInstanceOf[js.Any], enableRowSelection = enableRowSelection.asInstanceOf[js.Any], jqueryUITheme = jqueryUITheme.asInstanceOf[js.Any], rowClasses = rowClasses.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], selectWithCheckboxOnly = selectWithCheckboxOnly.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowConfig]
  }
  @scala.inline
  implicit class IRowConfigOps[Self <: IRowConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterSelectionChangeCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionChangeCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeforeSelectionChangeCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelectionChangeCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableCellSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableRowSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJqueryUITheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqueryUITheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectWithCheckboxOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectWithCheckboxOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

