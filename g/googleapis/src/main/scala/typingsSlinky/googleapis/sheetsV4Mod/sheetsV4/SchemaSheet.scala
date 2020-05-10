package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sheet in a spreadsheet.
  */
@js.native
trait SchemaSheet extends js.Object {
  /**
    * The banded (alternating colors) ranges on this sheet.
    */
  var bandedRanges: js.UndefOr[js.Array[SchemaBandedRange]] = js.native
  /**
    * The filter on this sheet, if any.
    */
  var basicFilter: js.UndefOr[SchemaBasicFilter] = js.native
  /**
    * The specifications of every chart on this sheet.
    */
  var charts: js.UndefOr[js.Array[SchemaEmbeddedChart]] = js.native
  /**
    * All column groups on this sheet, ordered by increasing range start index,
    * then by group depth.
    */
  var columnGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
  /**
    * The conditional format rules in this sheet.
    */
  var conditionalFormats: js.UndefOr[js.Array[SchemaConditionalFormatRule]] = js.native
  /**
    * Data in the grid, if this is a grid sheet. The number of GridData objects
    * returned is dependent on the number of ranges requested on this sheet.
    * For example, if this is representing `Sheet1`, and the spreadsheet was
    * requested with ranges `Sheet1!A1:C10` and `Sheet1!D15:E20`, then the
    * first GridData will have a startRow/startColumn of `0`, while the second
    * one will have `startRow 14` (zero-based row 15), and `startColumn 3`
    * (zero-based column D).
    */
  var data: js.UndefOr[js.Array[SchemaGridData]] = js.native
  /**
    * The developer metadata associated with a sheet.
    */
  var developerMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.native
  /**
    * The filter views in this sheet.
    */
  var filterViews: js.UndefOr[js.Array[SchemaFilterView]] = js.native
  /**
    * The ranges that are merged together.
    */
  var merges: js.UndefOr[js.Array[SchemaGridRange]] = js.native
  /**
    * The properties of the sheet.
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
  /**
    * The protected ranges in this sheet.
    */
  var protectedRanges: js.UndefOr[js.Array[SchemaProtectedRange]] = js.native
  /**
    * All row groups on this sheet, ordered by increasing range start index,
    * then by group depth.
    */
  var rowGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
}

object SchemaSheet {
  @scala.inline
  def apply(): SchemaSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheet]
  }
  @scala.inline
  implicit class SchemaSheetOps[Self <: SchemaSheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandedRanges(value: js.Array[SchemaBandedRange]): Self = {
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
    def withBasicFilter(value: SchemaBasicFilter): Self = {
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
    def withCharts(value: js.Array[SchemaEmbeddedChart]): Self = {
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
    def withColumnGroups(value: js.Array[SchemaDimensionGroup]): Self = {
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
    def withConditionalFormats(value: js.Array[SchemaConditionalFormatRule]): Self = {
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
    def withData(value: js.Array[SchemaGridData]): Self = {
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
    def withDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = {
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
    def withFilterViews(value: js.Array[SchemaFilterView]): Self = {
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
    def withMerges(value: js.Array[SchemaGridRange]): Self = {
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
    def withProperties(value: SchemaSheetProperties): Self = {
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
    def withProtectedRanges(value: js.Array[SchemaProtectedRange]): Self = {
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
    def withRowGroups(value: js.Array[SchemaDimensionGroup]): Self = {
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
  }
  
}

