package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Collection.SpreadsheetsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddBandingRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddChartRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddConditionalFormatRuleRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddDimensionGroupRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddFilterViewRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddNamedRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddProtectedRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AddSheetRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AppendCellsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AppendDimensionRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AutoFillRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AutoResizeDimensionsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BandedRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BandingProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BasicChartAxis
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BasicChartDomain
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BasicChartSeries
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BasicChartSpec
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BasicFilter
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchClearValuesByDataFilterRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchClearValuesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchGetValuesByDataFilterRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateSpreadsheetRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesByDataFilterRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BooleanCondition
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BooleanRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Border
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Borders
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BubbleChartSpec
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.CandlestickChartSpec
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.CandlestickData
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.CandlestickDomain
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.CandlestickSeries
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.CellData
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.CellFormat
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ChartData
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ChartSourceRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ChartSpec
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ClearBasicFilterRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Color
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ConditionValue
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ConditionalFormatRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.CopyPasteRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.CopySheetToAnotherSpreadsheetRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.CreateDeveloperMetadataRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.CutPasteRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DataFilter
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DataFilterValueRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DataValidationRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DateTimeRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteBandingRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteConditionalFormatRuleRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteDeveloperMetadataRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteDimensionGroupRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteDimensionRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteEmbeddedObjectRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteFilterViewRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteNamedRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteProtectedRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeleteSheetRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeveloperMetadata
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeveloperMetadataLocation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeveloperMetadataLookup
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DimensionGroup
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DimensionProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DimensionRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DuplicateFilterViewRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.DuplicateSheetRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Editors
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.EmbeddedChart
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.EmbeddedObjectPosition
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ErrorValue
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ExtendedValue
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.FilterView
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.FindReplaceRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.GetSpreadsheetByDataFilterRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.GradientRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.GridCoordinate
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.GridData
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.GridProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.GridRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.HistogramChartSpec
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.HistogramRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.HistogramSeries
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.InsertDimensionRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.InsertRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.InterpolationPoint
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.IterativeCalculationSettings
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.LineStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ManualRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ManualRuleGroup
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.MergeCellsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.MoveDimensionRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.NamedRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.NumberFormat
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.OrgChartSpec
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.OverlayPosition
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Padding
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.PasteDataRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.PieChartSpec
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotGroup
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotGroupRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotGroupSortValueBucket
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotGroupValueMetadata
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotTable
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.PivotValue
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ProtectedRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.RandomizeRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.RepeatCellRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Request
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.RowData
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.SearchDeveloperMetadataRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.SetBasicFilterRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.SetDataValidationRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Sheet
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.SheetProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.SortRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.SortSpec
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.SourceAndDestination
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.SpreadsheetProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.TextFormat
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.TextFormatRun
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.TextPosition
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.TextRotation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.TextToColumnsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.TreemapChartColorScale
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.TreemapChartSpec
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UnmergeCellsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateBandingRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateBordersRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateCellsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateChartSpecRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateConditionalFormatRuleRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateDeveloperMetadataRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateDimensionGroupRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateDimensionPropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateEmbeddedObjectPositionRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateFilterViewRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateNamedRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateProtectedRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateSheetPropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateSpreadsheetPropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ValueRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartColumnStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartCustomSubtotal
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartDomain
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartSeries
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheets_ extends js.Object {
  var Spreadsheets: js.UndefOr[SpreadsheetsCollection] = js.native
  // Create a new instance of AddBandingRequest
  def newAddBandingRequest(): AddBandingRequest = js.native
  // Create a new instance of AddChartRequest
  def newAddChartRequest(): AddChartRequest = js.native
  // Create a new instance of AddConditionalFormatRuleRequest
  def newAddConditionalFormatRuleRequest(): AddConditionalFormatRuleRequest = js.native
  // Create a new instance of AddDimensionGroupRequest
  def newAddDimensionGroupRequest(): AddDimensionGroupRequest = js.native
  // Create a new instance of AddFilterViewRequest
  def newAddFilterViewRequest(): AddFilterViewRequest = js.native
  // Create a new instance of AddNamedRangeRequest
  def newAddNamedRangeRequest(): AddNamedRangeRequest = js.native
  // Create a new instance of AddProtectedRangeRequest
  def newAddProtectedRangeRequest(): AddProtectedRangeRequest = js.native
  // Create a new instance of AddSheetRequest
  def newAddSheetRequest(): AddSheetRequest = js.native
  // Create a new instance of AppendCellsRequest
  def newAppendCellsRequest(): AppendCellsRequest = js.native
  // Create a new instance of AppendDimensionRequest
  def newAppendDimensionRequest(): AppendDimensionRequest = js.native
  // Create a new instance of AutoFillRequest
  def newAutoFillRequest(): AutoFillRequest = js.native
  // Create a new instance of AutoResizeDimensionsRequest
  def newAutoResizeDimensionsRequest(): AutoResizeDimensionsRequest = js.native
  // Create a new instance of BandedRange
  def newBandedRange(): BandedRange = js.native
  // Create a new instance of BandingProperties
  def newBandingProperties(): BandingProperties = js.native
  // Create a new instance of BasicChartAxis
  def newBasicChartAxis(): BasicChartAxis = js.native
  // Create a new instance of BasicChartDomain
  def newBasicChartDomain(): BasicChartDomain = js.native
  // Create a new instance of BasicChartSeries
  def newBasicChartSeries(): BasicChartSeries = js.native
  // Create a new instance of BasicChartSpec
  def newBasicChartSpec(): BasicChartSpec = js.native
  // Create a new instance of BasicFilter
  def newBasicFilter(): BasicFilter = js.native
  // Create a new instance of BatchClearValuesByDataFilterRequest
  def newBatchClearValuesByDataFilterRequest(): BatchClearValuesByDataFilterRequest = js.native
  // Create a new instance of BatchClearValuesRequest
  def newBatchClearValuesRequest(): BatchClearValuesRequest = js.native
  // Create a new instance of BatchGetValuesByDataFilterRequest
  def newBatchGetValuesByDataFilterRequest(): BatchGetValuesByDataFilterRequest = js.native
  // Create a new instance of BatchUpdateSpreadsheetRequest
  def newBatchUpdateSpreadsheetRequest(): BatchUpdateSpreadsheetRequest = js.native
  // Create a new instance of BatchUpdateValuesByDataFilterRequest
  def newBatchUpdateValuesByDataFilterRequest(): BatchUpdateValuesByDataFilterRequest = js.native
  // Create a new instance of BatchUpdateValuesRequest
  def newBatchUpdateValuesRequest(): BatchUpdateValuesRequest = js.native
  // Create a new instance of BooleanCondition
  def newBooleanCondition(): BooleanCondition = js.native
  // Create a new instance of BooleanRule
  def newBooleanRule(): BooleanRule = js.native
  // Create a new instance of Border
  def newBorder(): Border = js.native
  // Create a new instance of Borders
  def newBorders(): Borders = js.native
  // Create a new instance of BubbleChartSpec
  def newBubbleChartSpec(): BubbleChartSpec = js.native
  // Create a new instance of CandlestickChartSpec
  def newCandlestickChartSpec(): CandlestickChartSpec = js.native
  // Create a new instance of CandlestickData
  def newCandlestickData(): CandlestickData = js.native
  // Create a new instance of CandlestickDomain
  def newCandlestickDomain(): CandlestickDomain = js.native
  // Create a new instance of CandlestickSeries
  def newCandlestickSeries(): CandlestickSeries = js.native
  // Create a new instance of CellData
  def newCellData(): CellData = js.native
  // Create a new instance of CellFormat
  def newCellFormat(): CellFormat = js.native
  // Create a new instance of ChartData
  def newChartData(): ChartData = js.native
  // Create a new instance of ChartSourceRange
  def newChartSourceRange(): ChartSourceRange = js.native
  // Create a new instance of ChartSpec
  def newChartSpec(): ChartSpec = js.native
  // Create a new instance of ClearBasicFilterRequest
  def newClearBasicFilterRequest(): ClearBasicFilterRequest = js.native
  // Create a new instance of ClearValuesRequest
  def newClearValuesRequest(): js.Any = js.native
   // Schema.ClearValuesRequest;
  // Create a new instance of Color
  def newColor(): Color = js.native
  // Create a new instance of ConditionValue
  def newConditionValue(): ConditionValue = js.native
  // Create a new instance of ConditionalFormatRule
  def newConditionalFormatRule(): ConditionalFormatRule = js.native
  // Create a new instance of CopyPasteRequest
  def newCopyPasteRequest(): CopyPasteRequest = js.native
  // Create a new instance of CopySheetToAnotherSpreadsheetRequest
  def newCopySheetToAnotherSpreadsheetRequest(): CopySheetToAnotherSpreadsheetRequest = js.native
  // Create a new instance of CreateDeveloperMetadataRequest
  def newCreateDeveloperMetadataRequest(): CreateDeveloperMetadataRequest = js.native
  // Create a new instance of CutPasteRequest
  def newCutPasteRequest(): CutPasteRequest = js.native
  // Create a new instance of DataFilter
  def newDataFilter(): DataFilter = js.native
  // Create a new instance of DataFilterValueRange
  def newDataFilterValueRange(): DataFilterValueRange = js.native
  // Create a new instance of DataValidationRule
  def newDataValidationRule(): DataValidationRule = js.native
  // Create a new instance of DateTimeRule
  def newDateTimeRule(): DateTimeRule = js.native
  // Create a new instance of DeleteBandingRequest
  def newDeleteBandingRequest(): DeleteBandingRequest = js.native
  // Create a new instance of DeleteConditionalFormatRuleRequest
  def newDeleteConditionalFormatRuleRequest(): DeleteConditionalFormatRuleRequest = js.native
  // Create a new instance of DeleteDeveloperMetadataRequest
  def newDeleteDeveloperMetadataRequest(): DeleteDeveloperMetadataRequest = js.native
  // Create a new instance of DeleteDimensionGroupRequest
  def newDeleteDimensionGroupRequest(): DeleteDimensionGroupRequest = js.native
  // Create a new instance of DeleteDimensionRequest
  def newDeleteDimensionRequest(): DeleteDimensionRequest = js.native
  // Create a new instance of DeleteEmbeddedObjectRequest
  def newDeleteEmbeddedObjectRequest(): DeleteEmbeddedObjectRequest = js.native
  // Create a new instance of DeleteFilterViewRequest
  def newDeleteFilterViewRequest(): DeleteFilterViewRequest = js.native
  // Create a new instance of DeleteNamedRangeRequest
  def newDeleteNamedRangeRequest(): DeleteNamedRangeRequest = js.native
  // Create a new instance of DeleteProtectedRangeRequest
  def newDeleteProtectedRangeRequest(): DeleteProtectedRangeRequest = js.native
  // Create a new instance of DeleteRangeRequest
  def newDeleteRangeRequest(): DeleteRangeRequest = js.native
  // Create a new instance of DeleteSheetRequest
  def newDeleteSheetRequest(): DeleteSheetRequest = js.native
  // Create a new instance of DeveloperMetadata
  def newDeveloperMetadata(): DeveloperMetadata = js.native
  // Create a new instance of DeveloperMetadataLocation
  def newDeveloperMetadataLocation(): DeveloperMetadataLocation = js.native
  // Create a new instance of DeveloperMetadataLookup
  def newDeveloperMetadataLookup(): DeveloperMetadataLookup = js.native
  // Create a new instance of DimensionGroup
  def newDimensionGroup(): DimensionGroup = js.native
  // Create a new instance of DimensionProperties
  def newDimensionProperties(): DimensionProperties = js.native
  // Create a new instance of DimensionRange
  def newDimensionRange(): DimensionRange = js.native
  // Create a new instance of DuplicateFilterViewRequest
  def newDuplicateFilterViewRequest(): DuplicateFilterViewRequest = js.native
  // Create a new instance of DuplicateSheetRequest
  def newDuplicateSheetRequest(): DuplicateSheetRequest = js.native
  // Create a new instance of Editors
  def newEditors(): Editors = js.native
  // Create a new instance of EmbeddedChart
  def newEmbeddedChart(): EmbeddedChart = js.native
  // Create a new instance of EmbeddedObjectPosition
  def newEmbeddedObjectPosition(): EmbeddedObjectPosition = js.native
  // Create a new instance of ErrorValue
  def newErrorValue(): ErrorValue = js.native
  // Create a new instance of ExtendedValue
  def newExtendedValue(): ExtendedValue = js.native
  // Create a new instance of FilterView
  def newFilterView(): FilterView = js.native
  // Create a new instance of FindReplaceRequest
  def newFindReplaceRequest(): FindReplaceRequest = js.native
  // Create a new instance of GetSpreadsheetByDataFilterRequest
  def newGetSpreadsheetByDataFilterRequest(): GetSpreadsheetByDataFilterRequest = js.native
  // Create a new instance of GradientRule
  def newGradientRule(): GradientRule = js.native
  // Create a new instance of GridCoordinate
  def newGridCoordinate(): GridCoordinate = js.native
  // Create a new instance of GridData
  def newGridData(): GridData = js.native
  // Create a new instance of GridProperties
  def newGridProperties(): GridProperties = js.native
  // Create a new instance of GridRange
  def newGridRange(): GridRange = js.native
  // Create a new instance of HistogramChartSpec
  def newHistogramChartSpec(): HistogramChartSpec = js.native
  // Create a new instance of HistogramRule
  def newHistogramRule(): HistogramRule = js.native
  // Create a new instance of HistogramSeries
  def newHistogramSeries(): HistogramSeries = js.native
  // Create a new instance of InsertDimensionRequest
  def newInsertDimensionRequest(): InsertDimensionRequest = js.native
  // Create a new instance of InsertRangeRequest
  def newInsertRangeRequest(): InsertRangeRequest = js.native
  // Create a new instance of InterpolationPoint
  def newInterpolationPoint(): InterpolationPoint = js.native
  // Create a new instance of IterativeCalculationSettings
  def newIterativeCalculationSettings(): IterativeCalculationSettings = js.native
  // Create a new instance of LineStyle
  def newLineStyle(): LineStyle = js.native
  // Create a new instance of ManualRule
  def newManualRule(): ManualRule = js.native
  // Create a new instance of ManualRuleGroup
  def newManualRuleGroup(): ManualRuleGroup = js.native
  // Create a new instance of MergeCellsRequest
  def newMergeCellsRequest(): MergeCellsRequest = js.native
  // Create a new instance of MoveDimensionRequest
  def newMoveDimensionRequest(): MoveDimensionRequest = js.native
  // Create a new instance of NamedRange
  def newNamedRange(): NamedRange = js.native
  // Create a new instance of NumberFormat
  def newNumberFormat(): NumberFormat = js.native
  // Create a new instance of OrgChartSpec
  def newOrgChartSpec(): OrgChartSpec = js.native
  // Create a new instance of OverlayPosition
  def newOverlayPosition(): OverlayPosition = js.native
  // Create a new instance of Padding
  def newPadding(): Padding = js.native
  // Create a new instance of PasteDataRequest
  def newPasteDataRequest(): PasteDataRequest = js.native
  // Create a new instance of PieChartSpec
  def newPieChartSpec(): PieChartSpec = js.native
  // Create a new instance of PivotGroup
  def newPivotGroup(): PivotGroup = js.native
  // Create a new instance of PivotGroupRule
  def newPivotGroupRule(): PivotGroupRule = js.native
  // Create a new instance of PivotGroupSortValueBucket
  def newPivotGroupSortValueBucket(): PivotGroupSortValueBucket = js.native
  // Create a new instance of PivotGroupValueMetadata
  def newPivotGroupValueMetadata(): PivotGroupValueMetadata = js.native
  // Create a new instance of PivotTable
  def newPivotTable(): PivotTable = js.native
  // Create a new instance of PivotValue
  def newPivotValue(): PivotValue = js.native
  // Create a new instance of ProtectedRange
  def newProtectedRange(): ProtectedRange = js.native
  // Create a new instance of RandomizeRangeRequest
  def newRandomizeRangeRequest(): RandomizeRangeRequest = js.native
  // Create a new instance of RepeatCellRequest
  def newRepeatCellRequest(): RepeatCellRequest = js.native
  // Create a new instance of Request
  def newRequest(): Request = js.native
  // Create a new instance of RowData
  def newRowData(): RowData = js.native
  // Create a new instance of SearchDeveloperMetadataRequest
  def newSearchDeveloperMetadataRequest(): SearchDeveloperMetadataRequest = js.native
  // Create a new instance of SetBasicFilterRequest
  def newSetBasicFilterRequest(): SetBasicFilterRequest = js.native
  // Create a new instance of SetDataValidationRequest
  def newSetDataValidationRequest(): SetDataValidationRequest = js.native
  // Create a new instance of Sheet
  def newSheet(): Sheet = js.native
  // Create a new instance of SheetProperties
  def newSheetProperties(): SheetProperties = js.native
  // Create a new instance of SortRangeRequest
  def newSortRangeRequest(): SortRangeRequest = js.native
  // Create a new instance of SortSpec
  def newSortSpec(): SortSpec = js.native
  // Create a new instance of SourceAndDestination
  def newSourceAndDestination(): SourceAndDestination = js.native
  // Create a new instance of Spreadsheet
  def newSpreadsheet(): typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet = js.native
  // Create a new instance of SpreadsheetProperties
  def newSpreadsheetProperties(): SpreadsheetProperties = js.native
  // Create a new instance of TextFormat
  def newTextFormat(): TextFormat = js.native
  // Create a new instance of TextFormatRun
  def newTextFormatRun(): TextFormatRun = js.native
  // Create a new instance of TextPosition
  def newTextPosition(): TextPosition = js.native
  // Create a new instance of TextRotation
  def newTextRotation(): TextRotation = js.native
  // Create a new instance of TextToColumnsRequest
  def newTextToColumnsRequest(): TextToColumnsRequest = js.native
  // Create a new instance of TreemapChartColorScale
  def newTreemapChartColorScale(): TreemapChartColorScale = js.native
  // Create a new instance of TreemapChartSpec
  def newTreemapChartSpec(): TreemapChartSpec = js.native
  // Create a new instance of UnmergeCellsRequest
  def newUnmergeCellsRequest(): UnmergeCellsRequest = js.native
  // Create a new instance of UpdateBandingRequest
  def newUpdateBandingRequest(): UpdateBandingRequest = js.native
  // Create a new instance of UpdateBordersRequest
  def newUpdateBordersRequest(): UpdateBordersRequest = js.native
  // Create a new instance of UpdateCellsRequest
  def newUpdateCellsRequest(): UpdateCellsRequest = js.native
  // Create a new instance of UpdateChartSpecRequest
  def newUpdateChartSpecRequest(): UpdateChartSpecRequest = js.native
  // Create a new instance of UpdateConditionalFormatRuleRequest
  def newUpdateConditionalFormatRuleRequest(): UpdateConditionalFormatRuleRequest = js.native
  // Create a new instance of UpdateDeveloperMetadataRequest
  def newUpdateDeveloperMetadataRequest(): UpdateDeveloperMetadataRequest = js.native
  // Create a new instance of UpdateDimensionGroupRequest
  def newUpdateDimensionGroupRequest(): UpdateDimensionGroupRequest = js.native
  // Create a new instance of UpdateDimensionPropertiesRequest
  def newUpdateDimensionPropertiesRequest(): UpdateDimensionPropertiesRequest = js.native
  // Create a new instance of UpdateEmbeddedObjectPositionRequest
  def newUpdateEmbeddedObjectPositionRequest(): UpdateEmbeddedObjectPositionRequest = js.native
  // Create a new instance of UpdateFilterViewRequest
  def newUpdateFilterViewRequest(): UpdateFilterViewRequest = js.native
  // Create a new instance of UpdateNamedRangeRequest
  def newUpdateNamedRangeRequest(): UpdateNamedRangeRequest = js.native
  // Create a new instance of UpdateProtectedRangeRequest
  def newUpdateProtectedRangeRequest(): UpdateProtectedRangeRequest = js.native
  // Create a new instance of UpdateSheetPropertiesRequest
  def newUpdateSheetPropertiesRequest(): UpdateSheetPropertiesRequest = js.native
  // Create a new instance of UpdateSpreadsheetPropertiesRequest
  def newUpdateSpreadsheetPropertiesRequest(): UpdateSpreadsheetPropertiesRequest = js.native
  // Create a new instance of ValueRange
  def newValueRange(): ValueRange = js.native
  // Create a new instance of WaterfallChartColumnStyle
  def newWaterfallChartColumnStyle(): WaterfallChartColumnStyle = js.native
  // Create a new instance of WaterfallChartCustomSubtotal
  def newWaterfallChartCustomSubtotal(): WaterfallChartCustomSubtotal = js.native
  // Create a new instance of WaterfallChartDomain
  def newWaterfallChartDomain(): WaterfallChartDomain = js.native
  // Create a new instance of WaterfallChartSeries
  def newWaterfallChartSeries(): WaterfallChartSeries = js.native
  // Create a new instance of WaterfallChartSpec
  def newWaterfallChartSpec(): WaterfallChartSpec = js.native
}

object Sheets_ {
  @scala.inline
  def apply(
    newAddBandingRequest: () => AddBandingRequest,
    newAddChartRequest: () => AddChartRequest,
    newAddConditionalFormatRuleRequest: () => AddConditionalFormatRuleRequest,
    newAddDimensionGroupRequest: () => AddDimensionGroupRequest,
    newAddFilterViewRequest: () => AddFilterViewRequest,
    newAddNamedRangeRequest: () => AddNamedRangeRequest,
    newAddProtectedRangeRequest: () => AddProtectedRangeRequest,
    newAddSheetRequest: () => AddSheetRequest,
    newAppendCellsRequest: () => AppendCellsRequest,
    newAppendDimensionRequest: () => AppendDimensionRequest,
    newAutoFillRequest: () => AutoFillRequest,
    newAutoResizeDimensionsRequest: () => AutoResizeDimensionsRequest,
    newBandedRange: () => BandedRange,
    newBandingProperties: () => BandingProperties,
    newBasicChartAxis: () => BasicChartAxis,
    newBasicChartDomain: () => BasicChartDomain,
    newBasicChartSeries: () => BasicChartSeries,
    newBasicChartSpec: () => BasicChartSpec,
    newBasicFilter: () => BasicFilter,
    newBatchClearValuesByDataFilterRequest: () => BatchClearValuesByDataFilterRequest,
    newBatchClearValuesRequest: () => BatchClearValuesRequest,
    newBatchGetValuesByDataFilterRequest: () => BatchGetValuesByDataFilterRequest,
    newBatchUpdateSpreadsheetRequest: () => BatchUpdateSpreadsheetRequest,
    newBatchUpdateValuesByDataFilterRequest: () => BatchUpdateValuesByDataFilterRequest,
    newBatchUpdateValuesRequest: () => BatchUpdateValuesRequest,
    newBooleanCondition: () => BooleanCondition,
    newBooleanRule: () => BooleanRule,
    newBorder: () => Border,
    newBorders: () => Borders,
    newBubbleChartSpec: () => BubbleChartSpec,
    newCandlestickChartSpec: () => CandlestickChartSpec,
    newCandlestickData: () => CandlestickData,
    newCandlestickDomain: () => CandlestickDomain,
    newCandlestickSeries: () => CandlestickSeries,
    newCellData: () => CellData,
    newCellFormat: () => CellFormat,
    newChartData: () => ChartData,
    newChartSourceRange: () => ChartSourceRange,
    newChartSpec: () => ChartSpec,
    newClearBasicFilterRequest: () => ClearBasicFilterRequest,
    newClearValuesRequest: () => js.Any,
    newColor: () => Color,
    newConditionValue: () => ConditionValue,
    newConditionalFormatRule: () => ConditionalFormatRule,
    newCopyPasteRequest: () => CopyPasteRequest,
    newCopySheetToAnotherSpreadsheetRequest: () => CopySheetToAnotherSpreadsheetRequest,
    newCreateDeveloperMetadataRequest: () => CreateDeveloperMetadataRequest,
    newCutPasteRequest: () => CutPasteRequest,
    newDataFilter: () => DataFilter,
    newDataFilterValueRange: () => DataFilterValueRange,
    newDataValidationRule: () => DataValidationRule,
    newDateTimeRule: () => DateTimeRule,
    newDeleteBandingRequest: () => DeleteBandingRequest,
    newDeleteConditionalFormatRuleRequest: () => DeleteConditionalFormatRuleRequest,
    newDeleteDeveloperMetadataRequest: () => DeleteDeveloperMetadataRequest,
    newDeleteDimensionGroupRequest: () => DeleteDimensionGroupRequest,
    newDeleteDimensionRequest: () => DeleteDimensionRequest,
    newDeleteEmbeddedObjectRequest: () => DeleteEmbeddedObjectRequest,
    newDeleteFilterViewRequest: () => DeleteFilterViewRequest,
    newDeleteNamedRangeRequest: () => DeleteNamedRangeRequest,
    newDeleteProtectedRangeRequest: () => DeleteProtectedRangeRequest,
    newDeleteRangeRequest: () => DeleteRangeRequest,
    newDeleteSheetRequest: () => DeleteSheetRequest,
    newDeveloperMetadata: () => DeveloperMetadata,
    newDeveloperMetadataLocation: () => DeveloperMetadataLocation,
    newDeveloperMetadataLookup: () => DeveloperMetadataLookup,
    newDimensionGroup: () => DimensionGroup,
    newDimensionProperties: () => DimensionProperties,
    newDimensionRange: () => DimensionRange,
    newDuplicateFilterViewRequest: () => DuplicateFilterViewRequest,
    newDuplicateSheetRequest: () => DuplicateSheetRequest,
    newEditors: () => Editors,
    newEmbeddedChart: () => EmbeddedChart,
    newEmbeddedObjectPosition: () => EmbeddedObjectPosition,
    newErrorValue: () => ErrorValue,
    newExtendedValue: () => ExtendedValue,
    newFilterView: () => FilterView,
    newFindReplaceRequest: () => FindReplaceRequest,
    newGetSpreadsheetByDataFilterRequest: () => GetSpreadsheetByDataFilterRequest,
    newGradientRule: () => GradientRule,
    newGridCoordinate: () => GridCoordinate,
    newGridData: () => GridData,
    newGridProperties: () => GridProperties,
    newGridRange: () => GridRange,
    newHistogramChartSpec: () => HistogramChartSpec,
    newHistogramRule: () => HistogramRule,
    newHistogramSeries: () => HistogramSeries,
    newInsertDimensionRequest: () => InsertDimensionRequest,
    newInsertRangeRequest: () => InsertRangeRequest,
    newInterpolationPoint: () => InterpolationPoint,
    newIterativeCalculationSettings: () => IterativeCalculationSettings,
    newLineStyle: () => LineStyle,
    newManualRule: () => ManualRule,
    newManualRuleGroup: () => ManualRuleGroup,
    newMergeCellsRequest: () => MergeCellsRequest,
    newMoveDimensionRequest: () => MoveDimensionRequest,
    newNamedRange: () => NamedRange,
    newNumberFormat: () => NumberFormat,
    newOrgChartSpec: () => OrgChartSpec,
    newOverlayPosition: () => OverlayPosition,
    newPadding: () => Padding,
    newPasteDataRequest: () => PasteDataRequest,
    newPieChartSpec: () => PieChartSpec,
    newPivotGroup: () => PivotGroup,
    newPivotGroupRule: () => PivotGroupRule,
    newPivotGroupSortValueBucket: () => PivotGroupSortValueBucket,
    newPivotGroupValueMetadata: () => PivotGroupValueMetadata,
    newPivotTable: () => PivotTable,
    newPivotValue: () => PivotValue,
    newProtectedRange: () => ProtectedRange,
    newRandomizeRangeRequest: () => RandomizeRangeRequest,
    newRepeatCellRequest: () => RepeatCellRequest,
    newRequest: () => Request,
    newRowData: () => RowData,
    newSearchDeveloperMetadataRequest: () => SearchDeveloperMetadataRequest,
    newSetBasicFilterRequest: () => SetBasicFilterRequest,
    newSetDataValidationRequest: () => SetDataValidationRequest,
    newSheet: () => Sheet,
    newSheetProperties: () => SheetProperties,
    newSortRangeRequest: () => SortRangeRequest,
    newSortSpec: () => SortSpec,
    newSourceAndDestination: () => SourceAndDestination,
    newSpreadsheet: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet,
    newSpreadsheetProperties: () => SpreadsheetProperties,
    newTextFormat: () => TextFormat,
    newTextFormatRun: () => TextFormatRun,
    newTextPosition: () => TextPosition,
    newTextRotation: () => TextRotation,
    newTextToColumnsRequest: () => TextToColumnsRequest,
    newTreemapChartColorScale: () => TreemapChartColorScale,
    newTreemapChartSpec: () => TreemapChartSpec,
    newUnmergeCellsRequest: () => UnmergeCellsRequest,
    newUpdateBandingRequest: () => UpdateBandingRequest,
    newUpdateBordersRequest: () => UpdateBordersRequest,
    newUpdateCellsRequest: () => UpdateCellsRequest,
    newUpdateChartSpecRequest: () => UpdateChartSpecRequest,
    newUpdateConditionalFormatRuleRequest: () => UpdateConditionalFormatRuleRequest,
    newUpdateDeveloperMetadataRequest: () => UpdateDeveloperMetadataRequest,
    newUpdateDimensionGroupRequest: () => UpdateDimensionGroupRequest,
    newUpdateDimensionPropertiesRequest: () => UpdateDimensionPropertiesRequest,
    newUpdateEmbeddedObjectPositionRequest: () => UpdateEmbeddedObjectPositionRequest,
    newUpdateFilterViewRequest: () => UpdateFilterViewRequest,
    newUpdateNamedRangeRequest: () => UpdateNamedRangeRequest,
    newUpdateProtectedRangeRequest: () => UpdateProtectedRangeRequest,
    newUpdateSheetPropertiesRequest: () => UpdateSheetPropertiesRequest,
    newUpdateSpreadsheetPropertiesRequest: () => UpdateSpreadsheetPropertiesRequest,
    newValueRange: () => ValueRange,
    newWaterfallChartColumnStyle: () => WaterfallChartColumnStyle,
    newWaterfallChartCustomSubtotal: () => WaterfallChartCustomSubtotal,
    newWaterfallChartDomain: () => WaterfallChartDomain,
    newWaterfallChartSeries: () => WaterfallChartSeries,
    newWaterfallChartSpec: () => WaterfallChartSpec
  ): Sheets_ = {
    val __obj = js.Dynamic.literal(newAddBandingRequest = js.Any.fromFunction0(newAddBandingRequest), newAddChartRequest = js.Any.fromFunction0(newAddChartRequest), newAddConditionalFormatRuleRequest = js.Any.fromFunction0(newAddConditionalFormatRuleRequest), newAddDimensionGroupRequest = js.Any.fromFunction0(newAddDimensionGroupRequest), newAddFilterViewRequest = js.Any.fromFunction0(newAddFilterViewRequest), newAddNamedRangeRequest = js.Any.fromFunction0(newAddNamedRangeRequest), newAddProtectedRangeRequest = js.Any.fromFunction0(newAddProtectedRangeRequest), newAddSheetRequest = js.Any.fromFunction0(newAddSheetRequest), newAppendCellsRequest = js.Any.fromFunction0(newAppendCellsRequest), newAppendDimensionRequest = js.Any.fromFunction0(newAppendDimensionRequest), newAutoFillRequest = js.Any.fromFunction0(newAutoFillRequest), newAutoResizeDimensionsRequest = js.Any.fromFunction0(newAutoResizeDimensionsRequest), newBandedRange = js.Any.fromFunction0(newBandedRange), newBandingProperties = js.Any.fromFunction0(newBandingProperties), newBasicChartAxis = js.Any.fromFunction0(newBasicChartAxis), newBasicChartDomain = js.Any.fromFunction0(newBasicChartDomain), newBasicChartSeries = js.Any.fromFunction0(newBasicChartSeries), newBasicChartSpec = js.Any.fromFunction0(newBasicChartSpec), newBasicFilter = js.Any.fromFunction0(newBasicFilter), newBatchClearValuesByDataFilterRequest = js.Any.fromFunction0(newBatchClearValuesByDataFilterRequest), newBatchClearValuesRequest = js.Any.fromFunction0(newBatchClearValuesRequest), newBatchGetValuesByDataFilterRequest = js.Any.fromFunction0(newBatchGetValuesByDataFilterRequest), newBatchUpdateSpreadsheetRequest = js.Any.fromFunction0(newBatchUpdateSpreadsheetRequest), newBatchUpdateValuesByDataFilterRequest = js.Any.fromFunction0(newBatchUpdateValuesByDataFilterRequest), newBatchUpdateValuesRequest = js.Any.fromFunction0(newBatchUpdateValuesRequest), newBooleanCondition = js.Any.fromFunction0(newBooleanCondition), newBooleanRule = js.Any.fromFunction0(newBooleanRule), newBorder = js.Any.fromFunction0(newBorder), newBorders = js.Any.fromFunction0(newBorders), newBubbleChartSpec = js.Any.fromFunction0(newBubbleChartSpec), newCandlestickChartSpec = js.Any.fromFunction0(newCandlestickChartSpec), newCandlestickData = js.Any.fromFunction0(newCandlestickData), newCandlestickDomain = js.Any.fromFunction0(newCandlestickDomain), newCandlestickSeries = js.Any.fromFunction0(newCandlestickSeries), newCellData = js.Any.fromFunction0(newCellData), newCellFormat = js.Any.fromFunction0(newCellFormat), newChartData = js.Any.fromFunction0(newChartData), newChartSourceRange = js.Any.fromFunction0(newChartSourceRange), newChartSpec = js.Any.fromFunction0(newChartSpec), newClearBasicFilterRequest = js.Any.fromFunction0(newClearBasicFilterRequest), newClearValuesRequest = js.Any.fromFunction0(newClearValuesRequest), newColor = js.Any.fromFunction0(newColor), newConditionValue = js.Any.fromFunction0(newConditionValue), newConditionalFormatRule = js.Any.fromFunction0(newConditionalFormatRule), newCopyPasteRequest = js.Any.fromFunction0(newCopyPasteRequest), newCopySheetToAnotherSpreadsheetRequest = js.Any.fromFunction0(newCopySheetToAnotherSpreadsheetRequest), newCreateDeveloperMetadataRequest = js.Any.fromFunction0(newCreateDeveloperMetadataRequest), newCutPasteRequest = js.Any.fromFunction0(newCutPasteRequest), newDataFilter = js.Any.fromFunction0(newDataFilter), newDataFilterValueRange = js.Any.fromFunction0(newDataFilterValueRange), newDataValidationRule = js.Any.fromFunction0(newDataValidationRule), newDateTimeRule = js.Any.fromFunction0(newDateTimeRule), newDeleteBandingRequest = js.Any.fromFunction0(newDeleteBandingRequest), newDeleteConditionalFormatRuleRequest = js.Any.fromFunction0(newDeleteConditionalFormatRuleRequest), newDeleteDeveloperMetadataRequest = js.Any.fromFunction0(newDeleteDeveloperMetadataRequest), newDeleteDimensionGroupRequest = js.Any.fromFunction0(newDeleteDimensionGroupRequest), newDeleteDimensionRequest = js.Any.fromFunction0(newDeleteDimensionRequest), newDeleteEmbeddedObjectRequest = js.Any.fromFunction0(newDeleteEmbeddedObjectRequest), newDeleteFilterViewRequest = js.Any.fromFunction0(newDeleteFilterViewRequest), newDeleteNamedRangeRequest = js.Any.fromFunction0(newDeleteNamedRangeRequest), newDeleteProtectedRangeRequest = js.Any.fromFunction0(newDeleteProtectedRangeRequest), newDeleteRangeRequest = js.Any.fromFunction0(newDeleteRangeRequest), newDeleteSheetRequest = js.Any.fromFunction0(newDeleteSheetRequest), newDeveloperMetadata = js.Any.fromFunction0(newDeveloperMetadata), newDeveloperMetadataLocation = js.Any.fromFunction0(newDeveloperMetadataLocation), newDeveloperMetadataLookup = js.Any.fromFunction0(newDeveloperMetadataLookup), newDimensionGroup = js.Any.fromFunction0(newDimensionGroup), newDimensionProperties = js.Any.fromFunction0(newDimensionProperties), newDimensionRange = js.Any.fromFunction0(newDimensionRange), newDuplicateFilterViewRequest = js.Any.fromFunction0(newDuplicateFilterViewRequest), newDuplicateSheetRequest = js.Any.fromFunction0(newDuplicateSheetRequest), newEditors = js.Any.fromFunction0(newEditors), newEmbeddedChart = js.Any.fromFunction0(newEmbeddedChart), newEmbeddedObjectPosition = js.Any.fromFunction0(newEmbeddedObjectPosition), newErrorValue = js.Any.fromFunction0(newErrorValue), newExtendedValue = js.Any.fromFunction0(newExtendedValue), newFilterView = js.Any.fromFunction0(newFilterView), newFindReplaceRequest = js.Any.fromFunction0(newFindReplaceRequest), newGetSpreadsheetByDataFilterRequest = js.Any.fromFunction0(newGetSpreadsheetByDataFilterRequest), newGradientRule = js.Any.fromFunction0(newGradientRule), newGridCoordinate = js.Any.fromFunction0(newGridCoordinate), newGridData = js.Any.fromFunction0(newGridData), newGridProperties = js.Any.fromFunction0(newGridProperties), newGridRange = js.Any.fromFunction0(newGridRange), newHistogramChartSpec = js.Any.fromFunction0(newHistogramChartSpec), newHistogramRule = js.Any.fromFunction0(newHistogramRule), newHistogramSeries = js.Any.fromFunction0(newHistogramSeries), newInsertDimensionRequest = js.Any.fromFunction0(newInsertDimensionRequest), newInsertRangeRequest = js.Any.fromFunction0(newInsertRangeRequest), newInterpolationPoint = js.Any.fromFunction0(newInterpolationPoint), newIterativeCalculationSettings = js.Any.fromFunction0(newIterativeCalculationSettings), newLineStyle = js.Any.fromFunction0(newLineStyle), newManualRule = js.Any.fromFunction0(newManualRule), newManualRuleGroup = js.Any.fromFunction0(newManualRuleGroup), newMergeCellsRequest = js.Any.fromFunction0(newMergeCellsRequest), newMoveDimensionRequest = js.Any.fromFunction0(newMoveDimensionRequest), newNamedRange = js.Any.fromFunction0(newNamedRange), newNumberFormat = js.Any.fromFunction0(newNumberFormat), newOrgChartSpec = js.Any.fromFunction0(newOrgChartSpec), newOverlayPosition = js.Any.fromFunction0(newOverlayPosition), newPadding = js.Any.fromFunction0(newPadding), newPasteDataRequest = js.Any.fromFunction0(newPasteDataRequest), newPieChartSpec = js.Any.fromFunction0(newPieChartSpec), newPivotGroup = js.Any.fromFunction0(newPivotGroup), newPivotGroupRule = js.Any.fromFunction0(newPivotGroupRule), newPivotGroupSortValueBucket = js.Any.fromFunction0(newPivotGroupSortValueBucket), newPivotGroupValueMetadata = js.Any.fromFunction0(newPivotGroupValueMetadata), newPivotTable = js.Any.fromFunction0(newPivotTable), newPivotValue = js.Any.fromFunction0(newPivotValue), newProtectedRange = js.Any.fromFunction0(newProtectedRange), newRandomizeRangeRequest = js.Any.fromFunction0(newRandomizeRangeRequest), newRepeatCellRequest = js.Any.fromFunction0(newRepeatCellRequest), newRequest = js.Any.fromFunction0(newRequest), newRowData = js.Any.fromFunction0(newRowData), newSearchDeveloperMetadataRequest = js.Any.fromFunction0(newSearchDeveloperMetadataRequest), newSetBasicFilterRequest = js.Any.fromFunction0(newSetBasicFilterRequest), newSetDataValidationRequest = js.Any.fromFunction0(newSetDataValidationRequest), newSheet = js.Any.fromFunction0(newSheet), newSheetProperties = js.Any.fromFunction0(newSheetProperties), newSortRangeRequest = js.Any.fromFunction0(newSortRangeRequest), newSortSpec = js.Any.fromFunction0(newSortSpec), newSourceAndDestination = js.Any.fromFunction0(newSourceAndDestination), newSpreadsheet = js.Any.fromFunction0(newSpreadsheet), newSpreadsheetProperties = js.Any.fromFunction0(newSpreadsheetProperties), newTextFormat = js.Any.fromFunction0(newTextFormat), newTextFormatRun = js.Any.fromFunction0(newTextFormatRun), newTextPosition = js.Any.fromFunction0(newTextPosition), newTextRotation = js.Any.fromFunction0(newTextRotation), newTextToColumnsRequest = js.Any.fromFunction0(newTextToColumnsRequest), newTreemapChartColorScale = js.Any.fromFunction0(newTreemapChartColorScale), newTreemapChartSpec = js.Any.fromFunction0(newTreemapChartSpec), newUnmergeCellsRequest = js.Any.fromFunction0(newUnmergeCellsRequest), newUpdateBandingRequest = js.Any.fromFunction0(newUpdateBandingRequest), newUpdateBordersRequest = js.Any.fromFunction0(newUpdateBordersRequest), newUpdateCellsRequest = js.Any.fromFunction0(newUpdateCellsRequest), newUpdateChartSpecRequest = js.Any.fromFunction0(newUpdateChartSpecRequest), newUpdateConditionalFormatRuleRequest = js.Any.fromFunction0(newUpdateConditionalFormatRuleRequest), newUpdateDeveloperMetadataRequest = js.Any.fromFunction0(newUpdateDeveloperMetadataRequest), newUpdateDimensionGroupRequest = js.Any.fromFunction0(newUpdateDimensionGroupRequest), newUpdateDimensionPropertiesRequest = js.Any.fromFunction0(newUpdateDimensionPropertiesRequest), newUpdateEmbeddedObjectPositionRequest = js.Any.fromFunction0(newUpdateEmbeddedObjectPositionRequest), newUpdateFilterViewRequest = js.Any.fromFunction0(newUpdateFilterViewRequest), newUpdateNamedRangeRequest = js.Any.fromFunction0(newUpdateNamedRangeRequest), newUpdateProtectedRangeRequest = js.Any.fromFunction0(newUpdateProtectedRangeRequest), newUpdateSheetPropertiesRequest = js.Any.fromFunction0(newUpdateSheetPropertiesRequest), newUpdateSpreadsheetPropertiesRequest = js.Any.fromFunction0(newUpdateSpreadsheetPropertiesRequest), newValueRange = js.Any.fromFunction0(newValueRange), newWaterfallChartColumnStyle = js.Any.fromFunction0(newWaterfallChartColumnStyle), newWaterfallChartCustomSubtotal = js.Any.fromFunction0(newWaterfallChartCustomSubtotal), newWaterfallChartDomain = js.Any.fromFunction0(newWaterfallChartDomain), newWaterfallChartSeries = js.Any.fromFunction0(newWaterfallChartSeries), newWaterfallChartSpec = js.Any.fromFunction0(newWaterfallChartSpec))
    __obj.asInstanceOf[Sheets_]
  }
  @scala.inline
  implicit class Sheets_Ops[Self <: Sheets_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAddBandingRequest(value: () => AddBandingRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAddBandingRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAddChartRequest(value: () => AddChartRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAddChartRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAddConditionalFormatRuleRequest(value: () => AddConditionalFormatRuleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAddConditionalFormatRuleRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAddDimensionGroupRequest(value: () => AddDimensionGroupRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAddDimensionGroupRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAddFilterViewRequest(value: () => AddFilterViewRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAddFilterViewRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAddNamedRangeRequest(value: () => AddNamedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAddNamedRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAddProtectedRangeRequest(value: () => AddProtectedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAddProtectedRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAddSheetRequest(value: () => AddSheetRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAddSheetRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAppendCellsRequest(value: () => AppendCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAppendCellsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAppendDimensionRequest(value: () => AppendDimensionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAppendDimensionRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAutoFillRequest(value: () => AutoFillRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAutoFillRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAutoResizeDimensionsRequest(value: () => AutoResizeDimensionsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAutoResizeDimensionsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBandedRange(value: () => BandedRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBandedRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBandingProperties(value: () => BandingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBandingProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBasicChartAxis(value: () => BasicChartAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBasicChartAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBasicChartDomain(value: () => BasicChartDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBasicChartDomain")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBasicChartSeries(value: () => BasicChartSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBasicChartSeries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBasicChartSpec(value: () => BasicChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBasicChartSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBasicFilter(value: () => BasicFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBasicFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBatchClearValuesByDataFilterRequest(value: () => BatchClearValuesByDataFilterRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBatchClearValuesByDataFilterRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBatchClearValuesRequest(value: () => BatchClearValuesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBatchClearValuesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBatchGetValuesByDataFilterRequest(value: () => BatchGetValuesByDataFilterRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBatchGetValuesByDataFilterRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBatchUpdateSpreadsheetRequest(value: () => BatchUpdateSpreadsheetRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBatchUpdateSpreadsheetRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBatchUpdateValuesByDataFilterRequest(value: () => BatchUpdateValuesByDataFilterRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBatchUpdateValuesByDataFilterRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBatchUpdateValuesRequest(value: () => BatchUpdateValuesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBatchUpdateValuesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBooleanCondition(value: () => BooleanCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBooleanCondition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBooleanRule(value: () => BooleanRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBooleanRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBorder(value: () => Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBorder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBorders(value: () => Borders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBorders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBubbleChartSpec(value: () => BubbleChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBubbleChartSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCandlestickChartSpec(value: () => CandlestickChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCandlestickChartSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCandlestickData(value: () => CandlestickData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCandlestickData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCandlestickDomain(value: () => CandlestickDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCandlestickDomain")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCandlestickSeries(value: () => CandlestickSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCandlestickSeries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCellData(value: () => CellData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCellData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCellFormat(value: () => CellFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCellFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChartData(value: () => ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChartData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChartSourceRange(value: () => ChartSourceRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChartSourceRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewChartSpec(value: () => ChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newChartSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewClearBasicFilterRequest(value: () => ClearBasicFilterRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClearBasicFilterRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewClearValuesRequest(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClearValuesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewColor(value: () => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewConditionValue(value: () => ConditionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConditionValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewConditionalFormatRule(value: () => ConditionalFormatRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConditionalFormatRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCopyPasteRequest(value: () => CopyPasteRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCopyPasteRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCopySheetToAnotherSpreadsheetRequest(value: () => CopySheetToAnotherSpreadsheetRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCopySheetToAnotherSpreadsheetRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateDeveloperMetadataRequest(value: () => CreateDeveloperMetadataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateDeveloperMetadataRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCutPasteRequest(value: () => CutPasteRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCutPasteRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDataFilter(value: () => DataFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDataFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDataFilterValueRange(value: () => DataFilterValueRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDataFilterValueRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDataValidationRule(value: () => DataValidationRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDataValidationRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDateTimeRule(value: () => DateTimeRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDateTimeRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteBandingRequest(value: () => DeleteBandingRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteBandingRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteConditionalFormatRuleRequest(value: () => DeleteConditionalFormatRuleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteConditionalFormatRuleRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteDeveloperMetadataRequest(value: () => DeleteDeveloperMetadataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteDeveloperMetadataRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteDimensionGroupRequest(value: () => DeleteDimensionGroupRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteDimensionGroupRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteDimensionRequest(value: () => DeleteDimensionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteDimensionRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteEmbeddedObjectRequest(value: () => DeleteEmbeddedObjectRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteEmbeddedObjectRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteFilterViewRequest(value: () => DeleteFilterViewRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteFilterViewRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteNamedRangeRequest(value: () => DeleteNamedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteNamedRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteProtectedRangeRequest(value: () => DeleteProtectedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteProtectedRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteRangeRequest(value: () => DeleteRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteSheetRequest(value: () => DeleteSheetRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteSheetRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeveloperMetadata(value: () => DeveloperMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeveloperMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeveloperMetadataLocation(value: () => DeveloperMetadataLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeveloperMetadataLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeveloperMetadataLookup(value: () => DeveloperMetadataLookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeveloperMetadataLookup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDimensionGroup(value: () => DimensionGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDimensionGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDimensionProperties(value: () => DimensionProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDimensionProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDimensionRange(value: () => DimensionRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDimensionRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDuplicateFilterViewRequest(value: () => DuplicateFilterViewRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDuplicateFilterViewRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDuplicateSheetRequest(value: () => DuplicateSheetRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDuplicateSheetRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEditors(value: () => Editors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEditors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEmbeddedChart(value: () => EmbeddedChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEmbeddedChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEmbeddedObjectPosition(value: () => EmbeddedObjectPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEmbeddedObjectPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewErrorValue(value: () => ErrorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newErrorValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewExtendedValue(value: () => ExtendedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newExtendedValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFilterView(value: () => FilterView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFilterView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFindReplaceRequest(value: () => FindReplaceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFindReplaceRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGetSpreadsheetByDataFilterRequest(value: () => GetSpreadsheetByDataFilterRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGetSpreadsheetByDataFilterRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGradientRule(value: () => GradientRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGradientRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGridCoordinate(value: () => GridCoordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGridCoordinate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGridData(value: () => GridData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGridData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGridProperties(value: () => GridProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGridProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGridRange(value: () => GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGridRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewHistogramChartSpec(value: () => HistogramChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHistogramChartSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewHistogramRule(value: () => HistogramRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHistogramRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewHistogramSeries(value: () => HistogramSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHistogramSeries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInsertDimensionRequest(value: () => InsertDimensionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInsertDimensionRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInsertRangeRequest(value: () => InsertRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInsertRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInterpolationPoint(value: () => InterpolationPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInterpolationPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewIterativeCalculationSettings(value: () => IterativeCalculationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIterativeCalculationSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLineStyle(value: () => LineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewManualRule(value: () => ManualRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newManualRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewManualRuleGroup(value: () => ManualRuleGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newManualRuleGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMergeCellsRequest(value: () => MergeCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMergeCellsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMoveDimensionRequest(value: () => MoveDimensionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMoveDimensionRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewNamedRange(value: () => NamedRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNamedRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewNumberFormat(value: () => NumberFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNumberFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrgChartSpec(value: () => OrgChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrgChartSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOverlayPosition(value: () => OverlayPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOverlayPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPadding(value: () => Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPadding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPasteDataRequest(value: () => PasteDataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPasteDataRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPieChartSpec(value: () => PieChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPieChartSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPivotGroup(value: () => PivotGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPivotGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPivotGroupRule(value: () => PivotGroupRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPivotGroupRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPivotGroupSortValueBucket(value: () => PivotGroupSortValueBucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPivotGroupSortValueBucket")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPivotGroupValueMetadata(value: () => PivotGroupValueMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPivotGroupValueMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPivotTable(value: () => PivotTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPivotTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPivotValue(value: () => PivotValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPivotValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewProtectedRange(value: () => ProtectedRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProtectedRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRandomizeRangeRequest(value: () => RandomizeRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRandomizeRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRepeatCellRequest(value: () => RepeatCellRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRepeatCellRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRequest(value: () => Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRowData(value: () => RowData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRowData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSearchDeveloperMetadataRequest(value: () => SearchDeveloperMetadataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSearchDeveloperMetadataRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSetBasicFilterRequest(value: () => SetBasicFilterRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSetBasicFilterRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSetDataValidationRequest(value: () => SetDataValidationRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSetDataValidationRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSheet(value: () => Sheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSheetProperties(value: () => SheetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheetProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSortRangeRequest(value: () => SortRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSortRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSortSpec(value: () => SortSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSortSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSourceAndDestination(value: () => SourceAndDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSourceAndDestination")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSpreadsheet(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSpreadsheet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSpreadsheetProperties(value: () => SpreadsheetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSpreadsheetProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextFormat(value: () => TextFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextFormatRun(value: () => TextFormatRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextFormatRun")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextPosition(value: () => TextPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextRotation(value: () => TextRotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextRotation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextToColumnsRequest(value: () => TextToColumnsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextToColumnsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTreemapChartColorScale(value: () => TreemapChartColorScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTreemapChartColorScale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTreemapChartSpec(value: () => TreemapChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTreemapChartSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUnmergeCellsRequest(value: () => UnmergeCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUnmergeCellsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateBandingRequest(value: () => UpdateBandingRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateBandingRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateBordersRequest(value: () => UpdateBordersRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateBordersRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateCellsRequest(value: () => UpdateCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateCellsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateChartSpecRequest(value: () => UpdateChartSpecRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateChartSpecRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateConditionalFormatRuleRequest(value: () => UpdateConditionalFormatRuleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateConditionalFormatRuleRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateDeveloperMetadataRequest(value: () => UpdateDeveloperMetadataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateDeveloperMetadataRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateDimensionGroupRequest(value: () => UpdateDimensionGroupRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateDimensionGroupRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateDimensionPropertiesRequest(value: () => UpdateDimensionPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateDimensionPropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateEmbeddedObjectPositionRequest(value: () => UpdateEmbeddedObjectPositionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateEmbeddedObjectPositionRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateFilterViewRequest(value: () => UpdateFilterViewRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateFilterViewRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateNamedRangeRequest(value: () => UpdateNamedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateNamedRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateProtectedRangeRequest(value: () => UpdateProtectedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateProtectedRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateSheetPropertiesRequest(value: () => UpdateSheetPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateSheetPropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateSpreadsheetPropertiesRequest(value: () => UpdateSpreadsheetPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateSpreadsheetPropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewValueRange(value: () => ValueRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValueRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWaterfallChartColumnStyle(value: () => WaterfallChartColumnStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWaterfallChartColumnStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWaterfallChartCustomSubtotal(value: () => WaterfallChartCustomSubtotal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWaterfallChartCustomSubtotal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWaterfallChartDomain(value: () => WaterfallChartDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWaterfallChartDomain")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWaterfallChartSeries(value: () => WaterfallChartSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWaterfallChartSeries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWaterfallChartSpec(value: () => WaterfallChartSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWaterfallChartSpec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpreadsheets(value: SpreadsheetsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spreadsheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadsheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Spreadsheets")(js.undefined)
        ret
    }
  }
  
}

