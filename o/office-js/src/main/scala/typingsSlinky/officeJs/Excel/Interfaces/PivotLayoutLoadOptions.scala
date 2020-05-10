package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the visual layout of the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait PivotLayoutLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
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
  var layoutType: js.UndefOr[Boolean] = js.native
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
  var subtotalLocation: js.UndefOr[Boolean] = js.native
}

object PivotLayoutLoadOptions {
  @scala.inline
  def apply(): PivotLayoutLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotLayoutLoadOptions]
  }
  @scala.inline
  implicit class PivotLayoutLoadOptionsOps[Self <: PivotLayoutLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
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
    def withLayoutType(value: Boolean): Self = {
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
    def withSubtotalLocation(value: Boolean): Self = {
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

