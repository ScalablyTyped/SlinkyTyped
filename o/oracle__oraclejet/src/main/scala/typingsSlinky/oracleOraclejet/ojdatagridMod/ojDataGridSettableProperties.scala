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

trait ojDataGridSettableProperties[K, D] extends baseComponentSettableProperties {
  var bandingInterval: Column
  var cell: ClassName[K, D]
  var currentCell: CurrentCell[K] | Null
  var data: (DataProvider[K, D]) | Null
  var dnd: Reorder
  var editMode: none | cellNavigation | cellEdit
  var gridlines: Horizontal
  var header: ColumnEnd[K, D]
  var scrollPolicy: auto | loadMoreOnScroll | scroll
  var scrollPolicyOptions: MaxColumnCount
  var scrollPosition: ColumnIndex[K]
  var selection: js.Array[Selection[K]]
  var selectionMode: Cell
  @JSName("translations")
  var translations_ojDataGridSettableProperties: AccessibleActionableMode
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
    translations: AccessibleActionableMode,
    currentCell: CurrentCell[K] = null,
    data: DataProvider[K, D] = null
  ): ojDataGridSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(bandingInterval = bandingInterval.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], gridlines = gridlines.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], currentCell = currentCell.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDataGridSettableProperties[K, D]]
  }
}

