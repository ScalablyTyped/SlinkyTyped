package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var addBanding: js.UndefOr[AddBandingRequest] = js.native
  var addChart: js.UndefOr[AddChartRequest] = js.native
  var addConditionalFormatRule: js.UndefOr[AddConditionalFormatRuleRequest] = js.native
  var addDimensionGroup: js.UndefOr[AddDimensionGroupRequest] = js.native
  var addFilterView: js.UndefOr[AddFilterViewRequest] = js.native
  var addNamedRange: js.UndefOr[AddNamedRangeRequest] = js.native
  var addProtectedRange: js.UndefOr[AddProtectedRangeRequest] = js.native
  var addSheet: js.UndefOr[AddSheetRequest] = js.native
  var appendCells: js.UndefOr[AppendCellsRequest] = js.native
  var appendDimension: js.UndefOr[AppendDimensionRequest] = js.native
  var autoFill: js.UndefOr[AutoFillRequest] = js.native
  var autoResizeDimensions: js.UndefOr[AutoResizeDimensionsRequest] = js.native
  var clearBasicFilter: js.UndefOr[ClearBasicFilterRequest] = js.native
  var copyPaste: js.UndefOr[CopyPasteRequest] = js.native
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataRequest] = js.native
  var cutPaste: js.UndefOr[CutPasteRequest] = js.native
  var deleteBanding: js.UndefOr[DeleteBandingRequest] = js.native
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleRequest] = js.native
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataRequest] = js.native
  var deleteDimension: js.UndefOr[DeleteDimensionRequest] = js.native
  var deleteDimensionGroup: js.UndefOr[DeleteDimensionGroupRequest] = js.native
  var deleteEmbeddedObject: js.UndefOr[DeleteEmbeddedObjectRequest] = js.native
  var deleteFilterView: js.UndefOr[DeleteFilterViewRequest] = js.native
  var deleteNamedRange: js.UndefOr[DeleteNamedRangeRequest] = js.native
  var deleteProtectedRange: js.UndefOr[DeleteProtectedRangeRequest] = js.native
  var deleteRange: js.UndefOr[DeleteRangeRequest] = js.native
  var deleteSheet: js.UndefOr[DeleteSheetRequest] = js.native
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewRequest] = js.native
  var duplicateSheet: js.UndefOr[DuplicateSheetRequest] = js.native
  var findReplace: js.UndefOr[FindReplaceRequest] = js.native
  var insertDimension: js.UndefOr[InsertDimensionRequest] = js.native
  var insertRange: js.UndefOr[InsertRangeRequest] = js.native
  var mergeCells: js.UndefOr[MergeCellsRequest] = js.native
  var moveDimension: js.UndefOr[MoveDimensionRequest] = js.native
  var pasteData: js.UndefOr[PasteDataRequest] = js.native
  var randomizeRange: js.UndefOr[RandomizeRangeRequest] = js.native
  var repeatCell: js.UndefOr[RepeatCellRequest] = js.native
  var setBasicFilter: js.UndefOr[SetBasicFilterRequest] = js.native
  var setDataValidation: js.UndefOr[SetDataValidationRequest] = js.native
  var sortRange: js.UndefOr[SortRangeRequest] = js.native
  var textToColumns: js.UndefOr[TextToColumnsRequest] = js.native
  var unmergeCells: js.UndefOr[UnmergeCellsRequest] = js.native
  var updateBanding: js.UndefOr[UpdateBandingRequest] = js.native
  var updateBorders: js.UndefOr[UpdateBordersRequest] = js.native
  var updateCells: js.UndefOr[UpdateCellsRequest] = js.native
  var updateChartSpec: js.UndefOr[UpdateChartSpecRequest] = js.native
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleRequest] = js.native
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataRequest] = js.native
  var updateDimensionGroup: js.UndefOr[UpdateDimensionGroupRequest] = js.native
  var updateDimensionProperties: js.UndefOr[UpdateDimensionPropertiesRequest] = js.native
  var updateEmbeddedObjectPosition: js.UndefOr[UpdateEmbeddedObjectPositionRequest] = js.native
  var updateFilterView: js.UndefOr[UpdateFilterViewRequest] = js.native
  var updateNamedRange: js.UndefOr[UpdateNamedRangeRequest] = js.native
  var updateProtectedRange: js.UndefOr[UpdateProtectedRangeRequest] = js.native
  var updateSheetProperties: js.UndefOr[UpdateSheetPropertiesRequest] = js.native
  var updateSpreadsheetProperties: js.UndefOr[UpdateSpreadsheetPropertiesRequest] = js.native
}

object Request {
  @scala.inline
  def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBanding(value: AddBandingRequest): Self = {
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
    def withAddChart(value: AddChartRequest): Self = {
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
    def withAddConditionalFormatRule(value: AddConditionalFormatRuleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addConditionalFormatRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddConditionalFormatRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addConditionalFormatRule")(js.undefined)
        ret
    }
    @scala.inline
    def withAddDimensionGroup(value: AddDimensionGroupRequest): Self = {
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
    def withAddFilterView(value: AddFilterViewRequest): Self = {
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
    def withAddNamedRange(value: AddNamedRangeRequest): Self = {
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
    def withAddProtectedRange(value: AddProtectedRangeRequest): Self = {
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
    def withAddSheet(value: AddSheetRequest): Self = {
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
    def withAppendCells(value: AppendCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendCells")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendDimension(value: AppendDimensionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFill(value: AutoFillRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFill")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoResizeDimensions(value: AutoResizeDimensionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResizeDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResizeDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResizeDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withClearBasicFilter(value: ClearBasicFilterRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBasicFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearBasicFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBasicFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyPaste(value: CopyPasteRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDeveloperMetadata(value: CreateDeveloperMetadataRequest): Self = {
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
    def withCutPaste(value: CutPasteRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteBanding(value: DeleteBandingRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBanding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteBanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBanding")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteConditionalFormatRule(value: DeleteConditionalFormatRuleRequest): Self = {
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
    def withDeleteDeveloperMetadata(value: DeleteDeveloperMetadataRequest): Self = {
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
    def withDeleteDimension(value: DeleteDimensionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteDimensionGroup(value: DeleteDimensionGroupRequest): Self = {
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
    def withDeleteEmbeddedObject(value: DeleteEmbeddedObjectRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEmbeddedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteEmbeddedObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEmbeddedObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteFilterView(value: DeleteFilterViewRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFilterView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteFilterView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFilterView")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteNamedRange(value: DeleteNamedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteNamedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteNamedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteNamedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteProtectedRange(value: DeleteProtectedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteProtectedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteProtectedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteProtectedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteRange(value: DeleteRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteSheet(value: DeleteSheetRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSheet")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateFilterView(value: DuplicateFilterViewRequest): Self = {
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
    def withDuplicateSheet(value: DuplicateSheetRequest): Self = {
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
    def withFindReplace(value: FindReplaceRequest): Self = {
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
    def withInsertDimension(value: InsertDimensionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertRange(value: InsertRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRange")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeCells(value: MergeCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCells")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveDimension(value: MoveDimensionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteData(value: PasteDataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteData")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomizeRange(value: RandomizeRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomizeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomizeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomizeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatCell(value: RepeatCellRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatCell")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBasicFilter(value: SetBasicFilterRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBasicFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetBasicFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBasicFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDataValidation(value: SetDataValidationRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDataValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetDataValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDataValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withSortRange(value: SortRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRange")(js.undefined)
        ret
    }
    @scala.inline
    def withTextToColumns(value: TextToColumnsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextToColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmergeCells(value: UnmergeCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmergeCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmergeCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmergeCells")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateBanding(value: UpdateBandingRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBanding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateBanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBanding")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateBorders(value: UpdateBordersRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateCells(value: UpdateCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCells")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateChartSpec(value: UpdateChartSpecRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateChartSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateChartSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateChartSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateConditionalFormatRule(value: UpdateConditionalFormatRuleRequest): Self = {
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
    def withUpdateDeveloperMetadata(value: UpdateDeveloperMetadataRequest): Self = {
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
    def withUpdateDimensionGroup(value: UpdateDimensionGroupRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDimensionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDimensionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDimensionGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDimensionProperties(value: UpdateDimensionPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDimensionProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDimensionProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDimensionProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateEmbeddedObjectPosition(value: UpdateEmbeddedObjectPositionRequest): Self = {
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
    @scala.inline
    def withUpdateFilterView(value: UpdateFilterViewRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFilterView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateFilterView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFilterView")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateNamedRange(value: UpdateNamedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateNamedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateNamedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateNamedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateProtectedRange(value: UpdateProtectedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProtectedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateProtectedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProtectedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateSheetProperties(value: UpdateSheetPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSheetProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateSheetProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSheetProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateSpreadsheetProperties(value: UpdateSpreadsheetPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSpreadsheetProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateSpreadsheetProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSpreadsheetProperties")(js.undefined)
        ret
    }
  }
  
}

