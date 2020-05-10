package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single kind of update to apply to a spreadsheet.
  */
@js.native
trait SchemaRequest extends js.Object {
  /**
    * Adds a new banded range
    */
  var addBanding: js.UndefOr[SchemaAddBandingRequest] = js.native
  /**
    * Adds a chart.
    */
  var addChart: js.UndefOr[SchemaAddChartRequest] = js.native
  /**
    * Adds a new conditional format rule.
    */
  var addConditionalFormatRule: js.UndefOr[SchemaAddConditionalFormatRuleRequest] = js.native
  /**
    * Creates a group over the specified range.
    */
  var addDimensionGroup: js.UndefOr[SchemaAddDimensionGroupRequest] = js.native
  /**
    * Adds a filter view.
    */
  var addFilterView: js.UndefOr[SchemaAddFilterViewRequest] = js.native
  /**
    * Adds a named range.
    */
  var addNamedRange: js.UndefOr[SchemaAddNamedRangeRequest] = js.native
  /**
    * Adds a protected range.
    */
  var addProtectedRange: js.UndefOr[SchemaAddProtectedRangeRequest] = js.native
  /**
    * Adds a sheet.
    */
  var addSheet: js.UndefOr[SchemaAddSheetRequest] = js.native
  /**
    * Appends cells after the last row with data in a sheet.
    */
  var appendCells: js.UndefOr[SchemaAppendCellsRequest] = js.native
  /**
    * Appends dimensions to the end of a sheet.
    */
  var appendDimension: js.UndefOr[SchemaAppendDimensionRequest] = js.native
  /**
    * Automatically fills in more data based on existing data.
    */
  var autoFill: js.UndefOr[SchemaAutoFillRequest] = js.native
  /**
    * Automatically resizes one or more dimensions based on the contents of the
    * cells in that dimension.
    */
  var autoResizeDimensions: js.UndefOr[SchemaAutoResizeDimensionsRequest] = js.native
  /**
    * Clears the basic filter on a sheet.
    */
  var clearBasicFilter: js.UndefOr[SchemaClearBasicFilterRequest] = js.native
  /**
    * Copies data from one area and pastes it to another.
    */
  var copyPaste: js.UndefOr[SchemaCopyPasteRequest] = js.native
  /**
    * Creates new developer metadata
    */
  var createDeveloperMetadata: js.UndefOr[SchemaCreateDeveloperMetadataRequest] = js.native
  /**
    * Cuts data from one area and pastes it to another.
    */
  var cutPaste: js.UndefOr[SchemaCutPasteRequest] = js.native
  /**
    * Removes a banded range
    */
  var deleteBanding: js.UndefOr[SchemaDeleteBandingRequest] = js.native
  /**
    * Deletes an existing conditional format rule.
    */
  var deleteConditionalFormatRule: js.UndefOr[SchemaDeleteConditionalFormatRuleRequest] = js.native
  /**
    * Deletes developer metadata
    */
  var deleteDeveloperMetadata: js.UndefOr[SchemaDeleteDeveloperMetadataRequest] = js.native
  /**
    * Deletes rows or columns in a sheet.
    */
  var deleteDimension: js.UndefOr[SchemaDeleteDimensionRequest] = js.native
  /**
    * Deletes a group over the specified range.
    */
  var deleteDimensionGroup: js.UndefOr[SchemaDeleteDimensionGroupRequest] = js.native
  /**
    * Deletes an embedded object (e.g, chart, image) in a sheet.
    */
  var deleteEmbeddedObject: js.UndefOr[SchemaDeleteEmbeddedObjectRequest] = js.native
  /**
    * Deletes a filter view from a sheet.
    */
  var deleteFilterView: js.UndefOr[SchemaDeleteFilterViewRequest] = js.native
  /**
    * Deletes a named range.
    */
  var deleteNamedRange: js.UndefOr[SchemaDeleteNamedRangeRequest] = js.native
  /**
    * Deletes a protected range.
    */
  var deleteProtectedRange: js.UndefOr[SchemaDeleteProtectedRangeRequest] = js.native
  /**
    * Deletes a range of cells from a sheet, shifting the remaining cells.
    */
  var deleteRange: js.UndefOr[SchemaDeleteRangeRequest] = js.native
  /**
    * Deletes a sheet.
    */
  var deleteSheet: js.UndefOr[SchemaDeleteSheetRequest] = js.native
  /**
    * Duplicates a filter view.
    */
  var duplicateFilterView: js.UndefOr[SchemaDuplicateFilterViewRequest] = js.native
  /**
    * Duplicates a sheet.
    */
  var duplicateSheet: js.UndefOr[SchemaDuplicateSheetRequest] = js.native
  /**
    * Finds and replaces occurrences of some text with other text.
    */
  var findReplace: js.UndefOr[SchemaFindReplaceRequest] = js.native
  /**
    * Inserts new rows or columns in a sheet.
    */
  var insertDimension: js.UndefOr[SchemaInsertDimensionRequest] = js.native
  /**
    * Inserts new cells in a sheet, shifting the existing cells.
    */
  var insertRange: js.UndefOr[SchemaInsertRangeRequest] = js.native
  /**
    * Merges cells together.
    */
  var mergeCells: js.UndefOr[SchemaMergeCellsRequest] = js.native
  /**
    * Moves rows or columns to another location in a sheet.
    */
  var moveDimension: js.UndefOr[SchemaMoveDimensionRequest] = js.native
  /**
    * Pastes data (HTML or delimited) into a sheet.
    */
  var pasteData: js.UndefOr[SchemaPasteDataRequest] = js.native
  /**
    * Randomizes the order of the rows in a range.
    */
  var randomizeRange: js.UndefOr[SchemaRandomizeRangeRequest] = js.native
  /**
    * Repeats a single cell across a range.
    */
  var repeatCell: js.UndefOr[SchemaRepeatCellRequest] = js.native
  /**
    * Sets the basic filter on a sheet.
    */
  var setBasicFilter: js.UndefOr[SchemaSetBasicFilterRequest] = js.native
  /**
    * Sets data validation for one or more cells.
    */
  var setDataValidation: js.UndefOr[SchemaSetDataValidationRequest] = js.native
  /**
    * Sorts data in a range.
    */
  var sortRange: js.UndefOr[SchemaSortRangeRequest] = js.native
  /**
    * Converts a column of text into many columns of text.
    */
  var textToColumns: js.UndefOr[SchemaTextToColumnsRequest] = js.native
  /**
    * Unmerges merged cells.
    */
  var unmergeCells: js.UndefOr[SchemaUnmergeCellsRequest] = js.native
  /**
    * Updates a banded range
    */
  var updateBanding: js.UndefOr[SchemaUpdateBandingRequest] = js.native
  /**
    * Updates the borders in a range of cells.
    */
  var updateBorders: js.UndefOr[SchemaUpdateBordersRequest] = js.native
  /**
    * Updates many cells at once.
    */
  var updateCells: js.UndefOr[SchemaUpdateCellsRequest] = js.native
  /**
    * Updates a chart&#39;s specifications.
    */
  var updateChartSpec: js.UndefOr[SchemaUpdateChartSpecRequest] = js.native
  /**
    * Updates an existing conditional format rule.
    */
  var updateConditionalFormatRule: js.UndefOr[SchemaUpdateConditionalFormatRuleRequest] = js.native
  /**
    * Updates an existing developer metadata entry
    */
  var updateDeveloperMetadata: js.UndefOr[SchemaUpdateDeveloperMetadataRequest] = js.native
  /**
    * Updates the state of the specified group.
    */
  var updateDimensionGroup: js.UndefOr[SchemaUpdateDimensionGroupRequest] = js.native
  /**
    * Updates dimensions&#39; properties.
    */
  var updateDimensionProperties: js.UndefOr[SchemaUpdateDimensionPropertiesRequest] = js.native
  /**
    * Updates an embedded object&#39;s (e.g. chart, image) position.
    */
  var updateEmbeddedObjectPosition: js.UndefOr[SchemaUpdateEmbeddedObjectPositionRequest] = js.native
  /**
    * Updates the properties of a filter view.
    */
  var updateFilterView: js.UndefOr[SchemaUpdateFilterViewRequest] = js.native
  /**
    * Updates a named range.
    */
  var updateNamedRange: js.UndefOr[SchemaUpdateNamedRangeRequest] = js.native
  /**
    * Updates a protected range.
    */
  var updateProtectedRange: js.UndefOr[SchemaUpdateProtectedRangeRequest] = js.native
  /**
    * Updates a sheet&#39;s properties.
    */
  var updateSheetProperties: js.UndefOr[SchemaUpdateSheetPropertiesRequest] = js.native
  /**
    * Updates the spreadsheet&#39;s properties.
    */
  var updateSpreadsheetProperties: js.UndefOr[SchemaUpdateSpreadsheetPropertiesRequest] = js.native
}

object SchemaRequest {
  @scala.inline
  def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  @scala.inline
  implicit class SchemaRequestOps[Self <: SchemaRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBanding(value: SchemaAddBandingRequest): Self = {
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
    def withAddChart(value: SchemaAddChartRequest): Self = {
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
    def withAddConditionalFormatRule(value: SchemaAddConditionalFormatRuleRequest): Self = {
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
    def withAddDimensionGroup(value: SchemaAddDimensionGroupRequest): Self = {
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
    def withAddFilterView(value: SchemaAddFilterViewRequest): Self = {
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
    def withAddNamedRange(value: SchemaAddNamedRangeRequest): Self = {
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
    def withAddProtectedRange(value: SchemaAddProtectedRangeRequest): Self = {
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
    def withAddSheet(value: SchemaAddSheetRequest): Self = {
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
    def withAppendCells(value: SchemaAppendCellsRequest): Self = {
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
    def withAppendDimension(value: SchemaAppendDimensionRequest): Self = {
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
    def withAutoFill(value: SchemaAutoFillRequest): Self = {
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
    def withAutoResizeDimensions(value: SchemaAutoResizeDimensionsRequest): Self = {
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
    def withClearBasicFilter(value: SchemaClearBasicFilterRequest): Self = {
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
    def withCopyPaste(value: SchemaCopyPasteRequest): Self = {
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
    def withCreateDeveloperMetadata(value: SchemaCreateDeveloperMetadataRequest): Self = {
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
    def withCutPaste(value: SchemaCutPasteRequest): Self = {
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
    def withDeleteBanding(value: SchemaDeleteBandingRequest): Self = {
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
    def withDeleteConditionalFormatRule(value: SchemaDeleteConditionalFormatRuleRequest): Self = {
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
    def withDeleteDeveloperMetadata(value: SchemaDeleteDeveloperMetadataRequest): Self = {
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
    def withDeleteDimension(value: SchemaDeleteDimensionRequest): Self = {
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
    def withDeleteDimensionGroup(value: SchemaDeleteDimensionGroupRequest): Self = {
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
    def withDeleteEmbeddedObject(value: SchemaDeleteEmbeddedObjectRequest): Self = {
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
    def withDeleteFilterView(value: SchemaDeleteFilterViewRequest): Self = {
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
    def withDeleteNamedRange(value: SchemaDeleteNamedRangeRequest): Self = {
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
    def withDeleteProtectedRange(value: SchemaDeleteProtectedRangeRequest): Self = {
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
    def withDeleteRange(value: SchemaDeleteRangeRequest): Self = {
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
    def withDeleteSheet(value: SchemaDeleteSheetRequest): Self = {
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
    def withDuplicateFilterView(value: SchemaDuplicateFilterViewRequest): Self = {
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
    def withDuplicateSheet(value: SchemaDuplicateSheetRequest): Self = {
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
    def withFindReplace(value: SchemaFindReplaceRequest): Self = {
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
    def withInsertDimension(value: SchemaInsertDimensionRequest): Self = {
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
    def withInsertRange(value: SchemaInsertRangeRequest): Self = {
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
    def withMergeCells(value: SchemaMergeCellsRequest): Self = {
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
    def withMoveDimension(value: SchemaMoveDimensionRequest): Self = {
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
    def withPasteData(value: SchemaPasteDataRequest): Self = {
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
    def withRandomizeRange(value: SchemaRandomizeRangeRequest): Self = {
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
    def withRepeatCell(value: SchemaRepeatCellRequest): Self = {
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
    def withSetBasicFilter(value: SchemaSetBasicFilterRequest): Self = {
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
    def withSetDataValidation(value: SchemaSetDataValidationRequest): Self = {
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
    def withSortRange(value: SchemaSortRangeRequest): Self = {
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
    def withTextToColumns(value: SchemaTextToColumnsRequest): Self = {
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
    def withUnmergeCells(value: SchemaUnmergeCellsRequest): Self = {
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
    def withUpdateBanding(value: SchemaUpdateBandingRequest): Self = {
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
    def withUpdateBorders(value: SchemaUpdateBordersRequest): Self = {
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
    def withUpdateCells(value: SchemaUpdateCellsRequest): Self = {
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
    def withUpdateChartSpec(value: SchemaUpdateChartSpecRequest): Self = {
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
    def withUpdateConditionalFormatRule(value: SchemaUpdateConditionalFormatRuleRequest): Self = {
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
    def withUpdateDeveloperMetadata(value: SchemaUpdateDeveloperMetadataRequest): Self = {
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
    def withUpdateDimensionGroup(value: SchemaUpdateDimensionGroupRequest): Self = {
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
    def withUpdateDimensionProperties(value: SchemaUpdateDimensionPropertiesRequest): Self = {
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
    def withUpdateEmbeddedObjectPosition(value: SchemaUpdateEmbeddedObjectPositionRequest): Self = {
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
    def withUpdateFilterView(value: SchemaUpdateFilterViewRequest): Self = {
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
    def withUpdateNamedRange(value: SchemaUpdateNamedRangeRequest): Self = {
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
    def withUpdateProtectedRange(value: SchemaUpdateProtectedRangeRequest): Self = {
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
    def withUpdateSheetProperties(value: SchemaUpdateSheetPropertiesRequest): Self = {
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
    def withUpdateSpreadsheetProperties(value: SchemaUpdateSpreadsheetPropertiesRequest): Self = {
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

