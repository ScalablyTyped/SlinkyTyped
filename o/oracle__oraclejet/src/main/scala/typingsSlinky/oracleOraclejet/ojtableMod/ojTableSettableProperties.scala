package typingsSlinky.oracleOraclejet.ojtableMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.Anon19
import typingsSlinky.oracleOraclejet.AnonColumnKey
import typingsSlinky.oracleOraclejet.AnonDropReorder
import typingsSlinky.oracleOraclejet.AnonField
import typingsSlinky.oracleOraclejet.AnonFooterClassName
import typingsSlinky.oracleOraclejet.AnonLabelAccSelectionAffordanceBottom
import typingsSlinky.oracleOraclejet.AnonMaxCount
import typingsSlinky.oracleOraclejet.AnonRowHeader
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

@js.native
trait ojTableSettableProperties[K, D] extends baseComponentSettableProperties {
  var accessibility: AnonRowHeader = js.native
  var as: String = js.native
  var columns: (js.Array[AnonField[K, D]]) | Null = js.native
  var columnsDefault: AnonFooterClassName[K, D] = js.native
  var currentRow: CurrentRow[K] | Null = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: list | grid = js.native
  var dnd: AnonDropReorder[K, D] = js.native
  var editMode: none | rowEdit = js.native
  val firstSelectedRow: js.Object = js.native
  var horizontalGridVisible: auto | enabled | disabled = js.native
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null = js.native
  var scrollPolicy: auto | loadMoreOnScroll = js.native
  var scrollPolicyOptions: AnonMaxCount = js.native
  var scrollPosition: AnonColumnKey = js.native
  var selection: js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ] = js.native
  var selectionMode: Anon19 = js.native
  var selectionRequired: Boolean = js.native
  @JSName("translations")
  var translations_ojTableSettableProperties: AnonLabelAccSelectionAffordanceBottom = js.native
  var verticalGridVisible: auto | enabled | disabled = js.native
}

object ojTableSettableProperties {
  @scala.inline
  def apply[K, D](
    accessibility: AnonRowHeader,
    as: String,
    columnsDefault: AnonFooterClassName[K, D],
    display: list | grid,
    dnd: AnonDropReorder[K, D],
    editMode: none | rowEdit,
    firstSelectedRow: js.Object,
    horizontalGridVisible: auto | enabled | disabled,
    scrollPolicy: auto | loadMoreOnScroll,
    scrollPolicyOptions: AnonMaxCount,
    scrollPosition: AnonColumnKey,
    selection: js.Array[
      (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
    ],
    selectionMode: Anon19,
    selectionRequired: Boolean,
    translations: AnonLabelAccSelectionAffordanceBottom,
    verticalGridVisible: auto | enabled | disabled
  ): ojTableSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(accessibility = accessibility.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], columnsDefault = columnsDefault.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], firstSelectedRow = firstSelectedRow.asInstanceOf[js.Any], horizontalGridVisible = horizontalGridVisible.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], selectionRequired = selectionRequired.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], verticalGridVisible = verticalGridVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTableSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojTableSettablePropertiesOps[Self[k, d] <: ojTableSettableProperties[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withAccessibility(value: AnonRowHeader): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnsDefault(value: AnonFooterClassName[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: list | grid): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnd(value: AnonDropReorder[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditMode(value: none | rowEdit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstSelectedRow(value: js.Object): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSelectedRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalGridVisible(value: auto | enabled | disabled): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalGridVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPolicy(value: auto | loadMoreOnScroll): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPolicyOptions(value: AnonMaxCount): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPolicyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPosition(value: AnonColumnKey): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(
      value: js.Array[
          (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
        ]
    ): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: Anon19): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionRequired(value: Boolean): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AnonLabelAccSelectionAffordanceBottom): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalGridVisible(value: auto | enabled | disabled): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGridVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[AnonField[K, D]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnsNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(null)
        ret
    }
    @scala.inline
    def withCurrentRow(value: CurrentRow[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentRowNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRow")(null)
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
    @scala.inline
    def withRowRenderer(value: /* context */ RowRendererContext[K, D] => String | HTMLElement | Unit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowRendererNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRenderer")(null)
        ret
    }
  }
  
}

