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
  implicit class ojDataGridSettablePropertiesOps[Self <: ojDataGridSettableProperties[_, _], K, D] (val x: Self with (ojDataGridSettableProperties[K, D])) extends AnyVal {
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
    def setBandingInterval(value: Column): Self = this.set("bandingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setCell(value: ClassName[K, D]): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setDnd(value: Reorder): Self = this.set("dnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditMode(value: none | cellNavigation | cellEdit): Self = this.set("editMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridlines(value: Horizontal): Self = this.set("gridlines", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: ColumnEnd[K, D]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPolicy(value: auto | loadMoreOnScroll | scroll): Self = this.set("scrollPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPolicyOptions(value: MaxColumnCount): Self = this.set("scrollPolicyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollPosition(value: ColumnIndex[K]): Self = this.set("scrollPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionVarargs(value: Selection[K]*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[Selection[K]]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionMode(value: Cell): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: AccessibleActionableMode): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentCell(value: CurrentCell[K]): Self = this.set("currentCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentCellNull: Self = this.set("currentCell", null)
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
  
}

