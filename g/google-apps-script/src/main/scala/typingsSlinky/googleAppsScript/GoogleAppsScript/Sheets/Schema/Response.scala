package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var addBanding: js.UndefOr[AddBandingResponse] = js.native
  var addChart: js.UndefOr[AddChartResponse] = js.native
  var addDimensionGroup: js.UndefOr[AddDimensionGroupResponse] = js.native
  var addFilterView: js.UndefOr[AddFilterViewResponse] = js.native
  var addNamedRange: js.UndefOr[AddNamedRangeResponse] = js.native
  var addProtectedRange: js.UndefOr[AddProtectedRangeResponse] = js.native
  var addSheet: js.UndefOr[AddSheetResponse] = js.native
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataResponse] = js.native
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleResponse] = js.native
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataResponse] = js.native
  var deleteDimensionGroup: js.UndefOr[DeleteDimensionGroupResponse] = js.native
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewResponse] = js.native
  var duplicateSheet: js.UndefOr[DuplicateSheetResponse] = js.native
  var findReplace: js.UndefOr[FindReplaceResponse] = js.native
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleResponse] = js.native
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataResponse] = js.native
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

