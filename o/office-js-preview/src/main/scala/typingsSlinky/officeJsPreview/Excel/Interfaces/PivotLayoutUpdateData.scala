package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.PivotLayoutType
import typingsSlinky.officeJsPreview.Excel.SubtotalLocationType
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AtBottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AtTop
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Compact
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Off
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Outline
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Tabular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotLayout object, for use in `pivotLayout.set({ ... })`. */
@js.native
trait PivotLayoutUpdateData extends js.Object {
  /**
    *
    * Specifies whether formatting will be automatically formatted when it’s refreshed or when fields are moved
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether the field list can be shown in the UI.
    *
    * [Api set: ExcelApi 1.10]
    */
  var enableFieldList: js.UndefOr[Boolean] = js.native
  /**
    *
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: js.UndefOr[PivotLayoutType | Compact | Tabular | Outline] = js.native
  /**
    *
    * The style applied to the PivotTable.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var pivotStyle: js.UndefOr[PivotTableStyleUpdateData] = js.native
  /**
    *
    * Specifies whether formatting is preserved when the report is refreshed or recalculated by operations such as pivoting, sorting, or changing page field items.
    *
    * [Api set: ExcelApi 1.9]
    */
  var preserveFormatting: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether the PivotTable report shows grand totals for columns.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether the PivotTable report shows grand totals for rows.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.native
  /**
    *
    * This property indicates the SubtotalLocationType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotalLocation: js.UndefOr[SubtotalLocationType | AtTop | AtBottom | Off] = js.native
}

object PivotLayoutUpdateData {
  @scala.inline
  def apply(): PivotLayoutUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotLayoutUpdateData]
  }
  @scala.inline
  implicit class PivotLayoutUpdateDataOps[Self <: PivotLayoutUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFieldList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFieldList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFieldList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFieldList")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutType(value: PivotLayoutType | Compact | Tabular | Outline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutType")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotStyle(value: PivotTableStyleUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveFormatting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveFormatting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFormatting")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnGrandTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnGrandTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnGrandTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnGrandTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowGrandTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowGrandTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowGrandTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowGrandTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtotalLocation(value: SubtotalLocationType | AtTop | AtBottom | Off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotalLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtotalLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotalLocation")(js.undefined)
        ret
    }
  }
  
}

