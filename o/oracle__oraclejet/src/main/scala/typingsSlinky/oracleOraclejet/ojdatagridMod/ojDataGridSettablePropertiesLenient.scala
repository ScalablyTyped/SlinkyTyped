package typingsSlinky.oracleOraclejet.ojdatagridMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.AccessibleActionableMode
import typingsSlinky.oracleOraclejet.anon.Cell
import typingsSlinky.oracleOraclejet.anon.ClassName
import typingsSlinky.oracleOraclejet.anon.Column
import typingsSlinky.oracleOraclejet.anon.ColumnEnd
import typingsSlinky.oracleOraclejet.anon.ColumnIndex
import typingsSlinky.oracleOraclejet.anon.Horizontal
import typingsSlinky.oracleOraclejet.anon.MaxColumnCount
import typingsSlinky.oracleOraclejet.anon.Reorder
import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.Selection
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cellEdit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.cellNavigation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdatagrid.ojDataGridSettableProperties<K, D>> */
@js.native
trait ojDataGridSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var bandingInterval: js.UndefOr[Column] = js.native
  var cell: js.UndefOr[ClassName[K, D]] = js.native
  var currentCell: js.UndefOr[CurrentCell[K]] = js.native
  var data: js.UndefOr[DataProvider[K, D]] = js.native
  var dnd: js.UndefOr[Reorder] = js.native
  var editMode: js.UndefOr[none | cellNavigation | cellEdit] = js.native
  var gridlines: js.UndefOr[Horizontal] = js.native
  var header: js.UndefOr[ColumnEnd[K, D]] = js.native
  var scrollPolicy: js.UndefOr[auto | loadMoreOnScroll | scroll] = js.native
  var scrollPolicyOptions: js.UndefOr[MaxColumnCount] = js.native
  var scrollPosition: js.UndefOr[ColumnIndex[K]] = js.native
  var selection: js.UndefOr[js.Array[Selection[K]]] = js.native
  var selectionMode: js.UndefOr[Cell] = js.native
  var translations: js.UndefOr[AccessibleActionableMode] = js.native
}

object ojDataGridSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](): ojDataGridSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDataGridSettablePropertiesLenient[K, D]]
  }
  @scala.inline
  implicit class ojDataGridSettablePropertiesLenientOps[Self[k, d] <: ojDataGridSettablePropertiesLenient[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withBandingInterval(value: Column): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandingInterval: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withCell(value: ClassName[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentCell(value: CurrentCell[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentCell: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCell")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDnd(value: Reorder): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnd: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(js.undefined)
        ret
    }
    @scala.inline
    def withEditMode(value: none | cellNavigation | cellEdit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditMode: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGridlines(value: Horizontal): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridlines: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: ColumnEnd[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPolicy(value: auto | loadMoreOnScroll | scroll): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPolicy: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPolicyOptions(value: MaxColumnCount): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPolicyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPolicyOptions: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPolicyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPosition(value: ColumnIndex[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPosition: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[Selection[K]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: Cell): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: AccessibleActionableMode): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

