package typingsSlinky.oracleOraclejet.ojdatagridMod

import typingsSlinky.oracleOraclejet.AnonAccessibleActionableMode
import typingsSlinky.oracleOraclejet.AnonCell
import typingsSlinky.oracleOraclejet.AnonClassName
import typingsSlinky.oracleOraclejet.AnonColumn
import typingsSlinky.oracleOraclejet.AnonColumnEnd
import typingsSlinky.oracleOraclejet.AnonColumnIndex
import typingsSlinky.oracleOraclejet.AnonHorizontal
import typingsSlinky.oracleOraclejet.AnonMaxColumnCount
import typingsSlinky.oracleOraclejet.AnonReorder
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
  var bandingInterval: AnonColumn = js.native
  var cell: AnonClassName[K, D] = js.native
  var currentCell: CurrentCell[K] | Null = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var dnd: AnonReorder = js.native
  var editMode: none | cellNavigation | cellEdit = js.native
  var gridlines: AnonHorizontal = js.native
  var header: AnonColumnEnd[K, D] = js.native
  var scrollPolicy: auto | loadMoreOnScroll | scroll = js.native
  var scrollPolicyOptions: AnonMaxColumnCount = js.native
  var scrollPosition: AnonColumnIndex[K] = js.native
  var selection: js.Array[Selection[K]] = js.native
  var selectionMode: AnonCell = js.native
  @JSName("translations")
  var translations_ojDataGridSettableProperties: AnonAccessibleActionableMode = js.native
}

object ojDataGridSettableProperties {
  @scala.inline
  def apply[K, D](
    bandingInterval: AnonColumn,
    cell: AnonClassName[K, D],
    dnd: AnonReorder,
    editMode: none | cellNavigation | cellEdit,
    gridlines: AnonHorizontal,
    header: AnonColumnEnd[K, D],
    scrollPolicy: auto | loadMoreOnScroll | scroll,
    scrollPolicyOptions: AnonMaxColumnCount,
    scrollPosition: AnonColumnIndex[K],
    selection: js.Array[Selection[K]],
    selectionMode: AnonCell,
    translations: AnonAccessibleActionableMode
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
    def withBandingInterval(value: AnonColumn): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCell(value: AnonClassName[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnd(value: AnonReorder): Self[K, D] = {
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
    def withGridlines(value: AnonHorizontal): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: AnonColumnEnd[K, D]): Self[K, D] = {
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
    def withScrollPolicyOptions(value: AnonMaxColumnCount): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPolicyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPosition(value: AnonColumnIndex[K]): Self[K, D] = {
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
    def withSelectionMode(value: AnonCell): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AnonAccessibleActionableMode): Self[K, D] = {
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

