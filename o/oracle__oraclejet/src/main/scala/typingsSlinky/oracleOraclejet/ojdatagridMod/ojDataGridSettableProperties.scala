package typingsSlinky.oracleOraclejet.ojdatagridMod

import typingsSlinky.oracleOraclejet.anon.AccessibleActionableMode
import typingsSlinky.oracleOraclejet.anon.Cell
import typingsSlinky.oracleOraclejet.anon.ClassName
import typingsSlinky.oracleOraclejet.anon.Column
import typingsSlinky.oracleOraclejet.anon.ColumnEnd
import typingsSlinky.oracleOraclejet.anon.ColumnIndex
import typingsSlinky.oracleOraclejet.anon.Horizontal
import typingsSlinky.oracleOraclejet.anon.MaxColumnCount
import typingsSlinky.oracleOraclejet.anon.Reorder
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
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

@js.native
trait ojDataGridSettableProperties[K, D] extends baseComponentSettableProperties {
  var bandingInterval: Column = js.native
  var cell: ClassName[K, D] = js.native
  var currentCell: CurrentCell[K] | Null = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var dnd: Reorder = js.native
  var editMode: none | cellNavigation | cellEdit = js.native
  var gridlines: Horizontal = js.native
  var header: ColumnEnd[K, D] = js.native
  var scrollPolicy: auto | loadMoreOnScroll | scroll = js.native
  var scrollPolicyOptions: MaxColumnCount = js.native
  var scrollPosition: ColumnIndex[K] = js.native
  var selection: js.Array[Selection[K]] = js.native
  var selectionMode: Cell = js.native
  @JSName("translations")
  var translations_ojDataGridSettableProperties: AccessibleActionableMode = js.native
}

object ojDataGridSettableProperties {
  @scala.inline
  def apply[K, D](
    bandingInterval: Column,
    cell: ClassName[K, D],
    dnd: Reorder,
    editMode: none | cellNavigation | cellEdit,
    gridlines: Horizontal,
    header: ColumnEnd[K, D],
    scrollPolicy: auto | loadMoreOnScroll | scroll,
    scrollPolicyOptions: MaxColumnCount,
    scrollPosition: ColumnIndex[K],
    selection: js.Array[Selection[K]],
    selectionMode: Cell,
    translations: AccessibleActionableMode
  ): ojDataGridSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(bandingInterval = bandingInterval.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], gridlines = gridlines.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDataGridSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojDataGridSettablePropertiesOps[Self[k, d] <: ojDataGridSettableProperties[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
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
    def withCell(value: ClassName[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnd(value: Reorder): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditMode(value: none | cellNavigation | cellEdit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridlines(value: Horizontal): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: ColumnEnd[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPolicy(value: auto | loadMoreOnScroll | scroll): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPolicyOptions(value: MaxColumnCount): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPolicyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPosition(value: ColumnIndex[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: js.Array[Selection[K]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: Cell): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AccessibleActionableMode): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentCell(value: CurrentCell[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentCellNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCell")(null)
        ret
    }
    @scala.inline
    def withData(value: DataProvider[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
  }
  
}

