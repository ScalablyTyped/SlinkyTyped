package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Collection.Spreadsheets.DeveloperMetadataCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Collection.Spreadsheets.SheetsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Collection.Spreadsheets.ValuesCollection
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
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.AppendValuesResponse
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
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchClearValuesByDataFilterResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchClearValuesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchClearValuesResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchGetValuesByDataFilterRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchGetValuesByDataFilterResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchGetValuesResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateSpreadsheetRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateSpreadsheetResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesByDataFilterRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesByDataFilterResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesResponse
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
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ClearValuesResponse
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
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.SearchDeveloperMetadataResponse
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
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateValuesResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.ValueRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartColumnStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartCustomSubtotal
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartDomain
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartSeries
import typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.WaterfallChartSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheets extends StObject {
  
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
object Sheets {
  
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
  ): Sheets = {
    val __obj = js.Dynamic.literal(newAddBandingRequest = js.Any.fromFunction0(newAddBandingRequest), newAddChartRequest = js.Any.fromFunction0(newAddChartRequest), newAddConditionalFormatRuleRequest = js.Any.fromFunction0(newAddConditionalFormatRuleRequest), newAddDimensionGroupRequest = js.Any.fromFunction0(newAddDimensionGroupRequest), newAddFilterViewRequest = js.Any.fromFunction0(newAddFilterViewRequest), newAddNamedRangeRequest = js.Any.fromFunction0(newAddNamedRangeRequest), newAddProtectedRangeRequest = js.Any.fromFunction0(newAddProtectedRangeRequest), newAddSheetRequest = js.Any.fromFunction0(newAddSheetRequest), newAppendCellsRequest = js.Any.fromFunction0(newAppendCellsRequest), newAppendDimensionRequest = js.Any.fromFunction0(newAppendDimensionRequest), newAutoFillRequest = js.Any.fromFunction0(newAutoFillRequest), newAutoResizeDimensionsRequest = js.Any.fromFunction0(newAutoResizeDimensionsRequest), newBandedRange = js.Any.fromFunction0(newBandedRange), newBandingProperties = js.Any.fromFunction0(newBandingProperties), newBasicChartAxis = js.Any.fromFunction0(newBasicChartAxis), newBasicChartDomain = js.Any.fromFunction0(newBasicChartDomain), newBasicChartSeries = js.Any.fromFunction0(newBasicChartSeries), newBasicChartSpec = js.Any.fromFunction0(newBasicChartSpec), newBasicFilter = js.Any.fromFunction0(newBasicFilter), newBatchClearValuesByDataFilterRequest = js.Any.fromFunction0(newBatchClearValuesByDataFilterRequest), newBatchClearValuesRequest = js.Any.fromFunction0(newBatchClearValuesRequest), newBatchGetValuesByDataFilterRequest = js.Any.fromFunction0(newBatchGetValuesByDataFilterRequest), newBatchUpdateSpreadsheetRequest = js.Any.fromFunction0(newBatchUpdateSpreadsheetRequest), newBatchUpdateValuesByDataFilterRequest = js.Any.fromFunction0(newBatchUpdateValuesByDataFilterRequest), newBatchUpdateValuesRequest = js.Any.fromFunction0(newBatchUpdateValuesRequest), newBooleanCondition = js.Any.fromFunction0(newBooleanCondition), newBooleanRule = js.Any.fromFunction0(newBooleanRule), newBorder = js.Any.fromFunction0(newBorder), newBorders = js.Any.fromFunction0(newBorders), newBubbleChartSpec = js.Any.fromFunction0(newBubbleChartSpec), newCandlestickChartSpec = js.Any.fromFunction0(newCandlestickChartSpec), newCandlestickData = js.Any.fromFunction0(newCandlestickData), newCandlestickDomain = js.Any.fromFunction0(newCandlestickDomain), newCandlestickSeries = js.Any.fromFunction0(newCandlestickSeries), newCellData = js.Any.fromFunction0(newCellData), newCellFormat = js.Any.fromFunction0(newCellFormat), newChartData = js.Any.fromFunction0(newChartData), newChartSourceRange = js.Any.fromFunction0(newChartSourceRange), newChartSpec = js.Any.fromFunction0(newChartSpec), newClearBasicFilterRequest = js.Any.fromFunction0(newClearBasicFilterRequest), newClearValuesRequest = js.Any.fromFunction0(newClearValuesRequest), newColor = js.Any.fromFunction0(newColor), newConditionValue = js.Any.fromFunction0(newConditionValue), newConditionalFormatRule = js.Any.fromFunction0(newConditionalFormatRule), newCopyPasteRequest = js.Any.fromFunction0(newCopyPasteRequest), newCopySheetToAnotherSpreadsheetRequest = js.Any.fromFunction0(newCopySheetToAnotherSpreadsheetRequest), newCreateDeveloperMetadataRequest = js.Any.fromFunction0(newCreateDeveloperMetadataRequest), newCutPasteRequest = js.Any.fromFunction0(newCutPasteRequest), newDataFilter = js.Any.fromFunction0(newDataFilter), newDataFilterValueRange = js.Any.fromFunction0(newDataFilterValueRange), newDataValidationRule = js.Any.fromFunction0(newDataValidationRule), newDateTimeRule = js.Any.fromFunction0(newDateTimeRule), newDeleteBandingRequest = js.Any.fromFunction0(newDeleteBandingRequest), newDeleteConditionalFormatRuleRequest = js.Any.fromFunction0(newDeleteConditionalFormatRuleRequest), newDeleteDeveloperMetadataRequest = js.Any.fromFunction0(newDeleteDeveloperMetadataRequest), newDeleteDimensionGroupRequest = js.Any.fromFunction0(newDeleteDimensionGroupRequest), newDeleteDimensionRequest = js.Any.fromFunction0(newDeleteDimensionRequest), newDeleteEmbeddedObjectRequest = js.Any.fromFunction0(newDeleteEmbeddedObjectRequest), newDeleteFilterViewRequest = js.Any.fromFunction0(newDeleteFilterViewRequest), newDeleteNamedRangeRequest = js.Any.fromFunction0(newDeleteNamedRangeRequest), newDeleteProtectedRangeRequest = js.Any.fromFunction0(newDeleteProtectedRangeRequest), newDeleteRangeRequest = js.Any.fromFunction0(newDeleteRangeRequest), newDeleteSheetRequest = js.Any.fromFunction0(newDeleteSheetRequest), newDeveloperMetadata = js.Any.fromFunction0(newDeveloperMetadata), newDeveloperMetadataLocation = js.Any.fromFunction0(newDeveloperMetadataLocation), newDeveloperMetadataLookup = js.Any.fromFunction0(newDeveloperMetadataLookup), newDimensionGroup = js.Any.fromFunction0(newDimensionGroup), newDimensionProperties = js.Any.fromFunction0(newDimensionProperties), newDimensionRange = js.Any.fromFunction0(newDimensionRange), newDuplicateFilterViewRequest = js.Any.fromFunction0(newDuplicateFilterViewRequest), newDuplicateSheetRequest = js.Any.fromFunction0(newDuplicateSheetRequest), newEditors = js.Any.fromFunction0(newEditors), newEmbeddedChart = js.Any.fromFunction0(newEmbeddedChart), newEmbeddedObjectPosition = js.Any.fromFunction0(newEmbeddedObjectPosition), newErrorValue = js.Any.fromFunction0(newErrorValue), newExtendedValue = js.Any.fromFunction0(newExtendedValue), newFilterView = js.Any.fromFunction0(newFilterView), newFindReplaceRequest = js.Any.fromFunction0(newFindReplaceRequest), newGetSpreadsheetByDataFilterRequest = js.Any.fromFunction0(newGetSpreadsheetByDataFilterRequest), newGradientRule = js.Any.fromFunction0(newGradientRule), newGridCoordinate = js.Any.fromFunction0(newGridCoordinate), newGridData = js.Any.fromFunction0(newGridData), newGridProperties = js.Any.fromFunction0(newGridProperties), newGridRange = js.Any.fromFunction0(newGridRange), newHistogramChartSpec = js.Any.fromFunction0(newHistogramChartSpec), newHistogramRule = js.Any.fromFunction0(newHistogramRule), newHistogramSeries = js.Any.fromFunction0(newHistogramSeries), newInsertDimensionRequest = js.Any.fromFunction0(newInsertDimensionRequest), newInsertRangeRequest = js.Any.fromFunction0(newInsertRangeRequest), newInterpolationPoint = js.Any.fromFunction0(newInterpolationPoint), newIterativeCalculationSettings = js.Any.fromFunction0(newIterativeCalculationSettings), newLineStyle = js.Any.fromFunction0(newLineStyle), newManualRule = js.Any.fromFunction0(newManualRule), newManualRuleGroup = js.Any.fromFunction0(newManualRuleGroup), newMergeCellsRequest = js.Any.fromFunction0(newMergeCellsRequest), newMoveDimensionRequest = js.Any.fromFunction0(newMoveDimensionRequest), newNamedRange = js.Any.fromFunction0(newNamedRange), newNumberFormat = js.Any.fromFunction0(newNumberFormat), newOrgChartSpec = js.Any.fromFunction0(newOrgChartSpec), newOverlayPosition = js.Any.fromFunction0(newOverlayPosition), newPadding = js.Any.fromFunction0(newPadding), newPasteDataRequest = js.Any.fromFunction0(newPasteDataRequest), newPieChartSpec = js.Any.fromFunction0(newPieChartSpec), newPivotGroup = js.Any.fromFunction0(newPivotGroup), newPivotGroupRule = js.Any.fromFunction0(newPivotGroupRule), newPivotGroupSortValueBucket = js.Any.fromFunction0(newPivotGroupSortValueBucket), newPivotGroupValueMetadata = js.Any.fromFunction0(newPivotGroupValueMetadata), newPivotTable = js.Any.fromFunction0(newPivotTable), newPivotValue = js.Any.fromFunction0(newPivotValue), newProtectedRange = js.Any.fromFunction0(newProtectedRange), newRandomizeRangeRequest = js.Any.fromFunction0(newRandomizeRangeRequest), newRepeatCellRequest = js.Any.fromFunction0(newRepeatCellRequest), newRequest = js.Any.fromFunction0(newRequest), newRowData = js.Any.fromFunction0(newRowData), newSearchDeveloperMetadataRequest = js.Any.fromFunction0(newSearchDeveloperMetadataRequest), newSetBasicFilterRequest = js.Any.fromFunction0(newSetBasicFilterRequest), newSetDataValidationRequest = js.Any.fromFunction0(newSetDataValidationRequest), newSheet = js.Any.fromFunction0(newSheet), newSheetProperties = js.Any.fromFunction0(newSheetProperties), newSortRangeRequest = js.Any.fromFunction0(newSortRangeRequest), newSortSpec = js.Any.fromFunction0(newSortSpec), newSourceAndDestination = js.Any.fromFunction0(newSourceAndDestination), newSpreadsheet = js.Any.fromFunction0(newSpreadsheet), newSpreadsheetProperties = js.Any.fromFunction0(newSpreadsheetProperties), newTextFormat = js.Any.fromFunction0(newTextFormat), newTextFormatRun = js.Any.fromFunction0(newTextFormatRun), newTextPosition = js.Any.fromFunction0(newTextPosition), newTextRotation = js.Any.fromFunction0(newTextRotation), newTextToColumnsRequest = js.Any.fromFunction0(newTextToColumnsRequest), newTreemapChartColorScale = js.Any.fromFunction0(newTreemapChartColorScale), newTreemapChartSpec = js.Any.fromFunction0(newTreemapChartSpec), newUnmergeCellsRequest = js.Any.fromFunction0(newUnmergeCellsRequest), newUpdateBandingRequest = js.Any.fromFunction0(newUpdateBandingRequest), newUpdateBordersRequest = js.Any.fromFunction0(newUpdateBordersRequest), newUpdateCellsRequest = js.Any.fromFunction0(newUpdateCellsRequest), newUpdateChartSpecRequest = js.Any.fromFunction0(newUpdateChartSpecRequest), newUpdateConditionalFormatRuleRequest = js.Any.fromFunction0(newUpdateConditionalFormatRuleRequest), newUpdateDeveloperMetadataRequest = js.Any.fromFunction0(newUpdateDeveloperMetadataRequest), newUpdateDimensionGroupRequest = js.Any.fromFunction0(newUpdateDimensionGroupRequest), newUpdateDimensionPropertiesRequest = js.Any.fromFunction0(newUpdateDimensionPropertiesRequest), newUpdateEmbeddedObjectPositionRequest = js.Any.fromFunction0(newUpdateEmbeddedObjectPositionRequest), newUpdateFilterViewRequest = js.Any.fromFunction0(newUpdateFilterViewRequest), newUpdateNamedRangeRequest = js.Any.fromFunction0(newUpdateNamedRangeRequest), newUpdateProtectedRangeRequest = js.Any.fromFunction0(newUpdateProtectedRangeRequest), newUpdateSheetPropertiesRequest = js.Any.fromFunction0(newUpdateSheetPropertiesRequest), newUpdateSpreadsheetPropertiesRequest = js.Any.fromFunction0(newUpdateSpreadsheetPropertiesRequest), newValueRange = js.Any.fromFunction0(newValueRange), newWaterfallChartColumnStyle = js.Any.fromFunction0(newWaterfallChartColumnStyle), newWaterfallChartCustomSubtotal = js.Any.fromFunction0(newWaterfallChartCustomSubtotal), newWaterfallChartDomain = js.Any.fromFunction0(newWaterfallChartDomain), newWaterfallChartSeries = js.Any.fromFunction0(newWaterfallChartSeries), newWaterfallChartSpec = js.Any.fromFunction0(newWaterfallChartSpec))
    __obj.asInstanceOf[Sheets]
  }
  
  object Collection {
    
    object Spreadsheets {
      
      @js.native
      trait DeveloperMetadataCollection extends StObject {
        
        // Returns the developer metadata with the specified ID.
        // The caller must specify the spreadsheet ID and the developer metadata's
        // unique metadataId.
        def get(spreadsheetId: String, metadataId: Double): DeveloperMetadata = js.native
        
        // Returns all developer metadata matching the specified DataFilter.
        // If the provided DataFilter represents a DeveloperMetadataLookup object,
        // this will return all DeveloperMetadata entries selected by it. If the
        // DataFilter represents a location in a spreadsheet, this will return all
        // developer metadata associated with locations intersecting that region.
        def search(resource: SearchDeveloperMetadataRequest, spreadsheetId: String): SearchDeveloperMetadataResponse = js.native
      }
      object DeveloperMetadataCollection {
        
        @scala.inline
        def apply(
          get: (String, Double) => DeveloperMetadata,
          search: (SearchDeveloperMetadataRequest, String) => SearchDeveloperMetadataResponse
        ): DeveloperMetadataCollection = {
          val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), search = js.Any.fromFunction2(search))
          __obj.asInstanceOf[DeveloperMetadataCollection]
        }
        
        @scala.inline
        implicit class DeveloperMetadataCollectionMutableBuilder[Self <: DeveloperMetadataCollection] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setGet(value: (String, Double) => DeveloperMetadata): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
          
          @scala.inline
          def setSearch(value: (SearchDeveloperMetadataRequest, String) => SearchDeveloperMetadataResponse): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
        }
      }
      
      @js.native
      trait SheetsCollection extends StObject {
        
        // Copies a single sheet from a spreadsheet to another spreadsheet.
        // Returns the properties of the newly created sheet.
        def copyTo(resource: CopySheetToAnotherSpreadsheetRequest, spreadsheetId: String, sheetId: Double): SheetProperties = js.native
      }
      object SheetsCollection {
        
        @scala.inline
        def apply(copyTo: (CopySheetToAnotherSpreadsheetRequest, String, Double) => SheetProperties): SheetsCollection = {
          val __obj = js.Dynamic.literal(copyTo = js.Any.fromFunction3(copyTo))
          __obj.asInstanceOf[SheetsCollection]
        }
        
        @scala.inline
        implicit class SheetsCollectionMutableBuilder[Self <: SheetsCollection] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCopyTo(value: (CopySheetToAnotherSpreadsheetRequest, String, Double) => SheetProperties): Self = StObject.set(x, "copyTo", js.Any.fromFunction3(value))
        }
      }
      
      @js.native
      trait ValuesCollection extends StObject {
        
        // Appends values to a spreadsheet. The input range is used to search for
        // existing data and find a "table" within that range. Values will be
        // appended to the next row of the table, starting with the first column of
        // the table. See the
        // [guide](/sheets/api/guides/values#appending_values)
        // and
        // [sample code](/sheets/api/samples/writing#append_values)
        // for specific details of how tables are detected and data is appended.
        // The caller must specify the spreadsheet ID, range, and
        // a valueInputOption.  The `valueInputOption` only
        // controls how the input data will be added to the sheet (column-wise or
        // row-wise), it does not influence what cell the data starts being written
        // to.
        def append(resource: ValueRange, spreadsheetId: String, range: String): AppendValuesResponse = js.native
        // Appends values to a spreadsheet. The input range is used to search for
        // existing data and find a "table" within that range. Values will be
        // appended to the next row of the table, starting with the first column of
        // the table. See the
        // [guide](/sheets/api/guides/values#appending_values)
        // and
        // [sample code](/sheets/api/samples/writing#append_values)
        // for specific details of how tables are detected and data is appended.
        // The caller must specify the spreadsheet ID, range, and
        // a valueInputOption.  The `valueInputOption` only
        // controls how the input data will be added to the sheet (column-wise or
        // row-wise), it does not influence what cell the data starts being written
        // to.
        def append(resource: ValueRange, spreadsheetId: String, range: String, optionalArgs: js.Object): AppendValuesResponse = js.native
        
        // Clears one or more ranges of values from a spreadsheet.
        // The caller must specify the spreadsheet ID and one or more ranges.
        // Only values are cleared -- all other properties of the cell (such as
        // formatting, data validation, etc..) are kept.
        def batchClear(resource: BatchClearValuesRequest, spreadsheetId: String): BatchClearValuesResponse = js.native
        
        // Clears one or more ranges of values from a spreadsheet.
        // The caller must specify the spreadsheet ID and one or more
        // DataFilters. Ranges matching any of the specified data
        // filters will be cleared.  Only values are cleared -- all other properties
        // of the cell (such as formatting, data validation, etc..) are kept.
        def batchClearByDataFilter(resource: BatchClearValuesByDataFilterRequest, spreadsheetId: String): BatchClearValuesByDataFilterResponse = js.native
        
        // Returns one or more ranges of values from a spreadsheet.
        // The caller must specify the spreadsheet ID and one or more ranges.
        def batchGet(spreadsheetId: String): BatchGetValuesResponse = js.native
        // Returns one or more ranges of values from a spreadsheet.
        // The caller must specify the spreadsheet ID and one or more ranges.
        def batchGet(spreadsheetId: String, optionalArgs: js.Object): BatchGetValuesResponse = js.native
        
        // Returns one or more ranges of values that match the specified data filters.
        // The caller must specify the spreadsheet ID and one or more
        // DataFilters.  Ranges that match any of the data filters in
        // the request will be returned.
        def batchGetByDataFilter(resource: BatchGetValuesByDataFilterRequest, spreadsheetId: String): BatchGetValuesByDataFilterResponse = js.native
        
        // Sets values in one or more ranges of a spreadsheet.
        // The caller must specify the spreadsheet ID,
        // a valueInputOption, and one or more
        // ValueRanges.
        def batchUpdate(resource: BatchUpdateValuesRequest, spreadsheetId: String): BatchUpdateValuesResponse = js.native
        
        // Sets values in one or more ranges of a spreadsheet.
        // The caller must specify the spreadsheet ID,
        // a valueInputOption, and one or more
        // DataFilterValueRanges.
        def batchUpdateByDataFilter(resource: BatchUpdateValuesByDataFilterRequest, spreadsheetId: String): BatchUpdateValuesByDataFilterResponse = js.native
        
        // Clears values from a spreadsheet.
        // The caller must specify the spreadsheet ID and range.
        // Only values are cleared -- all other properties of the cell (such as
        // formatting, data validation, etc..) are kept.
        def clear(resource: js.Any, /* Schema.ClearValuesRequest */ spreadsheetId: String, range: String): ClearValuesResponse = js.native
        
        // Returns a range of values from a spreadsheet.
        // The caller must specify the spreadsheet ID and a range.
        def get(spreadsheetId: String, range: String): ValueRange = js.native
        // Returns a range of values from a spreadsheet.
        // The caller must specify the spreadsheet ID and a range.
        def get(spreadsheetId: String, range: String, optionalArgs: js.Object): ValueRange = js.native
        
        // Sets values in a range of a spreadsheet.
        // The caller must specify the spreadsheet ID, range, and
        // a valueInputOption.
        def update(resource: ValueRange, spreadsheetId: String, range: String): UpdateValuesResponse = js.native
        // Sets values in a range of a spreadsheet.
        // The caller must specify the spreadsheet ID, range, and
        // a valueInputOption.
        def update(resource: ValueRange, spreadsheetId: String, range: String, optionalArgs: js.Object): UpdateValuesResponse = js.native
      }
    }
    
    @js.native
    trait SpreadsheetsCollection extends StObject {
      
      var DeveloperMetadata: js.UndefOr[DeveloperMetadataCollection] = js.native
      
      var Sheets: js.UndefOr[SheetsCollection] = js.native
      
      var Values: js.UndefOr[ValuesCollection] = js.native
      
      // Applies one or more updates to the spreadsheet.
      // Each request is validated before
      // being applied. If any request is not valid then the entire request will
      // fail and nothing will be applied.
      // Some requests have replies to
      // give you some information about how
      // they are applied. The replies will mirror the requests.  For example,
      // if you applied 4 updates and the 3rd one had a reply, then the
      // response will have 2 empty replies, the actual reply, and another empty
      // reply, in that order.
      // Due to the collaborative nature of spreadsheets, it is not guaranteed that
      // the spreadsheet will reflect exactly your changes after this completes,
      // however it is guaranteed that the updates in the request will be
      // applied together atomically. Your changes may be altered with respect to
      // collaborator changes. If there are no collaborators, the spreadsheet
      // should reflect your changes.
      def batchUpdate(resource: BatchUpdateSpreadsheetRequest, spreadsheetId: String): BatchUpdateSpreadsheetResponse = js.native
      
      // Creates a spreadsheet, returning the newly created spreadsheet.
      def create(resource: typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet): typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet = js.native
      
      // Returns the spreadsheet at the given ID.
      // The caller must specify the spreadsheet ID.
      // By default, data within grids will not be returned.
      // You can include grid data one of two ways:
      // * Specify a field mask listing your desired fields using the `fields` URL
      // parameter in HTTP
      // * Set the includeGridData
      // URL parameter to true.  If a field mask is set, the `includeGridData`
      // parameter is ignored
      // For large spreadsheets, it is recommended to retrieve only the specific
      // fields of the spreadsheet that you want.
      // To retrieve only subsets of the spreadsheet, use the
      // ranges URL parameter.
      // Multiple ranges can be specified.  Limiting the range will
      // return only the portions of the spreadsheet that intersect the requested
      // ranges. Ranges are specified using A1 notation.
      def get(spreadsheetId: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet = js.native
      // Returns the spreadsheet at the given ID.
      // The caller must specify the spreadsheet ID.
      // By default, data within grids will not be returned.
      // You can include grid data one of two ways:
      // * Specify a field mask listing your desired fields using the `fields` URL
      // parameter in HTTP
      // * Set the includeGridData
      // URL parameter to true.  If a field mask is set, the `includeGridData`
      // parameter is ignored
      // For large spreadsheets, it is recommended to retrieve only the specific
      // fields of the spreadsheet that you want.
      // To retrieve only subsets of the spreadsheet, use the
      // ranges URL parameter.
      // Multiple ranges can be specified.  Limiting the range will
      // return only the portions of the spreadsheet that intersect the requested
      // ranges. Ranges are specified using A1 notation.
      def get(spreadsheetId: String, optionalArgs: js.Object): typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet = js.native
      
      // Returns the spreadsheet at the given ID.
      // The caller must specify the spreadsheet ID.
      // This method differs from GetSpreadsheet in that it allows selecting
      // which subsets of spreadsheet data to return by specifying a
      // dataFilters parameter.
      // Multiple DataFilters can be specified.  Specifying one or
      // more data filters will return the portions of the spreadsheet that
      // intersect ranges matched by any of the filters.
      // By default, data within grids will not be returned.
      // You can include grid data one of two ways:
      // * Specify a field mask listing your desired fields using the `fields` URL
      // parameter in HTTP
      // * Set the includeGridData
      // parameter to true.  If a field mask is set, the `includeGridData`
      // parameter is ignored
      // For large spreadsheets, it is recommended to retrieve only the specific
      // fields of the spreadsheet that you want.
      def getByDataFilter(resource: GetSpreadsheetByDataFilterRequest, spreadsheetId: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet = js.native
    }
  }
  
  object Schema {
    
    @js.native
    trait AddBandingRequest extends StObject {
      
      var bandedRange: js.UndefOr[BandedRange] = js.native
    }
    object AddBandingRequest {
      
      @scala.inline
      def apply(): AddBandingRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddBandingRequest]
      }
      
      @scala.inline
      implicit class AddBandingRequestMutableBuilder[Self <: AddBandingRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBandedRange(value: BandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
      }
    }
    
    @js.native
    trait AddBandingResponse extends StObject {
      
      var bandedRange: js.UndefOr[BandedRange] = js.native
    }
    object AddBandingResponse {
      
      @scala.inline
      def apply(): AddBandingResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddBandingResponse]
      }
      
      @scala.inline
      implicit class AddBandingResponseMutableBuilder[Self <: AddBandingResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBandedRange(value: BandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
      }
    }
    
    @js.native
    trait AddChartRequest extends StObject {
      
      var chart: js.UndefOr[EmbeddedChart] = js.native
    }
    object AddChartRequest {
      
      @scala.inline
      def apply(): AddChartRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddChartRequest]
      }
      
      @scala.inline
      implicit class AddChartRequestMutableBuilder[Self <: AddChartRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChart(value: EmbeddedChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
      }
    }
    
    @js.native
    trait AddChartResponse extends StObject {
      
      var chart: js.UndefOr[EmbeddedChart] = js.native
    }
    object AddChartResponse {
      
      @scala.inline
      def apply(): AddChartResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddChartResponse]
      }
      
      @scala.inline
      implicit class AddChartResponseMutableBuilder[Self <: AddChartResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChart(value: EmbeddedChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
      }
    }
    
    @js.native
    trait AddConditionalFormatRuleRequest extends StObject {
      
      var index: js.UndefOr[Double] = js.native
      
      var rule: js.UndefOr[ConditionalFormatRule] = js.native
    }
    object AddConditionalFormatRuleRequest {
      
      @scala.inline
      def apply(): AddConditionalFormatRuleRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddConditionalFormatRuleRequest]
      }
      
      @scala.inline
      implicit class AddConditionalFormatRuleRequestMutableBuilder[Self <: AddConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        @scala.inline
        def setRule(value: ConditionalFormatRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      }
    }
    
    @js.native
    trait AddDimensionGroupRequest extends StObject {
      
      var range: js.UndefOr[DimensionRange] = js.native
    }
    object AddDimensionGroupRequest {
      
      @scala.inline
      def apply(): AddDimensionGroupRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddDimensionGroupRequest]
      }
      
      @scala.inline
      implicit class AddDimensionGroupRequestMutableBuilder[Self <: AddDimensionGroupRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    @js.native
    trait AddDimensionGroupResponse extends StObject {
      
      var dimensionGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
    }
    object AddDimensionGroupResponse {
      
      @scala.inline
      def apply(): AddDimensionGroupResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddDimensionGroupResponse]
      }
      
      @scala.inline
      implicit class AddDimensionGroupResponseMutableBuilder[Self <: AddDimensionGroupResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimensionGroups(value: js.Array[DimensionGroup]): Self = StObject.set(x, "dimensionGroups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionGroupsUndefined: Self = StObject.set(x, "dimensionGroups", js.undefined)
        
        @scala.inline
        def setDimensionGroupsVarargs(value: DimensionGroup*): Self = StObject.set(x, "dimensionGroups", js.Array(value :_*))
      }
    }
    
    @js.native
    trait AddFilterViewRequest extends StObject {
      
      var filter: js.UndefOr[FilterView] = js.native
    }
    object AddFilterViewRequest {
      
      @scala.inline
      def apply(): AddFilterViewRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddFilterViewRequest]
      }
      
      @scala.inline
      implicit class AddFilterViewRequestMutableBuilder[Self <: AddFilterViewRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilter(value: FilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      }
    }
    
    @js.native
    trait AddFilterViewResponse extends StObject {
      
      var filter: js.UndefOr[FilterView] = js.native
    }
    object AddFilterViewResponse {
      
      @scala.inline
      def apply(): AddFilterViewResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddFilterViewResponse]
      }
      
      @scala.inline
      implicit class AddFilterViewResponseMutableBuilder[Self <: AddFilterViewResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilter(value: FilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      }
    }
    
    @js.native
    trait AddNamedRangeRequest extends StObject {
      
      var namedRange: js.UndefOr[NamedRange] = js.native
    }
    object AddNamedRangeRequest {
      
      @scala.inline
      def apply(): AddNamedRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddNamedRangeRequest]
      }
      
      @scala.inline
      implicit class AddNamedRangeRequestMutableBuilder[Self <: AddNamedRangeRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNamedRange(value: NamedRange): Self = StObject.set(x, "namedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamedRangeUndefined: Self = StObject.set(x, "namedRange", js.undefined)
      }
    }
    
    @js.native
    trait AddNamedRangeResponse extends StObject {
      
      var namedRange: js.UndefOr[NamedRange] = js.native
    }
    object AddNamedRangeResponse {
      
      @scala.inline
      def apply(): AddNamedRangeResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddNamedRangeResponse]
      }
      
      @scala.inline
      implicit class AddNamedRangeResponseMutableBuilder[Self <: AddNamedRangeResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNamedRange(value: NamedRange): Self = StObject.set(x, "namedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamedRangeUndefined: Self = StObject.set(x, "namedRange", js.undefined)
      }
    }
    
    @js.native
    trait AddProtectedRangeRequest extends StObject {
      
      var protectedRange: js.UndefOr[ProtectedRange] = js.native
    }
    object AddProtectedRangeRequest {
      
      @scala.inline
      def apply(): AddProtectedRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddProtectedRangeRequest]
      }
      
      @scala.inline
      implicit class AddProtectedRangeRequestMutableBuilder[Self <: AddProtectedRangeRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProtectedRange(value: ProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
      }
    }
    
    @js.native
    trait AddProtectedRangeResponse extends StObject {
      
      var protectedRange: js.UndefOr[ProtectedRange] = js.native
    }
    object AddProtectedRangeResponse {
      
      @scala.inline
      def apply(): AddProtectedRangeResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddProtectedRangeResponse]
      }
      
      @scala.inline
      implicit class AddProtectedRangeResponseMutableBuilder[Self <: AddProtectedRangeResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProtectedRange(value: ProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
      }
    }
    
    @js.native
    trait AddSheetRequest extends StObject {
      
      var properties: js.UndefOr[SheetProperties] = js.native
    }
    object AddSheetRequest {
      
      @scala.inline
      def apply(): AddSheetRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddSheetRequest]
      }
      
      @scala.inline
      implicit class AddSheetRequestMutableBuilder[Self <: AddSheetRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProperties(value: SheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      }
    }
    
    @js.native
    trait AddSheetResponse extends StObject {
      
      var properties: js.UndefOr[SheetProperties] = js.native
    }
    object AddSheetResponse {
      
      @scala.inline
      def apply(): AddSheetResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddSheetResponse]
      }
      
      @scala.inline
      implicit class AddSheetResponseMutableBuilder[Self <: AddSheetResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProperties(value: SheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      }
    }
    
    @js.native
    trait AppendCellsRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var rows: js.UndefOr[js.Array[RowData]] = js.native
      
      var sheetId: js.UndefOr[Double] = js.native
    }
    object AppendCellsRequest {
      
      @scala.inline
      def apply(): AppendCellsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AppendCellsRequest]
      }
      
      @scala.inline
      implicit class AppendCellsRequestMutableBuilder[Self <: AppendCellsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setRows(value: js.Array[RowData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        @scala.inline
        def setRowsVarargs(value: RowData*): Self = StObject.set(x, "rows", js.Array(value :_*))
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
      }
    }
    
    @js.native
    trait AppendDimensionRequest extends StObject {
      
      var dimension: js.UndefOr[String] = js.native
      
      var length: js.UndefOr[Double] = js.native
      
      var sheetId: js.UndefOr[Double] = js.native
    }
    object AppendDimensionRequest {
      
      @scala.inline
      def apply(): AppendDimensionRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AppendDimensionRequest]
      }
      
      @scala.inline
      implicit class AppendDimensionRequestMutableBuilder[Self <: AppendDimensionRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
        
        @scala.inline
        def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
      }
    }
    
    @js.native
    trait AppendValuesResponse extends StObject {
      
      var spreadsheetId: js.UndefOr[String] = js.native
      
      var tableRange: js.UndefOr[String] = js.native
      
      var updates: js.UndefOr[UpdateValuesResponse] = js.native
    }
    object AppendValuesResponse {
      
      @scala.inline
      def apply(): AppendValuesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AppendValuesResponse]
      }
      
      @scala.inline
      implicit class AppendValuesResponseMutableBuilder[Self <: AppendValuesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
        
        @scala.inline
        def setTableRange(value: String): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
        
        @scala.inline
        def setUpdates(value: UpdateValuesResponse): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
      }
    }
    
    @js.native
    trait AutoFillRequest extends StObject {
      
      var range: js.UndefOr[GridRange] = js.native
      
      var sourceAndDestination: js.UndefOr[SourceAndDestination] = js.native
      
      var useAlternateSeries: js.UndefOr[Boolean] = js.native
    }
    object AutoFillRequest {
      
      @scala.inline
      def apply(): AutoFillRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AutoFillRequest]
      }
      
      @scala.inline
      implicit class AutoFillRequestMutableBuilder[Self <: AutoFillRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setSourceAndDestination(value: SourceAndDestination): Self = StObject.set(x, "sourceAndDestination", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceAndDestinationUndefined: Self = StObject.set(x, "sourceAndDestination", js.undefined)
        
        @scala.inline
        def setUseAlternateSeries(value: Boolean): Self = StObject.set(x, "useAlternateSeries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseAlternateSeriesUndefined: Self = StObject.set(x, "useAlternateSeries", js.undefined)
      }
    }
    
    @js.native
    trait AutoResizeDimensionsRequest extends StObject {
      
      var dimensions: js.UndefOr[DimensionRange] = js.native
    }
    object AutoResizeDimensionsRequest {
      
      @scala.inline
      def apply(): AutoResizeDimensionsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AutoResizeDimensionsRequest]
      }
      
      @scala.inline
      implicit class AutoResizeDimensionsRequestMutableBuilder[Self <: AutoResizeDimensionsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimensions(value: DimensionRange): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      }
    }
    
    @js.native
    trait BandedRange extends StObject {
      
      var bandedRangeId: js.UndefOr[Double] = js.native
      
      var columnProperties: js.UndefOr[BandingProperties] = js.native
      
      var range: js.UndefOr[GridRange] = js.native
      
      var rowProperties: js.UndefOr[BandingProperties] = js.native
    }
    object BandedRange {
      
      @scala.inline
      def apply(): BandedRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BandedRange]
      }
      
      @scala.inline
      implicit class BandedRangeMutableBuilder[Self <: BandedRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBandedRangeId(value: Double): Self = StObject.set(x, "bandedRangeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBandedRangeIdUndefined: Self = StObject.set(x, "bandedRangeId", js.undefined)
        
        @scala.inline
        def setColumnProperties(value: BandingProperties): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setRowProperties(value: BandingProperties): Self = StObject.set(x, "rowProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowPropertiesUndefined: Self = StObject.set(x, "rowProperties", js.undefined)
      }
    }
    
    @js.native
    trait BandingProperties extends StObject {
      
      var firstBandColor: js.UndefOr[Color] = js.native
      
      var footerColor: js.UndefOr[Color] = js.native
      
      var headerColor: js.UndefOr[Color] = js.native
      
      var secondBandColor: js.UndefOr[Color] = js.native
    }
    object BandingProperties {
      
      @scala.inline
      def apply(): BandingProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BandingProperties]
      }
      
      @scala.inline
      implicit class BandingPropertiesMutableBuilder[Self <: BandingProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFirstBandColor(value: Color): Self = StObject.set(x, "firstBandColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirstBandColorUndefined: Self = StObject.set(x, "firstBandColor", js.undefined)
        
        @scala.inline
        def setFooterColor(value: Color): Self = StObject.set(x, "footerColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFooterColorUndefined: Self = StObject.set(x, "footerColor", js.undefined)
        
        @scala.inline
        def setHeaderColor(value: Color): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderColorUndefined: Self = StObject.set(x, "headerColor", js.undefined)
        
        @scala.inline
        def setSecondBandColor(value: Color): Self = StObject.set(x, "secondBandColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecondBandColorUndefined: Self = StObject.set(x, "secondBandColor", js.undefined)
      }
    }
    
    @js.native
    trait BasicChartAxis extends StObject {
      
      var format: js.UndefOr[TextFormat] = js.native
      
      var position: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var titleTextPosition: js.UndefOr[TextPosition] = js.native
    }
    object BasicChartAxis {
      
      @scala.inline
      def apply(): BasicChartAxis = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BasicChartAxis]
      }
      
      @scala.inline
      implicit class BasicChartAxisMutableBuilder[Self <: BasicChartAxis] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormat(value: TextFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        @scala.inline
        def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleTextPosition(value: TextPosition): Self = StObject.set(x, "titleTextPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleTextPositionUndefined: Self = StObject.set(x, "titleTextPosition", js.undefined)
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait BasicChartDomain extends StObject {
      
      var domain: js.UndefOr[ChartData] = js.native
      
      var reversed: js.UndefOr[Boolean] = js.native
    }
    object BasicChartDomain {
      
      @scala.inline
      def apply(): BasicChartDomain = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BasicChartDomain]
      }
      
      @scala.inline
      implicit class BasicChartDomainMutableBuilder[Self <: BasicChartDomain] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDomain(value: ChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      }
    }
    
    @js.native
    trait BasicChartSeries extends StObject {
      
      var color: js.UndefOr[Color] = js.native
      
      var lineStyle: js.UndefOr[LineStyle] = js.native
      
      var series: js.UndefOr[ChartData] = js.native
      
      var targetAxis: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object BasicChartSeries {
      
      @scala.inline
      def apply(): BasicChartSeries = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BasicChartSeries]
      }
      
      @scala.inline
      implicit class BasicChartSeriesMutableBuilder[Self <: BasicChartSeries] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setLineStyle(value: LineStyle): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
        
        @scala.inline
        def setSeries(value: ChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
        
        @scala.inline
        def setTargetAxis(value: String): Self = StObject.set(x, "targetAxis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetAxisUndefined: Self = StObject.set(x, "targetAxis", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait BasicChartSpec extends StObject {
      
      var axis: js.UndefOr[js.Array[BasicChartAxis]] = js.native
      
      var chartType: js.UndefOr[String] = js.native
      
      var compareMode: js.UndefOr[String] = js.native
      
      var domains: js.UndefOr[js.Array[BasicChartDomain]] = js.native
      
      var headerCount: js.UndefOr[Double] = js.native
      
      var interpolateNulls: js.UndefOr[Boolean] = js.native
      
      var legendPosition: js.UndefOr[String] = js.native
      
      var lineSmoothing: js.UndefOr[Boolean] = js.native
      
      var series: js.UndefOr[js.Array[BasicChartSeries]] = js.native
      
      var stackedType: js.UndefOr[String] = js.native
      
      var threeDimensional: js.UndefOr[Boolean] = js.native
    }
    object BasicChartSpec {
      
      @scala.inline
      def apply(): BasicChartSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BasicChartSpec]
      }
      
      @scala.inline
      implicit class BasicChartSpecMutableBuilder[Self <: BasicChartSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAxis(value: js.Array[BasicChartAxis]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
        
        @scala.inline
        def setAxisVarargs(value: BasicChartAxis*): Self = StObject.set(x, "axis", js.Array(value :_*))
        
        @scala.inline
        def setChartType(value: String): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
        
        @scala.inline
        def setCompareMode(value: String): Self = StObject.set(x, "compareMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompareModeUndefined: Self = StObject.set(x, "compareMode", js.undefined)
        
        @scala.inline
        def setDomains(value: js.Array[BasicChartDomain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
        
        @scala.inline
        def setDomainsVarargs(value: BasicChartDomain*): Self = StObject.set(x, "domains", js.Array(value :_*))
        
        @scala.inline
        def setHeaderCount(value: Double): Self = StObject.set(x, "headerCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderCountUndefined: Self = StObject.set(x, "headerCount", js.undefined)
        
        @scala.inline
        def setInterpolateNulls(value: Boolean): Self = StObject.set(x, "interpolateNulls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInterpolateNullsUndefined: Self = StObject.set(x, "interpolateNulls", js.undefined)
        
        @scala.inline
        def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
        
        @scala.inline
        def setLineSmoothing(value: Boolean): Self = StObject.set(x, "lineSmoothing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineSmoothingUndefined: Self = StObject.set(x, "lineSmoothing", js.undefined)
        
        @scala.inline
        def setSeries(value: js.Array[BasicChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
        
        @scala.inline
        def setSeriesVarargs(value: BasicChartSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
        
        @scala.inline
        def setStackedType(value: String): Self = StObject.set(x, "stackedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStackedTypeUndefined: Self = StObject.set(x, "stackedType", js.undefined)
        
        @scala.inline
        def setThreeDimensional(value: Boolean): Self = StObject.set(x, "threeDimensional", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThreeDimensionalUndefined: Self = StObject.set(x, "threeDimensional", js.undefined)
      }
    }
    
    @js.native
    trait BasicFilter extends StObject {
      
      var criteria: js.UndefOr[js.Object] = js.native
      
      var range: js.UndefOr[GridRange] = js.native
      
      var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
    }
    object BasicFilter {
      
      @scala.inline
      def apply(): BasicFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BasicFilter]
      }
      
      @scala.inline
      implicit class BasicFilterMutableBuilder[Self <: BasicFilter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCriteria(value: js.Object): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setSortSpecs(value: js.Array[SortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
        
        @scala.inline
        def setSortSpecsVarargs(value: SortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value :_*))
      }
    }
    
    @js.native
    trait BatchClearValuesByDataFilterRequest extends StObject {
      
      var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
    }
    object BatchClearValuesByDataFilterRequest {
      
      @scala.inline
      def apply(): BatchClearValuesByDataFilterRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchClearValuesByDataFilterRequest]
      }
      
      @scala.inline
      implicit class BatchClearValuesByDataFilterRequestMutableBuilder[Self <: BatchClearValuesByDataFilterRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
        
        @scala.inline
        def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
      }
    }
    
    @js.native
    trait BatchClearValuesByDataFilterResponse extends StObject {
      
      var clearedRanges: js.UndefOr[js.Array[String]] = js.native
      
      var spreadsheetId: js.UndefOr[String] = js.native
    }
    object BatchClearValuesByDataFilterResponse {
      
      @scala.inline
      def apply(): BatchClearValuesByDataFilterResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchClearValuesByDataFilterResponse]
      }
      
      @scala.inline
      implicit class BatchClearValuesByDataFilterResponseMutableBuilder[Self <: BatchClearValuesByDataFilterResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClearedRanges(value: js.Array[String]): Self = StObject.set(x, "clearedRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClearedRangesUndefined: Self = StObject.set(x, "clearedRanges", js.undefined)
        
        @scala.inline
        def setClearedRangesVarargs(value: String*): Self = StObject.set(x, "clearedRanges", js.Array(value :_*))
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
      }
    }
    
    @js.native
    trait BatchClearValuesRequest extends StObject {
      
      var ranges: js.UndefOr[js.Array[String]] = js.native
    }
    object BatchClearValuesRequest {
      
      @scala.inline
      def apply(): BatchClearValuesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchClearValuesRequest]
      }
      
      @scala.inline
      implicit class BatchClearValuesRequestMutableBuilder[Self <: BatchClearValuesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRanges(value: js.Array[String]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
        
        @scala.inline
        def setRangesVarargs(value: String*): Self = StObject.set(x, "ranges", js.Array(value :_*))
      }
    }
    
    @js.native
    trait BatchClearValuesResponse extends StObject {
      
      var clearedRanges: js.UndefOr[js.Array[String]] = js.native
      
      var spreadsheetId: js.UndefOr[String] = js.native
    }
    object BatchClearValuesResponse {
      
      @scala.inline
      def apply(): BatchClearValuesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchClearValuesResponse]
      }
      
      @scala.inline
      implicit class BatchClearValuesResponseMutableBuilder[Self <: BatchClearValuesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClearedRanges(value: js.Array[String]): Self = StObject.set(x, "clearedRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClearedRangesUndefined: Self = StObject.set(x, "clearedRanges", js.undefined)
        
        @scala.inline
        def setClearedRangesVarargs(value: String*): Self = StObject.set(x, "clearedRanges", js.Array(value :_*))
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
      }
    }
    
    @js.native
    trait BatchGetValuesByDataFilterRequest extends StObject {
      
      var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
      
      var dateTimeRenderOption: js.UndefOr[String] = js.native
      
      var majorDimension: js.UndefOr[String] = js.native
      
      var valueRenderOption: js.UndefOr[String] = js.native
    }
    object BatchGetValuesByDataFilterRequest {
      
      @scala.inline
      def apply(): BatchGetValuesByDataFilterRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchGetValuesByDataFilterRequest]
      }
      
      @scala.inline
      implicit class BatchGetValuesByDataFilterRequestMutableBuilder[Self <: BatchGetValuesByDataFilterRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
        
        @scala.inline
        def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
        
        @scala.inline
        def setDateTimeRenderOption(value: String): Self = StObject.set(x, "dateTimeRenderOption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateTimeRenderOptionUndefined: Self = StObject.set(x, "dateTimeRenderOption", js.undefined)
        
        @scala.inline
        def setMajorDimension(value: String): Self = StObject.set(x, "majorDimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMajorDimensionUndefined: Self = StObject.set(x, "majorDimension", js.undefined)
        
        @scala.inline
        def setValueRenderOption(value: String): Self = StObject.set(x, "valueRenderOption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueRenderOptionUndefined: Self = StObject.set(x, "valueRenderOption", js.undefined)
      }
    }
    
    @js.native
    trait BatchGetValuesByDataFilterResponse extends StObject {
      
      var spreadsheetId: js.UndefOr[String] = js.native
      
      var valueRanges: js.UndefOr[js.Array[MatchedValueRange]] = js.native
    }
    object BatchGetValuesByDataFilterResponse {
      
      @scala.inline
      def apply(): BatchGetValuesByDataFilterResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchGetValuesByDataFilterResponse]
      }
      
      @scala.inline
      implicit class BatchGetValuesByDataFilterResponseMutableBuilder[Self <: BatchGetValuesByDataFilterResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
        
        @scala.inline
        def setValueRanges(value: js.Array[MatchedValueRange]): Self = StObject.set(x, "valueRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueRangesUndefined: Self = StObject.set(x, "valueRanges", js.undefined)
        
        @scala.inline
        def setValueRangesVarargs(value: MatchedValueRange*): Self = StObject.set(x, "valueRanges", js.Array(value :_*))
      }
    }
    
    @js.native
    trait BatchGetValuesResponse extends StObject {
      
      var spreadsheetId: js.UndefOr[String] = js.native
      
      var valueRanges: js.UndefOr[js.Array[ValueRange]] = js.native
    }
    object BatchGetValuesResponse {
      
      @scala.inline
      def apply(): BatchGetValuesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchGetValuesResponse]
      }
      
      @scala.inline
      implicit class BatchGetValuesResponseMutableBuilder[Self <: BatchGetValuesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
        
        @scala.inline
        def setValueRanges(value: js.Array[ValueRange]): Self = StObject.set(x, "valueRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueRangesUndefined: Self = StObject.set(x, "valueRanges", js.undefined)
        
        @scala.inline
        def setValueRangesVarargs(value: ValueRange*): Self = StObject.set(x, "valueRanges", js.Array(value :_*))
      }
    }
    
    @js.native
    trait BatchUpdateSpreadsheetRequest extends StObject {
      
      var includeSpreadsheetInResponse: js.UndefOr[Boolean] = js.native
      
      var requests: js.UndefOr[js.Array[Request]] = js.native
      
      var responseIncludeGridData: js.UndefOr[Boolean] = js.native
      
      var responseRanges: js.UndefOr[js.Array[String]] = js.native
    }
    object BatchUpdateSpreadsheetRequest {
      
      @scala.inline
      def apply(): BatchUpdateSpreadsheetRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdateSpreadsheetRequest]
      }
      
      @scala.inline
      implicit class BatchUpdateSpreadsheetRequestMutableBuilder[Self <: BatchUpdateSpreadsheetRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIncludeSpreadsheetInResponse(value: Boolean): Self = StObject.set(x, "includeSpreadsheetInResponse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeSpreadsheetInResponseUndefined: Self = StObject.set(x, "includeSpreadsheetInResponse", js.undefined)
        
        @scala.inline
        def setRequests(value: js.Array[Request]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
        
        @scala.inline
        def setRequestsVarargs(value: Request*): Self = StObject.set(x, "requests", js.Array(value :_*))
        
        @scala.inline
        def setResponseIncludeGridData(value: Boolean): Self = StObject.set(x, "responseIncludeGridData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseIncludeGridDataUndefined: Self = StObject.set(x, "responseIncludeGridData", js.undefined)
        
        @scala.inline
        def setResponseRanges(value: js.Array[String]): Self = StObject.set(x, "responseRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseRangesUndefined: Self = StObject.set(x, "responseRanges", js.undefined)
        
        @scala.inline
        def setResponseRangesVarargs(value: String*): Self = StObject.set(x, "responseRanges", js.Array(value :_*))
      }
    }
    
    @js.native
    trait BatchUpdateSpreadsheetResponse extends StObject {
      
      var replies: js.UndefOr[js.Array[Response]] = js.native
      
      var spreadsheetId: js.UndefOr[String] = js.native
      
      var updatedSpreadsheet: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet] = js.native
    }
    object BatchUpdateSpreadsheetResponse {
      
      @scala.inline
      def apply(): BatchUpdateSpreadsheetResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdateSpreadsheetResponse]
      }
      
      @scala.inline
      implicit class BatchUpdateSpreadsheetResponseMutableBuilder[Self <: BatchUpdateSpreadsheetResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setReplies(value: js.Array[Response]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
        
        @scala.inline
        def setRepliesVarargs(value: Response*): Self = StObject.set(x, "replies", js.Array(value :_*))
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
        
        @scala.inline
        def setUpdatedSpreadsheet(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet): Self = StObject.set(x, "updatedSpreadsheet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedSpreadsheetUndefined: Self = StObject.set(x, "updatedSpreadsheet", js.undefined)
      }
    }
    
    @js.native
    trait BatchUpdateValuesByDataFilterRequest extends StObject {
      
      var data: js.UndefOr[js.Array[DataFilterValueRange]] = js.native
      
      var includeValuesInResponse: js.UndefOr[Boolean] = js.native
      
      var responseDateTimeRenderOption: js.UndefOr[String] = js.native
      
      var responseValueRenderOption: js.UndefOr[String] = js.native
      
      var valueInputOption: js.UndefOr[String] = js.native
    }
    object BatchUpdateValuesByDataFilterRequest {
      
      @scala.inline
      def apply(): BatchUpdateValuesByDataFilterRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdateValuesByDataFilterRequest]
      }
      
      @scala.inline
      implicit class BatchUpdateValuesByDataFilterRequestMutableBuilder[Self <: BatchUpdateValuesByDataFilterRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: js.Array[DataFilterValueRange]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setDataVarargs(value: DataFilterValueRange*): Self = StObject.set(x, "data", js.Array(value :_*))
        
        @scala.inline
        def setIncludeValuesInResponse(value: Boolean): Self = StObject.set(x, "includeValuesInResponse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeValuesInResponseUndefined: Self = StObject.set(x, "includeValuesInResponse", js.undefined)
        
        @scala.inline
        def setResponseDateTimeRenderOption(value: String): Self = StObject.set(x, "responseDateTimeRenderOption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseDateTimeRenderOptionUndefined: Self = StObject.set(x, "responseDateTimeRenderOption", js.undefined)
        
        @scala.inline
        def setResponseValueRenderOption(value: String): Self = StObject.set(x, "responseValueRenderOption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseValueRenderOptionUndefined: Self = StObject.set(x, "responseValueRenderOption", js.undefined)
        
        @scala.inline
        def setValueInputOption(value: String): Self = StObject.set(x, "valueInputOption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueInputOptionUndefined: Self = StObject.set(x, "valueInputOption", js.undefined)
      }
    }
    
    @js.native
    trait BatchUpdateValuesByDataFilterResponse extends StObject {
      
      var responses: js.UndefOr[js.Array[UpdateValuesByDataFilterResponse]] = js.native
      
      var spreadsheetId: js.UndefOr[String] = js.native
      
      var totalUpdatedCells: js.UndefOr[Double] = js.native
      
      var totalUpdatedColumns: js.UndefOr[Double] = js.native
      
      var totalUpdatedRows: js.UndefOr[Double] = js.native
      
      var totalUpdatedSheets: js.UndefOr[Double] = js.native
    }
    object BatchUpdateValuesByDataFilterResponse {
      
      @scala.inline
      def apply(): BatchUpdateValuesByDataFilterResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdateValuesByDataFilterResponse]
      }
      
      @scala.inline
      implicit class BatchUpdateValuesByDataFilterResponseMutableBuilder[Self <: BatchUpdateValuesByDataFilterResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setResponses(value: js.Array[UpdateValuesByDataFilterResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
        
        @scala.inline
        def setResponsesVarargs(value: UpdateValuesByDataFilterResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
        
        @scala.inline
        def setTotalUpdatedCells(value: Double): Self = StObject.set(x, "totalUpdatedCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalUpdatedCellsUndefined: Self = StObject.set(x, "totalUpdatedCells", js.undefined)
        
        @scala.inline
        def setTotalUpdatedColumns(value: Double): Self = StObject.set(x, "totalUpdatedColumns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalUpdatedColumnsUndefined: Self = StObject.set(x, "totalUpdatedColumns", js.undefined)
        
        @scala.inline
        def setTotalUpdatedRows(value: Double): Self = StObject.set(x, "totalUpdatedRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalUpdatedRowsUndefined: Self = StObject.set(x, "totalUpdatedRows", js.undefined)
        
        @scala.inline
        def setTotalUpdatedSheets(value: Double): Self = StObject.set(x, "totalUpdatedSheets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalUpdatedSheetsUndefined: Self = StObject.set(x, "totalUpdatedSheets", js.undefined)
      }
    }
    
    @js.native
    trait BatchUpdateValuesRequest extends StObject {
      
      var data: js.UndefOr[js.Array[ValueRange]] = js.native
      
      var includeValuesInResponse: js.UndefOr[Boolean] = js.native
      
      var responseDateTimeRenderOption: js.UndefOr[String] = js.native
      
      var responseValueRenderOption: js.UndefOr[String] = js.native
      
      var valueInputOption: js.UndefOr[String] = js.native
    }
    object BatchUpdateValuesRequest {
      
      @scala.inline
      def apply(): BatchUpdateValuesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdateValuesRequest]
      }
      
      @scala.inline
      implicit class BatchUpdateValuesRequestMutableBuilder[Self <: BatchUpdateValuesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: js.Array[ValueRange]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setDataVarargs(value: ValueRange*): Self = StObject.set(x, "data", js.Array(value :_*))
        
        @scala.inline
        def setIncludeValuesInResponse(value: Boolean): Self = StObject.set(x, "includeValuesInResponse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeValuesInResponseUndefined: Self = StObject.set(x, "includeValuesInResponse", js.undefined)
        
        @scala.inline
        def setResponseDateTimeRenderOption(value: String): Self = StObject.set(x, "responseDateTimeRenderOption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseDateTimeRenderOptionUndefined: Self = StObject.set(x, "responseDateTimeRenderOption", js.undefined)
        
        @scala.inline
        def setResponseValueRenderOption(value: String): Self = StObject.set(x, "responseValueRenderOption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseValueRenderOptionUndefined: Self = StObject.set(x, "responseValueRenderOption", js.undefined)
        
        @scala.inline
        def setValueInputOption(value: String): Self = StObject.set(x, "valueInputOption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueInputOptionUndefined: Self = StObject.set(x, "valueInputOption", js.undefined)
      }
    }
    
    @js.native
    trait BatchUpdateValuesResponse extends StObject {
      
      var responses: js.UndefOr[js.Array[UpdateValuesResponse]] = js.native
      
      var spreadsheetId: js.UndefOr[String] = js.native
      
      var totalUpdatedCells: js.UndefOr[Double] = js.native
      
      var totalUpdatedColumns: js.UndefOr[Double] = js.native
      
      var totalUpdatedRows: js.UndefOr[Double] = js.native
      
      var totalUpdatedSheets: js.UndefOr[Double] = js.native
    }
    object BatchUpdateValuesResponse {
      
      @scala.inline
      def apply(): BatchUpdateValuesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdateValuesResponse]
      }
      
      @scala.inline
      implicit class BatchUpdateValuesResponseMutableBuilder[Self <: BatchUpdateValuesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setResponses(value: js.Array[UpdateValuesResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
        
        @scala.inline
        def setResponsesVarargs(value: UpdateValuesResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
        
        @scala.inline
        def setTotalUpdatedCells(value: Double): Self = StObject.set(x, "totalUpdatedCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalUpdatedCellsUndefined: Self = StObject.set(x, "totalUpdatedCells", js.undefined)
        
        @scala.inline
        def setTotalUpdatedColumns(value: Double): Self = StObject.set(x, "totalUpdatedColumns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalUpdatedColumnsUndefined: Self = StObject.set(x, "totalUpdatedColumns", js.undefined)
        
        @scala.inline
        def setTotalUpdatedRows(value: Double): Self = StObject.set(x, "totalUpdatedRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalUpdatedRowsUndefined: Self = StObject.set(x, "totalUpdatedRows", js.undefined)
        
        @scala.inline
        def setTotalUpdatedSheets(value: Double): Self = StObject.set(x, "totalUpdatedSheets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalUpdatedSheetsUndefined: Self = StObject.set(x, "totalUpdatedSheets", js.undefined)
      }
    }
    
    @js.native
    trait BooleanCondition extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
      
      var values: js.UndefOr[js.Array[ConditionValue]] = js.native
    }
    object BooleanCondition {
      
      @scala.inline
      def apply(): BooleanCondition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BooleanCondition]
      }
      
      @scala.inline
      implicit class BooleanConditionMutableBuilder[Self <: BooleanCondition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setValues(value: js.Array[ConditionValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        @scala.inline
        def setValuesVarargs(value: ConditionValue*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    @js.native
    trait BooleanRule extends StObject {
      
      var condition: js.UndefOr[BooleanCondition] = js.native
      
      var format: js.UndefOr[CellFormat] = js.native
    }
    object BooleanRule {
      
      @scala.inline
      def apply(): BooleanRule = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BooleanRule]
      }
      
      @scala.inline
      implicit class BooleanRuleMutableBuilder[Self <: BooleanRule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCondition(value: BooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
        
        @scala.inline
        def setFormat(value: CellFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      }
    }
    
    @js.native
    trait Border extends StObject {
      
      var color: js.UndefOr[Color] = js.native
      
      var style: js.UndefOr[String] = js.native
      
      var width: js.UndefOr[Double] = js.native
    }
    object Border {
      
      @scala.inline
      def apply(): Border = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Border]
      }
      
      @scala.inline
      implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    @js.native
    trait Borders extends StObject {
      
      var bottom: js.UndefOr[Border] = js.native
      
      var left: js.UndefOr[Border] = js.native
      
      var right: js.UndefOr[Border] = js.native
      
      var top: js.UndefOr[Border] = js.native
    }
    object Borders {
      
      @scala.inline
      def apply(): Borders = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Borders]
      }
      
      @scala.inline
      implicit class BordersMutableBuilder[Self <: Borders] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottom(value: Border): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
        
        @scala.inline
        def setLeft(value: Border): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        @scala.inline
        def setRight(value: Border): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        @scala.inline
        def setTop(value: Border): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      }
    }
    
    @js.native
    trait BubbleChartSpec extends StObject {
      
      var bubbleBorderColor: js.UndefOr[Color] = js.native
      
      var bubbleLabels: js.UndefOr[ChartData] = js.native
      
      var bubbleMaxRadiusSize: js.UndefOr[Double] = js.native
      
      var bubbleMinRadiusSize: js.UndefOr[Double] = js.native
      
      var bubbleOpacity: js.UndefOr[Double] = js.native
      
      var bubbleSizes: js.UndefOr[ChartData] = js.native
      
      var bubbleTextStyle: js.UndefOr[TextFormat] = js.native
      
      var domain: js.UndefOr[ChartData] = js.native
      
      var groupIds: js.UndefOr[ChartData] = js.native
      
      var legendPosition: js.UndefOr[String] = js.native
      
      var series: js.UndefOr[ChartData] = js.native
    }
    object BubbleChartSpec {
      
      @scala.inline
      def apply(): BubbleChartSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BubbleChartSpec]
      }
      
      @scala.inline
      implicit class BubbleChartSpecMutableBuilder[Self <: BubbleChartSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBubbleBorderColor(value: Color): Self = StObject.set(x, "bubbleBorderColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBubbleBorderColorUndefined: Self = StObject.set(x, "bubbleBorderColor", js.undefined)
        
        @scala.inline
        def setBubbleLabels(value: ChartData): Self = StObject.set(x, "bubbleLabels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBubbleLabelsUndefined: Self = StObject.set(x, "bubbleLabels", js.undefined)
        
        @scala.inline
        def setBubbleMaxRadiusSize(value: Double): Self = StObject.set(x, "bubbleMaxRadiusSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBubbleMaxRadiusSizeUndefined: Self = StObject.set(x, "bubbleMaxRadiusSize", js.undefined)
        
        @scala.inline
        def setBubbleMinRadiusSize(value: Double): Self = StObject.set(x, "bubbleMinRadiusSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBubbleMinRadiusSizeUndefined: Self = StObject.set(x, "bubbleMinRadiusSize", js.undefined)
        
        @scala.inline
        def setBubbleOpacity(value: Double): Self = StObject.set(x, "bubbleOpacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBubbleOpacityUndefined: Self = StObject.set(x, "bubbleOpacity", js.undefined)
        
        @scala.inline
        def setBubbleSizes(value: ChartData): Self = StObject.set(x, "bubbleSizes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBubbleSizesUndefined: Self = StObject.set(x, "bubbleSizes", js.undefined)
        
        @scala.inline
        def setBubbleTextStyle(value: TextFormat): Self = StObject.set(x, "bubbleTextStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBubbleTextStyleUndefined: Self = StObject.set(x, "bubbleTextStyle", js.undefined)
        
        @scala.inline
        def setDomain(value: ChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setGroupIds(value: ChartData): Self = StObject.set(x, "groupIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupIdsUndefined: Self = StObject.set(x, "groupIds", js.undefined)
        
        @scala.inline
        def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
        
        @scala.inline
        def setSeries(value: ChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      }
    }
    
    @js.native
    trait CandlestickChartSpec extends StObject {
      
      var data: js.UndefOr[js.Array[CandlestickData]] = js.native
      
      var domain: js.UndefOr[CandlestickDomain] = js.native
    }
    object CandlestickChartSpec {
      
      @scala.inline
      def apply(): CandlestickChartSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CandlestickChartSpec]
      }
      
      @scala.inline
      implicit class CandlestickChartSpecMutableBuilder[Self <: CandlestickChartSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: js.Array[CandlestickData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setDataVarargs(value: CandlestickData*): Self = StObject.set(x, "data", js.Array(value :_*))
        
        @scala.inline
        def setDomain(value: CandlestickDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      }
    }
    
    @js.native
    trait CandlestickData extends StObject {
      
      var closeSeries: js.UndefOr[CandlestickSeries] = js.native
      
      var highSeries: js.UndefOr[CandlestickSeries] = js.native
      
      var lowSeries: js.UndefOr[CandlestickSeries] = js.native
      
      var openSeries: js.UndefOr[CandlestickSeries] = js.native
    }
    object CandlestickData {
      
      @scala.inline
      def apply(): CandlestickData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CandlestickData]
      }
      
      @scala.inline
      implicit class CandlestickDataMutableBuilder[Self <: CandlestickData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCloseSeries(value: CandlestickSeries): Self = StObject.set(x, "closeSeries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCloseSeriesUndefined: Self = StObject.set(x, "closeSeries", js.undefined)
        
        @scala.inline
        def setHighSeries(value: CandlestickSeries): Self = StObject.set(x, "highSeries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHighSeriesUndefined: Self = StObject.set(x, "highSeries", js.undefined)
        
        @scala.inline
        def setLowSeries(value: CandlestickSeries): Self = StObject.set(x, "lowSeries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLowSeriesUndefined: Self = StObject.set(x, "lowSeries", js.undefined)
        
        @scala.inline
        def setOpenSeries(value: CandlestickSeries): Self = StObject.set(x, "openSeries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpenSeriesUndefined: Self = StObject.set(x, "openSeries", js.undefined)
      }
    }
    
    @js.native
    trait CandlestickDomain extends StObject {
      
      var data: js.UndefOr[ChartData] = js.native
      
      var reversed: js.UndefOr[Boolean] = js.native
    }
    object CandlestickDomain {
      
      @scala.inline
      def apply(): CandlestickDomain = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CandlestickDomain]
      }
      
      @scala.inline
      implicit class CandlestickDomainMutableBuilder[Self <: CandlestickDomain] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      }
    }
    
    @js.native
    trait CandlestickSeries extends StObject {
      
      var data: js.UndefOr[ChartData] = js.native
    }
    object CandlestickSeries {
      
      @scala.inline
      def apply(): CandlestickSeries = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CandlestickSeries]
      }
      
      @scala.inline
      implicit class CandlestickSeriesMutableBuilder[Self <: CandlestickSeries] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      }
    }
    
    @js.native
    trait CellData extends StObject {
      
      var dataValidation: js.UndefOr[DataValidationRule] = js.native
      
      var effectiveFormat: js.UndefOr[CellFormat] = js.native
      
      var effectiveValue: js.UndefOr[ExtendedValue] = js.native
      
      var formattedValue: js.UndefOr[String] = js.native
      
      var hyperlink: js.UndefOr[String] = js.native
      
      var note: js.UndefOr[String] = js.native
      
      var pivotTable: js.UndefOr[PivotTable] = js.native
      
      var textFormatRuns: js.UndefOr[js.Array[TextFormatRun]] = js.native
      
      var userEnteredFormat: js.UndefOr[CellFormat] = js.native
      
      var userEnteredValue: js.UndefOr[ExtendedValue] = js.native
    }
    object CellData {
      
      @scala.inline
      def apply(): CellData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CellData]
      }
      
      @scala.inline
      implicit class CellDataMutableBuilder[Self <: CellData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataValidation(value: DataValidationRule): Self = StObject.set(x, "dataValidation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataValidationUndefined: Self = StObject.set(x, "dataValidation", js.undefined)
        
        @scala.inline
        def setEffectiveFormat(value: CellFormat): Self = StObject.set(x, "effectiveFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEffectiveFormatUndefined: Self = StObject.set(x, "effectiveFormat", js.undefined)
        
        @scala.inline
        def setEffectiveValue(value: ExtendedValue): Self = StObject.set(x, "effectiveValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEffectiveValueUndefined: Self = StObject.set(x, "effectiveValue", js.undefined)
        
        @scala.inline
        def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
        
        @scala.inline
        def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
        
        @scala.inline
        def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
        
        @scala.inline
        def setPivotTable(value: PivotTable): Self = StObject.set(x, "pivotTable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPivotTableUndefined: Self = StObject.set(x, "pivotTable", js.undefined)
        
        @scala.inline
        def setTextFormatRuns(value: js.Array[TextFormatRun]): Self = StObject.set(x, "textFormatRuns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextFormatRunsUndefined: Self = StObject.set(x, "textFormatRuns", js.undefined)
        
        @scala.inline
        def setTextFormatRunsVarargs(value: TextFormatRun*): Self = StObject.set(x, "textFormatRuns", js.Array(value :_*))
        
        @scala.inline
        def setUserEnteredFormat(value: CellFormat): Self = StObject.set(x, "userEnteredFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserEnteredFormatUndefined: Self = StObject.set(x, "userEnteredFormat", js.undefined)
        
        @scala.inline
        def setUserEnteredValue(value: ExtendedValue): Self = StObject.set(x, "userEnteredValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserEnteredValueUndefined: Self = StObject.set(x, "userEnteredValue", js.undefined)
      }
    }
    
    @js.native
    trait CellFormat extends StObject {
      
      var backgroundColor: js.UndefOr[Color] = js.native
      
      var borders: js.UndefOr[Borders] = js.native
      
      var horizontalAlignment: js.UndefOr[String] = js.native
      
      var hyperlinkDisplayType: js.UndefOr[String] = js.native
      
      var numberFormat: js.UndefOr[NumberFormat] = js.native
      
      var padding: js.UndefOr[Padding] = js.native
      
      var textDirection: js.UndefOr[String] = js.native
      
      var textFormat: js.UndefOr[TextFormat] = js.native
      
      var textRotation: js.UndefOr[TextRotation] = js.native
      
      var verticalAlignment: js.UndefOr[String] = js.native
      
      var wrapStrategy: js.UndefOr[String] = js.native
    }
    object CellFormat {
      
      @scala.inline
      def apply(): CellFormat = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CellFormat]
      }
      
      @scala.inline
      implicit class CellFormatMutableBuilder[Self <: CellFormat] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        @scala.inline
        def setBorders(value: Borders): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
        
        @scala.inline
        def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
        
        @scala.inline
        def setHyperlinkDisplayType(value: String): Self = StObject.set(x, "hyperlinkDisplayType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHyperlinkDisplayTypeUndefined: Self = StObject.set(x, "hyperlinkDisplayType", js.undefined)
        
        @scala.inline
        def setNumberFormat(value: NumberFormat): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
        
        @scala.inline
        def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        @scala.inline
        def setTextDirection(value: String): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
        
        @scala.inline
        def setTextFormat(value: TextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
        
        @scala.inline
        def setTextRotation(value: TextRotation): Self = StObject.set(x, "textRotation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextRotationUndefined: Self = StObject.set(x, "textRotation", js.undefined)
        
        @scala.inline
        def setVerticalAlignment(value: String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
        
        @scala.inline
        def setWrapStrategy(value: String): Self = StObject.set(x, "wrapStrategy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWrapStrategyUndefined: Self = StObject.set(x, "wrapStrategy", js.undefined)
      }
    }
    
    @js.native
    trait ChartData extends StObject {
      
      var sourceRange: js.UndefOr[ChartSourceRange] = js.native
    }
    object ChartData {
      
      @scala.inline
      def apply(): ChartData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChartData]
      }
      
      @scala.inline
      implicit class ChartDataMutableBuilder[Self <: ChartData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSourceRange(value: ChartSourceRange): Self = StObject.set(x, "sourceRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceRangeUndefined: Self = StObject.set(x, "sourceRange", js.undefined)
      }
    }
    
    @js.native
    trait ChartSourceRange extends StObject {
      
      var sources: js.UndefOr[js.Array[GridRange]] = js.native
    }
    object ChartSourceRange {
      
      @scala.inline
      def apply(): ChartSourceRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChartSourceRange]
      }
      
      @scala.inline
      implicit class ChartSourceRangeMutableBuilder[Self <: ChartSourceRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSources(value: js.Array[GridRange]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
        
        @scala.inline
        def setSourcesVarargs(value: GridRange*): Self = StObject.set(x, "sources", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ChartSpec extends StObject {
      
      var altText: js.UndefOr[String] = js.native
      
      var backgroundColor: js.UndefOr[Color] = js.native
      
      var basicChart: js.UndefOr[BasicChartSpec] = js.native
      
      var bubbleChart: js.UndefOr[BubbleChartSpec] = js.native
      
      var candlestickChart: js.UndefOr[CandlestickChartSpec] = js.native
      
      var fontName: js.UndefOr[String] = js.native
      
      var hiddenDimensionStrategy: js.UndefOr[String] = js.native
      
      var histogramChart: js.UndefOr[HistogramChartSpec] = js.native
      
      var maximized: js.UndefOr[Boolean] = js.native
      
      var orgChart: js.UndefOr[OrgChartSpec] = js.native
      
      var pieChart: js.UndefOr[PieChartSpec] = js.native
      
      var subtitle: js.UndefOr[String] = js.native
      
      var subtitleTextFormat: js.UndefOr[TextFormat] = js.native
      
      var subtitleTextPosition: js.UndefOr[TextPosition] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var titleTextFormat: js.UndefOr[TextFormat] = js.native
      
      var titleTextPosition: js.UndefOr[TextPosition] = js.native
      
      var treemapChart: js.UndefOr[TreemapChartSpec] = js.native
      
      var waterfallChart: js.UndefOr[WaterfallChartSpec] = js.native
    }
    object ChartSpec {
      
      @scala.inline
      def apply(): ChartSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChartSpec]
      }
      
      @scala.inline
      implicit class ChartSpecMutableBuilder[Self <: ChartSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
        
        @scala.inline
        def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        @scala.inline
        def setBasicChart(value: BasicChartSpec): Self = StObject.set(x, "basicChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBasicChartUndefined: Self = StObject.set(x, "basicChart", js.undefined)
        
        @scala.inline
        def setBubbleChart(value: BubbleChartSpec): Self = StObject.set(x, "bubbleChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBubbleChartUndefined: Self = StObject.set(x, "bubbleChart", js.undefined)
        
        @scala.inline
        def setCandlestickChart(value: CandlestickChartSpec): Self = StObject.set(x, "candlestickChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCandlestickChartUndefined: Self = StObject.set(x, "candlestickChart", js.undefined)
        
        @scala.inline
        def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
        
        @scala.inline
        def setHiddenDimensionStrategy(value: String): Self = StObject.set(x, "hiddenDimensionStrategy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHiddenDimensionStrategyUndefined: Self = StObject.set(x, "hiddenDimensionStrategy", js.undefined)
        
        @scala.inline
        def setHistogramChart(value: HistogramChartSpec): Self = StObject.set(x, "histogramChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHistogramChartUndefined: Self = StObject.set(x, "histogramChart", js.undefined)
        
        @scala.inline
        def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
        
        @scala.inline
        def setOrgChart(value: OrgChartSpec): Self = StObject.set(x, "orgChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrgChartUndefined: Self = StObject.set(x, "orgChart", js.undefined)
        
        @scala.inline
        def setPieChart(value: PieChartSpec): Self = StObject.set(x, "pieChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPieChartUndefined: Self = StObject.set(x, "pieChart", js.undefined)
        
        @scala.inline
        def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtitleTextFormat(value: TextFormat): Self = StObject.set(x, "subtitleTextFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtitleTextFormatUndefined: Self = StObject.set(x, "subtitleTextFormat", js.undefined)
        
        @scala.inline
        def setSubtitleTextPosition(value: TextPosition): Self = StObject.set(x, "subtitleTextPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtitleTextPositionUndefined: Self = StObject.set(x, "subtitleTextPosition", js.undefined)
        
        @scala.inline
        def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleTextFormat(value: TextFormat): Self = StObject.set(x, "titleTextFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleTextFormatUndefined: Self = StObject.set(x, "titleTextFormat", js.undefined)
        
        @scala.inline
        def setTitleTextPosition(value: TextPosition): Self = StObject.set(x, "titleTextPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleTextPositionUndefined: Self = StObject.set(x, "titleTextPosition", js.undefined)
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setTreemapChart(value: TreemapChartSpec): Self = StObject.set(x, "treemapChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTreemapChartUndefined: Self = StObject.set(x, "treemapChart", js.undefined)
        
        @scala.inline
        def setWaterfallChart(value: WaterfallChartSpec): Self = StObject.set(x, "waterfallChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWaterfallChartUndefined: Self = StObject.set(x, "waterfallChart", js.undefined)
      }
    }
    
    @js.native
    trait ClearBasicFilterRequest extends StObject {
      
      var sheetId: js.UndefOr[Double] = js.native
    }
    object ClearBasicFilterRequest {
      
      @scala.inline
      def apply(): ClearBasicFilterRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ClearBasicFilterRequest]
      }
      
      @scala.inline
      implicit class ClearBasicFilterRequestMutableBuilder[Self <: ClearBasicFilterRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
      }
    }
    
    @js.native
    trait ClearValuesResponse extends StObject {
      
      var clearedRange: js.UndefOr[String] = js.native
      
      var spreadsheetId: js.UndefOr[String] = js.native
    }
    object ClearValuesResponse {
      
      @scala.inline
      def apply(): ClearValuesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ClearValuesResponse]
      }
      
      @scala.inline
      implicit class ClearValuesResponseMutableBuilder[Self <: ClearValuesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClearedRange(value: String): Self = StObject.set(x, "clearedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClearedRangeUndefined: Self = StObject.set(x, "clearedRange", js.undefined)
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
      }
    }
    
    @js.native
    trait Color extends StObject {
      
      var alpha: js.UndefOr[Double] = js.native
      
      var blue: js.UndefOr[Double] = js.native
      
      var green: js.UndefOr[Double] = js.native
      
      var red: js.UndefOr[Double] = js.native
    }
    object Color {
      
      @scala.inline
      def apply(): Color = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Color]
      }
      
      @scala.inline
      implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
        
        @scala.inline
        def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
        
        @scala.inline
        def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
        
        @scala.inline
        def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
      }
    }
    
    @js.native
    trait ConditionValue extends StObject {
      
      var relativeDate: js.UndefOr[String] = js.native
      
      var userEnteredValue: js.UndefOr[String] = js.native
    }
    object ConditionValue {
      
      @scala.inline
      def apply(): ConditionValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConditionValue]
      }
      
      @scala.inline
      implicit class ConditionValueMutableBuilder[Self <: ConditionValue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRelativeDate(value: String): Self = StObject.set(x, "relativeDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelativeDateUndefined: Self = StObject.set(x, "relativeDate", js.undefined)
        
        @scala.inline
        def setUserEnteredValue(value: String): Self = StObject.set(x, "userEnteredValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserEnteredValueUndefined: Self = StObject.set(x, "userEnteredValue", js.undefined)
      }
    }
    
    @js.native
    trait ConditionalFormatRule extends StObject {
      
      var booleanRule: js.UndefOr[BooleanRule] = js.native
      
      var gradientRule: js.UndefOr[GradientRule] = js.native
      
      var ranges: js.UndefOr[js.Array[GridRange]] = js.native
    }
    object ConditionalFormatRule {
      
      @scala.inline
      def apply(): ConditionalFormatRule = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConditionalFormatRule]
      }
      
      @scala.inline
      implicit class ConditionalFormatRuleMutableBuilder[Self <: ConditionalFormatRule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBooleanRule(value: BooleanRule): Self = StObject.set(x, "booleanRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBooleanRuleUndefined: Self = StObject.set(x, "booleanRule", js.undefined)
        
        @scala.inline
        def setGradientRule(value: GradientRule): Self = StObject.set(x, "gradientRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGradientRuleUndefined: Self = StObject.set(x, "gradientRule", js.undefined)
        
        @scala.inline
        def setRanges(value: js.Array[GridRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
        
        @scala.inline
        def setRangesVarargs(value: GridRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
      }
    }
    
    @js.native
    trait CopyPasteRequest extends StObject {
      
      var destination: js.UndefOr[GridRange] = js.native
      
      var pasteOrientation: js.UndefOr[String] = js.native
      
      var pasteType: js.UndefOr[String] = js.native
      
      var source: js.UndefOr[GridRange] = js.native
    }
    object CopyPasteRequest {
      
      @scala.inline
      def apply(): CopyPasteRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CopyPasteRequest]
      }
      
      @scala.inline
      implicit class CopyPasteRequestMutableBuilder[Self <: CopyPasteRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDestination(value: GridRange): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
        
        @scala.inline
        def setPasteOrientation(value: String): Self = StObject.set(x, "pasteOrientation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasteOrientationUndefined: Self = StObject.set(x, "pasteOrientation", js.undefined)
        
        @scala.inline
        def setPasteType(value: String): Self = StObject.set(x, "pasteType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasteTypeUndefined: Self = StObject.set(x, "pasteType", js.undefined)
        
        @scala.inline
        def setSource(value: GridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      }
    }
    
    @js.native
    trait CopySheetToAnotherSpreadsheetRequest extends StObject {
      
      var destinationSpreadsheetId: js.UndefOr[String] = js.native
    }
    object CopySheetToAnotherSpreadsheetRequest {
      
      @scala.inline
      def apply(): CopySheetToAnotherSpreadsheetRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CopySheetToAnotherSpreadsheetRequest]
      }
      
      @scala.inline
      implicit class CopySheetToAnotherSpreadsheetRequestMutableBuilder[Self <: CopySheetToAnotherSpreadsheetRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDestinationSpreadsheetId(value: String): Self = StObject.set(x, "destinationSpreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestinationSpreadsheetIdUndefined: Self = StObject.set(x, "destinationSpreadsheetId", js.undefined)
      }
    }
    
    @js.native
    trait CreateDeveloperMetadataRequest extends StObject {
      
      var developerMetadata: js.UndefOr[DeveloperMetadata] = js.native
    }
    object CreateDeveloperMetadataRequest {
      
      @scala.inline
      def apply(): CreateDeveloperMetadataRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateDeveloperMetadataRequest]
      }
      
      @scala.inline
      implicit class CreateDeveloperMetadataRequestMutableBuilder[Self <: CreateDeveloperMetadataRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeveloperMetadata(value: DeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
      }
    }
    
    @js.native
    trait CreateDeveloperMetadataResponse extends StObject {
      
      var developerMetadata: js.UndefOr[DeveloperMetadata] = js.native
    }
    object CreateDeveloperMetadataResponse {
      
      @scala.inline
      def apply(): CreateDeveloperMetadataResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateDeveloperMetadataResponse]
      }
      
      @scala.inline
      implicit class CreateDeveloperMetadataResponseMutableBuilder[Self <: CreateDeveloperMetadataResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeveloperMetadata(value: DeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
      }
    }
    
    @js.native
    trait CutPasteRequest extends StObject {
      
      var destination: js.UndefOr[GridCoordinate] = js.native
      
      var pasteType: js.UndefOr[String] = js.native
      
      var source: js.UndefOr[GridRange] = js.native
    }
    object CutPasteRequest {
      
      @scala.inline
      def apply(): CutPasteRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CutPasteRequest]
      }
      
      @scala.inline
      implicit class CutPasteRequestMutableBuilder[Self <: CutPasteRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDestination(value: GridCoordinate): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
        
        @scala.inline
        def setPasteType(value: String): Self = StObject.set(x, "pasteType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasteTypeUndefined: Self = StObject.set(x, "pasteType", js.undefined)
        
        @scala.inline
        def setSource(value: GridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      }
    }
    
    @js.native
    trait DataFilter extends StObject {
      
      var a1Range: js.UndefOr[String] = js.native
      
      var developerMetadataLookup: js.UndefOr[DeveloperMetadataLookup] = js.native
      
      var gridRange: js.UndefOr[GridRange] = js.native
    }
    object DataFilter {
      
      @scala.inline
      def apply(): DataFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DataFilter]
      }
      
      @scala.inline
      implicit class DataFilterMutableBuilder[Self <: DataFilter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA1Range(value: String): Self = StObject.set(x, "a1Range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setA1RangeUndefined: Self = StObject.set(x, "a1Range", js.undefined)
        
        @scala.inline
        def setDeveloperMetadataLookup(value: DeveloperMetadataLookup): Self = StObject.set(x, "developerMetadataLookup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeveloperMetadataLookupUndefined: Self = StObject.set(x, "developerMetadataLookup", js.undefined)
        
        @scala.inline
        def setGridRange(value: GridRange): Self = StObject.set(x, "gridRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGridRangeUndefined: Self = StObject.set(x, "gridRange", js.undefined)
      }
    }
    
    @js.native
    trait DataFilterValueRange extends StObject {
      
      var dataFilter: js.UndefOr[DataFilter] = js.native
      
      var majorDimension: js.UndefOr[String] = js.native
      
      var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
    }
    object DataFilterValueRange {
      
      @scala.inline
      def apply(): DataFilterValueRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DataFilterValueRange]
      }
      
      @scala.inline
      implicit class DataFilterValueRangeMutableBuilder[Self <: DataFilterValueRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataFilter(value: DataFilter): Self = StObject.set(x, "dataFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataFilterUndefined: Self = StObject.set(x, "dataFilter", js.undefined)
        
        @scala.inline
        def setMajorDimension(value: String): Self = StObject.set(x, "majorDimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMajorDimensionUndefined: Self = StObject.set(x, "majorDimension", js.undefined)
        
        @scala.inline
        def setValues(value: js.Array[js.Array[_]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        @scala.inline
        def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    @js.native
    trait DataValidationRule extends StObject {
      
      var condition: js.UndefOr[BooleanCondition] = js.native
      
      var inputMessage: js.UndefOr[String] = js.native
      
      var showCustomUi: js.UndefOr[Boolean] = js.native
      
      var strict: js.UndefOr[Boolean] = js.native
    }
    object DataValidationRule {
      
      @scala.inline
      def apply(): DataValidationRule = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DataValidationRule]
      }
      
      @scala.inline
      implicit class DataValidationRuleMutableBuilder[Self <: DataValidationRule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCondition(value: BooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
        
        @scala.inline
        def setInputMessage(value: String): Self = StObject.set(x, "inputMessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInputMessageUndefined: Self = StObject.set(x, "inputMessage", js.undefined)
        
        @scala.inline
        def setShowCustomUi(value: Boolean): Self = StObject.set(x, "showCustomUi", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowCustomUiUndefined: Self = StObject.set(x, "showCustomUi", js.undefined)
        
        @scala.inline
        def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
    
    @js.native
    trait DateTimeRule extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
    }
    object DateTimeRule {
      
      @scala.inline
      def apply(): DateTimeRule = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DateTimeRule]
      }
      
      @scala.inline
      implicit class DateTimeRuleMutableBuilder[Self <: DateTimeRule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait DeleteBandingRequest extends StObject {
      
      var bandedRangeId: js.UndefOr[Double] = js.native
    }
    object DeleteBandingRequest {
      
      @scala.inline
      def apply(): DeleteBandingRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteBandingRequest]
      }
      
      @scala.inline
      implicit class DeleteBandingRequestMutableBuilder[Self <: DeleteBandingRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBandedRangeId(value: Double): Self = StObject.set(x, "bandedRangeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBandedRangeIdUndefined: Self = StObject.set(x, "bandedRangeId", js.undefined)
      }
    }
    
    @js.native
    trait DeleteConditionalFormatRuleRequest extends StObject {
      
      var index: js.UndefOr[Double] = js.native
      
      var sheetId: js.UndefOr[Double] = js.native
    }
    object DeleteConditionalFormatRuleRequest {
      
      @scala.inline
      def apply(): DeleteConditionalFormatRuleRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteConditionalFormatRuleRequest]
      }
      
      @scala.inline
      implicit class DeleteConditionalFormatRuleRequestMutableBuilder[Self <: DeleteConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
      }
    }
    
    @js.native
    trait DeleteConditionalFormatRuleResponse extends StObject {
      
      var rule: js.UndefOr[ConditionalFormatRule] = js.native
    }
    object DeleteConditionalFormatRuleResponse {
      
      @scala.inline
      def apply(): DeleteConditionalFormatRuleResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteConditionalFormatRuleResponse]
      }
      
      @scala.inline
      implicit class DeleteConditionalFormatRuleResponseMutableBuilder[Self <: DeleteConditionalFormatRuleResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRule(value: ConditionalFormatRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      }
    }
    
    @js.native
    trait DeleteDeveloperMetadataRequest extends StObject {
      
      var dataFilter: js.UndefOr[DataFilter] = js.native
    }
    object DeleteDeveloperMetadataRequest {
      
      @scala.inline
      def apply(): DeleteDeveloperMetadataRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteDeveloperMetadataRequest]
      }
      
      @scala.inline
      implicit class DeleteDeveloperMetadataRequestMutableBuilder[Self <: DeleteDeveloperMetadataRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataFilter(value: DataFilter): Self = StObject.set(x, "dataFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataFilterUndefined: Self = StObject.set(x, "dataFilter", js.undefined)
      }
    }
    
    @js.native
    trait DeleteDeveloperMetadataResponse extends StObject {
      
      var deletedDeveloperMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
    }
    object DeleteDeveloperMetadataResponse {
      
      @scala.inline
      def apply(): DeleteDeveloperMetadataResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteDeveloperMetadataResponse]
      }
      
      @scala.inline
      implicit class DeleteDeveloperMetadataResponseMutableBuilder[Self <: DeleteDeveloperMetadataResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeletedDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "deletedDeveloperMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletedDeveloperMetadataUndefined: Self = StObject.set(x, "deletedDeveloperMetadata", js.undefined)
        
        @scala.inline
        def setDeletedDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "deletedDeveloperMetadata", js.Array(value :_*))
      }
    }
    
    @js.native
    trait DeleteDimensionGroupRequest extends StObject {
      
      var range: js.UndefOr[DimensionRange] = js.native
    }
    object DeleteDimensionGroupRequest {
      
      @scala.inline
      def apply(): DeleteDimensionGroupRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteDimensionGroupRequest]
      }
      
      @scala.inline
      implicit class DeleteDimensionGroupRequestMutableBuilder[Self <: DeleteDimensionGroupRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    @js.native
    trait DeleteDimensionGroupResponse extends StObject {
      
      var dimensionGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
    }
    object DeleteDimensionGroupResponse {
      
      @scala.inline
      def apply(): DeleteDimensionGroupResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteDimensionGroupResponse]
      }
      
      @scala.inline
      implicit class DeleteDimensionGroupResponseMutableBuilder[Self <: DeleteDimensionGroupResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimensionGroups(value: js.Array[DimensionGroup]): Self = StObject.set(x, "dimensionGroups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionGroupsUndefined: Self = StObject.set(x, "dimensionGroups", js.undefined)
        
        @scala.inline
        def setDimensionGroupsVarargs(value: DimensionGroup*): Self = StObject.set(x, "dimensionGroups", js.Array(value :_*))
      }
    }
    
    @js.native
    trait DeleteDimensionRequest extends StObject {
      
      var range: js.UndefOr[DimensionRange] = js.native
    }
    object DeleteDimensionRequest {
      
      @scala.inline
      def apply(): DeleteDimensionRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteDimensionRequest]
      }
      
      @scala.inline
      implicit class DeleteDimensionRequestMutableBuilder[Self <: DeleteDimensionRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    @js.native
    trait DeleteEmbeddedObjectRequest extends StObject {
      
      var objectId: js.UndefOr[Double] = js.native
    }
    object DeleteEmbeddedObjectRequest {
      
      @scala.inline
      def apply(): DeleteEmbeddedObjectRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteEmbeddedObjectRequest]
      }
      
      @scala.inline
      implicit class DeleteEmbeddedObjectRequestMutableBuilder[Self <: DeleteEmbeddedObjectRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait DeleteFilterViewRequest extends StObject {
      
      var filterId: js.UndefOr[Double] = js.native
    }
    object DeleteFilterViewRequest {
      
      @scala.inline
      def apply(): DeleteFilterViewRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteFilterViewRequest]
      }
      
      @scala.inline
      implicit class DeleteFilterViewRequestMutableBuilder[Self <: DeleteFilterViewRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilterId(value: Double): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
      }
    }
    
    @js.native
    trait DeleteNamedRangeRequest extends StObject {
      
      var namedRangeId: js.UndefOr[String] = js.native
    }
    object DeleteNamedRangeRequest {
      
      @scala.inline
      def apply(): DeleteNamedRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteNamedRangeRequest]
      }
      
      @scala.inline
      implicit class DeleteNamedRangeRequestMutableBuilder[Self <: DeleteNamedRangeRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
      }
    }
    
    @js.native
    trait DeleteProtectedRangeRequest extends StObject {
      
      var protectedRangeId: js.UndefOr[Double] = js.native
    }
    object DeleteProtectedRangeRequest {
      
      @scala.inline
      def apply(): DeleteProtectedRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteProtectedRangeRequest]
      }
      
      @scala.inline
      implicit class DeleteProtectedRangeRequestMutableBuilder[Self <: DeleteProtectedRangeRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProtectedRangeId(value: Double): Self = StObject.set(x, "protectedRangeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProtectedRangeIdUndefined: Self = StObject.set(x, "protectedRangeId", js.undefined)
      }
    }
    
    @js.native
    trait DeleteRangeRequest extends StObject {
      
      var range: js.UndefOr[GridRange] = js.native
      
      var shiftDimension: js.UndefOr[String] = js.native
    }
    object DeleteRangeRequest {
      
      @scala.inline
      def apply(): DeleteRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteRangeRequest]
      }
      
      @scala.inline
      implicit class DeleteRangeRequestMutableBuilder[Self <: DeleteRangeRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setShiftDimension(value: String): Self = StObject.set(x, "shiftDimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShiftDimensionUndefined: Self = StObject.set(x, "shiftDimension", js.undefined)
      }
    }
    
    @js.native
    trait DeleteSheetRequest extends StObject {
      
      var sheetId: js.UndefOr[Double] = js.native
    }
    object DeleteSheetRequest {
      
      @scala.inline
      def apply(): DeleteSheetRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteSheetRequest]
      }
      
      @scala.inline
      implicit class DeleteSheetRequestMutableBuilder[Self <: DeleteSheetRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
      }
    }
    
    @js.native
    trait DeveloperMetadata extends StObject {
      
      var location: js.UndefOr[DeveloperMetadataLocation] = js.native
      
      var metadataId: js.UndefOr[Double] = js.native
      
      var metadataKey: js.UndefOr[String] = js.native
      
      var metadataValue: js.UndefOr[String] = js.native
      
      var visibility: js.UndefOr[String] = js.native
    }
    object DeveloperMetadata {
      
      @scala.inline
      def apply(): DeveloperMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeveloperMetadata]
      }
      
      @scala.inline
      implicit class DeveloperMetadataMutableBuilder[Self <: DeveloperMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocation(value: DeveloperMetadataLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setMetadataId(value: Double): Self = StObject.set(x, "metadataId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataIdUndefined: Self = StObject.set(x, "metadataId", js.undefined)
        
        @scala.inline
        def setMetadataKey(value: String): Self = StObject.set(x, "metadataKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataKeyUndefined: Self = StObject.set(x, "metadataKey", js.undefined)
        
        @scala.inline
        def setMetadataValue(value: String): Self = StObject.set(x, "metadataValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataValueUndefined: Self = StObject.set(x, "metadataValue", js.undefined)
        
        @scala.inline
        def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      }
    }
    
    @js.native
    trait DeveloperMetadataLocation extends StObject {
      
      var dimensionRange: js.UndefOr[DimensionRange] = js.native
      
      var locationType: js.UndefOr[String] = js.native
      
      var sheetId: js.UndefOr[Double] = js.native
      
      var spreadsheet: js.UndefOr[Boolean] = js.native
    }
    object DeveloperMetadataLocation {
      
      @scala.inline
      def apply(): DeveloperMetadataLocation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeveloperMetadataLocation]
      }
      
      @scala.inline
      implicit class DeveloperMetadataLocationMutableBuilder[Self <: DeveloperMetadataLocation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimensionRange(value: DimensionRange): Self = StObject.set(x, "dimensionRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionRangeUndefined: Self = StObject.set(x, "dimensionRange", js.undefined)
        
        @scala.inline
        def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
        
        @scala.inline
        def setSpreadsheet(value: Boolean): Self = StObject.set(x, "spreadsheet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetUndefined: Self = StObject.set(x, "spreadsheet", js.undefined)
      }
    }
    
    @js.native
    trait DeveloperMetadataLookup extends StObject {
      
      var locationMatchingStrategy: js.UndefOr[String] = js.native
      
      var locationType: js.UndefOr[String] = js.native
      
      var metadataId: js.UndefOr[Double] = js.native
      
      var metadataKey: js.UndefOr[String] = js.native
      
      var metadataLocation: js.UndefOr[DeveloperMetadataLocation] = js.native
      
      var metadataValue: js.UndefOr[String] = js.native
      
      var visibility: js.UndefOr[String] = js.native
    }
    object DeveloperMetadataLookup {
      
      @scala.inline
      def apply(): DeveloperMetadataLookup = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeveloperMetadataLookup]
      }
      
      @scala.inline
      implicit class DeveloperMetadataLookupMutableBuilder[Self <: DeveloperMetadataLookup] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocationMatchingStrategy(value: String): Self = StObject.set(x, "locationMatchingStrategy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationMatchingStrategyUndefined: Self = StObject.set(x, "locationMatchingStrategy", js.undefined)
        
        @scala.inline
        def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
        
        @scala.inline
        def setMetadataId(value: Double): Self = StObject.set(x, "metadataId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataIdUndefined: Self = StObject.set(x, "metadataId", js.undefined)
        
        @scala.inline
        def setMetadataKey(value: String): Self = StObject.set(x, "metadataKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataKeyUndefined: Self = StObject.set(x, "metadataKey", js.undefined)
        
        @scala.inline
        def setMetadataLocation(value: DeveloperMetadataLocation): Self = StObject.set(x, "metadataLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataLocationUndefined: Self = StObject.set(x, "metadataLocation", js.undefined)
        
        @scala.inline
        def setMetadataValue(value: String): Self = StObject.set(x, "metadataValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataValueUndefined: Self = StObject.set(x, "metadataValue", js.undefined)
        
        @scala.inline
        def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      }
    }
    
    @js.native
    trait DimensionGroup extends StObject {
      
      var collapsed: js.UndefOr[Boolean] = js.native
      
      var depth: js.UndefOr[Double] = js.native
      
      var range: js.UndefOr[DimensionRange] = js.native
    }
    object DimensionGroup {
      
      @scala.inline
      def apply(): DimensionGroup = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DimensionGroup]
      }
      
      @scala.inline
      implicit class DimensionGroupMutableBuilder[Self <: DimensionGroup] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
        
        @scala.inline
        def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
        
        @scala.inline
        def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    @js.native
    trait DimensionProperties extends StObject {
      
      var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
      
      var hiddenByFilter: js.UndefOr[Boolean] = js.native
      
      var hiddenByUser: js.UndefOr[Boolean] = js.native
      
      var pixelSize: js.UndefOr[Double] = js.native
    }
    object DimensionProperties {
      
      @scala.inline
      def apply(): DimensionProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DimensionProperties]
      }
      
      @scala.inline
      implicit class DimensionPropertiesMutableBuilder[Self <: DimensionProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
        
        @scala.inline
        def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
        
        @scala.inline
        def setHiddenByFilter(value: Boolean): Self = StObject.set(x, "hiddenByFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHiddenByFilterUndefined: Self = StObject.set(x, "hiddenByFilter", js.undefined)
        
        @scala.inline
        def setHiddenByUser(value: Boolean): Self = StObject.set(x, "hiddenByUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHiddenByUserUndefined: Self = StObject.set(x, "hiddenByUser", js.undefined)
        
        @scala.inline
        def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
      }
    }
    
    @js.native
    trait DimensionRange extends StObject {
      
      var dimension: js.UndefOr[String] = js.native
      
      var endIndex: js.UndefOr[Double] = js.native
      
      var sheetId: js.UndefOr[Double] = js.native
      
      var startIndex: js.UndefOr[Double] = js.native
    }
    object DimensionRange {
      
      @scala.inline
      def apply(): DimensionRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DimensionRange]
      }
      
      @scala.inline
      implicit class DimensionRangeMutableBuilder[Self <: DimensionRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
        
        @scala.inline
        def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
        
        @scala.inline
        def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      }
    }
    
    @js.native
    trait DuplicateFilterViewRequest extends StObject {
      
      var filterId: js.UndefOr[Double] = js.native
    }
    object DuplicateFilterViewRequest {
      
      @scala.inline
      def apply(): DuplicateFilterViewRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DuplicateFilterViewRequest]
      }
      
      @scala.inline
      implicit class DuplicateFilterViewRequestMutableBuilder[Self <: DuplicateFilterViewRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilterId(value: Double): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
      }
    }
    
    @js.native
    trait DuplicateFilterViewResponse extends StObject {
      
      var filter: js.UndefOr[FilterView] = js.native
    }
    object DuplicateFilterViewResponse {
      
      @scala.inline
      def apply(): DuplicateFilterViewResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DuplicateFilterViewResponse]
      }
      
      @scala.inline
      implicit class DuplicateFilterViewResponseMutableBuilder[Self <: DuplicateFilterViewResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilter(value: FilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      }
    }
    
    @js.native
    trait DuplicateSheetRequest extends StObject {
      
      var insertSheetIndex: js.UndefOr[Double] = js.native
      
      var newSheetId: js.UndefOr[Double] = js.native
      
      var newSheetName: js.UndefOr[String] = js.native
      
      var sourceSheetId: js.UndefOr[Double] = js.native
    }
    object DuplicateSheetRequest {
      
      @scala.inline
      def apply(): DuplicateSheetRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DuplicateSheetRequest]
      }
      
      @scala.inline
      implicit class DuplicateSheetRequestMutableBuilder[Self <: DuplicateSheetRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInsertSheetIndex(value: Double): Self = StObject.set(x, "insertSheetIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertSheetIndexUndefined: Self = StObject.set(x, "insertSheetIndex", js.undefined)
        
        @scala.inline
        def setNewSheetId(value: Double): Self = StObject.set(x, "newSheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewSheetIdUndefined: Self = StObject.set(x, "newSheetId", js.undefined)
        
        @scala.inline
        def setNewSheetName(value: String): Self = StObject.set(x, "newSheetName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewSheetNameUndefined: Self = StObject.set(x, "newSheetName", js.undefined)
        
        @scala.inline
        def setSourceSheetId(value: Double): Self = StObject.set(x, "sourceSheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceSheetIdUndefined: Self = StObject.set(x, "sourceSheetId", js.undefined)
      }
    }
    
    @js.native
    trait DuplicateSheetResponse extends StObject {
      
      var properties: js.UndefOr[SheetProperties] = js.native
    }
    object DuplicateSheetResponse {
      
      @scala.inline
      def apply(): DuplicateSheetResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DuplicateSheetResponse]
      }
      
      @scala.inline
      implicit class DuplicateSheetResponseMutableBuilder[Self <: DuplicateSheetResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProperties(value: SheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      }
    }
    
    @js.native
    trait Editors extends StObject {
      
      var domainUsersCanEdit: js.UndefOr[Boolean] = js.native
      
      var groups: js.UndefOr[js.Array[String]] = js.native
      
      var users: js.UndefOr[js.Array[String]] = js.native
    }
    object Editors {
      
      @scala.inline
      def apply(): Editors = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Editors]
      }
      
      @scala.inline
      implicit class EditorsMutableBuilder[Self <: Editors] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDomainUsersCanEdit(value: Boolean): Self = StObject.set(x, "domainUsersCanEdit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUsersCanEditUndefined: Self = StObject.set(x, "domainUsersCanEdit", js.undefined)
        
        @scala.inline
        def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
        
        @scala.inline
        def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
        
        @scala.inline
        def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
        
        @scala.inline
        def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value :_*))
      }
    }
    
    @js.native
    trait EmbeddedChart extends StObject {
      
      var chartId: js.UndefOr[Double] = js.native
      
      var position: js.UndefOr[EmbeddedObjectPosition] = js.native
      
      var spec: js.UndefOr[ChartSpec] = js.native
    }
    object EmbeddedChart {
      
      @scala.inline
      def apply(): EmbeddedChart = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmbeddedChart]
      }
      
      @scala.inline
      implicit class EmbeddedChartMutableBuilder[Self <: EmbeddedChart] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
        
        @scala.inline
        def setPosition(value: EmbeddedObjectPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setSpec(value: ChartSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      }
    }
    
    @js.native
    trait EmbeddedObjectPosition extends StObject {
      
      var newSheet: js.UndefOr[Boolean] = js.native
      
      var overlayPosition: js.UndefOr[OverlayPosition] = js.native
      
      var sheetId: js.UndefOr[Double] = js.native
    }
    object EmbeddedObjectPosition {
      
      @scala.inline
      def apply(): EmbeddedObjectPosition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmbeddedObjectPosition]
      }
      
      @scala.inline
      implicit class EmbeddedObjectPositionMutableBuilder[Self <: EmbeddedObjectPosition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNewSheet(value: Boolean): Self = StObject.set(x, "newSheet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewSheetUndefined: Self = StObject.set(x, "newSheet", js.undefined)
        
        @scala.inline
        def setOverlayPosition(value: OverlayPosition): Self = StObject.set(x, "overlayPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverlayPositionUndefined: Self = StObject.set(x, "overlayPosition", js.undefined)
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
      }
    }
    
    @js.native
    trait ErrorValue extends StObject {
      
      var message: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object ErrorValue {
      
      @scala.inline
      def apply(): ErrorValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ErrorValue]
      }
      
      @scala.inline
      implicit class ErrorValueMutableBuilder[Self <: ErrorValue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait ExtendedValue extends StObject {
      
      var boolValue: js.UndefOr[Boolean] = js.native
      
      var errorValue: js.UndefOr[ErrorValue] = js.native
      
      var formulaValue: js.UndefOr[String] = js.native
      
      var numberValue: js.UndefOr[Double] = js.native
      
      var stringValue: js.UndefOr[String] = js.native
    }
    object ExtendedValue {
      
      @scala.inline
      def apply(): ExtendedValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExtendedValue]
      }
      
      @scala.inline
      implicit class ExtendedValueMutableBuilder[Self <: ExtendedValue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
        
        @scala.inline
        def setErrorValue(value: ErrorValue): Self = StObject.set(x, "errorValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorValueUndefined: Self = StObject.set(x, "errorValue", js.undefined)
        
        @scala.inline
        def setFormulaValue(value: String): Self = StObject.set(x, "formulaValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormulaValueUndefined: Self = StObject.set(x, "formulaValue", js.undefined)
        
        @scala.inline
        def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
        
        @scala.inline
        def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
      }
    }
    
    @js.native
    trait FilterCriteria extends StObject {
      
      var condition: js.UndefOr[BooleanCondition] = js.native
      
      var hiddenValues: js.UndefOr[js.Array[String]] = js.native
    }
    object FilterCriteria {
      
      @scala.inline
      def apply(): FilterCriteria = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FilterCriteria]
      }
      
      @scala.inline
      implicit class FilterCriteriaMutableBuilder[Self <: FilterCriteria] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCondition(value: BooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
        
        @scala.inline
        def setHiddenValues(value: js.Array[String]): Self = StObject.set(x, "hiddenValues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHiddenValuesUndefined: Self = StObject.set(x, "hiddenValues", js.undefined)
        
        @scala.inline
        def setHiddenValuesVarargs(value: String*): Self = StObject.set(x, "hiddenValues", js.Array(value :_*))
      }
    }
    
    @js.native
    trait FilterView extends StObject {
      
      var criteria: js.UndefOr[js.Object] = js.native
      
      var filterViewId: js.UndefOr[Double] = js.native
      
      var namedRangeId: js.UndefOr[String] = js.native
      
      var range: js.UndefOr[GridRange] = js.native
      
      var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object FilterView {
      
      @scala.inline
      def apply(): FilterView = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FilterView]
      }
      
      @scala.inline
      implicit class FilterViewMutableBuilder[Self <: FilterView] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCriteria(value: js.Object): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
        
        @scala.inline
        def setFilterViewId(value: Double): Self = StObject.set(x, "filterViewId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterViewIdUndefined: Self = StObject.set(x, "filterViewId", js.undefined)
        
        @scala.inline
        def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setSortSpecs(value: js.Array[SortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
        
        @scala.inline
        def setSortSpecsVarargs(value: SortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value :_*))
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait FindReplaceRequest extends StObject {
      
      var allSheets: js.UndefOr[Boolean] = js.native
      
      var find: js.UndefOr[String] = js.native
      
      var includeFormulas: js.UndefOr[Boolean] = js.native
      
      var matchCase: js.UndefOr[Boolean] = js.native
      
      var matchEntireCell: js.UndefOr[Boolean] = js.native
      
      var range: js.UndefOr[GridRange] = js.native
      
      var replacement: js.UndefOr[String] = js.native
      
      var searchByRegex: js.UndefOr[Boolean] = js.native
      
      var sheetId: js.UndefOr[Double] = js.native
    }
    object FindReplaceRequest {
      
      @scala.inline
      def apply(): FindReplaceRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FindReplaceRequest]
      }
      
      @scala.inline
      implicit class FindReplaceRequestMutableBuilder[Self <: FindReplaceRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllSheets(value: Boolean): Self = StObject.set(x, "allSheets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllSheetsUndefined: Self = StObject.set(x, "allSheets", js.undefined)
        
        @scala.inline
        def setFind(value: String): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
        
        @scala.inline
        def setIncludeFormulas(value: Boolean): Self = StObject.set(x, "includeFormulas", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeFormulasUndefined: Self = StObject.set(x, "includeFormulas", js.undefined)
        
        @scala.inline
        def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
        
        @scala.inline
        def setMatchEntireCell(value: Boolean): Self = StObject.set(x, "matchEntireCell", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatchEntireCellUndefined: Self = StObject.set(x, "matchEntireCell", js.undefined)
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
        
        @scala.inline
        def setSearchByRegex(value: Boolean): Self = StObject.set(x, "searchByRegex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchByRegexUndefined: Self = StObject.set(x, "searchByRegex", js.undefined)
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
      }
    }
    
    @js.native
    trait FindReplaceResponse extends StObject {
      
      var formulasChanged: js.UndefOr[Double] = js.native
      
      var occurrencesChanged: js.UndefOr[Double] = js.native
      
      var rowsChanged: js.UndefOr[Double] = js.native
      
      var sheetsChanged: js.UndefOr[Double] = js.native
      
      var valuesChanged: js.UndefOr[Double] = js.native
    }
    object FindReplaceResponse {
      
      @scala.inline
      def apply(): FindReplaceResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FindReplaceResponse]
      }
      
      @scala.inline
      implicit class FindReplaceResponseMutableBuilder[Self <: FindReplaceResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormulasChanged(value: Double): Self = StObject.set(x, "formulasChanged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormulasChangedUndefined: Self = StObject.set(x, "formulasChanged", js.undefined)
        
        @scala.inline
        def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
        
        @scala.inline
        def setRowsChanged(value: Double): Self = StObject.set(x, "rowsChanged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsChangedUndefined: Self = StObject.set(x, "rowsChanged", js.undefined)
        
        @scala.inline
        def setSheetsChanged(value: Double): Self = StObject.set(x, "sheetsChanged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetsChangedUndefined: Self = StObject.set(x, "sheetsChanged", js.undefined)
        
        @scala.inline
        def setValuesChanged(value: Double): Self = StObject.set(x, "valuesChanged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesChangedUndefined: Self = StObject.set(x, "valuesChanged", js.undefined)
      }
    }
    
    @js.native
    trait GetSpreadsheetByDataFilterRequest extends StObject {
      
      var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
      
      var includeGridData: js.UndefOr[Boolean] = js.native
    }
    object GetSpreadsheetByDataFilterRequest {
      
      @scala.inline
      def apply(): GetSpreadsheetByDataFilterRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetSpreadsheetByDataFilterRequest]
      }
      
      @scala.inline
      implicit class GetSpreadsheetByDataFilterRequestMutableBuilder[Self <: GetSpreadsheetByDataFilterRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
        
        @scala.inline
        def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
        
        @scala.inline
        def setIncludeGridData(value: Boolean): Self = StObject.set(x, "includeGridData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeGridDataUndefined: Self = StObject.set(x, "includeGridData", js.undefined)
      }
    }
    
    @js.native
    trait GradientRule extends StObject {
      
      var maxpoint: js.UndefOr[InterpolationPoint] = js.native
      
      var midpoint: js.UndefOr[InterpolationPoint] = js.native
      
      var minpoint: js.UndefOr[InterpolationPoint] = js.native
    }
    object GradientRule {
      
      @scala.inline
      def apply(): GradientRule = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GradientRule]
      }
      
      @scala.inline
      implicit class GradientRuleMutableBuilder[Self <: GradientRule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMaxpoint(value: InterpolationPoint): Self = StObject.set(x, "maxpoint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxpointUndefined: Self = StObject.set(x, "maxpoint", js.undefined)
        
        @scala.inline
        def setMidpoint(value: InterpolationPoint): Self = StObject.set(x, "midpoint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMidpointUndefined: Self = StObject.set(x, "midpoint", js.undefined)
        
        @scala.inline
        def setMinpoint(value: InterpolationPoint): Self = StObject.set(x, "minpoint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinpointUndefined: Self = StObject.set(x, "minpoint", js.undefined)
      }
    }
    
    @js.native
    trait GridCoordinate extends StObject {
      
      var columnIndex: js.UndefOr[Double] = js.native
      
      var rowIndex: js.UndefOr[Double] = js.native
      
      var sheetId: js.UndefOr[Double] = js.native
    }
    object GridCoordinate {
      
      @scala.inline
      def apply(): GridCoordinate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GridCoordinate]
      }
      
      @scala.inline
      implicit class GridCoordinateMutableBuilder[Self <: GridCoordinate] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
        
        @scala.inline
        def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
      }
    }
    
    @js.native
    trait GridData extends StObject {
      
      var columnMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.native
      
      var rowData: js.UndefOr[js.Array[RowData]] = js.native
      
      var rowMetadata: js.UndefOr[js.Array[DimensionProperties]] = js.native
      
      var startColumn: js.UndefOr[Double] = js.native
      
      var startRow: js.UndefOr[Double] = js.native
    }
    object GridData {
      
      @scala.inline
      def apply(): GridData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GridData]
      }
      
      @scala.inline
      implicit class GridDataMutableBuilder[Self <: GridData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnMetadata(value: js.Array[DimensionProperties]): Self = StObject.set(x, "columnMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnMetadataUndefined: Self = StObject.set(x, "columnMetadata", js.undefined)
        
        @scala.inline
        def setColumnMetadataVarargs(value: DimensionProperties*): Self = StObject.set(x, "columnMetadata", js.Array(value :_*))
        
        @scala.inline
        def setRowData(value: js.Array[RowData]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
        
        @scala.inline
        def setRowDataVarargs(value: RowData*): Self = StObject.set(x, "rowData", js.Array(value :_*))
        
        @scala.inline
        def setRowMetadata(value: js.Array[DimensionProperties]): Self = StObject.set(x, "rowMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowMetadataUndefined: Self = StObject.set(x, "rowMetadata", js.undefined)
        
        @scala.inline
        def setRowMetadataVarargs(value: DimensionProperties*): Self = StObject.set(x, "rowMetadata", js.Array(value :_*))
        
        @scala.inline
        def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
        
        @scala.inline
        def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
      }
    }
    
    @js.native
    trait GridProperties extends StObject {
      
      var columnCount: js.UndefOr[Double] = js.native
      
      var columnGroupControlAfter: js.UndefOr[Boolean] = js.native
      
      var frozenColumnCount: js.UndefOr[Double] = js.native
      
      var frozenRowCount: js.UndefOr[Double] = js.native
      
      var hideGridlines: js.UndefOr[Boolean] = js.native
      
      var rowCount: js.UndefOr[Double] = js.native
      
      var rowGroupControlAfter: js.UndefOr[Boolean] = js.native
    }
    object GridProperties {
      
      @scala.inline
      def apply(): GridProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GridProperties]
      }
      
      @scala.inline
      implicit class GridPropertiesMutableBuilder[Self <: GridProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
        
        @scala.inline
        def setColumnGroupControlAfter(value: Boolean): Self = StObject.set(x, "columnGroupControlAfter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnGroupControlAfterUndefined: Self = StObject.set(x, "columnGroupControlAfter", js.undefined)
        
        @scala.inline
        def setFrozenColumnCount(value: Double): Self = StObject.set(x, "frozenColumnCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFrozenColumnCountUndefined: Self = StObject.set(x, "frozenColumnCount", js.undefined)
        
        @scala.inline
        def setFrozenRowCount(value: Double): Self = StObject.set(x, "frozenRowCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFrozenRowCountUndefined: Self = StObject.set(x, "frozenRowCount", js.undefined)
        
        @scala.inline
        def setHideGridlines(value: Boolean): Self = StObject.set(x, "hideGridlines", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideGridlinesUndefined: Self = StObject.set(x, "hideGridlines", js.undefined)
        
        @scala.inline
        def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
        
        @scala.inline
        def setRowGroupControlAfter(value: Boolean): Self = StObject.set(x, "rowGroupControlAfter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowGroupControlAfterUndefined: Self = StObject.set(x, "rowGroupControlAfter", js.undefined)
      }
    }
    
    @js.native
    trait GridRange extends StObject {
      
      var endColumnIndex: js.UndefOr[Double] = js.native
      
      var endRowIndex: js.UndefOr[Double] = js.native
      
      var sheetId: js.UndefOr[Double] = js.native
      
      var startColumnIndex: js.UndefOr[Double] = js.native
      
      var startRowIndex: js.UndefOr[Double] = js.native
    }
    object GridRange {
      
      @scala.inline
      def apply(): GridRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GridRange]
      }
      
      @scala.inline
      implicit class GridRangeMutableBuilder[Self <: GridRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEndColumnIndex(value: Double): Self = StObject.set(x, "endColumnIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndColumnIndexUndefined: Self = StObject.set(x, "endColumnIndex", js.undefined)
        
        @scala.inline
        def setEndRowIndex(value: Double): Self = StObject.set(x, "endRowIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndRowIndexUndefined: Self = StObject.set(x, "endRowIndex", js.undefined)
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
        
        @scala.inline
        def setStartColumnIndex(value: Double): Self = StObject.set(x, "startColumnIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartColumnIndexUndefined: Self = StObject.set(x, "startColumnIndex", js.undefined)
        
        @scala.inline
        def setStartRowIndex(value: Double): Self = StObject.set(x, "startRowIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartRowIndexUndefined: Self = StObject.set(x, "startRowIndex", js.undefined)
      }
    }
    
    @js.native
    trait HistogramChartSpec extends StObject {
      
      var bucketSize: js.UndefOr[Double] = js.native
      
      var legendPosition: js.UndefOr[String] = js.native
      
      var outlierPercentile: js.UndefOr[Double] = js.native
      
      var series: js.UndefOr[js.Array[HistogramSeries]] = js.native
      
      var showItemDividers: js.UndefOr[Boolean] = js.native
    }
    object HistogramChartSpec {
      
      @scala.inline
      def apply(): HistogramChartSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HistogramChartSpec]
      }
      
      @scala.inline
      implicit class HistogramChartSpecMutableBuilder[Self <: HistogramChartSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBucketSize(value: Double): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
        
        @scala.inline
        def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
        
        @scala.inline
        def setOutlierPercentile(value: Double): Self = StObject.set(x, "outlierPercentile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutlierPercentileUndefined: Self = StObject.set(x, "outlierPercentile", js.undefined)
        
        @scala.inline
        def setSeries(value: js.Array[HistogramSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
        
        @scala.inline
        def setSeriesVarargs(value: HistogramSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
        
        @scala.inline
        def setShowItemDividers(value: Boolean): Self = StObject.set(x, "showItemDividers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowItemDividersUndefined: Self = StObject.set(x, "showItemDividers", js.undefined)
      }
    }
    
    @js.native
    trait HistogramRule extends StObject {
      
      var end: js.UndefOr[Double] = js.native
      
      var interval: js.UndefOr[Double] = js.native
      
      var start: js.UndefOr[Double] = js.native
    }
    object HistogramRule {
      
      @scala.inline
      def apply(): HistogramRule = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HistogramRule]
      }
      
      @scala.inline
      implicit class HistogramRuleMutableBuilder[Self <: HistogramRule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        @scala.inline
        def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
    
    @js.native
    trait HistogramSeries extends StObject {
      
      var barColor: js.UndefOr[Color] = js.native
      
      var data: js.UndefOr[ChartData] = js.native
    }
    object HistogramSeries {
      
      @scala.inline
      def apply(): HistogramSeries = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HistogramSeries]
      }
      
      @scala.inline
      implicit class HistogramSeriesMutableBuilder[Self <: HistogramSeries] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBarColor(value: Color): Self = StObject.set(x, "barColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBarColorUndefined: Self = StObject.set(x, "barColor", js.undefined)
        
        @scala.inline
        def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      }
    }
    
    @js.native
    trait InsertDimensionRequest extends StObject {
      
      var inheritFromBefore: js.UndefOr[Boolean] = js.native
      
      var range: js.UndefOr[DimensionRange] = js.native
    }
    object InsertDimensionRequest {
      
      @scala.inline
      def apply(): InsertDimensionRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertDimensionRequest]
      }
      
      @scala.inline
      implicit class InsertDimensionRequestMutableBuilder[Self <: InsertDimensionRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInheritFromBefore(value: Boolean): Self = StObject.set(x, "inheritFromBefore", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInheritFromBeforeUndefined: Self = StObject.set(x, "inheritFromBefore", js.undefined)
        
        @scala.inline
        def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    @js.native
    trait InsertRangeRequest extends StObject {
      
      var range: js.UndefOr[GridRange] = js.native
      
      var shiftDimension: js.UndefOr[String] = js.native
    }
    object InsertRangeRequest {
      
      @scala.inline
      def apply(): InsertRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertRangeRequest]
      }
      
      @scala.inline
      implicit class InsertRangeRequestMutableBuilder[Self <: InsertRangeRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setShiftDimension(value: String): Self = StObject.set(x, "shiftDimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShiftDimensionUndefined: Self = StObject.set(x, "shiftDimension", js.undefined)
      }
    }
    
    @js.native
    trait InterpolationPoint extends StObject {
      
      var color: js.UndefOr[Color] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object InterpolationPoint {
      
      @scala.inline
      def apply(): InterpolationPoint = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InterpolationPoint]
      }
      
      @scala.inline
      implicit class InterpolationPointMutableBuilder[Self <: InterpolationPoint] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait IterativeCalculationSettings extends StObject {
      
      var convergenceThreshold: js.UndefOr[Double] = js.native
      
      var maxIterations: js.UndefOr[Double] = js.native
    }
    object IterativeCalculationSettings {
      
      @scala.inline
      def apply(): IterativeCalculationSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IterativeCalculationSettings]
      }
      
      @scala.inline
      implicit class IterativeCalculationSettingsMutableBuilder[Self <: IterativeCalculationSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConvergenceThreshold(value: Double): Self = StObject.set(x, "convergenceThreshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConvergenceThresholdUndefined: Self = StObject.set(x, "convergenceThreshold", js.undefined)
        
        @scala.inline
        def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
      }
    }
    
    @js.native
    trait LineStyle extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
      
      var width: js.UndefOr[Double] = js.native
    }
    object LineStyle {
      
      @scala.inline
      def apply(): LineStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LineStyle]
      }
      
      @scala.inline
      implicit class LineStyleMutableBuilder[Self <: LineStyle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    @js.native
    trait ManualRule extends StObject {
      
      var groups: js.UndefOr[js.Array[ManualRuleGroup]] = js.native
    }
    object ManualRule {
      
      @scala.inline
      def apply(): ManualRule = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ManualRule]
      }
      
      @scala.inline
      implicit class ManualRuleMutableBuilder[Self <: ManualRule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGroups(value: js.Array[ManualRuleGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
        
        @scala.inline
        def setGroupsVarargs(value: ManualRuleGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ManualRuleGroup extends StObject {
      
      var groupName: js.UndefOr[ExtendedValue] = js.native
      
      var items: js.UndefOr[js.Array[ExtendedValue]] = js.native
    }
    object ManualRuleGroup {
      
      @scala.inline
      def apply(): ManualRuleGroup = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ManualRuleGroup]
      }
      
      @scala.inline
      implicit class ManualRuleGroupMutableBuilder[Self <: ManualRuleGroup] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGroupName(value: ExtendedValue): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[ExtendedValue]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: ExtendedValue*): Self = StObject.set(x, "items", js.Array(value :_*))
      }
    }
    
    @js.native
    trait MatchedDeveloperMetadata extends StObject {
      
      var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
      
      var developerMetadata: js.UndefOr[DeveloperMetadata] = js.native
    }
    object MatchedDeveloperMetadata {
      
      @scala.inline
      def apply(): MatchedDeveloperMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MatchedDeveloperMetadata]
      }
      
      @scala.inline
      implicit class MatchedDeveloperMetadataMutableBuilder[Self <: MatchedDeveloperMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
        
        @scala.inline
        def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
        
        @scala.inline
        def setDeveloperMetadata(value: DeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
      }
    }
    
    @js.native
    trait MatchedValueRange extends StObject {
      
      var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
      
      var valueRange: js.UndefOr[ValueRange] = js.native
    }
    object MatchedValueRange {
      
      @scala.inline
      def apply(): MatchedValueRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MatchedValueRange]
      }
      
      @scala.inline
      implicit class MatchedValueRangeMutableBuilder[Self <: MatchedValueRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
        
        @scala.inline
        def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
        
        @scala.inline
        def setValueRange(value: ValueRange): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
      }
    }
    
    @js.native
    trait MergeCellsRequest extends StObject {
      
      var mergeType: js.UndefOr[String] = js.native
      
      var range: js.UndefOr[GridRange] = js.native
    }
    object MergeCellsRequest {
      
      @scala.inline
      def apply(): MergeCellsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MergeCellsRequest]
      }
      
      @scala.inline
      implicit class MergeCellsRequestMutableBuilder[Self <: MergeCellsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMergeType(value: String): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMergeTypeUndefined: Self = StObject.set(x, "mergeType", js.undefined)
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    @js.native
    trait MoveDimensionRequest extends StObject {
      
      var destinationIndex: js.UndefOr[Double] = js.native
      
      var source: js.UndefOr[DimensionRange] = js.native
    }
    object MoveDimensionRequest {
      
      @scala.inline
      def apply(): MoveDimensionRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MoveDimensionRequest]
      }
      
      @scala.inline
      implicit class MoveDimensionRequestMutableBuilder[Self <: MoveDimensionRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDestinationIndex(value: Double): Self = StObject.set(x, "destinationIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDestinationIndexUndefined: Self = StObject.set(x, "destinationIndex", js.undefined)
        
        @scala.inline
        def setSource(value: DimensionRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      }
    }
    
    @js.native
    trait NamedRange extends StObject {
      
      var name: js.UndefOr[String] = js.native
      
      var namedRangeId: js.UndefOr[String] = js.native
      
      var range: js.UndefOr[GridRange] = js.native
    }
    object NamedRange {
      
      @scala.inline
      def apply(): NamedRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NamedRange]
      }
      
      @scala.inline
      implicit class NamedRangeMutableBuilder[Self <: NamedRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    @js.native
    trait NumberFormat extends StObject {
      
      var pattern: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object NumberFormat {
      
      @scala.inline
      def apply(): NumberFormat = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NumberFormat]
      }
      
      @scala.inline
      implicit class NumberFormatMutableBuilder[Self <: NumberFormat] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait OrgChartSpec extends StObject {
      
      var labels: js.UndefOr[ChartData] = js.native
      
      var nodeColor: js.UndefOr[Color] = js.native
      
      var nodeSize: js.UndefOr[String] = js.native
      
      var parentLabels: js.UndefOr[ChartData] = js.native
      
      var selectedNodeColor: js.UndefOr[Color] = js.native
      
      var tooltips: js.UndefOr[ChartData] = js.native
    }
    object OrgChartSpec {
      
      @scala.inline
      def apply(): OrgChartSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OrgChartSpec]
      }
      
      @scala.inline
      implicit class OrgChartSpecMutableBuilder[Self <: OrgChartSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLabels(value: ChartData): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        @scala.inline
        def setNodeColor(value: Color): Self = StObject.set(x, "nodeColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodeColorUndefined: Self = StObject.set(x, "nodeColor", js.undefined)
        
        @scala.inline
        def setNodeSize(value: String): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodeSizeUndefined: Self = StObject.set(x, "nodeSize", js.undefined)
        
        @scala.inline
        def setParentLabels(value: ChartData): Self = StObject.set(x, "parentLabels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentLabelsUndefined: Self = StObject.set(x, "parentLabels", js.undefined)
        
        @scala.inline
        def setSelectedNodeColor(value: Color): Self = StObject.set(x, "selectedNodeColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectedNodeColorUndefined: Self = StObject.set(x, "selectedNodeColor", js.undefined)
        
        @scala.inline
        def setTooltips(value: ChartData): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
      }
    }
    
    @js.native
    trait OverlayPosition extends StObject {
      
      var anchorCell: js.UndefOr[GridCoordinate] = js.native
      
      var heightPixels: js.UndefOr[Double] = js.native
      
      var offsetXPixels: js.UndefOr[Double] = js.native
      
      var offsetYPixels: js.UndefOr[Double] = js.native
      
      var widthPixels: js.UndefOr[Double] = js.native
    }
    object OverlayPosition {
      
      @scala.inline
      def apply(): OverlayPosition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OverlayPosition]
      }
      
      @scala.inline
      implicit class OverlayPositionMutableBuilder[Self <: OverlayPosition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnchorCell(value: GridCoordinate): Self = StObject.set(x, "anchorCell", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnchorCellUndefined: Self = StObject.set(x, "anchorCell", js.undefined)
        
        @scala.inline
        def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
        
        @scala.inline
        def setOffsetXPixels(value: Double): Self = StObject.set(x, "offsetXPixels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetXPixelsUndefined: Self = StObject.set(x, "offsetXPixels", js.undefined)
        
        @scala.inline
        def setOffsetYPixels(value: Double): Self = StObject.set(x, "offsetYPixels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetYPixelsUndefined: Self = StObject.set(x, "offsetYPixels", js.undefined)
        
        @scala.inline
        def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
      }
    }
    
    @js.native
    trait Padding extends StObject {
      
      var bottom: js.UndefOr[Double] = js.native
      
      var left: js.UndefOr[Double] = js.native
      
      var right: js.UndefOr[Double] = js.native
      
      var top: js.UndefOr[Double] = js.native
    }
    object Padding {
      
      @scala.inline
      def apply(): Padding = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Padding]
      }
      
      @scala.inline
      implicit class PaddingMutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
        
        @scala.inline
        def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        @scala.inline
        def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        @scala.inline
        def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      }
    }
    
    @js.native
    trait PasteDataRequest extends StObject {
      
      var coordinate: js.UndefOr[GridCoordinate] = js.native
      
      var data: js.UndefOr[String] = js.native
      
      var delimiter: js.UndefOr[String] = js.native
      
      var html: js.UndefOr[Boolean] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object PasteDataRequest {
      
      @scala.inline
      def apply(): PasteDataRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PasteDataRequest]
      }
      
      @scala.inline
      implicit class PasteDataRequestMutableBuilder[Self <: PasteDataRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCoordinate(value: GridCoordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
        
        @scala.inline
        def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
        
        @scala.inline
        def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait PieChartSpec extends StObject {
      
      var domain: js.UndefOr[ChartData] = js.native
      
      var legendPosition: js.UndefOr[String] = js.native
      
      var pieHole: js.UndefOr[Double] = js.native
      
      var series: js.UndefOr[ChartData] = js.native
      
      var threeDimensional: js.UndefOr[Boolean] = js.native
    }
    object PieChartSpec {
      
      @scala.inline
      def apply(): PieChartSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PieChartSpec]
      }
      
      @scala.inline
      implicit class PieChartSpecMutableBuilder[Self <: PieChartSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDomain(value: ChartData): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
        
        @scala.inline
        def setPieHole(value: Double): Self = StObject.set(x, "pieHole", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPieHoleUndefined: Self = StObject.set(x, "pieHole", js.undefined)
        
        @scala.inline
        def setSeries(value: ChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
        
        @scala.inline
        def setThreeDimensional(value: Boolean): Self = StObject.set(x, "threeDimensional", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThreeDimensionalUndefined: Self = StObject.set(x, "threeDimensional", js.undefined)
      }
    }
    
    @js.native
    trait PivotFilterCriteria extends StObject {
      
      var visibleValues: js.UndefOr[js.Array[String]] = js.native
    }
    object PivotFilterCriteria {
      
      @scala.inline
      def apply(): PivotFilterCriteria = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotFilterCriteria]
      }
      
      @scala.inline
      implicit class PivotFilterCriteriaMutableBuilder[Self <: PivotFilterCriteria] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVisibleValues(value: js.Array[String]): Self = StObject.set(x, "visibleValues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleValuesUndefined: Self = StObject.set(x, "visibleValues", js.undefined)
        
        @scala.inline
        def setVisibleValuesVarargs(value: String*): Self = StObject.set(x, "visibleValues", js.Array(value :_*))
      }
    }
    
    @js.native
    trait PivotGroup extends StObject {
      
      var groupRule: js.UndefOr[PivotGroupRule] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var repeatHeadings: js.UndefOr[Boolean] = js.native
      
      var showTotals: js.UndefOr[Boolean] = js.native
      
      var sortOrder: js.UndefOr[String] = js.native
      
      var sourceColumnOffset: js.UndefOr[Double] = js.native
      
      var valueBucket: js.UndefOr[PivotGroupSortValueBucket] = js.native
      
      var valueMetadata: js.UndefOr[js.Array[PivotGroupValueMetadata]] = js.native
    }
    object PivotGroup {
      
      @scala.inline
      def apply(): PivotGroup = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotGroup]
      }
      
      @scala.inline
      implicit class PivotGroupMutableBuilder[Self <: PivotGroup] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGroupRule(value: PivotGroupRule): Self = StObject.set(x, "groupRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupRuleUndefined: Self = StObject.set(x, "groupRule", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setRepeatHeadings(value: Boolean): Self = StObject.set(x, "repeatHeadings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRepeatHeadingsUndefined: Self = StObject.set(x, "repeatHeadings", js.undefined)
        
        @scala.inline
        def setShowTotals(value: Boolean): Self = StObject.set(x, "showTotals", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowTotalsUndefined: Self = StObject.set(x, "showTotals", js.undefined)
        
        @scala.inline
        def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
        
        @scala.inline
        def setSourceColumnOffset(value: Double): Self = StObject.set(x, "sourceColumnOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceColumnOffsetUndefined: Self = StObject.set(x, "sourceColumnOffset", js.undefined)
        
        @scala.inline
        def setValueBucket(value: PivotGroupSortValueBucket): Self = StObject.set(x, "valueBucket", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueBucketUndefined: Self = StObject.set(x, "valueBucket", js.undefined)
        
        @scala.inline
        def setValueMetadata(value: js.Array[PivotGroupValueMetadata]): Self = StObject.set(x, "valueMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueMetadataUndefined: Self = StObject.set(x, "valueMetadata", js.undefined)
        
        @scala.inline
        def setValueMetadataVarargs(value: PivotGroupValueMetadata*): Self = StObject.set(x, "valueMetadata", js.Array(value :_*))
      }
    }
    
    @js.native
    trait PivotGroupRule extends StObject {
      
      var dateTimeRule: js.UndefOr[DateTimeRule] = js.native
      
      var histogramRule: js.UndefOr[HistogramRule] = js.native
      
      var manualRule: js.UndefOr[ManualRule] = js.native
    }
    object PivotGroupRule {
      
      @scala.inline
      def apply(): PivotGroupRule = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotGroupRule]
      }
      
      @scala.inline
      implicit class PivotGroupRuleMutableBuilder[Self <: PivotGroupRule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDateTimeRule(value: DateTimeRule): Self = StObject.set(x, "dateTimeRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateTimeRuleUndefined: Self = StObject.set(x, "dateTimeRule", js.undefined)
        
        @scala.inline
        def setHistogramRule(value: HistogramRule): Self = StObject.set(x, "histogramRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHistogramRuleUndefined: Self = StObject.set(x, "histogramRule", js.undefined)
        
        @scala.inline
        def setManualRule(value: ManualRule): Self = StObject.set(x, "manualRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManualRuleUndefined: Self = StObject.set(x, "manualRule", js.undefined)
      }
    }
    
    @js.native
    trait PivotGroupSortValueBucket extends StObject {
      
      var buckets: js.UndefOr[js.Array[ExtendedValue]] = js.native
      
      var valuesIndex: js.UndefOr[Double] = js.native
    }
    object PivotGroupSortValueBucket {
      
      @scala.inline
      def apply(): PivotGroupSortValueBucket = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotGroupSortValueBucket]
      }
      
      @scala.inline
      implicit class PivotGroupSortValueBucketMutableBuilder[Self <: PivotGroupSortValueBucket] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBuckets(value: js.Array[ExtendedValue]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
        
        @scala.inline
        def setBucketsVarargs(value: ExtendedValue*): Self = StObject.set(x, "buckets", js.Array(value :_*))
        
        @scala.inline
        def setValuesIndex(value: Double): Self = StObject.set(x, "valuesIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesIndexUndefined: Self = StObject.set(x, "valuesIndex", js.undefined)
      }
    }
    
    @js.native
    trait PivotGroupValueMetadata extends StObject {
      
      var collapsed: js.UndefOr[Boolean] = js.native
      
      var value: js.UndefOr[ExtendedValue] = js.native
    }
    object PivotGroupValueMetadata {
      
      @scala.inline
      def apply(): PivotGroupValueMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotGroupValueMetadata]
      }
      
      @scala.inline
      implicit class PivotGroupValueMetadataMutableBuilder[Self <: PivotGroupValueMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
        
        @scala.inline
        def setValue(value: ExtendedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait PivotTable extends StObject {
      
      var columns: js.UndefOr[js.Array[PivotGroup]] = js.native
      
      var criteria: js.UndefOr[js.Object] = js.native
      
      var rows: js.UndefOr[js.Array[PivotGroup]] = js.native
      
      var source: js.UndefOr[GridRange] = js.native
      
      var valueLayout: js.UndefOr[String] = js.native
      
      var values: js.UndefOr[js.Array[PivotValue]] = js.native
    }
    object PivotTable {
      
      @scala.inline
      def apply(): PivotTable = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotTable]
      }
      
      @scala.inline
      implicit class PivotTableMutableBuilder[Self <: PivotTable] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumns(value: js.Array[PivotGroup]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        @scala.inline
        def setColumnsVarargs(value: PivotGroup*): Self = StObject.set(x, "columns", js.Array(value :_*))
        
        @scala.inline
        def setCriteria(value: js.Object): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
        
        @scala.inline
        def setRows(value: js.Array[PivotGroup]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        @scala.inline
        def setRowsVarargs(value: PivotGroup*): Self = StObject.set(x, "rows", js.Array(value :_*))
        
        @scala.inline
        def setSource(value: GridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        @scala.inline
        def setValueLayout(value: String): Self = StObject.set(x, "valueLayout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueLayoutUndefined: Self = StObject.set(x, "valueLayout", js.undefined)
        
        @scala.inline
        def setValues(value: js.Array[PivotValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        @scala.inline
        def setValuesVarargs(value: PivotValue*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    @js.native
    trait PivotValue extends StObject {
      
      var calculatedDisplayType: js.UndefOr[String] = js.native
      
      var formula: js.UndefOr[String] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var sourceColumnOffset: js.UndefOr[Double] = js.native
      
      var summarizeFunction: js.UndefOr[String] = js.native
    }
    object PivotValue {
      
      @scala.inline
      def apply(): PivotValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PivotValue]
      }
      
      @scala.inline
      implicit class PivotValueMutableBuilder[Self <: PivotValue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCalculatedDisplayType(value: String): Self = StObject.set(x, "calculatedDisplayType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCalculatedDisplayTypeUndefined: Self = StObject.set(x, "calculatedDisplayType", js.undefined)
        
        @scala.inline
        def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setSourceColumnOffset(value: Double): Self = StObject.set(x, "sourceColumnOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceColumnOffsetUndefined: Self = StObject.set(x, "sourceColumnOffset", js.undefined)
        
        @scala.inline
        def setSummarizeFunction(value: String): Self = StObject.set(x, "summarizeFunction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummarizeFunctionUndefined: Self = StObject.set(x, "summarizeFunction", js.undefined)
      }
    }
    
    @js.native
    trait ProtectedRange extends StObject {
      
      var description: js.UndefOr[String] = js.native
      
      var editors: js.UndefOr[Editors] = js.native
      
      var namedRangeId: js.UndefOr[String] = js.native
      
      var protectedRangeId: js.UndefOr[Double] = js.native
      
      var range: js.UndefOr[GridRange] = js.native
      
      var requestingUserCanEdit: js.UndefOr[Boolean] = js.native
      
      var unprotectedRanges: js.UndefOr[js.Array[GridRange]] = js.native
      
      var warningOnly: js.UndefOr[Boolean] = js.native
    }
    object ProtectedRange {
      
      @scala.inline
      def apply(): ProtectedRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ProtectedRange]
      }
      
      @scala.inline
      implicit class ProtectedRangeMutableBuilder[Self <: ProtectedRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setEditors(value: Editors): Self = StObject.set(x, "editors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorsUndefined: Self = StObject.set(x, "editors", js.undefined)
        
        @scala.inline
        def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
        
        @scala.inline
        def setProtectedRangeId(value: Double): Self = StObject.set(x, "protectedRangeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProtectedRangeIdUndefined: Self = StObject.set(x, "protectedRangeId", js.undefined)
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setRequestingUserCanEdit(value: Boolean): Self = StObject.set(x, "requestingUserCanEdit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestingUserCanEditUndefined: Self = StObject.set(x, "requestingUserCanEdit", js.undefined)
        
        @scala.inline
        def setUnprotectedRanges(value: js.Array[GridRange]): Self = StObject.set(x, "unprotectedRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnprotectedRangesUndefined: Self = StObject.set(x, "unprotectedRanges", js.undefined)
        
        @scala.inline
        def setUnprotectedRangesVarargs(value: GridRange*): Self = StObject.set(x, "unprotectedRanges", js.Array(value :_*))
        
        @scala.inline
        def setWarningOnly(value: Boolean): Self = StObject.set(x, "warningOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWarningOnlyUndefined: Self = StObject.set(x, "warningOnly", js.undefined)
      }
    }
    
    @js.native
    trait RandomizeRangeRequest extends StObject {
      
      var range: js.UndefOr[GridRange] = js.native
    }
    object RandomizeRangeRequest {
      
      @scala.inline
      def apply(): RandomizeRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RandomizeRangeRequest]
      }
      
      @scala.inline
      implicit class RandomizeRangeRequestMutableBuilder[Self <: RandomizeRangeRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    @js.native
    trait RepeatCellRequest extends StObject {
      
      var cell: js.UndefOr[CellData] = js.native
      
      var fields: js.UndefOr[String] = js.native
      
      var range: js.UndefOr[GridRange] = js.native
    }
    object RepeatCellRequest {
      
      @scala.inline
      def apply(): RepeatCellRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RepeatCellRequest]
      }
      
      @scala.inline
      implicit class RepeatCellRequestMutableBuilder[Self <: RepeatCellRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCell(value: CellData): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    @js.native
    trait Request extends StObject {
      
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
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddBanding(value: AddBandingRequest): Self = StObject.set(x, "addBanding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddBandingUndefined: Self = StObject.set(x, "addBanding", js.undefined)
        
        @scala.inline
        def setAddChart(value: AddChartRequest): Self = StObject.set(x, "addChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddChartUndefined: Self = StObject.set(x, "addChart", js.undefined)
        
        @scala.inline
        def setAddConditionalFormatRule(value: AddConditionalFormatRuleRequest): Self = StObject.set(x, "addConditionalFormatRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddConditionalFormatRuleUndefined: Self = StObject.set(x, "addConditionalFormatRule", js.undefined)
        
        @scala.inline
        def setAddDimensionGroup(value: AddDimensionGroupRequest): Self = StObject.set(x, "addDimensionGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddDimensionGroupUndefined: Self = StObject.set(x, "addDimensionGroup", js.undefined)
        
        @scala.inline
        def setAddFilterView(value: AddFilterViewRequest): Self = StObject.set(x, "addFilterView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddFilterViewUndefined: Self = StObject.set(x, "addFilterView", js.undefined)
        
        @scala.inline
        def setAddNamedRange(value: AddNamedRangeRequest): Self = StObject.set(x, "addNamedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddNamedRangeUndefined: Self = StObject.set(x, "addNamedRange", js.undefined)
        
        @scala.inline
        def setAddProtectedRange(value: AddProtectedRangeRequest): Self = StObject.set(x, "addProtectedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddProtectedRangeUndefined: Self = StObject.set(x, "addProtectedRange", js.undefined)
        
        @scala.inline
        def setAddSheet(value: AddSheetRequest): Self = StObject.set(x, "addSheet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddSheetUndefined: Self = StObject.set(x, "addSheet", js.undefined)
        
        @scala.inline
        def setAppendCells(value: AppendCellsRequest): Self = StObject.set(x, "appendCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppendCellsUndefined: Self = StObject.set(x, "appendCells", js.undefined)
        
        @scala.inline
        def setAppendDimension(value: AppendDimensionRequest): Self = StObject.set(x, "appendDimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppendDimensionUndefined: Self = StObject.set(x, "appendDimension", js.undefined)
        
        @scala.inline
        def setAutoFill(value: AutoFillRequest): Self = StObject.set(x, "autoFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoFillUndefined: Self = StObject.set(x, "autoFill", js.undefined)
        
        @scala.inline
        def setAutoResizeDimensions(value: AutoResizeDimensionsRequest): Self = StObject.set(x, "autoResizeDimensions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoResizeDimensionsUndefined: Self = StObject.set(x, "autoResizeDimensions", js.undefined)
        
        @scala.inline
        def setClearBasicFilter(value: ClearBasicFilterRequest): Self = StObject.set(x, "clearBasicFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClearBasicFilterUndefined: Self = StObject.set(x, "clearBasicFilter", js.undefined)
        
        @scala.inline
        def setCopyPaste(value: CopyPasteRequest): Self = StObject.set(x, "copyPaste", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCopyPasteUndefined: Self = StObject.set(x, "copyPaste", js.undefined)
        
        @scala.inline
        def setCreateDeveloperMetadata(value: CreateDeveloperMetadataRequest): Self = StObject.set(x, "createDeveloperMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateDeveloperMetadataUndefined: Self = StObject.set(x, "createDeveloperMetadata", js.undefined)
        
        @scala.inline
        def setCutPaste(value: CutPasteRequest): Self = StObject.set(x, "cutPaste", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCutPasteUndefined: Self = StObject.set(x, "cutPaste", js.undefined)
        
        @scala.inline
        def setDeleteBanding(value: DeleteBandingRequest): Self = StObject.set(x, "deleteBanding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteBandingUndefined: Self = StObject.set(x, "deleteBanding", js.undefined)
        
        @scala.inline
        def setDeleteConditionalFormatRule(value: DeleteConditionalFormatRuleRequest): Self = StObject.set(x, "deleteConditionalFormatRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteConditionalFormatRuleUndefined: Self = StObject.set(x, "deleteConditionalFormatRule", js.undefined)
        
        @scala.inline
        def setDeleteDeveloperMetadata(value: DeleteDeveloperMetadataRequest): Self = StObject.set(x, "deleteDeveloperMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteDeveloperMetadataUndefined: Self = StObject.set(x, "deleteDeveloperMetadata", js.undefined)
        
        @scala.inline
        def setDeleteDimension(value: DeleteDimensionRequest): Self = StObject.set(x, "deleteDimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteDimensionGroup(value: DeleteDimensionGroupRequest): Self = StObject.set(x, "deleteDimensionGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteDimensionGroupUndefined: Self = StObject.set(x, "deleteDimensionGroup", js.undefined)
        
        @scala.inline
        def setDeleteDimensionUndefined: Self = StObject.set(x, "deleteDimension", js.undefined)
        
        @scala.inline
        def setDeleteEmbeddedObject(value: DeleteEmbeddedObjectRequest): Self = StObject.set(x, "deleteEmbeddedObject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteEmbeddedObjectUndefined: Self = StObject.set(x, "deleteEmbeddedObject", js.undefined)
        
        @scala.inline
        def setDeleteFilterView(value: DeleteFilterViewRequest): Self = StObject.set(x, "deleteFilterView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteFilterViewUndefined: Self = StObject.set(x, "deleteFilterView", js.undefined)
        
        @scala.inline
        def setDeleteNamedRange(value: DeleteNamedRangeRequest): Self = StObject.set(x, "deleteNamedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteNamedRangeUndefined: Self = StObject.set(x, "deleteNamedRange", js.undefined)
        
        @scala.inline
        def setDeleteProtectedRange(value: DeleteProtectedRangeRequest): Self = StObject.set(x, "deleteProtectedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteProtectedRangeUndefined: Self = StObject.set(x, "deleteProtectedRange", js.undefined)
        
        @scala.inline
        def setDeleteRange(value: DeleteRangeRequest): Self = StObject.set(x, "deleteRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteRangeUndefined: Self = StObject.set(x, "deleteRange", js.undefined)
        
        @scala.inline
        def setDeleteSheet(value: DeleteSheetRequest): Self = StObject.set(x, "deleteSheet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteSheetUndefined: Self = StObject.set(x, "deleteSheet", js.undefined)
        
        @scala.inline
        def setDuplicateFilterView(value: DuplicateFilterViewRequest): Self = StObject.set(x, "duplicateFilterView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuplicateFilterViewUndefined: Self = StObject.set(x, "duplicateFilterView", js.undefined)
        
        @scala.inline
        def setDuplicateSheet(value: DuplicateSheetRequest): Self = StObject.set(x, "duplicateSheet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuplicateSheetUndefined: Self = StObject.set(x, "duplicateSheet", js.undefined)
        
        @scala.inline
        def setFindReplace(value: FindReplaceRequest): Self = StObject.set(x, "findReplace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFindReplaceUndefined: Self = StObject.set(x, "findReplace", js.undefined)
        
        @scala.inline
        def setInsertDimension(value: InsertDimensionRequest): Self = StObject.set(x, "insertDimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertDimensionUndefined: Self = StObject.set(x, "insertDimension", js.undefined)
        
        @scala.inline
        def setInsertRange(value: InsertRangeRequest): Self = StObject.set(x, "insertRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertRangeUndefined: Self = StObject.set(x, "insertRange", js.undefined)
        
        @scala.inline
        def setMergeCells(value: MergeCellsRequest): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMergeCellsUndefined: Self = StObject.set(x, "mergeCells", js.undefined)
        
        @scala.inline
        def setMoveDimension(value: MoveDimensionRequest): Self = StObject.set(x, "moveDimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMoveDimensionUndefined: Self = StObject.set(x, "moveDimension", js.undefined)
        
        @scala.inline
        def setPasteData(value: PasteDataRequest): Self = StObject.set(x, "pasteData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasteDataUndefined: Self = StObject.set(x, "pasteData", js.undefined)
        
        @scala.inline
        def setRandomizeRange(value: RandomizeRangeRequest): Self = StObject.set(x, "randomizeRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRandomizeRangeUndefined: Self = StObject.set(x, "randomizeRange", js.undefined)
        
        @scala.inline
        def setRepeatCell(value: RepeatCellRequest): Self = StObject.set(x, "repeatCell", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRepeatCellUndefined: Self = StObject.set(x, "repeatCell", js.undefined)
        
        @scala.inline
        def setSetBasicFilter(value: SetBasicFilterRequest): Self = StObject.set(x, "setBasicFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetBasicFilterUndefined: Self = StObject.set(x, "setBasicFilter", js.undefined)
        
        @scala.inline
        def setSetDataValidation(value: SetDataValidationRequest): Self = StObject.set(x, "setDataValidation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetDataValidationUndefined: Self = StObject.set(x, "setDataValidation", js.undefined)
        
        @scala.inline
        def setSortRange(value: SortRangeRequest): Self = StObject.set(x, "sortRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortRangeUndefined: Self = StObject.set(x, "sortRange", js.undefined)
        
        @scala.inline
        def setTextToColumns(value: TextToColumnsRequest): Self = StObject.set(x, "textToColumns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextToColumnsUndefined: Self = StObject.set(x, "textToColumns", js.undefined)
        
        @scala.inline
        def setUnmergeCells(value: UnmergeCellsRequest): Self = StObject.set(x, "unmergeCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnmergeCellsUndefined: Self = StObject.set(x, "unmergeCells", js.undefined)
        
        @scala.inline
        def setUpdateBanding(value: UpdateBandingRequest): Self = StObject.set(x, "updateBanding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateBandingUndefined: Self = StObject.set(x, "updateBanding", js.undefined)
        
        @scala.inline
        def setUpdateBorders(value: UpdateBordersRequest): Self = StObject.set(x, "updateBorders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateBordersUndefined: Self = StObject.set(x, "updateBorders", js.undefined)
        
        @scala.inline
        def setUpdateCells(value: UpdateCellsRequest): Self = StObject.set(x, "updateCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateCellsUndefined: Self = StObject.set(x, "updateCells", js.undefined)
        
        @scala.inline
        def setUpdateChartSpec(value: UpdateChartSpecRequest): Self = StObject.set(x, "updateChartSpec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateChartSpecUndefined: Self = StObject.set(x, "updateChartSpec", js.undefined)
        
        @scala.inline
        def setUpdateConditionalFormatRule(value: UpdateConditionalFormatRuleRequest): Self = StObject.set(x, "updateConditionalFormatRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateConditionalFormatRuleUndefined: Self = StObject.set(x, "updateConditionalFormatRule", js.undefined)
        
        @scala.inline
        def setUpdateDeveloperMetadata(value: UpdateDeveloperMetadataRequest): Self = StObject.set(x, "updateDeveloperMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateDeveloperMetadataUndefined: Self = StObject.set(x, "updateDeveloperMetadata", js.undefined)
        
        @scala.inline
        def setUpdateDimensionGroup(value: UpdateDimensionGroupRequest): Self = StObject.set(x, "updateDimensionGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateDimensionGroupUndefined: Self = StObject.set(x, "updateDimensionGroup", js.undefined)
        
        @scala.inline
        def setUpdateDimensionProperties(value: UpdateDimensionPropertiesRequest): Self = StObject.set(x, "updateDimensionProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateDimensionPropertiesUndefined: Self = StObject.set(x, "updateDimensionProperties", js.undefined)
        
        @scala.inline
        def setUpdateEmbeddedObjectPosition(value: UpdateEmbeddedObjectPositionRequest): Self = StObject.set(x, "updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateEmbeddedObjectPositionUndefined: Self = StObject.set(x, "updateEmbeddedObjectPosition", js.undefined)
        
        @scala.inline
        def setUpdateFilterView(value: UpdateFilterViewRequest): Self = StObject.set(x, "updateFilterView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateFilterViewUndefined: Self = StObject.set(x, "updateFilterView", js.undefined)
        
        @scala.inline
        def setUpdateNamedRange(value: UpdateNamedRangeRequest): Self = StObject.set(x, "updateNamedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateNamedRangeUndefined: Self = StObject.set(x, "updateNamedRange", js.undefined)
        
        @scala.inline
        def setUpdateProtectedRange(value: UpdateProtectedRangeRequest): Self = StObject.set(x, "updateProtectedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateProtectedRangeUndefined: Self = StObject.set(x, "updateProtectedRange", js.undefined)
        
        @scala.inline
        def setUpdateSheetProperties(value: UpdateSheetPropertiesRequest): Self = StObject.set(x, "updateSheetProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateSheetPropertiesUndefined: Self = StObject.set(x, "updateSheetProperties", js.undefined)
        
        @scala.inline
        def setUpdateSpreadsheetProperties(value: UpdateSpreadsheetPropertiesRequest): Self = StObject.set(x, "updateSpreadsheetProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateSpreadsheetPropertiesUndefined: Self = StObject.set(x, "updateSpreadsheetProperties", js.undefined)
      }
    }
    
    @js.native
    trait Response extends StObject {
      
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
      implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddBanding(value: AddBandingResponse): Self = StObject.set(x, "addBanding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddBandingUndefined: Self = StObject.set(x, "addBanding", js.undefined)
        
        @scala.inline
        def setAddChart(value: AddChartResponse): Self = StObject.set(x, "addChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddChartUndefined: Self = StObject.set(x, "addChart", js.undefined)
        
        @scala.inline
        def setAddDimensionGroup(value: AddDimensionGroupResponse): Self = StObject.set(x, "addDimensionGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddDimensionGroupUndefined: Self = StObject.set(x, "addDimensionGroup", js.undefined)
        
        @scala.inline
        def setAddFilterView(value: AddFilterViewResponse): Self = StObject.set(x, "addFilterView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddFilterViewUndefined: Self = StObject.set(x, "addFilterView", js.undefined)
        
        @scala.inline
        def setAddNamedRange(value: AddNamedRangeResponse): Self = StObject.set(x, "addNamedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddNamedRangeUndefined: Self = StObject.set(x, "addNamedRange", js.undefined)
        
        @scala.inline
        def setAddProtectedRange(value: AddProtectedRangeResponse): Self = StObject.set(x, "addProtectedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddProtectedRangeUndefined: Self = StObject.set(x, "addProtectedRange", js.undefined)
        
        @scala.inline
        def setAddSheet(value: AddSheetResponse): Self = StObject.set(x, "addSheet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddSheetUndefined: Self = StObject.set(x, "addSheet", js.undefined)
        
        @scala.inline
        def setCreateDeveloperMetadata(value: CreateDeveloperMetadataResponse): Self = StObject.set(x, "createDeveloperMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateDeveloperMetadataUndefined: Self = StObject.set(x, "createDeveloperMetadata", js.undefined)
        
        @scala.inline
        def setDeleteConditionalFormatRule(value: DeleteConditionalFormatRuleResponse): Self = StObject.set(x, "deleteConditionalFormatRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteConditionalFormatRuleUndefined: Self = StObject.set(x, "deleteConditionalFormatRule", js.undefined)
        
        @scala.inline
        def setDeleteDeveloperMetadata(value: DeleteDeveloperMetadataResponse): Self = StObject.set(x, "deleteDeveloperMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteDeveloperMetadataUndefined: Self = StObject.set(x, "deleteDeveloperMetadata", js.undefined)
        
        @scala.inline
        def setDeleteDimensionGroup(value: DeleteDimensionGroupResponse): Self = StObject.set(x, "deleteDimensionGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteDimensionGroupUndefined: Self = StObject.set(x, "deleteDimensionGroup", js.undefined)
        
        @scala.inline
        def setDuplicateFilterView(value: DuplicateFilterViewResponse): Self = StObject.set(x, "duplicateFilterView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuplicateFilterViewUndefined: Self = StObject.set(x, "duplicateFilterView", js.undefined)
        
        @scala.inline
        def setDuplicateSheet(value: DuplicateSheetResponse): Self = StObject.set(x, "duplicateSheet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuplicateSheetUndefined: Self = StObject.set(x, "duplicateSheet", js.undefined)
        
        @scala.inline
        def setFindReplace(value: FindReplaceResponse): Self = StObject.set(x, "findReplace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFindReplaceUndefined: Self = StObject.set(x, "findReplace", js.undefined)
        
        @scala.inline
        def setUpdateConditionalFormatRule(value: UpdateConditionalFormatRuleResponse): Self = StObject.set(x, "updateConditionalFormatRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateConditionalFormatRuleUndefined: Self = StObject.set(x, "updateConditionalFormatRule", js.undefined)
        
        @scala.inline
        def setUpdateDeveloperMetadata(value: UpdateDeveloperMetadataResponse): Self = StObject.set(x, "updateDeveloperMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateDeveloperMetadataUndefined: Self = StObject.set(x, "updateDeveloperMetadata", js.undefined)
        
        @scala.inline
        def setUpdateEmbeddedObjectPosition(value: UpdateEmbeddedObjectPositionResponse): Self = StObject.set(x, "updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateEmbeddedObjectPositionUndefined: Self = StObject.set(x, "updateEmbeddedObjectPosition", js.undefined)
      }
    }
    
    @js.native
    trait RowData extends StObject {
      
      var values: js.UndefOr[js.Array[CellData]] = js.native
    }
    object RowData {
      
      @scala.inline
      def apply(): RowData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RowData]
      }
      
      @scala.inline
      implicit class RowDataMutableBuilder[Self <: RowData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValues(value: js.Array[CellData]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        @scala.inline
        def setValuesVarargs(value: CellData*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    @js.native
    trait SearchDeveloperMetadataRequest extends StObject {
      
      var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
    }
    object SearchDeveloperMetadataRequest {
      
      @scala.inline
      def apply(): SearchDeveloperMetadataRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchDeveloperMetadataRequest]
      }
      
      @scala.inline
      implicit class SearchDeveloperMetadataRequestMutableBuilder[Self <: SearchDeveloperMetadataRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
        
        @scala.inline
        def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
      }
    }
    
    @js.native
    trait SearchDeveloperMetadataResponse extends StObject {
      
      var matchedDeveloperMetadata: js.UndefOr[js.Array[MatchedDeveloperMetadata]] = js.native
    }
    object SearchDeveloperMetadataResponse {
      
      @scala.inline
      def apply(): SearchDeveloperMetadataResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchDeveloperMetadataResponse]
      }
      
      @scala.inline
      implicit class SearchDeveloperMetadataResponseMutableBuilder[Self <: SearchDeveloperMetadataResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMatchedDeveloperMetadata(value: js.Array[MatchedDeveloperMetadata]): Self = StObject.set(x, "matchedDeveloperMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatchedDeveloperMetadataUndefined: Self = StObject.set(x, "matchedDeveloperMetadata", js.undefined)
        
        @scala.inline
        def setMatchedDeveloperMetadataVarargs(value: MatchedDeveloperMetadata*): Self = StObject.set(x, "matchedDeveloperMetadata", js.Array(value :_*))
      }
    }
    
    @js.native
    trait SetBasicFilterRequest extends StObject {
      
      var filter: js.UndefOr[BasicFilter] = js.native
    }
    object SetBasicFilterRequest {
      
      @scala.inline
      def apply(): SetBasicFilterRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SetBasicFilterRequest]
      }
      
      @scala.inline
      implicit class SetBasicFilterRequestMutableBuilder[Self <: SetBasicFilterRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilter(value: BasicFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      }
    }
    
    @js.native
    trait SetDataValidationRequest extends StObject {
      
      var range: js.UndefOr[GridRange] = js.native
      
      var rule: js.UndefOr[DataValidationRule] = js.native
    }
    object SetDataValidationRequest {
      
      @scala.inline
      def apply(): SetDataValidationRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SetDataValidationRequest]
      }
      
      @scala.inline
      implicit class SetDataValidationRequestMutableBuilder[Self <: SetDataValidationRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setRule(value: DataValidationRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      }
    }
    
    @js.native
    trait Sheet extends StObject {
      
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
      implicit class SheetMutableBuilder[Self <: Sheet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBandedRanges(value: js.Array[BandedRange]): Self = StObject.set(x, "bandedRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBandedRangesUndefined: Self = StObject.set(x, "bandedRanges", js.undefined)
        
        @scala.inline
        def setBandedRangesVarargs(value: BandedRange*): Self = StObject.set(x, "bandedRanges", js.Array(value :_*))
        
        @scala.inline
        def setBasicFilter(value: BasicFilter): Self = StObject.set(x, "basicFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBasicFilterUndefined: Self = StObject.set(x, "basicFilter", js.undefined)
        
        @scala.inline
        def setCharts(value: js.Array[EmbeddedChart]): Self = StObject.set(x, "charts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChartsUndefined: Self = StObject.set(x, "charts", js.undefined)
        
        @scala.inline
        def setChartsVarargs(value: EmbeddedChart*): Self = StObject.set(x, "charts", js.Array(value :_*))
        
        @scala.inline
        def setColumnGroups(value: js.Array[DimensionGroup]): Self = StObject.set(x, "columnGroups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnGroupsUndefined: Self = StObject.set(x, "columnGroups", js.undefined)
        
        @scala.inline
        def setColumnGroupsVarargs(value: DimensionGroup*): Self = StObject.set(x, "columnGroups", js.Array(value :_*))
        
        @scala.inline
        def setConditionalFormats(value: js.Array[ConditionalFormatRule]): Self = StObject.set(x, "conditionalFormats", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionalFormatsUndefined: Self = StObject.set(x, "conditionalFormats", js.undefined)
        
        @scala.inline
        def setConditionalFormatsVarargs(value: ConditionalFormatRule*): Self = StObject.set(x, "conditionalFormats", js.Array(value :_*))
        
        @scala.inline
        def setData(value: js.Array[GridData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setDataVarargs(value: GridData*): Self = StObject.set(x, "data", js.Array(value :_*))
        
        @scala.inline
        def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
        
        @scala.inline
        def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
        
        @scala.inline
        def setFilterViews(value: js.Array[FilterView]): Self = StObject.set(x, "filterViews", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterViewsUndefined: Self = StObject.set(x, "filterViews", js.undefined)
        
        @scala.inline
        def setFilterViewsVarargs(value: FilterView*): Self = StObject.set(x, "filterViews", js.Array(value :_*))
        
        @scala.inline
        def setMerges(value: js.Array[GridRange]): Self = StObject.set(x, "merges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMergesUndefined: Self = StObject.set(x, "merges", js.undefined)
        
        @scala.inline
        def setMergesVarargs(value: GridRange*): Self = StObject.set(x, "merges", js.Array(value :_*))
        
        @scala.inline
        def setProperties(value: SheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        @scala.inline
        def setProtectedRanges(value: js.Array[ProtectedRange]): Self = StObject.set(x, "protectedRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProtectedRangesUndefined: Self = StObject.set(x, "protectedRanges", js.undefined)
        
        @scala.inline
        def setProtectedRangesVarargs(value: ProtectedRange*): Self = StObject.set(x, "protectedRanges", js.Array(value :_*))
        
        @scala.inline
        def setRowGroups(value: js.Array[DimensionGroup]): Self = StObject.set(x, "rowGroups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowGroupsUndefined: Self = StObject.set(x, "rowGroups", js.undefined)
        
        @scala.inline
        def setRowGroupsVarargs(value: DimensionGroup*): Self = StObject.set(x, "rowGroups", js.Array(value :_*))
      }
    }
    
    @js.native
    trait SheetProperties extends StObject {
      
      var gridProperties: js.UndefOr[GridProperties] = js.native
      
      var hidden: js.UndefOr[Boolean] = js.native
      
      var index: js.UndefOr[Double] = js.native
      
      var rightToLeft: js.UndefOr[Boolean] = js.native
      
      var sheetId: js.UndefOr[Double] = js.native
      
      var sheetType: js.UndefOr[String] = js.native
      
      var tabColor: js.UndefOr[Color] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object SheetProperties {
      
      @scala.inline
      def apply(): SheetProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SheetProperties]
      }
      
      @scala.inline
      implicit class SheetPropertiesMutableBuilder[Self <: SheetProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGridProperties(value: GridProperties): Self = StObject.set(x, "gridProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGridPropertiesUndefined: Self = StObject.set(x, "gridProperties", js.undefined)
        
        @scala.inline
        def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        @scala.inline
        def setRightToLeft(value: Boolean): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightToLeftUndefined: Self = StObject.set(x, "rightToLeft", js.undefined)
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
        
        @scala.inline
        def setSheetType(value: String): Self = StObject.set(x, "sheetType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetTypeUndefined: Self = StObject.set(x, "sheetType", js.undefined)
        
        @scala.inline
        def setTabColor(value: Color): Self = StObject.set(x, "tabColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTabColorUndefined: Self = StObject.set(x, "tabColor", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait SortRangeRequest extends StObject {
      
      var range: js.UndefOr[GridRange] = js.native
      
      var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
    }
    object SortRangeRequest {
      
      @scala.inline
      def apply(): SortRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SortRangeRequest]
      }
      
      @scala.inline
      implicit class SortRangeRequestMutableBuilder[Self <: SortRangeRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setSortSpecs(value: js.Array[SortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
        
        @scala.inline
        def setSortSpecsVarargs(value: SortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value :_*))
      }
    }
    
    @js.native
    trait SortSpec extends StObject {
      
      var dimensionIndex: js.UndefOr[Double] = js.native
      
      var sortOrder: js.UndefOr[String] = js.native
    }
    object SortSpec {
      
      @scala.inline
      def apply(): SortSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SortSpec]
      }
      
      @scala.inline
      implicit class SortSpecMutableBuilder[Self <: SortSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimensionIndex(value: Double): Self = StObject.set(x, "dimensionIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionIndexUndefined: Self = StObject.set(x, "dimensionIndex", js.undefined)
        
        @scala.inline
        def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      }
    }
    
    @js.native
    trait SourceAndDestination extends StObject {
      
      var dimension: js.UndefOr[String] = js.native
      
      var fillLength: js.UndefOr[Double] = js.native
      
      var source: js.UndefOr[GridRange] = js.native
    }
    object SourceAndDestination {
      
      @scala.inline
      def apply(): SourceAndDestination = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SourceAndDestination]
      }
      
      @scala.inline
      implicit class SourceAndDestinationMutableBuilder[Self <: SourceAndDestination] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
        
        @scala.inline
        def setFillLength(value: Double): Self = StObject.set(x, "fillLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFillLengthUndefined: Self = StObject.set(x, "fillLength", js.undefined)
        
        @scala.inline
        def setSource(value: GridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      }
    }
    
    @js.native
    trait Spreadsheet extends StObject {
      
      var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
      
      var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.native
      
      var properties: js.UndefOr[SpreadsheetProperties] = js.native
      
      var sheets: js.UndefOr[js.Array[Sheet]] = js.native
      
      var spreadsheetId: js.UndefOr[String] = js.native
      
      var spreadsheetUrl: js.UndefOr[String] = js.native
    }
    object Spreadsheet {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet]
      }
      
      @scala.inline
      implicit class SpreadsheetMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
        
        @scala.inline
        def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
        
        @scala.inline
        def setNamedRanges(value: js.Array[NamedRange]): Self = StObject.set(x, "namedRanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamedRangesUndefined: Self = StObject.set(x, "namedRanges", js.undefined)
        
        @scala.inline
        def setNamedRangesVarargs(value: NamedRange*): Self = StObject.set(x, "namedRanges", js.Array(value :_*))
        
        @scala.inline
        def setProperties(value: SpreadsheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        @scala.inline
        def setSheets(value: js.Array[Sheet]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
        
        @scala.inline
        def setSheetsVarargs(value: Sheet*): Self = StObject.set(x, "sheets", js.Array(value :_*))
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
        
        @scala.inline
        def setSpreadsheetUrl(value: String): Self = StObject.set(x, "spreadsheetUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetUrlUndefined: Self = StObject.set(x, "spreadsheetUrl", js.undefined)
      }
    }
    
    @js.native
    trait SpreadsheetProperties extends StObject {
      
      var autoRecalc: js.UndefOr[String] = js.native
      
      var defaultFormat: js.UndefOr[CellFormat] = js.native
      
      var iterativeCalculationSettings: js.UndefOr[IterativeCalculationSettings] = js.native
      
      var locale: js.UndefOr[String] = js.native
      
      var timeZone: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object SpreadsheetProperties {
      
      @scala.inline
      def apply(): SpreadsheetProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SpreadsheetProperties]
      }
      
      @scala.inline
      implicit class SpreadsheetPropertiesMutableBuilder[Self <: SpreadsheetProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoRecalc(value: String): Self = StObject.set(x, "autoRecalc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoRecalcUndefined: Self = StObject.set(x, "autoRecalc", js.undefined)
        
        @scala.inline
        def setDefaultFormat(value: CellFormat): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultFormatUndefined: Self = StObject.set(x, "defaultFormat", js.undefined)
        
        @scala.inline
        def setIterativeCalculationSettings(value: IterativeCalculationSettings): Self = StObject.set(x, "iterativeCalculationSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIterativeCalculationSettingsUndefined: Self = StObject.set(x, "iterativeCalculationSettings", js.undefined)
        
        @scala.inline
        def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        @scala.inline
        def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait TextFormat extends StObject {
      
      var bold: js.UndefOr[Boolean] = js.native
      
      var fontFamily: js.UndefOr[String] = js.native
      
      var fontSize: js.UndefOr[Double] = js.native
      
      var foregroundColor: js.UndefOr[Color] = js.native
      
      var italic: js.UndefOr[Boolean] = js.native
      
      var strikethrough: js.UndefOr[Boolean] = js.native
      
      var underline: js.UndefOr[Boolean] = js.native
    }
    object TextFormat {
      
      @scala.inline
      def apply(): TextFormat = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextFormat]
      }
      
      @scala.inline
      implicit class TextFormatMutableBuilder[Self <: TextFormat] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
        
        @scala.inline
        def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
        
        @scala.inline
        def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
        
        @scala.inline
        def setForegroundColor(value: Color): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
        
        @scala.inline
        def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
        
        @scala.inline
        def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
        
        @scala.inline
        def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
      }
    }
    
    @js.native
    trait TextFormatRun extends StObject {
      
      var format: js.UndefOr[TextFormat] = js.native
      
      var startIndex: js.UndefOr[Double] = js.native
    }
    object TextFormatRun {
      
      @scala.inline
      def apply(): TextFormatRun = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextFormatRun]
      }
      
      @scala.inline
      implicit class TextFormatRunMutableBuilder[Self <: TextFormatRun] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormat(value: TextFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        @scala.inline
        def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      }
    }
    
    @js.native
    trait TextPosition extends StObject {
      
      var horizontalAlignment: js.UndefOr[String] = js.native
    }
    object TextPosition {
      
      @scala.inline
      def apply(): TextPosition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextPosition]
      }
      
      @scala.inline
      implicit class TextPositionMutableBuilder[Self <: TextPosition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      }
    }
    
    @js.native
    trait TextRotation extends StObject {
      
      var angle: js.UndefOr[Double] = js.native
      
      var vertical: js.UndefOr[Boolean] = js.native
    }
    object TextRotation {
      
      @scala.inline
      def apply(): TextRotation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextRotation]
      }
      
      @scala.inline
      implicit class TextRotationMutableBuilder[Self <: TextRotation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
        
        @scala.inline
        def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      }
    }
    
    @js.native
    trait TextToColumnsRequest extends StObject {
      
      var delimiter: js.UndefOr[String] = js.native
      
      var delimiterType: js.UndefOr[String] = js.native
      
      var source: js.UndefOr[GridRange] = js.native
    }
    object TextToColumnsRequest {
      
      @scala.inline
      def apply(): TextToColumnsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextToColumnsRequest]
      }
      
      @scala.inline
      implicit class TextToColumnsRequestMutableBuilder[Self <: TextToColumnsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelimiterType(value: String): Self = StObject.set(x, "delimiterType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelimiterTypeUndefined: Self = StObject.set(x, "delimiterType", js.undefined)
        
        @scala.inline
        def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
        
        @scala.inline
        def setSource(value: GridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      }
    }
    
    @js.native
    trait TreemapChartColorScale extends StObject {
      
      var maxValueColor: js.UndefOr[Color] = js.native
      
      var midValueColor: js.UndefOr[Color] = js.native
      
      var minValueColor: js.UndefOr[Color] = js.native
      
      var noDataColor: js.UndefOr[Color] = js.native
    }
    object TreemapChartColorScale {
      
      @scala.inline
      def apply(): TreemapChartColorScale = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TreemapChartColorScale]
      }
      
      @scala.inline
      implicit class TreemapChartColorScaleMutableBuilder[Self <: TreemapChartColorScale] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMaxValueColor(value: Color): Self = StObject.set(x, "maxValueColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxValueColorUndefined: Self = StObject.set(x, "maxValueColor", js.undefined)
        
        @scala.inline
        def setMidValueColor(value: Color): Self = StObject.set(x, "midValueColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMidValueColorUndefined: Self = StObject.set(x, "midValueColor", js.undefined)
        
        @scala.inline
        def setMinValueColor(value: Color): Self = StObject.set(x, "minValueColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinValueColorUndefined: Self = StObject.set(x, "minValueColor", js.undefined)
        
        @scala.inline
        def setNoDataColor(value: Color): Self = StObject.set(x, "noDataColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoDataColorUndefined: Self = StObject.set(x, "noDataColor", js.undefined)
      }
    }
    
    @js.native
    trait TreemapChartSpec extends StObject {
      
      var colorData: js.UndefOr[ChartData] = js.native
      
      var colorScale: js.UndefOr[TreemapChartColorScale] = js.native
      
      var headerColor: js.UndefOr[Color] = js.native
      
      var hideTooltips: js.UndefOr[Boolean] = js.native
      
      var hintedLevels: js.UndefOr[Double] = js.native
      
      var labels: js.UndefOr[ChartData] = js.native
      
      var levels: js.UndefOr[Double] = js.native
      
      var maxValue: js.UndefOr[Double] = js.native
      
      var minValue: js.UndefOr[Double] = js.native
      
      var parentLabels: js.UndefOr[ChartData] = js.native
      
      var sizeData: js.UndefOr[ChartData] = js.native
      
      var textFormat: js.UndefOr[TextFormat] = js.native
    }
    object TreemapChartSpec {
      
      @scala.inline
      def apply(): TreemapChartSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TreemapChartSpec]
      }
      
      @scala.inline
      implicit class TreemapChartSpecMutableBuilder[Self <: TreemapChartSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColorData(value: ChartData): Self = StObject.set(x, "colorData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorDataUndefined: Self = StObject.set(x, "colorData", js.undefined)
        
        @scala.inline
        def setColorScale(value: TreemapChartColorScale): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
        
        @scala.inline
        def setHeaderColor(value: Color): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderColorUndefined: Self = StObject.set(x, "headerColor", js.undefined)
        
        @scala.inline
        def setHideTooltips(value: Boolean): Self = StObject.set(x, "hideTooltips", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideTooltipsUndefined: Self = StObject.set(x, "hideTooltips", js.undefined)
        
        @scala.inline
        def setHintedLevels(value: Double): Self = StObject.set(x, "hintedLevels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHintedLevelsUndefined: Self = StObject.set(x, "hintedLevels", js.undefined)
        
        @scala.inline
        def setLabels(value: ChartData): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        @scala.inline
        def setLevels(value: Double): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
        
        @scala.inline
        def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
        
        @scala.inline
        def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
        
        @scala.inline
        def setParentLabels(value: ChartData): Self = StObject.set(x, "parentLabels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentLabelsUndefined: Self = StObject.set(x, "parentLabels", js.undefined)
        
        @scala.inline
        def setSizeData(value: ChartData): Self = StObject.set(x, "sizeData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeDataUndefined: Self = StObject.set(x, "sizeData", js.undefined)
        
        @scala.inline
        def setTextFormat(value: TextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
      }
    }
    
    @js.native
    trait UnmergeCellsRequest extends StObject {
      
      var range: js.UndefOr[GridRange] = js.native
    }
    object UnmergeCellsRequest {
      
      @scala.inline
      def apply(): UnmergeCellsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UnmergeCellsRequest]
      }
      
      @scala.inline
      implicit class UnmergeCellsRequestMutableBuilder[Self <: UnmergeCellsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    @js.native
    trait UpdateBandingRequest extends StObject {
      
      var bandedRange: js.UndefOr[BandedRange] = js.native
      
      var fields: js.UndefOr[String] = js.native
    }
    object UpdateBandingRequest {
      
      @scala.inline
      def apply(): UpdateBandingRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateBandingRequest]
      }
      
      @scala.inline
      implicit class UpdateBandingRequestMutableBuilder[Self <: UpdateBandingRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBandedRange(value: BandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      }
    }
    
    @js.native
    trait UpdateBordersRequest extends StObject {
      
      var bottom: js.UndefOr[Border] = js.native
      
      var innerHorizontal: js.UndefOr[Border] = js.native
      
      var innerVertical: js.UndefOr[Border] = js.native
      
      var left: js.UndefOr[Border] = js.native
      
      var range: js.UndefOr[GridRange] = js.native
      
      var right: js.UndefOr[Border] = js.native
      
      var top: js.UndefOr[Border] = js.native
    }
    object UpdateBordersRequest {
      
      @scala.inline
      def apply(): UpdateBordersRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateBordersRequest]
      }
      
      @scala.inline
      implicit class UpdateBordersRequestMutableBuilder[Self <: UpdateBordersRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottom(value: Border): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
        
        @scala.inline
        def setInnerHorizontal(value: Border): Self = StObject.set(x, "innerHorizontal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInnerHorizontalUndefined: Self = StObject.set(x, "innerHorizontal", js.undefined)
        
        @scala.inline
        def setInnerVertical(value: Border): Self = StObject.set(x, "innerVertical", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInnerVerticalUndefined: Self = StObject.set(x, "innerVertical", js.undefined)
        
        @scala.inline
        def setLeft(value: Border): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setRight(value: Border): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        @scala.inline
        def setTop(value: Border): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      }
    }
    
    @js.native
    trait UpdateCellsRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var range: js.UndefOr[GridRange] = js.native
      
      var rows: js.UndefOr[js.Array[RowData]] = js.native
      
      var start: js.UndefOr[GridCoordinate] = js.native
    }
    object UpdateCellsRequest {
      
      @scala.inline
      def apply(): UpdateCellsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateCellsRequest]
      }
      
      @scala.inline
      implicit class UpdateCellsRequestMutableBuilder[Self <: UpdateCellsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setRows(value: js.Array[RowData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        @scala.inline
        def setRowsVarargs(value: RowData*): Self = StObject.set(x, "rows", js.Array(value :_*))
        
        @scala.inline
        def setStart(value: GridCoordinate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
    
    @js.native
    trait UpdateChartSpecRequest extends StObject {
      
      var chartId: js.UndefOr[Double] = js.native
      
      var spec: js.UndefOr[ChartSpec] = js.native
    }
    object UpdateChartSpecRequest {
      
      @scala.inline
      def apply(): UpdateChartSpecRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateChartSpecRequest]
      }
      
      @scala.inline
      implicit class UpdateChartSpecRequestMutableBuilder[Self <: UpdateChartSpecRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
        
        @scala.inline
        def setSpec(value: ChartSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      }
    }
    
    @js.native
    trait UpdateConditionalFormatRuleRequest extends StObject {
      
      var index: js.UndefOr[Double] = js.native
      
      var newIndex: js.UndefOr[Double] = js.native
      
      var rule: js.UndefOr[ConditionalFormatRule] = js.native
      
      var sheetId: js.UndefOr[Double] = js.native
    }
    object UpdateConditionalFormatRuleRequest {
      
      @scala.inline
      def apply(): UpdateConditionalFormatRuleRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateConditionalFormatRuleRequest]
      }
      
      @scala.inline
      implicit class UpdateConditionalFormatRuleRequestMutableBuilder[Self <: UpdateConditionalFormatRuleRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        @scala.inline
        def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
        
        @scala.inline
        def setRule(value: ConditionalFormatRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
        
        @scala.inline
        def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
      }
    }
    
    @js.native
    trait UpdateConditionalFormatRuleResponse extends StObject {
      
      var newIndex: js.UndefOr[Double] = js.native
      
      var newRule: js.UndefOr[ConditionalFormatRule] = js.native
      
      var oldIndex: js.UndefOr[Double] = js.native
      
      var oldRule: js.UndefOr[ConditionalFormatRule] = js.native
    }
    object UpdateConditionalFormatRuleResponse {
      
      @scala.inline
      def apply(): UpdateConditionalFormatRuleResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateConditionalFormatRuleResponse]
      }
      
      @scala.inline
      implicit class UpdateConditionalFormatRuleResponseMutableBuilder[Self <: UpdateConditionalFormatRuleResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
        
        @scala.inline
        def setNewRule(value: ConditionalFormatRule): Self = StObject.set(x, "newRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewRuleUndefined: Self = StObject.set(x, "newRule", js.undefined)
        
        @scala.inline
        def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOldIndexUndefined: Self = StObject.set(x, "oldIndex", js.undefined)
        
        @scala.inline
        def setOldRule(value: ConditionalFormatRule): Self = StObject.set(x, "oldRule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOldRuleUndefined: Self = StObject.set(x, "oldRule", js.undefined)
      }
    }
    
    @js.native
    trait UpdateDeveloperMetadataRequest extends StObject {
      
      var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
      
      var developerMetadata: js.UndefOr[DeveloperMetadata] = js.native
      
      var fields: js.UndefOr[String] = js.native
    }
    object UpdateDeveloperMetadataRequest {
      
      @scala.inline
      def apply(): UpdateDeveloperMetadataRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateDeveloperMetadataRequest]
      }
      
      @scala.inline
      implicit class UpdateDeveloperMetadataRequestMutableBuilder[Self <: UpdateDeveloperMetadataRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
        
        @scala.inline
        def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
        
        @scala.inline
        def setDeveloperMetadata(value: DeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      }
    }
    
    @js.native
    trait UpdateDeveloperMetadataResponse extends StObject {
      
      var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
    }
    object UpdateDeveloperMetadataResponse {
      
      @scala.inline
      def apply(): UpdateDeveloperMetadataResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateDeveloperMetadataResponse]
      }
      
      @scala.inline
      implicit class UpdateDeveloperMetadataResponseMutableBuilder[Self <: UpdateDeveloperMetadataResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
        
        @scala.inline
        def setDeveloperMetadataVarargs(value: DeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
      }
    }
    
    @js.native
    trait UpdateDimensionGroupRequest extends StObject {
      
      var dimensionGroup: js.UndefOr[DimensionGroup] = js.native
      
      var fields: js.UndefOr[String] = js.native
    }
    object UpdateDimensionGroupRequest {
      
      @scala.inline
      def apply(): UpdateDimensionGroupRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateDimensionGroupRequest]
      }
      
      @scala.inline
      implicit class UpdateDimensionGroupRequestMutableBuilder[Self <: UpdateDimensionGroupRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDimensionGroup(value: DimensionGroup): Self = StObject.set(x, "dimensionGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimensionGroupUndefined: Self = StObject.set(x, "dimensionGroup", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      }
    }
    
    @js.native
    trait UpdateDimensionPropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var properties: js.UndefOr[DimensionProperties] = js.native
      
      var range: js.UndefOr[DimensionRange] = js.native
    }
    object UpdateDimensionPropertiesRequest {
      
      @scala.inline
      def apply(): UpdateDimensionPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateDimensionPropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdateDimensionPropertiesRequestMutableBuilder[Self <: UpdateDimensionPropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setProperties(value: DimensionProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        @scala.inline
        def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    @js.native
    trait UpdateEmbeddedObjectPositionRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var newPosition: js.UndefOr[EmbeddedObjectPosition] = js.native
      
      var objectId: js.UndefOr[Double] = js.native
    }
    object UpdateEmbeddedObjectPositionRequest {
      
      @scala.inline
      def apply(): UpdateEmbeddedObjectPositionRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateEmbeddedObjectPositionRequest]
      }
      
      @scala.inline
      implicit class UpdateEmbeddedObjectPositionRequestMutableBuilder[Self <: UpdateEmbeddedObjectPositionRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setNewPosition(value: EmbeddedObjectPosition): Self = StObject.set(x, "newPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewPositionUndefined: Self = StObject.set(x, "newPosition", js.undefined)
        
        @scala.inline
        def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait UpdateEmbeddedObjectPositionResponse extends StObject {
      
      var position: js.UndefOr[EmbeddedObjectPosition] = js.native
    }
    object UpdateEmbeddedObjectPositionResponse {
      
      @scala.inline
      def apply(): UpdateEmbeddedObjectPositionResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateEmbeddedObjectPositionResponse]
      }
      
      @scala.inline
      implicit class UpdateEmbeddedObjectPositionResponseMutableBuilder[Self <: UpdateEmbeddedObjectPositionResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPosition(value: EmbeddedObjectPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
    
    @js.native
    trait UpdateFilterViewRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var filter: js.UndefOr[FilterView] = js.native
    }
    object UpdateFilterViewRequest {
      
      @scala.inline
      def apply(): UpdateFilterViewRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateFilterViewRequest]
      }
      
      @scala.inline
      implicit class UpdateFilterViewRequestMutableBuilder[Self <: UpdateFilterViewRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setFilter(value: FilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      }
    }
    
    @js.native
    trait UpdateNamedRangeRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var namedRange: js.UndefOr[NamedRange] = js.native
    }
    object UpdateNamedRangeRequest {
      
      @scala.inline
      def apply(): UpdateNamedRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateNamedRangeRequest]
      }
      
      @scala.inline
      implicit class UpdateNamedRangeRequestMutableBuilder[Self <: UpdateNamedRangeRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setNamedRange(value: NamedRange): Self = StObject.set(x, "namedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamedRangeUndefined: Self = StObject.set(x, "namedRange", js.undefined)
      }
    }
    
    @js.native
    trait UpdateProtectedRangeRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var protectedRange: js.UndefOr[ProtectedRange] = js.native
    }
    object UpdateProtectedRangeRequest {
      
      @scala.inline
      def apply(): UpdateProtectedRangeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateProtectedRangeRequest]
      }
      
      @scala.inline
      implicit class UpdateProtectedRangeRequestMutableBuilder[Self <: UpdateProtectedRangeRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setProtectedRange(value: ProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
      }
    }
    
    @js.native
    trait UpdateSheetPropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var properties: js.UndefOr[SheetProperties] = js.native
    }
    object UpdateSheetPropertiesRequest {
      
      @scala.inline
      def apply(): UpdateSheetPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateSheetPropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdateSheetPropertiesRequestMutableBuilder[Self <: UpdateSheetPropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setProperties(value: SheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      }
    }
    
    @js.native
    trait UpdateSpreadsheetPropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var properties: js.UndefOr[SpreadsheetProperties] = js.native
    }
    object UpdateSpreadsheetPropertiesRequest {
      
      @scala.inline
      def apply(): UpdateSpreadsheetPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateSpreadsheetPropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdateSpreadsheetPropertiesRequestMutableBuilder[Self <: UpdateSpreadsheetPropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setProperties(value: SpreadsheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      }
    }
    
    @js.native
    trait UpdateValuesByDataFilterResponse extends StObject {
      
      var dataFilter: js.UndefOr[DataFilter] = js.native
      
      var updatedCells: js.UndefOr[Double] = js.native
      
      var updatedColumns: js.UndefOr[Double] = js.native
      
      var updatedData: js.UndefOr[ValueRange] = js.native
      
      var updatedRange: js.UndefOr[String] = js.native
      
      var updatedRows: js.UndefOr[Double] = js.native
    }
    object UpdateValuesByDataFilterResponse {
      
      @scala.inline
      def apply(): UpdateValuesByDataFilterResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateValuesByDataFilterResponse]
      }
      
      @scala.inline
      implicit class UpdateValuesByDataFilterResponseMutableBuilder[Self <: UpdateValuesByDataFilterResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataFilter(value: DataFilter): Self = StObject.set(x, "dataFilter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataFilterUndefined: Self = StObject.set(x, "dataFilter", js.undefined)
        
        @scala.inline
        def setUpdatedCells(value: Double): Self = StObject.set(x, "updatedCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedCellsUndefined: Self = StObject.set(x, "updatedCells", js.undefined)
        
        @scala.inline
        def setUpdatedColumns(value: Double): Self = StObject.set(x, "updatedColumns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedColumnsUndefined: Self = StObject.set(x, "updatedColumns", js.undefined)
        
        @scala.inline
        def setUpdatedData(value: ValueRange): Self = StObject.set(x, "updatedData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedDataUndefined: Self = StObject.set(x, "updatedData", js.undefined)
        
        @scala.inline
        def setUpdatedRange(value: String): Self = StObject.set(x, "updatedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedRangeUndefined: Self = StObject.set(x, "updatedRange", js.undefined)
        
        @scala.inline
        def setUpdatedRows(value: Double): Self = StObject.set(x, "updatedRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedRowsUndefined: Self = StObject.set(x, "updatedRows", js.undefined)
      }
    }
    
    @js.native
    trait UpdateValuesResponse extends StObject {
      
      var spreadsheetId: js.UndefOr[String] = js.native
      
      var updatedCells: js.UndefOr[Double] = js.native
      
      var updatedColumns: js.UndefOr[Double] = js.native
      
      var updatedData: js.UndefOr[ValueRange] = js.native
      
      var updatedRange: js.UndefOr[String] = js.native
      
      var updatedRows: js.UndefOr[Double] = js.native
    }
    object UpdateValuesResponse {
      
      @scala.inline
      def apply(): UpdateValuesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateValuesResponse]
      }
      
      @scala.inline
      implicit class UpdateValuesResponseMutableBuilder[Self <: UpdateValuesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
        
        @scala.inline
        def setUpdatedCells(value: Double): Self = StObject.set(x, "updatedCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedCellsUndefined: Self = StObject.set(x, "updatedCells", js.undefined)
        
        @scala.inline
        def setUpdatedColumns(value: Double): Self = StObject.set(x, "updatedColumns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedColumnsUndefined: Self = StObject.set(x, "updatedColumns", js.undefined)
        
        @scala.inline
        def setUpdatedData(value: ValueRange): Self = StObject.set(x, "updatedData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedDataUndefined: Self = StObject.set(x, "updatedData", js.undefined)
        
        @scala.inline
        def setUpdatedRange(value: String): Self = StObject.set(x, "updatedRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedRangeUndefined: Self = StObject.set(x, "updatedRange", js.undefined)
        
        @scala.inline
        def setUpdatedRows(value: Double): Self = StObject.set(x, "updatedRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedRowsUndefined: Self = StObject.set(x, "updatedRows", js.undefined)
      }
    }
    
    @js.native
    trait ValueRange extends StObject {
      
      var majorDimension: js.UndefOr[String] = js.native
      
      var range: js.UndefOr[String] = js.native
      
      var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
    }
    object ValueRange {
      
      @scala.inline
      def apply(): ValueRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ValueRange]
      }
      
      @scala.inline
      implicit class ValueRangeMutableBuilder[Self <: ValueRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMajorDimension(value: String): Self = StObject.set(x, "majorDimension", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMajorDimensionUndefined: Self = StObject.set(x, "majorDimension", js.undefined)
        
        @scala.inline
        def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        @scala.inline
        def setValues(value: js.Array[js.Array[_]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
        
        @scala.inline
        def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
    
    @js.native
    trait WaterfallChartColumnStyle extends StObject {
      
      var color: js.UndefOr[Color] = js.native
      
      var label: js.UndefOr[String] = js.native
    }
    object WaterfallChartColumnStyle {
      
      @scala.inline
      def apply(): WaterfallChartColumnStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WaterfallChartColumnStyle]
      }
      
      @scala.inline
      implicit class WaterfallChartColumnStyleMutableBuilder[Self <: WaterfallChartColumnStyle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      }
    }
    
    @js.native
    trait WaterfallChartCustomSubtotal extends StObject {
      
      var dataIsSubtotal: js.UndefOr[Boolean] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var subtotalIndex: js.UndefOr[Double] = js.native
    }
    object WaterfallChartCustomSubtotal {
      
      @scala.inline
      def apply(): WaterfallChartCustomSubtotal = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WaterfallChartCustomSubtotal]
      }
      
      @scala.inline
      implicit class WaterfallChartCustomSubtotalMutableBuilder[Self <: WaterfallChartCustomSubtotal] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataIsSubtotal(value: Boolean): Self = StObject.set(x, "dataIsSubtotal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataIsSubtotalUndefined: Self = StObject.set(x, "dataIsSubtotal", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setSubtotalIndex(value: Double): Self = StObject.set(x, "subtotalIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtotalIndexUndefined: Self = StObject.set(x, "subtotalIndex", js.undefined)
      }
    }
    
    @js.native
    trait WaterfallChartDomain extends StObject {
      
      var data: js.UndefOr[ChartData] = js.native
      
      var reversed: js.UndefOr[Boolean] = js.native
    }
    object WaterfallChartDomain {
      
      @scala.inline
      def apply(): WaterfallChartDomain = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WaterfallChartDomain]
      }
      
      @scala.inline
      implicit class WaterfallChartDomainMutableBuilder[Self <: WaterfallChartDomain] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      }
    }
    
    @js.native
    trait WaterfallChartSeries extends StObject {
      
      var customSubtotals: js.UndefOr[js.Array[WaterfallChartCustomSubtotal]] = js.native
      
      var data: js.UndefOr[ChartData] = js.native
      
      var hideTrailingSubtotal: js.UndefOr[Boolean] = js.native
      
      var negativeColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
      
      var positiveColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
      
      var subtotalColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
    }
    object WaterfallChartSeries {
      
      @scala.inline
      def apply(): WaterfallChartSeries = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WaterfallChartSeries]
      }
      
      @scala.inline
      implicit class WaterfallChartSeriesMutableBuilder[Self <: WaterfallChartSeries] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCustomSubtotals(value: js.Array[WaterfallChartCustomSubtotal]): Self = StObject.set(x, "customSubtotals", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomSubtotalsUndefined: Self = StObject.set(x, "customSubtotals", js.undefined)
        
        @scala.inline
        def setCustomSubtotalsVarargs(value: WaterfallChartCustomSubtotal*): Self = StObject.set(x, "customSubtotals", js.Array(value :_*))
        
        @scala.inline
        def setData(value: ChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setHideTrailingSubtotal(value: Boolean): Self = StObject.set(x, "hideTrailingSubtotal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideTrailingSubtotalUndefined: Self = StObject.set(x, "hideTrailingSubtotal", js.undefined)
        
        @scala.inline
        def setNegativeColumnsStyle(value: WaterfallChartColumnStyle): Self = StObject.set(x, "negativeColumnsStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNegativeColumnsStyleUndefined: Self = StObject.set(x, "negativeColumnsStyle", js.undefined)
        
        @scala.inline
        def setPositiveColumnsStyle(value: WaterfallChartColumnStyle): Self = StObject.set(x, "positiveColumnsStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositiveColumnsStyleUndefined: Self = StObject.set(x, "positiveColumnsStyle", js.undefined)
        
        @scala.inline
        def setSubtotalColumnsStyle(value: WaterfallChartColumnStyle): Self = StObject.set(x, "subtotalColumnsStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtotalColumnsStyleUndefined: Self = StObject.set(x, "subtotalColumnsStyle", js.undefined)
      }
    }
    
    @js.native
    trait WaterfallChartSpec extends StObject {
      
      var connectorLineStyle: js.UndefOr[LineStyle] = js.native
      
      var domain: js.UndefOr[WaterfallChartDomain] = js.native
      
      var firstValueIsTotal: js.UndefOr[Boolean] = js.native
      
      var hideConnectorLines: js.UndefOr[Boolean] = js.native
      
      var series: js.UndefOr[js.Array[WaterfallChartSeries]] = js.native
      
      var stackedType: js.UndefOr[String] = js.native
    }
    object WaterfallChartSpec {
      
      @scala.inline
      def apply(): WaterfallChartSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WaterfallChartSpec]
      }
      
      @scala.inline
      implicit class WaterfallChartSpecMutableBuilder[Self <: WaterfallChartSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnectorLineStyle(value: LineStyle): Self = StObject.set(x, "connectorLineStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectorLineStyleUndefined: Self = StObject.set(x, "connectorLineStyle", js.undefined)
        
        @scala.inline
        def setDomain(value: WaterfallChartDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setFirstValueIsTotal(value: Boolean): Self = StObject.set(x, "firstValueIsTotal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirstValueIsTotalUndefined: Self = StObject.set(x, "firstValueIsTotal", js.undefined)
        
        @scala.inline
        def setHideConnectorLines(value: Boolean): Self = StObject.set(x, "hideConnectorLines", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideConnectorLinesUndefined: Self = StObject.set(x, "hideConnectorLines", js.undefined)
        
        @scala.inline
        def setSeries(value: js.Array[WaterfallChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
        
        @scala.inline
        def setSeriesVarargs(value: WaterfallChartSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
        
        @scala.inline
        def setStackedType(value: String): Self = StObject.set(x, "stackedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStackedTypeUndefined: Self = StObject.set(x, "stackedType", js.undefined)
      }
    }
  }
  
  @scala.inline
  implicit class SheetsMutableBuilder[Self <: Sheets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewAddBandingRequest(value: () => AddBandingRequest): Self = StObject.set(x, "newAddBandingRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAddChartRequest(value: () => AddChartRequest): Self = StObject.set(x, "newAddChartRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAddConditionalFormatRuleRequest(value: () => AddConditionalFormatRuleRequest): Self = StObject.set(x, "newAddConditionalFormatRuleRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAddDimensionGroupRequest(value: () => AddDimensionGroupRequest): Self = StObject.set(x, "newAddDimensionGroupRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAddFilterViewRequest(value: () => AddFilterViewRequest): Self = StObject.set(x, "newAddFilterViewRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAddNamedRangeRequest(value: () => AddNamedRangeRequest): Self = StObject.set(x, "newAddNamedRangeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAddProtectedRangeRequest(value: () => AddProtectedRangeRequest): Self = StObject.set(x, "newAddProtectedRangeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAddSheetRequest(value: () => AddSheetRequest): Self = StObject.set(x, "newAddSheetRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAppendCellsRequest(value: () => AppendCellsRequest): Self = StObject.set(x, "newAppendCellsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAppendDimensionRequest(value: () => AppendDimensionRequest): Self = StObject.set(x, "newAppendDimensionRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAutoFillRequest(value: () => AutoFillRequest): Self = StObject.set(x, "newAutoFillRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAutoResizeDimensionsRequest(value: () => AutoResizeDimensionsRequest): Self = StObject.set(x, "newAutoResizeDimensionsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBandedRange(value: () => BandedRange): Self = StObject.set(x, "newBandedRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBandingProperties(value: () => BandingProperties): Self = StObject.set(x, "newBandingProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBasicChartAxis(value: () => BasicChartAxis): Self = StObject.set(x, "newBasicChartAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBasicChartDomain(value: () => BasicChartDomain): Self = StObject.set(x, "newBasicChartDomain", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBasicChartSeries(value: () => BasicChartSeries): Self = StObject.set(x, "newBasicChartSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBasicChartSpec(value: () => BasicChartSpec): Self = StObject.set(x, "newBasicChartSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBasicFilter(value: () => BasicFilter): Self = StObject.set(x, "newBasicFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBatchClearValuesByDataFilterRequest(value: () => BatchClearValuesByDataFilterRequest): Self = StObject.set(x, "newBatchClearValuesByDataFilterRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBatchClearValuesRequest(value: () => BatchClearValuesRequest): Self = StObject.set(x, "newBatchClearValuesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBatchGetValuesByDataFilterRequest(value: () => BatchGetValuesByDataFilterRequest): Self = StObject.set(x, "newBatchGetValuesByDataFilterRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBatchUpdateSpreadsheetRequest(value: () => BatchUpdateSpreadsheetRequest): Self = StObject.set(x, "newBatchUpdateSpreadsheetRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBatchUpdateValuesByDataFilterRequest(value: () => BatchUpdateValuesByDataFilterRequest): Self = StObject.set(x, "newBatchUpdateValuesByDataFilterRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBatchUpdateValuesRequest(value: () => BatchUpdateValuesRequest): Self = StObject.set(x, "newBatchUpdateValuesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBooleanCondition(value: () => BooleanCondition): Self = StObject.set(x, "newBooleanCondition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBooleanRule(value: () => BooleanRule): Self = StObject.set(x, "newBooleanRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBorder(value: () => Border): Self = StObject.set(x, "newBorder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBorders(value: () => Borders): Self = StObject.set(x, "newBorders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBubbleChartSpec(value: () => BubbleChartSpec): Self = StObject.set(x, "newBubbleChartSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCandlestickChartSpec(value: () => CandlestickChartSpec): Self = StObject.set(x, "newCandlestickChartSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCandlestickData(value: () => CandlestickData): Self = StObject.set(x, "newCandlestickData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCandlestickDomain(value: () => CandlestickDomain): Self = StObject.set(x, "newCandlestickDomain", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCandlestickSeries(value: () => CandlestickSeries): Self = StObject.set(x, "newCandlestickSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCellData(value: () => CellData): Self = StObject.set(x, "newCellData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCellFormat(value: () => CellFormat): Self = StObject.set(x, "newCellFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewChartData(value: () => ChartData): Self = StObject.set(x, "newChartData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewChartSourceRange(value: () => ChartSourceRange): Self = StObject.set(x, "newChartSourceRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewChartSpec(value: () => ChartSpec): Self = StObject.set(x, "newChartSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewClearBasicFilterRequest(value: () => ClearBasicFilterRequest): Self = StObject.set(x, "newClearBasicFilterRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewClearValuesRequest(value: () => js.Any): Self = StObject.set(x, "newClearValuesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewColor(value: () => Color): Self = StObject.set(x, "newColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConditionValue(value: () => ConditionValue): Self = StObject.set(x, "newConditionValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConditionalFormatRule(value: () => ConditionalFormatRule): Self = StObject.set(x, "newConditionalFormatRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCopyPasteRequest(value: () => CopyPasteRequest): Self = StObject.set(x, "newCopyPasteRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCopySheetToAnotherSpreadsheetRequest(value: () => CopySheetToAnotherSpreadsheetRequest): Self = StObject.set(x, "newCopySheetToAnotherSpreadsheetRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateDeveloperMetadataRequest(value: () => CreateDeveloperMetadataRequest): Self = StObject.set(x, "newCreateDeveloperMetadataRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCutPasteRequest(value: () => CutPasteRequest): Self = StObject.set(x, "newCutPasteRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDataFilter(value: () => DataFilter): Self = StObject.set(x, "newDataFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDataFilterValueRange(value: () => DataFilterValueRange): Self = StObject.set(x, "newDataFilterValueRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDataValidationRule(value: () => DataValidationRule): Self = StObject.set(x, "newDataValidationRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDateTimeRule(value: () => DateTimeRule): Self = StObject.set(x, "newDateTimeRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteBandingRequest(value: () => DeleteBandingRequest): Self = StObject.set(x, "newDeleteBandingRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteConditionalFormatRuleRequest(value: () => DeleteConditionalFormatRuleRequest): Self = StObject.set(x, "newDeleteConditionalFormatRuleRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteDeveloperMetadataRequest(value: () => DeleteDeveloperMetadataRequest): Self = StObject.set(x, "newDeleteDeveloperMetadataRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteDimensionGroupRequest(value: () => DeleteDimensionGroupRequest): Self = StObject.set(x, "newDeleteDimensionGroupRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteDimensionRequest(value: () => DeleteDimensionRequest): Self = StObject.set(x, "newDeleteDimensionRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteEmbeddedObjectRequest(value: () => DeleteEmbeddedObjectRequest): Self = StObject.set(x, "newDeleteEmbeddedObjectRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteFilterViewRequest(value: () => DeleteFilterViewRequest): Self = StObject.set(x, "newDeleteFilterViewRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteNamedRangeRequest(value: () => DeleteNamedRangeRequest): Self = StObject.set(x, "newDeleteNamedRangeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteProtectedRangeRequest(value: () => DeleteProtectedRangeRequest): Self = StObject.set(x, "newDeleteProtectedRangeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteRangeRequest(value: () => DeleteRangeRequest): Self = StObject.set(x, "newDeleteRangeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteSheetRequest(value: () => DeleteSheetRequest): Self = StObject.set(x, "newDeleteSheetRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeveloperMetadata(value: () => DeveloperMetadata): Self = StObject.set(x, "newDeveloperMetadata", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeveloperMetadataLocation(value: () => DeveloperMetadataLocation): Self = StObject.set(x, "newDeveloperMetadataLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeveloperMetadataLookup(value: () => DeveloperMetadataLookup): Self = StObject.set(x, "newDeveloperMetadataLookup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDimensionGroup(value: () => DimensionGroup): Self = StObject.set(x, "newDimensionGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDimensionProperties(value: () => DimensionProperties): Self = StObject.set(x, "newDimensionProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDimensionRange(value: () => DimensionRange): Self = StObject.set(x, "newDimensionRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDuplicateFilterViewRequest(value: () => DuplicateFilterViewRequest): Self = StObject.set(x, "newDuplicateFilterViewRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDuplicateSheetRequest(value: () => DuplicateSheetRequest): Self = StObject.set(x, "newDuplicateSheetRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEditors(value: () => Editors): Self = StObject.set(x, "newEditors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEmbeddedChart(value: () => EmbeddedChart): Self = StObject.set(x, "newEmbeddedChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEmbeddedObjectPosition(value: () => EmbeddedObjectPosition): Self = StObject.set(x, "newEmbeddedObjectPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewErrorValue(value: () => ErrorValue): Self = StObject.set(x, "newErrorValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewExtendedValue(value: () => ExtendedValue): Self = StObject.set(x, "newExtendedValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFilterView(value: () => FilterView): Self = StObject.set(x, "newFilterView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFindReplaceRequest(value: () => FindReplaceRequest): Self = StObject.set(x, "newFindReplaceRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGetSpreadsheetByDataFilterRequest(value: () => GetSpreadsheetByDataFilterRequest): Self = StObject.set(x, "newGetSpreadsheetByDataFilterRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGradientRule(value: () => GradientRule): Self = StObject.set(x, "newGradientRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGridCoordinate(value: () => GridCoordinate): Self = StObject.set(x, "newGridCoordinate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGridData(value: () => GridData): Self = StObject.set(x, "newGridData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGridProperties(value: () => GridProperties): Self = StObject.set(x, "newGridProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGridRange(value: () => GridRange): Self = StObject.set(x, "newGridRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewHistogramChartSpec(value: () => HistogramChartSpec): Self = StObject.set(x, "newHistogramChartSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewHistogramRule(value: () => HistogramRule): Self = StObject.set(x, "newHistogramRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewHistogramSeries(value: () => HistogramSeries): Self = StObject.set(x, "newHistogramSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewInsertDimensionRequest(value: () => InsertDimensionRequest): Self = StObject.set(x, "newInsertDimensionRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewInsertRangeRequest(value: () => InsertRangeRequest): Self = StObject.set(x, "newInsertRangeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewInterpolationPoint(value: () => InterpolationPoint): Self = StObject.set(x, "newInterpolationPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewIterativeCalculationSettings(value: () => IterativeCalculationSettings): Self = StObject.set(x, "newIterativeCalculationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLineStyle(value: () => LineStyle): Self = StObject.set(x, "newLineStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewManualRule(value: () => ManualRule): Self = StObject.set(x, "newManualRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewManualRuleGroup(value: () => ManualRuleGroup): Self = StObject.set(x, "newManualRuleGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMergeCellsRequest(value: () => MergeCellsRequest): Self = StObject.set(x, "newMergeCellsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMoveDimensionRequest(value: () => MoveDimensionRequest): Self = StObject.set(x, "newMoveDimensionRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewNamedRange(value: () => NamedRange): Self = StObject.set(x, "newNamedRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewNumberFormat(value: () => NumberFormat): Self = StObject.set(x, "newNumberFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOrgChartSpec(value: () => OrgChartSpec): Self = StObject.set(x, "newOrgChartSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOverlayPosition(value: () => OverlayPosition): Self = StObject.set(x, "newOverlayPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPadding(value: () => Padding): Self = StObject.set(x, "newPadding", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPasteDataRequest(value: () => PasteDataRequest): Self = StObject.set(x, "newPasteDataRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPieChartSpec(value: () => PieChartSpec): Self = StObject.set(x, "newPieChartSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPivotGroup(value: () => PivotGroup): Self = StObject.set(x, "newPivotGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPivotGroupRule(value: () => PivotGroupRule): Self = StObject.set(x, "newPivotGroupRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPivotGroupSortValueBucket(value: () => PivotGroupSortValueBucket): Self = StObject.set(x, "newPivotGroupSortValueBucket", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPivotGroupValueMetadata(value: () => PivotGroupValueMetadata): Self = StObject.set(x, "newPivotGroupValueMetadata", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPivotTable(value: () => PivotTable): Self = StObject.set(x, "newPivotTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPivotValue(value: () => PivotValue): Self = StObject.set(x, "newPivotValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewProtectedRange(value: () => ProtectedRange): Self = StObject.set(x, "newProtectedRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRandomizeRangeRequest(value: () => RandomizeRangeRequest): Self = StObject.set(x, "newRandomizeRangeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRepeatCellRequest(value: () => RepeatCellRequest): Self = StObject.set(x, "newRepeatCellRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRequest(value: () => Request): Self = StObject.set(x, "newRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRowData(value: () => RowData): Self = StObject.set(x, "newRowData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSearchDeveloperMetadataRequest(value: () => SearchDeveloperMetadataRequest): Self = StObject.set(x, "newSearchDeveloperMetadataRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSetBasicFilterRequest(value: () => SetBasicFilterRequest): Self = StObject.set(x, "newSetBasicFilterRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSetDataValidationRequest(value: () => SetDataValidationRequest): Self = StObject.set(x, "newSetDataValidationRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSheet(value: () => Sheet): Self = StObject.set(x, "newSheet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSheetProperties(value: () => SheetProperties): Self = StObject.set(x, "newSheetProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSortRangeRequest(value: () => SortRangeRequest): Self = StObject.set(x, "newSortRangeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSortSpec(value: () => SortSpec): Self = StObject.set(x, "newSortSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSourceAndDestination(value: () => SourceAndDestination): Self = StObject.set(x, "newSourceAndDestination", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSpreadsheet(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema.Spreadsheet): Self = StObject.set(x, "newSpreadsheet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSpreadsheetProperties(value: () => SpreadsheetProperties): Self = StObject.set(x, "newSpreadsheetProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextFormat(value: () => TextFormat): Self = StObject.set(x, "newTextFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextFormatRun(value: () => TextFormatRun): Self = StObject.set(x, "newTextFormatRun", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextPosition(value: () => TextPosition): Self = StObject.set(x, "newTextPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextRotation(value: () => TextRotation): Self = StObject.set(x, "newTextRotation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextToColumnsRequest(value: () => TextToColumnsRequest): Self = StObject.set(x, "newTextToColumnsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTreemapChartColorScale(value: () => TreemapChartColorScale): Self = StObject.set(x, "newTreemapChartColorScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTreemapChartSpec(value: () => TreemapChartSpec): Self = StObject.set(x, "newTreemapChartSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUnmergeCellsRequest(value: () => UnmergeCellsRequest): Self = StObject.set(x, "newUnmergeCellsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateBandingRequest(value: () => UpdateBandingRequest): Self = StObject.set(x, "newUpdateBandingRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateBordersRequest(value: () => UpdateBordersRequest): Self = StObject.set(x, "newUpdateBordersRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateCellsRequest(value: () => UpdateCellsRequest): Self = StObject.set(x, "newUpdateCellsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateChartSpecRequest(value: () => UpdateChartSpecRequest): Self = StObject.set(x, "newUpdateChartSpecRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateConditionalFormatRuleRequest(value: () => UpdateConditionalFormatRuleRequest): Self = StObject.set(x, "newUpdateConditionalFormatRuleRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateDeveloperMetadataRequest(value: () => UpdateDeveloperMetadataRequest): Self = StObject.set(x, "newUpdateDeveloperMetadataRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateDimensionGroupRequest(value: () => UpdateDimensionGroupRequest): Self = StObject.set(x, "newUpdateDimensionGroupRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateDimensionPropertiesRequest(value: () => UpdateDimensionPropertiesRequest): Self = StObject.set(x, "newUpdateDimensionPropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateEmbeddedObjectPositionRequest(value: () => UpdateEmbeddedObjectPositionRequest): Self = StObject.set(x, "newUpdateEmbeddedObjectPositionRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateFilterViewRequest(value: () => UpdateFilterViewRequest): Self = StObject.set(x, "newUpdateFilterViewRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateNamedRangeRequest(value: () => UpdateNamedRangeRequest): Self = StObject.set(x, "newUpdateNamedRangeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateProtectedRangeRequest(value: () => UpdateProtectedRangeRequest): Self = StObject.set(x, "newUpdateProtectedRangeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateSheetPropertiesRequest(value: () => UpdateSheetPropertiesRequest): Self = StObject.set(x, "newUpdateSheetPropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateSpreadsheetPropertiesRequest(value: () => UpdateSpreadsheetPropertiesRequest): Self = StObject.set(x, "newUpdateSpreadsheetPropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewValueRange(value: () => ValueRange): Self = StObject.set(x, "newValueRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWaterfallChartColumnStyle(value: () => WaterfallChartColumnStyle): Self = StObject.set(x, "newWaterfallChartColumnStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWaterfallChartCustomSubtotal(value: () => WaterfallChartCustomSubtotal): Self = StObject.set(x, "newWaterfallChartCustomSubtotal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWaterfallChartDomain(value: () => WaterfallChartDomain): Self = StObject.set(x, "newWaterfallChartDomain", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWaterfallChartSeries(value: () => WaterfallChartSeries): Self = StObject.set(x, "newWaterfallChartSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWaterfallChartSpec(value: () => WaterfallChartSpec): Self = StObject.set(x, "newWaterfallChartSpec", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSpreadsheets(value: SpreadsheetsCollection): Self = StObject.set(x, "Spreadsheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetsUndefined: Self = StObject.set(x, "Spreadsheets", js.undefined)
  }
}
