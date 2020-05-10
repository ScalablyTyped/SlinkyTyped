package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  /** A reply from adding a banded range. */
  var addBanding: js.UndefOr[AddBandingResponse] = js.native
  /** A reply from adding a chart. */
  var addChart: js.UndefOr[AddChartResponse] = js.native
  /** A reply from adding a dimension group. */
  var addDimensionGroup: js.UndefOr[AddDimensionGroupResponse] = js.native
  /** A reply from adding a filter view. */
  var addFilterView: js.UndefOr[AddFilterViewResponse] = js.native
  /** A reply from adding a named range. */
  var addNamedRange: js.UndefOr[AddNamedRangeResponse] = js.native
  /** A reply from adding a protected range. */
  var addProtectedRange: js.UndefOr[AddProtectedRangeResponse] = js.native
  /** A reply from adding a sheet. */
  var addSheet: js.UndefOr[AddSheetResponse] = js.native
  /** A reply from adding a slicer. */
  var addSlicer: js.UndefOr[AddSlicerResponse] = js.native
  /** A reply from creating a developer metadata entry. */
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataResponse] = js.native
  /** A reply from deleting a conditional format rule. */
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleResponse] = js.native
  /** A reply from deleting a developer metadata entry. */
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataResponse] = js.native
  /** A reply from deleting a dimension group. */
  var deleteDimensionGroup: js.UndefOr[DeleteDimensionGroupResponse] = js.native
  /** A reply from removing rows containing duplicate values. */
  var deleteDuplicates: js.UndefOr[DeleteDuplicatesResponse] = js.native
  /** A reply from duplicating a filter view. */
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewResponse] = js.native
  /** A reply from duplicating a sheet. */
  var duplicateSheet: js.UndefOr[DuplicateSheetResponse] = js.native
  /** A reply from doing a find/replace. */
  var findReplace: js.UndefOr[FindReplaceResponse] = js.native
  /** A reply from trimming whitespace. */
  var trimWhitespace: js.UndefOr[TrimWhitespaceResponse] = js.native
  /** A reply from updating a conditional format rule. */
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleResponse] = js.native
  /** A reply from updating a developer metadata entry. */
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataResponse] = js.native
  /** A reply from updating an embedded object's position. */
  var updateEmbeddedObjectPosition: js.UndefOr[UpdateEmbeddedObjectPositionResponse] = js.native
}

object Response {
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBanding(value: AddBandingResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBanding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddBanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBanding")(js.undefined)
        ret
    }
    @scala.inline
    def withAddChart(value: AddChartResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChart")(js.undefined)
        ret
    }
    @scala.inline
    def withAddDimensionGroup(value: AddDimensionGroupResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDimensionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddDimensionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDimensionGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withAddFilterView(value: AddFilterViewResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilterView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddFilterView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilterView")(js.undefined)
        ret
    }
    @scala.inline
    def withAddNamedRange(value: AddNamedRangeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNamedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddNamedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNamedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withAddProtectedRange(value: AddProtectedRangeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddProtectedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withAddSheet(value: AddSheetResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withAddSlicer(value: AddSlicerResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSlicer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSlicer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSlicer")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDeveloperMetadata(value: CreateDeveloperMetadataResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDeveloperMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDeveloperMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteConditionalFormatRule(value: DeleteConditionalFormatRuleResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteConditionalFormatRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteConditionalFormatRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteConditionalFormatRule")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteDeveloperMetadata(value: DeleteDeveloperMetadataResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDeveloperMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDeveloperMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteDimensionGroup(value: DeleteDimensionGroupResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDimensionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteDimensionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDimensionGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteDuplicates(value: DeleteDuplicatesResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteDuplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDuplicates")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateFilterView(value: DuplicateFilterViewResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateFilterView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateFilterView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateFilterView")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateSheet(value: DuplicateSheetResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withFindReplace(value: FindReplaceResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findReplace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findReplace")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimWhitespace(value: TrimWhitespaceResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateConditionalFormatRule(value: UpdateConditionalFormatRuleResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateConditionalFormatRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateConditionalFormatRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateConditionalFormatRule")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDeveloperMetadata(value: UpdateDeveloperMetadataResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDeveloperMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDeveloperMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateEmbeddedObjectPosition(value: UpdateEmbeddedObjectPositionResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEmbeddedObjectPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateEmbeddedObjectPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEmbeddedObjectPosition")(js.undefined)
        ret
    }
  }
  
}

