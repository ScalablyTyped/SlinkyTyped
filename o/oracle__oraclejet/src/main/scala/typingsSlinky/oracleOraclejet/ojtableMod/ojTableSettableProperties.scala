package typingsSlinky.oracleOraclejet.ojtableMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.ColumnKey
import typingsSlinky.oracleOraclejet.anon.DropReorder
import typingsSlinky.oracleOraclejet.anon.Field
import typingsSlinky.oracleOraclejet.anon.FooterClassName
import typingsSlinky.oracleOraclejet.anon.LabelAccSelectionAffordanceBottom
import typingsSlinky.oracleOraclejet.anon.MaxCount
import typingsSlinky.oracleOraclejet.anon.RowHeader
import typingsSlinky.oracleOraclejet.anon.`19`
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowRendererContext
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.grid
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.list
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rowEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTableSettableProperties[K, D] extends baseComponentSettableProperties {
  var accessibility: RowHeader
  var as: String
  var columns: (js.Array[Field[K, D]]) | Null
  var columnsDefault: FooterClassName[K, D]
  var currentRow: CurrentRow[K] | Null
  var data: (DataProvider[K, D]) | Null
  var display: list | grid
  var dnd: DropReorder[K, D]
  var editMode: none | rowEdit
  val firstSelectedRow: js.Object
  var horizontalGridVisible: auto | enabled | disabled
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null
  var scrollPolicy: auto | loadMoreOnScroll
  var scrollPolicyOptions: MaxCount
  var scrollPosition: ColumnKey
  var selection: js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ]
  var selectionMode: `19`
  var selectionRequired: Boolean
  @JSName("translations")
  var translations_ojTableSettableProperties: LabelAccSelectionAffordanceBottom
  var verticalGridVisible: auto | enabled | disabled
}

object ojTableSettableProperties {
  @scala.inline
  def apply[K, D](
    accessibility: RowHeader,
    as: String,
    columnsDefault: FooterClassName[K, D],
    display: list | grid,
    dnd: DropReorder[K, D],
    editMode: none | rowEdit,
    firstSelectedRow: js.Object,
    horizontalGridVisible: auto | enabled | disabled,
    scrollPolicy: auto | loadMoreOnScroll,
    scrollPolicyOptions: MaxCount,
    scrollPosition: ColumnKey,
    selection: js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ],
    selectionMode: `19`,
    selectionRequired: Boolean,
    translations: LabelAccSelectionAffordanceBottom,
    verticalGridVisible: auto | enabled | disabled,
    columns: js.Array[Field[K, D]] = null,
    currentRow: CurrentRow[K] = null,
    data: DataProvider[K, D] = null,
    rowRenderer: /* context */ RowRendererContext[K, D] => String | HTMLElement | Unit = null
  ): ojTableSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(accessibility = accessibility.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], columnsDefault = columnsDefault.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], firstSelectedRow = firstSelectedRow.asInstanceOf[js.Any], horizontalGridVisible = horizontalGridVisible.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], selectionRequired = selectionRequired.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], verticalGridVisible = verticalGridVisible.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], currentRow = currentRow.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowRenderer = js.Any.fromFunction1(rowRenderer))
    __obj.asInstanceOf[ojTableSettableProperties[K, D]]
  }
}

