package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Collection.PresentationsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.BatchUpdatePresentationRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Bullet
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorStop
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateImageRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateLineRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateParagraphBulletsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateShapeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateSheetsChartRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateSlideRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateTableRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.CreateVideoRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.CropProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.DeleteObjectRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.DeleteParagraphBulletsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.DeleteTableColumnRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.DeleteTableRowRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.DeleteTextRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Dimension
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.DuplicateObjectRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Group
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.GroupObjectsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Image
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ImageProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.InsertTableColumnsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.InsertTableRowsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.InsertTextRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LayoutPlaceholderIdMapping
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LayoutProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LayoutReference
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Line
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LineConnection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LineProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.MasterProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.MergeTableCellsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.NotesProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.OpaqueColor
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.OptionalColor
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Outline
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.OutlineFill
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageBackgroundFill
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElementProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphMarker
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Placeholder
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Range
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Recolor
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.RefreshSheetsChartRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ReplaceAllShapesWithImageRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ReplaceAllShapesWithSheetsChartRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ReplaceAllTextRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ReplaceImageRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Request
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.RerouteLineRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.RgbColor
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Shadow
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ShapeBackgroundFill
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ShapeProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChartProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Size
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SlideProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.StretchedPictureFill
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SubstringMatchCriteria
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Table
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableBorderCell
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableBorderFill
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableBorderProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableBorderRow
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCellBackgroundFill
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCellLocation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCellProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableColumnProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRowProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextContent
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextElement
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextRun
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ThemeColorPair
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UngroupObjectsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UnmergeTableCellsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateImagePropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateLineCategoryRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateLinePropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdatePageElementAltTextRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdatePageElementTransformRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdatePageElementsZOrderRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdatePagePropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateParagraphStyleRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateShapePropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateSlidesPositionRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateTableBorderPropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateTableCellPropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateTableColumnPropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateTableRowPropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateTextStyleRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.UpdateVideoPropertiesRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Video
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.VideoProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.WeightedFontFamily
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.WriteControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slides_ extends js.Object {
  var Presentations: js.UndefOr[PresentationsCollection] = js.native
  // Create a new instance of AffineTransform
  def newAffineTransform(): AffineTransform = js.native
  // Create a new instance of AutoText
  def newAutoText(): AutoText = js.native
  // Create a new instance of BatchUpdatePresentationRequest
  def newBatchUpdatePresentationRequest(): BatchUpdatePresentationRequest = js.native
  // Create a new instance of Bullet
  def newBullet(): Bullet = js.native
  // Create a new instance of ColorScheme
  def newColorScheme(): ColorScheme = js.native
  // Create a new instance of ColorStop
  def newColorStop(): ColorStop = js.native
  // Create a new instance of CreateImageRequest
  def newCreateImageRequest(): CreateImageRequest = js.native
  // Create a new instance of CreateLineRequest
  def newCreateLineRequest(): CreateLineRequest = js.native
  // Create a new instance of CreateParagraphBulletsRequest
  def newCreateParagraphBulletsRequest(): CreateParagraphBulletsRequest = js.native
  // Create a new instance of CreateShapeRequest
  def newCreateShapeRequest(): CreateShapeRequest = js.native
  // Create a new instance of CreateSheetsChartRequest
  def newCreateSheetsChartRequest(): CreateSheetsChartRequest = js.native
  // Create a new instance of CreateSlideRequest
  def newCreateSlideRequest(): CreateSlideRequest = js.native
  // Create a new instance of CreateTableRequest
  def newCreateTableRequest(): CreateTableRequest = js.native
  // Create a new instance of CreateVideoRequest
  def newCreateVideoRequest(): CreateVideoRequest = js.native
  // Create a new instance of CropProperties
  def newCropProperties(): CropProperties = js.native
  // Create a new instance of DeleteObjectRequest
  def newDeleteObjectRequest(): DeleteObjectRequest = js.native
  // Create a new instance of DeleteParagraphBulletsRequest
  def newDeleteParagraphBulletsRequest(): DeleteParagraphBulletsRequest = js.native
  // Create a new instance of DeleteTableColumnRequest
  def newDeleteTableColumnRequest(): DeleteTableColumnRequest = js.native
  // Create a new instance of DeleteTableRowRequest
  def newDeleteTableRowRequest(): DeleteTableRowRequest = js.native
  // Create a new instance of DeleteTextRequest
  def newDeleteTextRequest(): DeleteTextRequest = js.native
  // Create a new instance of Dimension
  def newDimension(): Dimension = js.native
  // Create a new instance of DuplicateObjectRequest
  def newDuplicateObjectRequest(): DuplicateObjectRequest = js.native
  // Create a new instance of Group
  def newGroup(): Group = js.native
  // Create a new instance of GroupObjectsRequest
  def newGroupObjectsRequest(): GroupObjectsRequest = js.native
  // Create a new instance of Image
  def newImage(): Image = js.native
  // Create a new instance of ImageProperties
  def newImageProperties(): ImageProperties = js.native
  // Create a new instance of InsertTableColumnsRequest
  def newInsertTableColumnsRequest(): InsertTableColumnsRequest = js.native
  // Create a new instance of InsertTableRowsRequest
  def newInsertTableRowsRequest(): InsertTableRowsRequest = js.native
  // Create a new instance of InsertTextRequest
  def newInsertTextRequest(): InsertTextRequest = js.native
  // Create a new instance of LayoutPlaceholderIdMapping
  def newLayoutPlaceholderIdMapping(): LayoutPlaceholderIdMapping = js.native
  // Create a new instance of LayoutProperties
  def newLayoutProperties(): LayoutProperties = js.native
  // Create a new instance of LayoutReference
  def newLayoutReference(): LayoutReference = js.native
  // Create a new instance of Line
  def newLine(): Line = js.native
  // Create a new instance of LineConnection
  def newLineConnection(): LineConnection = js.native
  // Create a new instance of LineFill
  def newLineFill(): LineFill = js.native
  // Create a new instance of LineProperties
  def newLineProperties(): LineProperties = js.native
  // Create a new instance of Link
  def newLink(): Link = js.native
  // Create a new instance of MasterProperties
  def newMasterProperties(): MasterProperties = js.native
  // Create a new instance of MergeTableCellsRequest
  def newMergeTableCellsRequest(): MergeTableCellsRequest = js.native
  // Create a new instance of NotesProperties
  def newNotesProperties(): NotesProperties = js.native
  // Create a new instance of OpaqueColor
  def newOpaqueColor(): OpaqueColor = js.native
  // Create a new instance of OptionalColor
  def newOptionalColor(): OptionalColor = js.native
  // Create a new instance of Outline
  def newOutline(): Outline = js.native
  // Create a new instance of OutlineFill
  def newOutlineFill(): OutlineFill = js.native
  // Create a new instance of Page
  def newPage(): Page = js.native
  // Create a new instance of PageBackgroundFill
  def newPageBackgroundFill(): PageBackgroundFill = js.native
  // Create a new instance of PageElement
  def newPageElement(): PageElement = js.native
  // Create a new instance of PageElementProperties
  def newPageElementProperties(): PageElementProperties = js.native
  // Create a new instance of PageProperties
  def newPageProperties(): PageProperties = js.native
  // Create a new instance of ParagraphMarker
  def newParagraphMarker(): ParagraphMarker = js.native
  // Create a new instance of ParagraphStyle
  def newParagraphStyle(): ParagraphStyle = js.native
  // Create a new instance of Placeholder
  def newPlaceholder(): Placeholder = js.native
  // Create a new instance of Presentation
  def newPresentation(): Presentation = js.native
  // Create a new instance of Range
  def newRange(): Range = js.native
  // Create a new instance of Recolor
  def newRecolor(): Recolor = js.native
  // Create a new instance of RefreshSheetsChartRequest
  def newRefreshSheetsChartRequest(): RefreshSheetsChartRequest = js.native
  // Create a new instance of ReplaceAllShapesWithImageRequest
  def newReplaceAllShapesWithImageRequest(): ReplaceAllShapesWithImageRequest = js.native
  // Create a new instance of ReplaceAllShapesWithSheetsChartRequest
  def newReplaceAllShapesWithSheetsChartRequest(): ReplaceAllShapesWithSheetsChartRequest = js.native
  // Create a new instance of ReplaceAllTextRequest
  def newReplaceAllTextRequest(): ReplaceAllTextRequest = js.native
  // Create a new instance of ReplaceImageRequest
  def newReplaceImageRequest(): ReplaceImageRequest = js.native
  // Create a new instance of Request
  def newRequest(): Request = js.native
  // Create a new instance of RerouteLineRequest
  def newRerouteLineRequest(): RerouteLineRequest = js.native
  // Create a new instance of RgbColor
  def newRgbColor(): RgbColor = js.native
  // Create a new instance of Shadow
  def newShadow(): Shadow = js.native
  // Create a new instance of Shape
  def newShape(): Shape = js.native
  // Create a new instance of ShapeBackgroundFill
  def newShapeBackgroundFill(): ShapeBackgroundFill = js.native
  // Create a new instance of ShapeProperties
  def newShapeProperties(): ShapeProperties = js.native
  // Create a new instance of SheetsChart
  def newSheetsChart(): SheetsChart = js.native
  // Create a new instance of SheetsChartProperties
  def newSheetsChartProperties(): SheetsChartProperties = js.native
  // Create a new instance of Size
  def newSize(): Size = js.native
  // Create a new instance of SlideProperties
  def newSlideProperties(): SlideProperties = js.native
  // Create a new instance of SolidFill
  def newSolidFill(): SolidFill = js.native
  // Create a new instance of StretchedPictureFill
  def newStretchedPictureFill(): StretchedPictureFill = js.native
  // Create a new instance of SubstringMatchCriteria
  def newSubstringMatchCriteria(): SubstringMatchCriteria = js.native
  // Create a new instance of Table
  def newTable(): Table = js.native
  // Create a new instance of TableBorderCell
  def newTableBorderCell(): TableBorderCell = js.native
  // Create a new instance of TableBorderFill
  def newTableBorderFill(): TableBorderFill = js.native
  // Create a new instance of TableBorderProperties
  def newTableBorderProperties(): TableBorderProperties = js.native
  // Create a new instance of TableBorderRow
  def newTableBorderRow(): TableBorderRow = js.native
  // Create a new instance of TableCell
  def newTableCell(): TableCell = js.native
  // Create a new instance of TableCellBackgroundFill
  def newTableCellBackgroundFill(): TableCellBackgroundFill = js.native
  // Create a new instance of TableCellLocation
  def newTableCellLocation(): TableCellLocation = js.native
  // Create a new instance of TableCellProperties
  def newTableCellProperties(): TableCellProperties = js.native
  // Create a new instance of TableColumnProperties
  def newTableColumnProperties(): TableColumnProperties = js.native
  // Create a new instance of TableRange
  def newTableRange(): TableRange = js.native
  // Create a new instance of TableRow
  def newTableRow(): TableRow = js.native
  // Create a new instance of TableRowProperties
  def newTableRowProperties(): TableRowProperties = js.native
  // Create a new instance of TextContent
  def newTextContent(): TextContent = js.native
  // Create a new instance of TextElement
  def newTextElement(): TextElement = js.native
  // Create a new instance of TextRun
  def newTextRun(): TextRun = js.native
  // Create a new instance of TextStyle
  def newTextStyle(): TextStyle = js.native
  // Create a new instance of ThemeColorPair
  def newThemeColorPair(): ThemeColorPair = js.native
  // Create a new instance of UngroupObjectsRequest
  def newUngroupObjectsRequest(): UngroupObjectsRequest = js.native
  // Create a new instance of UnmergeTableCellsRequest
  def newUnmergeTableCellsRequest(): UnmergeTableCellsRequest = js.native
  // Create a new instance of UpdateImagePropertiesRequest
  def newUpdateImagePropertiesRequest(): UpdateImagePropertiesRequest = js.native
  // Create a new instance of UpdateLineCategoryRequest
  def newUpdateLineCategoryRequest(): UpdateLineCategoryRequest = js.native
  // Create a new instance of UpdateLinePropertiesRequest
  def newUpdateLinePropertiesRequest(): UpdateLinePropertiesRequest = js.native
  // Create a new instance of UpdatePageElementAltTextRequest
  def newUpdatePageElementAltTextRequest(): UpdatePageElementAltTextRequest = js.native
  // Create a new instance of UpdatePageElementTransformRequest
  def newUpdatePageElementTransformRequest(): UpdatePageElementTransformRequest = js.native
  // Create a new instance of UpdatePageElementsZOrderRequest
  def newUpdatePageElementsZOrderRequest(): UpdatePageElementsZOrderRequest = js.native
  // Create a new instance of UpdatePagePropertiesRequest
  def newUpdatePagePropertiesRequest(): UpdatePagePropertiesRequest = js.native
  // Create a new instance of UpdateParagraphStyleRequest
  def newUpdateParagraphStyleRequest(): UpdateParagraphStyleRequest = js.native
  // Create a new instance of UpdateShapePropertiesRequest
  def newUpdateShapePropertiesRequest(): UpdateShapePropertiesRequest = js.native
  // Create a new instance of UpdateSlidesPositionRequest
  def newUpdateSlidesPositionRequest(): UpdateSlidesPositionRequest = js.native
  // Create a new instance of UpdateTableBorderPropertiesRequest
  def newUpdateTableBorderPropertiesRequest(): UpdateTableBorderPropertiesRequest = js.native
  // Create a new instance of UpdateTableCellPropertiesRequest
  def newUpdateTableCellPropertiesRequest(): UpdateTableCellPropertiesRequest = js.native
  // Create a new instance of UpdateTableColumnPropertiesRequest
  def newUpdateTableColumnPropertiesRequest(): UpdateTableColumnPropertiesRequest = js.native
  // Create a new instance of UpdateTableRowPropertiesRequest
  def newUpdateTableRowPropertiesRequest(): UpdateTableRowPropertiesRequest = js.native
  // Create a new instance of UpdateTextStyleRequest
  def newUpdateTextStyleRequest(): UpdateTextStyleRequest = js.native
  // Create a new instance of UpdateVideoPropertiesRequest
  def newUpdateVideoPropertiesRequest(): UpdateVideoPropertiesRequest = js.native
  // Create a new instance of Video
  def newVideo(): Video = js.native
  // Create a new instance of VideoProperties
  def newVideoProperties(): VideoProperties = js.native
  // Create a new instance of WeightedFontFamily
  def newWeightedFontFamily(): WeightedFontFamily = js.native
  // Create a new instance of WordArt
  def newWordArt(): WordArt = js.native
  // Create a new instance of WriteControl
  def newWriteControl(): WriteControl = js.native
}

object Slides_ {
  @scala.inline
  def apply(
    newAffineTransform: () => AffineTransform,
    newAutoText: () => AutoText,
    newBatchUpdatePresentationRequest: () => BatchUpdatePresentationRequest,
    newBullet: () => Bullet,
    newColorScheme: () => ColorScheme,
    newColorStop: () => ColorStop,
    newCreateImageRequest: () => CreateImageRequest,
    newCreateLineRequest: () => CreateLineRequest,
    newCreateParagraphBulletsRequest: () => CreateParagraphBulletsRequest,
    newCreateShapeRequest: () => CreateShapeRequest,
    newCreateSheetsChartRequest: () => CreateSheetsChartRequest,
    newCreateSlideRequest: () => CreateSlideRequest,
    newCreateTableRequest: () => CreateTableRequest,
    newCreateVideoRequest: () => CreateVideoRequest,
    newCropProperties: () => CropProperties,
    newDeleteObjectRequest: () => DeleteObjectRequest,
    newDeleteParagraphBulletsRequest: () => DeleteParagraphBulletsRequest,
    newDeleteTableColumnRequest: () => DeleteTableColumnRequest,
    newDeleteTableRowRequest: () => DeleteTableRowRequest,
    newDeleteTextRequest: () => DeleteTextRequest,
    newDimension: () => Dimension,
    newDuplicateObjectRequest: () => DuplicateObjectRequest,
    newGroup: () => Group,
    newGroupObjectsRequest: () => GroupObjectsRequest,
    newImage: () => Image,
    newImageProperties: () => ImageProperties,
    newInsertTableColumnsRequest: () => InsertTableColumnsRequest,
    newInsertTableRowsRequest: () => InsertTableRowsRequest,
    newInsertTextRequest: () => InsertTextRequest,
    newLayoutPlaceholderIdMapping: () => LayoutPlaceholderIdMapping,
    newLayoutProperties: () => LayoutProperties,
    newLayoutReference: () => LayoutReference,
    newLine: () => Line,
    newLineConnection: () => LineConnection,
    newLineFill: () => LineFill,
    newLineProperties: () => LineProperties,
    newLink: () => Link,
    newMasterProperties: () => MasterProperties,
    newMergeTableCellsRequest: () => MergeTableCellsRequest,
    newNotesProperties: () => NotesProperties,
    newOpaqueColor: () => OpaqueColor,
    newOptionalColor: () => OptionalColor,
    newOutline: () => Outline,
    newOutlineFill: () => OutlineFill,
    newPage: () => Page,
    newPageBackgroundFill: () => PageBackgroundFill,
    newPageElement: () => PageElement,
    newPageElementProperties: () => PageElementProperties,
    newPageProperties: () => PageProperties,
    newParagraphMarker: () => ParagraphMarker,
    newParagraphStyle: () => ParagraphStyle,
    newPlaceholder: () => Placeholder,
    newPresentation: () => Presentation,
    newRange: () => Range,
    newRecolor: () => Recolor,
    newRefreshSheetsChartRequest: () => RefreshSheetsChartRequest,
    newReplaceAllShapesWithImageRequest: () => ReplaceAllShapesWithImageRequest,
    newReplaceAllShapesWithSheetsChartRequest: () => ReplaceAllShapesWithSheetsChartRequest,
    newReplaceAllTextRequest: () => ReplaceAllTextRequest,
    newReplaceImageRequest: () => ReplaceImageRequest,
    newRequest: () => Request,
    newRerouteLineRequest: () => RerouteLineRequest,
    newRgbColor: () => RgbColor,
    newShadow: () => Shadow,
    newShape: () => Shape,
    newShapeBackgroundFill: () => ShapeBackgroundFill,
    newShapeProperties: () => ShapeProperties,
    newSheetsChart: () => SheetsChart,
    newSheetsChartProperties: () => SheetsChartProperties,
    newSize: () => Size,
    newSlideProperties: () => SlideProperties,
    newSolidFill: () => SolidFill,
    newStretchedPictureFill: () => StretchedPictureFill,
    newSubstringMatchCriteria: () => SubstringMatchCriteria,
    newTable: () => Table,
    newTableBorderCell: () => TableBorderCell,
    newTableBorderFill: () => TableBorderFill,
    newTableBorderProperties: () => TableBorderProperties,
    newTableBorderRow: () => TableBorderRow,
    newTableCell: () => TableCell,
    newTableCellBackgroundFill: () => TableCellBackgroundFill,
    newTableCellLocation: () => TableCellLocation,
    newTableCellProperties: () => TableCellProperties,
    newTableColumnProperties: () => TableColumnProperties,
    newTableRange: () => TableRange,
    newTableRow: () => TableRow,
    newTableRowProperties: () => TableRowProperties,
    newTextContent: () => TextContent,
    newTextElement: () => TextElement,
    newTextRun: () => TextRun,
    newTextStyle: () => TextStyle,
    newThemeColorPair: () => ThemeColorPair,
    newUngroupObjectsRequest: () => UngroupObjectsRequest,
    newUnmergeTableCellsRequest: () => UnmergeTableCellsRequest,
    newUpdateImagePropertiesRequest: () => UpdateImagePropertiesRequest,
    newUpdateLineCategoryRequest: () => UpdateLineCategoryRequest,
    newUpdateLinePropertiesRequest: () => UpdateLinePropertiesRequest,
    newUpdatePageElementAltTextRequest: () => UpdatePageElementAltTextRequest,
    newUpdatePageElementTransformRequest: () => UpdatePageElementTransformRequest,
    newUpdatePageElementsZOrderRequest: () => UpdatePageElementsZOrderRequest,
    newUpdatePagePropertiesRequest: () => UpdatePagePropertiesRequest,
    newUpdateParagraphStyleRequest: () => UpdateParagraphStyleRequest,
    newUpdateShapePropertiesRequest: () => UpdateShapePropertiesRequest,
    newUpdateSlidesPositionRequest: () => UpdateSlidesPositionRequest,
    newUpdateTableBorderPropertiesRequest: () => UpdateTableBorderPropertiesRequest,
    newUpdateTableCellPropertiesRequest: () => UpdateTableCellPropertiesRequest,
    newUpdateTableColumnPropertiesRequest: () => UpdateTableColumnPropertiesRequest,
    newUpdateTableRowPropertiesRequest: () => UpdateTableRowPropertiesRequest,
    newUpdateTextStyleRequest: () => UpdateTextStyleRequest,
    newUpdateVideoPropertiesRequest: () => UpdateVideoPropertiesRequest,
    newVideo: () => Video,
    newVideoProperties: () => VideoProperties,
    newWeightedFontFamily: () => WeightedFontFamily,
    newWordArt: () => WordArt,
    newWriteControl: () => WriteControl
  ): Slides_ = {
    val __obj = js.Dynamic.literal(newAffineTransform = js.Any.fromFunction0(newAffineTransform), newAutoText = js.Any.fromFunction0(newAutoText), newBatchUpdatePresentationRequest = js.Any.fromFunction0(newBatchUpdatePresentationRequest), newBullet = js.Any.fromFunction0(newBullet), newColorScheme = js.Any.fromFunction0(newColorScheme), newColorStop = js.Any.fromFunction0(newColorStop), newCreateImageRequest = js.Any.fromFunction0(newCreateImageRequest), newCreateLineRequest = js.Any.fromFunction0(newCreateLineRequest), newCreateParagraphBulletsRequest = js.Any.fromFunction0(newCreateParagraphBulletsRequest), newCreateShapeRequest = js.Any.fromFunction0(newCreateShapeRequest), newCreateSheetsChartRequest = js.Any.fromFunction0(newCreateSheetsChartRequest), newCreateSlideRequest = js.Any.fromFunction0(newCreateSlideRequest), newCreateTableRequest = js.Any.fromFunction0(newCreateTableRequest), newCreateVideoRequest = js.Any.fromFunction0(newCreateVideoRequest), newCropProperties = js.Any.fromFunction0(newCropProperties), newDeleteObjectRequest = js.Any.fromFunction0(newDeleteObjectRequest), newDeleteParagraphBulletsRequest = js.Any.fromFunction0(newDeleteParagraphBulletsRequest), newDeleteTableColumnRequest = js.Any.fromFunction0(newDeleteTableColumnRequest), newDeleteTableRowRequest = js.Any.fromFunction0(newDeleteTableRowRequest), newDeleteTextRequest = js.Any.fromFunction0(newDeleteTextRequest), newDimension = js.Any.fromFunction0(newDimension), newDuplicateObjectRequest = js.Any.fromFunction0(newDuplicateObjectRequest), newGroup = js.Any.fromFunction0(newGroup), newGroupObjectsRequest = js.Any.fromFunction0(newGroupObjectsRequest), newImage = js.Any.fromFunction0(newImage), newImageProperties = js.Any.fromFunction0(newImageProperties), newInsertTableColumnsRequest = js.Any.fromFunction0(newInsertTableColumnsRequest), newInsertTableRowsRequest = js.Any.fromFunction0(newInsertTableRowsRequest), newInsertTextRequest = js.Any.fromFunction0(newInsertTextRequest), newLayoutPlaceholderIdMapping = js.Any.fromFunction0(newLayoutPlaceholderIdMapping), newLayoutProperties = js.Any.fromFunction0(newLayoutProperties), newLayoutReference = js.Any.fromFunction0(newLayoutReference), newLine = js.Any.fromFunction0(newLine), newLineConnection = js.Any.fromFunction0(newLineConnection), newLineFill = js.Any.fromFunction0(newLineFill), newLineProperties = js.Any.fromFunction0(newLineProperties), newLink = js.Any.fromFunction0(newLink), newMasterProperties = js.Any.fromFunction0(newMasterProperties), newMergeTableCellsRequest = js.Any.fromFunction0(newMergeTableCellsRequest), newNotesProperties = js.Any.fromFunction0(newNotesProperties), newOpaqueColor = js.Any.fromFunction0(newOpaqueColor), newOptionalColor = js.Any.fromFunction0(newOptionalColor), newOutline = js.Any.fromFunction0(newOutline), newOutlineFill = js.Any.fromFunction0(newOutlineFill), newPage = js.Any.fromFunction0(newPage), newPageBackgroundFill = js.Any.fromFunction0(newPageBackgroundFill), newPageElement = js.Any.fromFunction0(newPageElement), newPageElementProperties = js.Any.fromFunction0(newPageElementProperties), newPageProperties = js.Any.fromFunction0(newPageProperties), newParagraphMarker = js.Any.fromFunction0(newParagraphMarker), newParagraphStyle = js.Any.fromFunction0(newParagraphStyle), newPlaceholder = js.Any.fromFunction0(newPlaceholder), newPresentation = js.Any.fromFunction0(newPresentation), newRange = js.Any.fromFunction0(newRange), newRecolor = js.Any.fromFunction0(newRecolor), newRefreshSheetsChartRequest = js.Any.fromFunction0(newRefreshSheetsChartRequest), newReplaceAllShapesWithImageRequest = js.Any.fromFunction0(newReplaceAllShapesWithImageRequest), newReplaceAllShapesWithSheetsChartRequest = js.Any.fromFunction0(newReplaceAllShapesWithSheetsChartRequest), newReplaceAllTextRequest = js.Any.fromFunction0(newReplaceAllTextRequest), newReplaceImageRequest = js.Any.fromFunction0(newReplaceImageRequest), newRequest = js.Any.fromFunction0(newRequest), newRerouteLineRequest = js.Any.fromFunction0(newRerouteLineRequest), newRgbColor = js.Any.fromFunction0(newRgbColor), newShadow = js.Any.fromFunction0(newShadow), newShape = js.Any.fromFunction0(newShape), newShapeBackgroundFill = js.Any.fromFunction0(newShapeBackgroundFill), newShapeProperties = js.Any.fromFunction0(newShapeProperties), newSheetsChart = js.Any.fromFunction0(newSheetsChart), newSheetsChartProperties = js.Any.fromFunction0(newSheetsChartProperties), newSize = js.Any.fromFunction0(newSize), newSlideProperties = js.Any.fromFunction0(newSlideProperties), newSolidFill = js.Any.fromFunction0(newSolidFill), newStretchedPictureFill = js.Any.fromFunction0(newStretchedPictureFill), newSubstringMatchCriteria = js.Any.fromFunction0(newSubstringMatchCriteria), newTable = js.Any.fromFunction0(newTable), newTableBorderCell = js.Any.fromFunction0(newTableBorderCell), newTableBorderFill = js.Any.fromFunction0(newTableBorderFill), newTableBorderProperties = js.Any.fromFunction0(newTableBorderProperties), newTableBorderRow = js.Any.fromFunction0(newTableBorderRow), newTableCell = js.Any.fromFunction0(newTableCell), newTableCellBackgroundFill = js.Any.fromFunction0(newTableCellBackgroundFill), newTableCellLocation = js.Any.fromFunction0(newTableCellLocation), newTableCellProperties = js.Any.fromFunction0(newTableCellProperties), newTableColumnProperties = js.Any.fromFunction0(newTableColumnProperties), newTableRange = js.Any.fromFunction0(newTableRange), newTableRow = js.Any.fromFunction0(newTableRow), newTableRowProperties = js.Any.fromFunction0(newTableRowProperties), newTextContent = js.Any.fromFunction0(newTextContent), newTextElement = js.Any.fromFunction0(newTextElement), newTextRun = js.Any.fromFunction0(newTextRun), newTextStyle = js.Any.fromFunction0(newTextStyle), newThemeColorPair = js.Any.fromFunction0(newThemeColorPair), newUngroupObjectsRequest = js.Any.fromFunction0(newUngroupObjectsRequest), newUnmergeTableCellsRequest = js.Any.fromFunction0(newUnmergeTableCellsRequest), newUpdateImagePropertiesRequest = js.Any.fromFunction0(newUpdateImagePropertiesRequest), newUpdateLineCategoryRequest = js.Any.fromFunction0(newUpdateLineCategoryRequest), newUpdateLinePropertiesRequest = js.Any.fromFunction0(newUpdateLinePropertiesRequest), newUpdatePageElementAltTextRequest = js.Any.fromFunction0(newUpdatePageElementAltTextRequest), newUpdatePageElementTransformRequest = js.Any.fromFunction0(newUpdatePageElementTransformRequest), newUpdatePageElementsZOrderRequest = js.Any.fromFunction0(newUpdatePageElementsZOrderRequest), newUpdatePagePropertiesRequest = js.Any.fromFunction0(newUpdatePagePropertiesRequest), newUpdateParagraphStyleRequest = js.Any.fromFunction0(newUpdateParagraphStyleRequest), newUpdateShapePropertiesRequest = js.Any.fromFunction0(newUpdateShapePropertiesRequest), newUpdateSlidesPositionRequest = js.Any.fromFunction0(newUpdateSlidesPositionRequest), newUpdateTableBorderPropertiesRequest = js.Any.fromFunction0(newUpdateTableBorderPropertiesRequest), newUpdateTableCellPropertiesRequest = js.Any.fromFunction0(newUpdateTableCellPropertiesRequest), newUpdateTableColumnPropertiesRequest = js.Any.fromFunction0(newUpdateTableColumnPropertiesRequest), newUpdateTableRowPropertiesRequest = js.Any.fromFunction0(newUpdateTableRowPropertiesRequest), newUpdateTextStyleRequest = js.Any.fromFunction0(newUpdateTextStyleRequest), newUpdateVideoPropertiesRequest = js.Any.fromFunction0(newUpdateVideoPropertiesRequest), newVideo = js.Any.fromFunction0(newVideo), newVideoProperties = js.Any.fromFunction0(newVideoProperties), newWeightedFontFamily = js.Any.fromFunction0(newWeightedFontFamily), newWordArt = js.Any.fromFunction0(newWordArt), newWriteControl = js.Any.fromFunction0(newWriteControl))
    __obj.asInstanceOf[Slides_]
  }
  @scala.inline
  implicit class Slides_Ops[Self <: Slides_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAffineTransform(value: () => AffineTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAffineTransform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewAutoText(value: () => AutoText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAutoText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBatchUpdatePresentationRequest(value: () => BatchUpdatePresentationRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBatchUpdatePresentationRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBullet(value: () => Bullet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBullet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewColorScheme(value: () => ColorScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newColorScheme")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewColorStop(value: () => ColorStop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newColorStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateImageRequest(value: () => CreateImageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateImageRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateLineRequest(value: () => CreateLineRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateLineRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateParagraphBulletsRequest(value: () => CreateParagraphBulletsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateParagraphBulletsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateShapeRequest(value: () => CreateShapeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateShapeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateSheetsChartRequest(value: () => CreateSheetsChartRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateSheetsChartRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateSlideRequest(value: () => CreateSlideRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateSlideRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateTableRequest(value: () => CreateTableRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateTableRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateVideoRequest(value: () => CreateVideoRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateVideoRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCropProperties(value: () => CropProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCropProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteObjectRequest(value: () => DeleteObjectRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteObjectRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteParagraphBulletsRequest(value: () => DeleteParagraphBulletsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteParagraphBulletsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteTableColumnRequest(value: () => DeleteTableColumnRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteTableColumnRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteTableRowRequest(value: () => DeleteTableRowRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteTableRowRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteTextRequest(value: () => DeleteTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteTextRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDimension(value: () => Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDimension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDuplicateObjectRequest(value: () => DuplicateObjectRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDuplicateObjectRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGroup(value: () => Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGroupObjectsRequest(value: () => GroupObjectsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroupObjectsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewImage(value: () => Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newImage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewImageProperties(value: () => ImageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newImageProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInsertTableColumnsRequest(value: () => InsertTableColumnsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInsertTableColumnsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInsertTableRowsRequest(value: () => InsertTableRowsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInsertTableRowsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInsertTextRequest(value: () => InsertTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInsertTextRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLayoutPlaceholderIdMapping(value: () => LayoutPlaceholderIdMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLayoutPlaceholderIdMapping")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLayoutProperties(value: () => LayoutProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLayoutProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLayoutReference(value: () => LayoutReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLayoutReference")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLine(value: () => Line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLineConnection(value: () => LineConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineConnection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLineFill(value: () => LineFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLineProperties(value: () => LineProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLineProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLink(value: () => Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMasterProperties(value: () => MasterProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMasterProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMergeTableCellsRequest(value: () => MergeTableCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMergeTableCellsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewNotesProperties(value: () => NotesProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNotesProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOpaqueColor(value: () => OpaqueColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOpaqueColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOptionalColor(value: () => OptionalColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOptionalColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOutline(value: () => Outline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOutline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOutlineFill(value: () => OutlineFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOutlineFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPage(value: () => Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPageBackgroundFill(value: () => PageBackgroundFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPageBackgroundFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPageElement(value: () => PageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPageElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPageElementProperties(value: () => PageElementProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPageElementProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPageProperties(value: () => PageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPageProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewParagraphMarker(value: () => ParagraphMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParagraphMarker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewParagraphStyle(value: () => ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParagraphStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPlaceholder(value: () => Placeholder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPlaceholder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPresentation(value: () => Presentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPresentation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRange(value: () => Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRecolor(value: () => Recolor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRecolor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRefreshSheetsChartRequest(value: () => RefreshSheetsChartRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRefreshSheetsChartRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewReplaceAllShapesWithImageRequest(value: () => ReplaceAllShapesWithImageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newReplaceAllShapesWithImageRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewReplaceAllShapesWithSheetsChartRequest(value: () => ReplaceAllShapesWithSheetsChartRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newReplaceAllShapesWithSheetsChartRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewReplaceAllTextRequest(value: () => ReplaceAllTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newReplaceAllTextRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewReplaceImageRequest(value: () => ReplaceImageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newReplaceImageRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRequest(value: () => Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRerouteLineRequest(value: () => RerouteLineRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRerouteLineRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRgbColor(value: () => RgbColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRgbColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShadow(value: () => Shadow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShadow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShape(value: () => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShapeBackgroundFill(value: () => ShapeBackgroundFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShapeBackgroundFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShapeProperties(value: () => ShapeProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShapeProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSheetsChart(value: () => SheetsChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheetsChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSheetsChartProperties(value: () => SheetsChartProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheetsChartProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSlideProperties(value: () => SlideProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSlideProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSolidFill(value: () => SolidFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSolidFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewStretchedPictureFill(value: () => StretchedPictureFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStretchedPictureFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubstringMatchCriteria(value: () => SubstringMatchCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubstringMatchCriteria")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTable(value: () => Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableBorderCell(value: () => TableBorderCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableBorderCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableBorderFill(value: () => TableBorderFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableBorderFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableBorderProperties(value: () => TableBorderProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableBorderProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableBorderRow(value: () => TableBorderRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableBorderRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableCell(value: () => TableCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableCellBackgroundFill(value: () => TableCellBackgroundFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableCellBackgroundFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableCellLocation(value: () => TableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableCellLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableCellProperties(value: () => TableCellProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableCellProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableColumnProperties(value: () => TableColumnProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableColumnProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableRange(value: () => TableRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableRow(value: () => TableRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableRowProperties(value: () => TableRowProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableRowProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextContent(value: () => TextContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextElement(value: () => TextElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextRun(value: () => TextRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextRun")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTextStyle(value: () => TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTextStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewThemeColorPair(value: () => ThemeColorPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newThemeColorPair")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUngroupObjectsRequest(value: () => UngroupObjectsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUngroupObjectsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUnmergeTableCellsRequest(value: () => UnmergeTableCellsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUnmergeTableCellsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateImagePropertiesRequest(value: () => UpdateImagePropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateImagePropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateLineCategoryRequest(value: () => UpdateLineCategoryRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateLineCategoryRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateLinePropertiesRequest(value: () => UpdateLinePropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateLinePropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdatePageElementAltTextRequest(value: () => UpdatePageElementAltTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdatePageElementAltTextRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdatePageElementTransformRequest(value: () => UpdatePageElementTransformRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdatePageElementTransformRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdatePageElementsZOrderRequest(value: () => UpdatePageElementsZOrderRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdatePageElementsZOrderRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdatePagePropertiesRequest(value: () => UpdatePagePropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdatePagePropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateParagraphStyleRequest(value: () => UpdateParagraphStyleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateParagraphStyleRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateShapePropertiesRequest(value: () => UpdateShapePropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateShapePropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateSlidesPositionRequest(value: () => UpdateSlidesPositionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateSlidesPositionRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateTableBorderPropertiesRequest(value: () => UpdateTableBorderPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateTableBorderPropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateTableCellPropertiesRequest(value: () => UpdateTableCellPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateTableCellPropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateTableColumnPropertiesRequest(value: () => UpdateTableColumnPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateTableColumnPropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateTableRowPropertiesRequest(value: () => UpdateTableRowPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateTableRowPropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateTextStyleRequest(value: () => UpdateTextStyleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateTextStyleRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateVideoPropertiesRequest(value: () => UpdateVideoPropertiesRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateVideoPropertiesRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideo(value: () => Video): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoProperties(value: () => VideoProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWeightedFontFamily(value: () => WeightedFontFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWeightedFontFamily")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWordArt(value: () => WordArt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWordArt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWriteControl(value: () => WriteControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWriteControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPresentations(value: PresentationsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Presentations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Presentations")(js.undefined)
        ret
    }
  }
  
}

