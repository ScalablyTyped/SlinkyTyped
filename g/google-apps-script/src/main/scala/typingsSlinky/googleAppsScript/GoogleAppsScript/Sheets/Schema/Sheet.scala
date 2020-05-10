package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet extends js.Object {
  var bandedRanges: js.UndefOr[js.Array[BandedRange]] = js.native
  var basicFilter: js.UndefOr[BasicFilter] = js.native
  var charts: js.UndefOr[js.Array[EmbeddedChart]] = js.native
  var columnGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatRule]] = js.native
  var data: js.UndefOr[js.Array[GridData]] = js.native
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
  var filterViews: js.UndefOr[js.Array[FilterView]] = js.native
  var merges: js.UndefOr[js.Array[GridRange]] = js.native
  var properties: js.UndefOr[SheetProperties] = js.native
  var protectedRanges: js.UndefOr[js.Array[ProtectedRange]] = js.native
  var rowGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
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
  }
  
}

