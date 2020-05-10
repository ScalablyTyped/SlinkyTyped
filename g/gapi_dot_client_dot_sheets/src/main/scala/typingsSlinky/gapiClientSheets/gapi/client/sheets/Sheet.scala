package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet extends js.Object {
  /** The banded (alternating colors) ranges on this sheet. */
  var bandedRanges: js.UndefOr[js.Array[BandedRange]] = js.native
  /** The filter on this sheet, if any. */
  var basicFilter: js.UndefOr[BasicFilter] = js.native
  /** The specifications of every chart on this sheet. */
  var charts: js.UndefOr[js.Array[EmbeddedChart]] = js.native
  /**
    * All column groups on this sheet, ordered by increasing range start index,
    * then by group depth.
    */
  var columnGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
  /** The conditional format rules in this sheet. */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatRule]] = js.native
  /**
    * Data in the grid, if this is a grid sheet.
    *
    * The number of GridData objects returned is dependent on the number of
    * ranges requested on this sheet. For example, if this is representing
    * `Sheet1`, and the spreadsheet was requested with ranges
    * `Sheet1!A1:C10` and `Sheet1!D15:E20`, then the first GridData will have a
    * startRow/startColumn of `0`,
    * while the second one will have `startRow 14` (zero-based row 15),
    * and `startColumn 3` (zero-based column D).
    */
  var data: js.UndefOr[js.Array[GridData]] = js.native
  /** The developer metadata associated with a sheet. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
  /** The filter views in this sheet. */
  var filterViews: js.UndefOr[js.Array[FilterView]] = js.native
  /** The ranges that are merged together. */
  var merges: js.UndefOr[js.Array[GridRange]] = js.native
  /** The properties of the sheet. */
  var properties: js.UndefOr[SheetProperties] = js.native
  /** The protected ranges in this sheet. */
  var protectedRanges: js.UndefOr[js.Array[ProtectedRange]] = js.native
  /**
    * All row groups on this sheet, ordered by increasing range start index, then
    * by group depth.
    */
  var rowGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
  /** The slicers on this sheet. */
  var slicers: js.UndefOr[js.Array[Slicer]] = js.native
}

object Sheet {
  @scala.inline
  def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  @scala.inline
  implicit class SheetOps[Self <: Sheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandedRanges(value: js.Array[BandedRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandedRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandedRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandedRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withBasicFilter(value: BasicFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasicFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCharts(value: js.Array[EmbeddedChart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnGroups(value: js.Array[DimensionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalFormats(value: js.Array[ConditionalFormatRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[GridData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterViews(value: js.Array[FilterView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterViews")(js.undefined)
        ret
    }
    @scala.inline
    def withMerges(value: js.Array[GridRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merges")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: SheetProperties): Self = {
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
    def withProtectedRanges(value: js.Array[ProtectedRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGroups(value: js.Array[DimensionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSlicers(value: js.Array[Slicer]): Self = {
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
  }
  
}

