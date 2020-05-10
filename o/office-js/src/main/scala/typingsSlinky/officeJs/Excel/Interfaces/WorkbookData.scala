package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `workbook.toJSON()`. */
@js.native
trait WorkbookData extends js.Object {
  /**
    *
    * Specifies whether or not the workbook is in autosave mode. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSave: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents a collection of bindings that are part of the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bindings: js.UndefOr[js.Array[BindingData]] = js.native
  /**
    *
    * Returns a number about the version of Excel Calculation Engine. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Double] = js.native
  /**
    *
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var chartDataPointTrack: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents a collection of Comments associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.native
  /**
    *
    * Represents the collection of custom XML parts contained by this workbook. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var customXmlParts: js.UndefOr[js.Array[CustomXmlPartData]] = js.native
  /**
    *
    * Specifies whether or not changes have been made since the workbook was last saved.
    You can set this property to true if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDirty: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the workbook name. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Represents a collection of workbook scoped named items (named ranges and constants). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var names: js.UndefOr[js.Array[NamedItemData]] = js.native
  /**
    *
    * Represents a collection of PivotTableStyles associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var pivotTableStyles: js.UndefOr[js.Array[PivotTableStyleData]] = js.native
  /**
    *
    * Represents a collection of PivotTables associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var pivotTables: js.UndefOr[js.Array[PivotTableData]] = js.native
  /**
    *
    * Specifies whether or not the workbook has ever been saved locally or online. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var previouslySaved: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the workbook properties. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesData] = js.native
  /**
    *
    * Returns workbook protection object for a workbook. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var protection: js.UndefOr[WorkbookProtectionData] = js.native
  /**
    *
    * True if the workbook is open in Read-only mode. Read-only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents a collection of Settings associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  var settings: js.UndefOr[js.Array[SettingData]] = js.native
  /**
    *
    * Represents a collection of SlicerStyles associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var slicerStyles: js.UndefOr[js.Array[SlicerStyleData]] = js.native
  /**
    *
    * Represents a collection of Slicers associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var slicers: js.UndefOr[js.Array[SlicerData]] = js.native
  /**
    *
    * Represents a collection of styles associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var styles: js.UndefOr[js.Array[StyleData]] = js.native
  /**
    *
    * Represents a collection of TableStyles associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var tableStyles: js.UndefOr[js.Array[TableStyleData]] = js.native
  /**
    *
    * Represents a collection of tables associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.native
  /**
    *
    * Represents a collection of TimelineStyles associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var timelineStyles: js.UndefOr[js.Array[TimelineStyleData]] = js.native
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents a collection of worksheets associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var worksheets: js.UndefOr[js.Array[WorksheetData]] = js.native
}

object WorkbookData {
  @scala.inline
  def apply(): WorkbookData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookData]
  }
  @scala.inline
  implicit class WorkbookDataOps[Self <: WorkbookData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(js.undefined)
        ret
    }
    @scala.inline
    def withBindings(value: js.Array[BindingData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculationEngineVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculationEngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculationEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculationEngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withChartDataPointTrack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartDataPointTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartDataPointTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartDataPointTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: js.Array[CommentData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomXmlParts(value: js.Array[CustomXmlPartData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customXmlParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomXmlParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customXmlParts")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: js.Array[NamedItemData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotTableStyles(value: js.Array[PivotTableStyleData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotTableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotTables(value: js.Array[PivotTableData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTables")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviouslySaved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previouslySaved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviouslySaved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previouslySaved")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: DocumentPropertiesData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection(value: WorkbookProtectionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: js.Array[SettingData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withSlicerStyles(value: js.Array[SlicerStyleData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicerStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlicerStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicerStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withSlicers(value: js.Array[SlicerData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlicers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicers")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[StyleData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTableStyles(value: js.Array[TableStyleData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: js.Array[TableData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
    @scala.inline
    def withTimelineStyles(value: js.Array[TimelineStyleData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimelineStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePrecisionAsDisplayed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePrecisionAsDisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePrecisionAsDisplayed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePrecisionAsDisplayed")(js.undefined)
        ret
    }
    @scala.inline
    def withWorksheets(value: js.Array[WorksheetData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorksheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheets")(js.undefined)
        ret
    }
  }
  
}

