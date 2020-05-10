package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * An object encapsulating a conditional format's range, format, rule, and other properties.
  To learn more about the conditional formatting object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-conditional-formatting | Apply conditional formatting to Excel ranges}.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValue: js.UndefOr[CellValueConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValueOrNullObject: js.UndefOr[CellValueConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScale: js.UndefOr[ColorScaleConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScaleOrNullObject: js.UndefOr[ColorScaleConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var custom: js.UndefOr[CustomConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var customOrNullObject: js.UndefOr[CustomConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBar: js.UndefOr[DataBarConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBarOrNullObject: js.UndefOr[DataBarConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSet: js.UndefOr[IconSetConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSetOrNullObject: js.UndefOr[IconSetConditionalFormatLoadOptions] = js.native
  /**
    *
    * The Priority of the Conditional Format within the current ConditionalFormatCollection. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var preset: js.UndefOr[PresetCriteriaConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var presetOrNullObject: js.UndefOr[PresetCriteriaConditionalFormatLoadOptions] = js.native
  /**
    *
    * The priority (or index) within the conditional format collection that this conditional format currently exists in. Changing this also
    changes other conditional formats' priorities, to allow for a contiguous priority order.
    Use a negative priority to begin from the back.
    Priorities greater than than bounds will get and set to the maximum (or minimum if negative) priority.
    Also note that if you change the priority, you have to re-fetch a new copy of the object at that new priority location if you want to make further changes to it. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var priority: js.UndefOr[Boolean] = js.native
  /**
    *
    * If the conditions of this conditional format are met, no lower-priority formats shall take effect on that cell.
    Null on databars, icon sets, and colorscales as there's no concept of StopIfTrue for these
    *
    * [Api set: ExcelApi 1.6]
    */
  var stopIfTrue: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparison: js.UndefOr[TextConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparisonOrNullObject: js.UndefOr[TextConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottom: js.UndefOr[TopBottomConditionalFormatLoadOptions] = js.native
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottomOrNullObject: js.UndefOr[TopBottomConditionalFormatLoadOptions] = js.native
  /**
    *
    * A type of conditional format. Only one can be set at a time. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: js.UndefOr[Boolean] = js.native
}

object ConditionalFormatLoadOptions {
  @scala.inline
  def apply(): ConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatLoadOptions]
  }
  @scala.inline
  implicit class ConditionalFormatLoadOptionsOps[Self <: ConditionalFormatLoadOptions] (val x: Self) extends AnyVal {
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
    def withCellValue(value: CellValueConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCellValueOrNullObject(value: CellValueConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValueOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellValueOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValueOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withColorScale(value: ColorScaleConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScale")(js.undefined)
        ret
    }
    @scala.inline
    def withColorScaleOrNullObject(value: ColorScaleConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScaleOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScaleOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScaleOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: CustomConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomOrNullObject(value: CustomConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBar(value: DataBarConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBar")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBarOrNullObject(value: DataBarConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBarOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBarOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBarOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSet(value: IconSetConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSet")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSetOrNullObject(value: IconSetConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSetOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSetOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSetOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: PresetCriteriaConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withPresetOrNullObject(value: PresetCriteriaConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presetOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresetOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presetOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withStopIfTrue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopIfTrue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopIfTrue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopIfTrue")(js.undefined)
        ret
    }
    @scala.inline
    def withTextComparison(value: TextConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComparison")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextComparison: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComparison")(js.undefined)
        ret
    }
    @scala.inline
    def withTextComparisonOrNullObject(value: TextConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComparisonOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextComparisonOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComparisonOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withTopBottom(value: TopBottomConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withTopBottomOrNullObject(value: TopBottomConditionalFormatLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBottomOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopBottomOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBottomOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

