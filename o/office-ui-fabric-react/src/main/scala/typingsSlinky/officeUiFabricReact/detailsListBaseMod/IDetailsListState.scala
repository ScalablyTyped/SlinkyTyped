package typingsSlinky.officeUiFabricReact.detailsListBaseMod

import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListState extends js.Object {
  var adjustedColumns: js.Array[IColumn] = js.native
  var focusedItemIndex: Double = js.native
  var isCollapsed: js.UndefOr[Boolean] = js.native
  var isDropping: js.UndefOr[Boolean] = js.native
  var isSizing: js.UndefOr[Boolean] = js.native
  var isSomeGroupExpanded: js.UndefOr[Boolean] = js.native
  var lastSelectionMode: js.UndefOr[SelectionMode] = js.native
  var lastWidth: js.UndefOr[Double] = js.native
}

object IDetailsListState {
  @scala.inline
  def apply(adjustedColumns: js.Array[IColumn], focusedItemIndex: Double): IDetailsListState = {
    val __obj = js.Dynamic.literal(adjustedColumns = adjustedColumns.asInstanceOf[js.Any], focusedItemIndex = focusedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListState]
  }
  @scala.inline
  implicit class IDetailsListStateOps[Self <: IDetailsListState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustedColumns(value: js.Array[IColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDropping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDropping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropping")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSizing")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSomeGroupExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSomeGroupExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSomeGroupExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSomeGroupExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSelectionMode(value: SelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSelectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSelectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWidth")(js.undefined)
        ret
    }
  }
  
}

