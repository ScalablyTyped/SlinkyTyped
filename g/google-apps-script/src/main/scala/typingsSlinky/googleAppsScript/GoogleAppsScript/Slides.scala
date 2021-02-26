package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ColorType
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Ui
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Collection.Presentations.PagesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Collection.PresentationsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.BatchUpdatePresentationRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.BatchUpdatePresentationResponse
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
import typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Thumbnail
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
import typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.EmbeddedChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slides extends StObject {
  
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
object Slides {
  
  @scala.inline
  def apply(
    newAffineTransform: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform,
    newAutoText: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText,
    newBatchUpdatePresentationRequest: () => BatchUpdatePresentationRequest,
    newBullet: () => Bullet,
    newColorScheme: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme,
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
    newGroup: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Group,
    newGroupObjectsRequest: () => GroupObjectsRequest,
    newImage: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Image,
    newImageProperties: () => ImageProperties,
    newInsertTableColumnsRequest: () => InsertTableColumnsRequest,
    newInsertTableRowsRequest: () => InsertTableRowsRequest,
    newInsertTextRequest: () => InsertTextRequest,
    newLayoutPlaceholderIdMapping: () => LayoutPlaceholderIdMapping,
    newLayoutProperties: () => LayoutProperties,
    newLayoutReference: () => LayoutReference,
    newLine: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Line,
    newLineConnection: () => LineConnection,
    newLineFill: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill,
    newLineProperties: () => LineProperties,
    newLink: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link,
    newMasterProperties: () => MasterProperties,
    newMergeTableCellsRequest: () => MergeTableCellsRequest,
    newNotesProperties: () => NotesProperties,
    newOpaqueColor: () => OpaqueColor,
    newOptionalColor: () => OptionalColor,
    newOutline: () => Outline,
    newOutlineFill: () => OutlineFill,
    newPage: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page,
    newPageBackgroundFill: () => PageBackgroundFill,
    newPageElement: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement,
    newPageElementProperties: () => PageElementProperties,
    newPageProperties: () => PageProperties,
    newParagraphMarker: () => ParagraphMarker,
    newParagraphStyle: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle,
    newPlaceholder: () => Placeholder,
    newPresentation: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation,
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
    newShape: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape,
    newShapeBackgroundFill: () => ShapeBackgroundFill,
    newShapeProperties: () => ShapeProperties,
    newSheetsChart: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart,
    newSheetsChartProperties: () => SheetsChartProperties,
    newSize: () => Size,
    newSlideProperties: () => SlideProperties,
    newSolidFill: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill,
    newStretchedPictureFill: () => StretchedPictureFill,
    newSubstringMatchCriteria: () => SubstringMatchCriteria,
    newTable: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Table,
    newTableBorderCell: () => TableBorderCell,
    newTableBorderFill: () => TableBorderFill,
    newTableBorderProperties: () => TableBorderProperties,
    newTableBorderRow: () => TableBorderRow,
    newTableCell: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell,
    newTableCellBackgroundFill: () => TableCellBackgroundFill,
    newTableCellLocation: () => TableCellLocation,
    newTableCellProperties: () => TableCellProperties,
    newTableColumnProperties: () => TableColumnProperties,
    newTableRange: () => TableRange,
    newTableRow: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow,
    newTableRowProperties: () => TableRowProperties,
    newTextContent: () => TextContent,
    newTextElement: () => TextElement,
    newTextRun: () => TextRun,
    newTextStyle: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle,
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
    newVideo: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Video,
    newVideoProperties: () => VideoProperties,
    newWeightedFontFamily: () => WeightedFontFamily,
    newWordArt: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt,
    newWriteControl: () => WriteControl
  ): Slides = {
    val __obj = js.Dynamic.literal(newAffineTransform = js.Any.fromFunction0(newAffineTransform), newAutoText = js.Any.fromFunction0(newAutoText), newBatchUpdatePresentationRequest = js.Any.fromFunction0(newBatchUpdatePresentationRequest), newBullet = js.Any.fromFunction0(newBullet), newColorScheme = js.Any.fromFunction0(newColorScheme), newColorStop = js.Any.fromFunction0(newColorStop), newCreateImageRequest = js.Any.fromFunction0(newCreateImageRequest), newCreateLineRequest = js.Any.fromFunction0(newCreateLineRequest), newCreateParagraphBulletsRequest = js.Any.fromFunction0(newCreateParagraphBulletsRequest), newCreateShapeRequest = js.Any.fromFunction0(newCreateShapeRequest), newCreateSheetsChartRequest = js.Any.fromFunction0(newCreateSheetsChartRequest), newCreateSlideRequest = js.Any.fromFunction0(newCreateSlideRequest), newCreateTableRequest = js.Any.fromFunction0(newCreateTableRequest), newCreateVideoRequest = js.Any.fromFunction0(newCreateVideoRequest), newCropProperties = js.Any.fromFunction0(newCropProperties), newDeleteObjectRequest = js.Any.fromFunction0(newDeleteObjectRequest), newDeleteParagraphBulletsRequest = js.Any.fromFunction0(newDeleteParagraphBulletsRequest), newDeleteTableColumnRequest = js.Any.fromFunction0(newDeleteTableColumnRequest), newDeleteTableRowRequest = js.Any.fromFunction0(newDeleteTableRowRequest), newDeleteTextRequest = js.Any.fromFunction0(newDeleteTextRequest), newDimension = js.Any.fromFunction0(newDimension), newDuplicateObjectRequest = js.Any.fromFunction0(newDuplicateObjectRequest), newGroup = js.Any.fromFunction0(newGroup), newGroupObjectsRequest = js.Any.fromFunction0(newGroupObjectsRequest), newImage = js.Any.fromFunction0(newImage), newImageProperties = js.Any.fromFunction0(newImageProperties), newInsertTableColumnsRequest = js.Any.fromFunction0(newInsertTableColumnsRequest), newInsertTableRowsRequest = js.Any.fromFunction0(newInsertTableRowsRequest), newInsertTextRequest = js.Any.fromFunction0(newInsertTextRequest), newLayoutPlaceholderIdMapping = js.Any.fromFunction0(newLayoutPlaceholderIdMapping), newLayoutProperties = js.Any.fromFunction0(newLayoutProperties), newLayoutReference = js.Any.fromFunction0(newLayoutReference), newLine = js.Any.fromFunction0(newLine), newLineConnection = js.Any.fromFunction0(newLineConnection), newLineFill = js.Any.fromFunction0(newLineFill), newLineProperties = js.Any.fromFunction0(newLineProperties), newLink = js.Any.fromFunction0(newLink), newMasterProperties = js.Any.fromFunction0(newMasterProperties), newMergeTableCellsRequest = js.Any.fromFunction0(newMergeTableCellsRequest), newNotesProperties = js.Any.fromFunction0(newNotesProperties), newOpaqueColor = js.Any.fromFunction0(newOpaqueColor), newOptionalColor = js.Any.fromFunction0(newOptionalColor), newOutline = js.Any.fromFunction0(newOutline), newOutlineFill = js.Any.fromFunction0(newOutlineFill), newPage = js.Any.fromFunction0(newPage), newPageBackgroundFill = js.Any.fromFunction0(newPageBackgroundFill), newPageElement = js.Any.fromFunction0(newPageElement), newPageElementProperties = js.Any.fromFunction0(newPageElementProperties), newPageProperties = js.Any.fromFunction0(newPageProperties), newParagraphMarker = js.Any.fromFunction0(newParagraphMarker), newParagraphStyle = js.Any.fromFunction0(newParagraphStyle), newPlaceholder = js.Any.fromFunction0(newPlaceholder), newPresentation = js.Any.fromFunction0(newPresentation), newRange = js.Any.fromFunction0(newRange), newRecolor = js.Any.fromFunction0(newRecolor), newRefreshSheetsChartRequest = js.Any.fromFunction0(newRefreshSheetsChartRequest), newReplaceAllShapesWithImageRequest = js.Any.fromFunction0(newReplaceAllShapesWithImageRequest), newReplaceAllShapesWithSheetsChartRequest = js.Any.fromFunction0(newReplaceAllShapesWithSheetsChartRequest), newReplaceAllTextRequest = js.Any.fromFunction0(newReplaceAllTextRequest), newReplaceImageRequest = js.Any.fromFunction0(newReplaceImageRequest), newRequest = js.Any.fromFunction0(newRequest), newRerouteLineRequest = js.Any.fromFunction0(newRerouteLineRequest), newRgbColor = js.Any.fromFunction0(newRgbColor), newShadow = js.Any.fromFunction0(newShadow), newShape = js.Any.fromFunction0(newShape), newShapeBackgroundFill = js.Any.fromFunction0(newShapeBackgroundFill), newShapeProperties = js.Any.fromFunction0(newShapeProperties), newSheetsChart = js.Any.fromFunction0(newSheetsChart), newSheetsChartProperties = js.Any.fromFunction0(newSheetsChartProperties), newSize = js.Any.fromFunction0(newSize), newSlideProperties = js.Any.fromFunction0(newSlideProperties), newSolidFill = js.Any.fromFunction0(newSolidFill), newStretchedPictureFill = js.Any.fromFunction0(newStretchedPictureFill), newSubstringMatchCriteria = js.Any.fromFunction0(newSubstringMatchCriteria), newTable = js.Any.fromFunction0(newTable), newTableBorderCell = js.Any.fromFunction0(newTableBorderCell), newTableBorderFill = js.Any.fromFunction0(newTableBorderFill), newTableBorderProperties = js.Any.fromFunction0(newTableBorderProperties), newTableBorderRow = js.Any.fromFunction0(newTableBorderRow), newTableCell = js.Any.fromFunction0(newTableCell), newTableCellBackgroundFill = js.Any.fromFunction0(newTableCellBackgroundFill), newTableCellLocation = js.Any.fromFunction0(newTableCellLocation), newTableCellProperties = js.Any.fromFunction0(newTableCellProperties), newTableColumnProperties = js.Any.fromFunction0(newTableColumnProperties), newTableRange = js.Any.fromFunction0(newTableRange), newTableRow = js.Any.fromFunction0(newTableRow), newTableRowProperties = js.Any.fromFunction0(newTableRowProperties), newTextContent = js.Any.fromFunction0(newTextContent), newTextElement = js.Any.fromFunction0(newTextElement), newTextRun = js.Any.fromFunction0(newTextRun), newTextStyle = js.Any.fromFunction0(newTextStyle), newThemeColorPair = js.Any.fromFunction0(newThemeColorPair), newUngroupObjectsRequest = js.Any.fromFunction0(newUngroupObjectsRequest), newUnmergeTableCellsRequest = js.Any.fromFunction0(newUnmergeTableCellsRequest), newUpdateImagePropertiesRequest = js.Any.fromFunction0(newUpdateImagePropertiesRequest), newUpdateLineCategoryRequest = js.Any.fromFunction0(newUpdateLineCategoryRequest), newUpdateLinePropertiesRequest = js.Any.fromFunction0(newUpdateLinePropertiesRequest), newUpdatePageElementAltTextRequest = js.Any.fromFunction0(newUpdatePageElementAltTextRequest), newUpdatePageElementTransformRequest = js.Any.fromFunction0(newUpdatePageElementTransformRequest), newUpdatePageElementsZOrderRequest = js.Any.fromFunction0(newUpdatePageElementsZOrderRequest), newUpdatePagePropertiesRequest = js.Any.fromFunction0(newUpdatePagePropertiesRequest), newUpdateParagraphStyleRequest = js.Any.fromFunction0(newUpdateParagraphStyleRequest), newUpdateShapePropertiesRequest = js.Any.fromFunction0(newUpdateShapePropertiesRequest), newUpdateSlidesPositionRequest = js.Any.fromFunction0(newUpdateSlidesPositionRequest), newUpdateTableBorderPropertiesRequest = js.Any.fromFunction0(newUpdateTableBorderPropertiesRequest), newUpdateTableCellPropertiesRequest = js.Any.fromFunction0(newUpdateTableCellPropertiesRequest), newUpdateTableColumnPropertiesRequest = js.Any.fromFunction0(newUpdateTableColumnPropertiesRequest), newUpdateTableRowPropertiesRequest = js.Any.fromFunction0(newUpdateTableRowPropertiesRequest), newUpdateTextStyleRequest = js.Any.fromFunction0(newUpdateTextStyleRequest), newUpdateVideoPropertiesRequest = js.Any.fromFunction0(newUpdateVideoPropertiesRequest), newVideo = js.Any.fromFunction0(newVideo), newVideoProperties = js.Any.fromFunction0(newVideoProperties), newWeightedFontFamily = js.Any.fromFunction0(newWeightedFontFamily), newWordArt = js.Any.fromFunction0(newWordArt), newWriteControl = js.Any.fromFunction0(newWriteControl))
    __obj.asInstanceOf[Slides]
  }
  
  @js.native
  sealed trait AlignmentPosition extends StObject
  /**
    * The alignment position to apply.
    */
  @JSGlobal("GoogleAppsScript.Slides.AlignmentPosition")
  @js.native
  object AlignmentPosition extends StObject {
    
    @js.native
    sealed trait CENTER extends AlignmentPosition
    
    @js.native
    sealed trait HORIZONTAL_CENTER extends AlignmentPosition
    
    @js.native
    sealed trait VERTICAL_CENTER extends AlignmentPosition
  }
  
  @js.native
  sealed trait ArrowStyle extends StObject
  /**
    * The kinds of start and end forms with which linear geometry can be rendered.
    *
    * Some values are based on the "ST_LineEndType" simple type described in section 20.1.10.33 of
    * of "Office Open XML File Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ArrowStyle")
  @js.native
  object ArrowStyle extends StObject {
    
    @js.native
    sealed trait FILL_ARROW extends ArrowStyle
    
    @js.native
    sealed trait FILL_CIRCLE extends ArrowStyle
    
    @js.native
    sealed trait FILL_DIAMOND extends ArrowStyle
    
    @js.native
    sealed trait FILL_SQUARE extends ArrowStyle
    
    @js.native
    sealed trait NONE extends ArrowStyle
    
    @js.native
    sealed trait OPEN_ARROW extends ArrowStyle
    
    @js.native
    sealed trait OPEN_CIRCLE extends ArrowStyle
    
    @js.native
    sealed trait OPEN_DIAMOND extends ArrowStyle
    
    @js.native
    sealed trait OPEN_SQUARE extends ArrowStyle
    
    @js.native
    sealed trait STEALTH_ARROW extends ArrowStyle
    
    @js.native
    sealed trait UNSUPPORTED extends ArrowStyle
  }
  
  @js.native
  sealed trait AutoTextType extends StObject
  /**
    * The types of auto text.
    */
  @JSGlobal("GoogleAppsScript.Slides.AutoTextType")
  @js.native
  object AutoTextType extends StObject {
    
    @js.native
    sealed trait SLIDE_NUMBER extends AutoTextType
    
    @js.native
    sealed trait UNSUPPORTED extends AutoTextType
  }
  
  @js.native
  sealed trait CellMergeState extends StObject
  /**
    * The table cell merge states.
    */
  @JSGlobal("GoogleAppsScript.Slides.CellMergeState")
  @js.native
  object CellMergeState extends StObject {
    
    @js.native
    sealed trait HEAD extends CellMergeState
    
    @js.native
    sealed trait MERGED extends CellMergeState
    
    @js.native
    sealed trait NORMAL extends CellMergeState
  }
  
  @js.native
  sealed trait ContentAlignment extends StObject
  /**
    * The content alignments for a Shape or TableCell. The supported alignments
    * correspond to predefined text anchoring types from the ECMA-376 standard.
    *
    * More information on those alignments can be found in the description of
    * the ST_TextAnchoringType simple type in section 20.1.10.59 of "Office Open XML File
    * Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ContentAlignment")
  @js.native
  object ContentAlignment extends StObject {
    
    @js.native
    sealed trait BOTTOM extends ContentAlignment
    
    @js.native
    sealed trait MIDDLE extends ContentAlignment
    
    @js.native
    sealed trait TOP extends ContentAlignment
    
    @js.native
    sealed trait UNSUPPORTED extends ContentAlignment
  }
  
  @js.native
  sealed trait DashStyle extends StObject
  /**
    * The kinds of dashes with which linear geometry can be rendered. These values are based on the
    * "ST_PresetLineDashVal" simple type described in section 20.1.10.48 of "Office Open XML File
    * Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.DashStyle")
  @js.native
  object DashStyle extends StObject {
    
    @js.native
    sealed trait DASH extends DashStyle
    
    @js.native
    sealed trait DASH_DOT extends DashStyle
    
    @js.native
    sealed trait DOT extends DashStyle
    
    @js.native
    sealed trait LONG_DASH extends DashStyle
    
    @js.native
    sealed trait LONG_DASH_DOT extends DashStyle
    
    @js.native
    sealed trait SOLID extends DashStyle
    
    @js.native
    sealed trait UNSUPPORTED extends DashStyle
  }
  
  @js.native
  sealed trait FillType extends StObject
  /**
    * The kinds of fill.
    */
  @JSGlobal("GoogleAppsScript.Slides.FillType")
  @js.native
  object FillType extends StObject {
    
    @js.native
    sealed trait NONE extends FillType
    
    @js.native
    sealed trait SOLID extends FillType
    
    @js.native
    sealed trait UNSUPPORTED extends FillType
  }
  
  @js.native
  sealed trait LineCategory extends StObject
  /**
    * The line category.
    *
    * The exact LineType created is determined based on the category and how it's routed to
    * connect to other page elements.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineCategory")
  @js.native
  object LineCategory extends StObject {
    
    @js.native
    sealed trait BENT extends LineCategory
    
    @js.native
    sealed trait CURVED extends LineCategory
    
    @js.native
    sealed trait STRAIGHT extends LineCategory
    
    @js.native
    sealed trait UNSUPPORTED extends LineCategory
  }
  
  @js.native
  sealed trait LineFillType extends StObject
  /**
    * The kinds of line fill.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineFillType")
  @js.native
  object LineFillType extends StObject {
    
    @js.native
    sealed trait NONE extends LineFillType
    
    @js.native
    sealed trait SOLID extends LineFillType
    
    @js.native
    sealed trait UNSUPPORTED extends LineFillType
  }
  
  @js.native
  sealed trait LineType extends StObject
  /**
    * The line types.
    *
    * Derived from a subset of the values of the "ST_ShapeType" simple type in section 20.1.10.55 of
    * "Office Open XML File Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.LineType")
  @js.native
  object LineType extends StObject {
    
    @js.native
    sealed trait BENT_CONNECTOR_2 extends LineType
    
    @js.native
    sealed trait BENT_CONNECTOR_3 extends LineType
    
    @js.native
    sealed trait BENT_CONNECTOR_4 extends LineType
    
    @js.native
    sealed trait BENT_CONNECTOR_5 extends LineType
    
    @js.native
    sealed trait CURVED_CONNECTOR_2 extends LineType
    
    @js.native
    sealed trait CURVED_CONNECTOR_3 extends LineType
    
    @js.native
    sealed trait CURVED_CONNECTOR_4 extends LineType
    
    @js.native
    sealed trait CURVED_CONNECTOR_5 extends LineType
    
    @js.native
    sealed trait STRAIGHT_CONNECTOR_1 extends LineType
    
    @js.native
    sealed trait STRAIGHT_LINE extends LineType
    
    @js.native
    sealed trait UNSUPPORTED extends LineType
  }
  
  @js.native
  sealed trait LinkType extends StObject
  /**
    * The types of a Link.
    */
  @JSGlobal("GoogleAppsScript.Slides.LinkType")
  @js.native
  object LinkType extends StObject {
    
    @js.native
    sealed trait SLIDE_ID extends LinkType
    
    @js.native
    sealed trait SLIDE_INDEX extends LinkType
    
    @js.native
    sealed trait SLIDE_POSITION extends LinkType
    
    @js.native
    sealed trait UNSUPPORTED extends LinkType
    
    @js.native
    sealed trait URL extends LinkType
  }
  
  @js.native
  sealed trait ListPreset extends StObject
  /**
    * Preset patterns of glyphs for lists in text.
    *
    * These presets use these glyphs:
    *
    * ARROW: An arrow, ➔, corresponding to a Unicode U+2794 code point
    *
    * ARROW3D: An arrow with 3D shading, ➢, corresponding to a Unicode U+27a2 code point
    *
    * CHECKBOX: A hollow square, ❏, corresponding to a Unicode U+274f code point
    *
    * CIRCLE: A hollow circle, ○, corresponding to a Unicode U+25cb code point
    *
    * DIAMOND: A solid diamond, ◆, corresponding to a Unicode U+25c6 code point
    *
    * `DIAMONDX: A diamond with an 'x', ❖, corresponding to a Unicode U+2756 code point
    *
    * HOLLOWDIAMOND: A hollow diamond, ◇, corresponding to a Unicode U+25c7 code point
    *
    * DISC: A solid circle, ●, corresponding to a Unicode U+25cf code point
    *
    * SQUARE: A solid square, ■, corresponding to a Unicode U+25a0 code point
    *
    * STAR: A star, ★, corresponding to a Unicode U+2605 code point
    *
    * ALPHA: A lowercase letter, like 'a', 'b', or 'c'.
    *
    * UPPERALPHA: An uppercase letter, like 'A', 'B', or 'C'.
    *
    * DIGIT: A number, like '1', '2', or '3'.
    *
    * ZERODIGIT: A number where single digit numbers are prefixed with a zero, like '01', '02',
    *       or '03'. Numbers with more than one digit are not prefixed a zero.
    *
    * ROMAN: A lowercase roman numeral, like 'i', 'ii', or 'iii'.
    *
    * UPPERROMAN: A uppercase roman numeral, like 'I', 'II', or 'III'.
    *
    * LEFTTRIANGLE: A triangle pointing left, ◄, corresponding to a Unicode U+25c4 code
    *       point
    */
  @JSGlobal("GoogleAppsScript.Slides.ListPreset")
  @js.native
  object ListPreset extends StObject {
    
    @js.native
    sealed trait ARROW3D_CIRCLE_SQUARE extends ListPreset
    
    @js.native
    sealed trait ARROW_DIAMOND_DISC extends ListPreset
    
    @js.native
    sealed trait CHECKBOX extends ListPreset
    
    @js.native
    sealed trait DIAMONDX_ARROW3D_SQUARE extends ListPreset
    
    @js.native
    sealed trait DIAMONDX_HOLLOWDIAMOND_SQUARE extends ListPreset
    
    @js.native
    sealed trait DIAMOND_CIRCLE_SQUARE extends ListPreset
    
    @js.native
    sealed trait DIGIT_ALPHA_ROMAN extends ListPreset
    
    @js.native
    sealed trait DIGIT_ALPHA_ROMAN_PARENS extends ListPreset
    
    @js.native
    sealed trait DIGIT_NESTED extends ListPreset
    
    @js.native
    sealed trait DISC_CIRCLE_SQUARE extends ListPreset
    
    @js.native
    sealed trait LEFTTRIANGLE_DIAMOND_DISC extends ListPreset
    
    @js.native
    sealed trait STAR_CIRCLE_SQUARE extends ListPreset
    
    @js.native
    sealed trait UPPERALPHA_ALPHA_ROMAN extends ListPreset
    
    @js.native
    sealed trait UPPERROMAN_UPPERALPHA_DIGIT extends ListPreset
    
    @js.native
    sealed trait ZERODIGIT_ALPHA_ROMAN extends ListPreset
  }
  
  @js.native
  sealed trait PageBackgroundType extends StObject
  /**
    * The kinds of page backgrounds.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageBackgroundType")
  @js.native
  object PageBackgroundType extends StObject {
    
    @js.native
    sealed trait NONE extends PageBackgroundType
    
    @js.native
    sealed trait PICTURE extends PageBackgroundType
    
    @js.native
    sealed trait SOLID extends PageBackgroundType
    
    @js.native
    sealed trait UNSUPPORTED extends PageBackgroundType
  }
  
  @js.native
  sealed trait PageElementType extends StObject
  /**
    * The page element type.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageElementType")
  @js.native
  object PageElementType extends StObject {
    
    @js.native
    sealed trait GROUP extends PageElementType
    
    @js.native
    sealed trait IMAGE extends PageElementType
    
    @js.native
    sealed trait LINE extends PageElementType
    
    @js.native
    sealed trait SHAPE extends PageElementType
    
    @js.native
    sealed trait SHEETS_CHART extends PageElementType
    
    @js.native
    sealed trait TABLE extends PageElementType
    
    @js.native
    sealed trait UNSUPPORTED extends PageElementType
    
    @js.native
    sealed trait VIDEO extends PageElementType
    
    @js.native
    sealed trait WORD_ART extends PageElementType
  }
  
  @js.native
  sealed trait PageType extends StObject
  /**
    * The page types.
    */
  @JSGlobal("GoogleAppsScript.Slides.PageType")
  @js.native
  object PageType extends StObject {
    
    @js.native
    sealed trait LAYOUT extends PageType
    
    @js.native
    sealed trait MASTER extends PageType
    
    @js.native
    sealed trait SLIDE extends PageType
    
    @js.native
    sealed trait UNSUPPORTED extends PageType
  }
  
  @js.native
  sealed trait ParagraphAlignment extends StObject
  /**
    * The types of text alignment for a paragraph.
    */
  @JSGlobal("GoogleAppsScript.Slides.ParagraphAlignment")
  @js.native
  object ParagraphAlignment extends StObject {
    
    @js.native
    sealed trait CENTER extends ParagraphAlignment
    
    @js.native
    sealed trait END extends ParagraphAlignment
    
    @js.native
    sealed trait JUSTIFIED extends ParagraphAlignment
    
    @js.native
    sealed trait START extends ParagraphAlignment
    
    @js.native
    sealed trait UNSUPPORTED extends ParagraphAlignment
  }
  
  @js.native
  sealed trait PlaceholderType extends StObject
  /**
    * The placeholder types. Many of these placeholder types correspond to placeholder IDs from the
    * ECMA-376 standard. More information on those shapes can be found in the description of the
    * "ST_PlaceholderType" type in section 19.7.10 of "Office Open XML File Formats - Fundamentals and
    * Markup Language Reference", part 1 of ECMA-376 5th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.PlaceholderType")
  @js.native
  object PlaceholderType extends StObject {
    
    @js.native
    sealed trait BODY extends PlaceholderType
    
    @js.native
    sealed trait CENTERED_TITLE extends PlaceholderType
    
    @js.native
    sealed trait CHART extends PlaceholderType
    
    @js.native
    sealed trait CLIP_ART extends PlaceholderType
    
    @js.native
    sealed trait DATE_AND_TIME extends PlaceholderType
    
    @js.native
    sealed trait DIAGRAM extends PlaceholderType
    
    @js.native
    sealed trait FOOTER extends PlaceholderType
    
    @js.native
    sealed trait HEADER extends PlaceholderType
    
    @js.native
    sealed trait MEDIA extends PlaceholderType
    
    @js.native
    sealed trait NONE extends PlaceholderType
    
    @js.native
    sealed trait OBJECT extends PlaceholderType
    
    @js.native
    sealed trait PICTURE extends PlaceholderType
    
    @js.native
    sealed trait SLIDE_IMAGE extends PlaceholderType
    
    @js.native
    sealed trait SLIDE_NUMBER extends PlaceholderType
    
    @js.native
    sealed trait SUBTITLE extends PlaceholderType
    
    @js.native
    sealed trait TABLE extends PlaceholderType
    
    @js.native
    sealed trait TITLE extends PlaceholderType
    
    @js.native
    sealed trait UNSUPPORTED extends PlaceholderType
  }
  
  @js.native
  sealed trait PredefinedLayout extends StObject
  /**
    * Predefined layouts. These are commonly found layouts in presentations. However, there is no
    * guarantee that these layouts are present in the current master as they could have been deleted or
    * not part of the used theme. Additionally, the placeholders on each layout may have been changed.
    */
  @JSGlobal("GoogleAppsScript.Slides.PredefinedLayout")
  @js.native
  object PredefinedLayout extends StObject {
    
    @js.native
    sealed trait BIG_NUMBER extends PredefinedLayout
    
    @js.native
    sealed trait BLANK extends PredefinedLayout
    
    @js.native
    sealed trait CAPTION_ONLY extends PredefinedLayout
    
    @js.native
    sealed trait MAIN_POINT extends PredefinedLayout
    
    @js.native
    sealed trait ONE_COLUMN_TEXT extends PredefinedLayout
    
    @js.native
    sealed trait SECTION_HEADER extends PredefinedLayout
    
    @js.native
    sealed trait SECTION_TITLE_AND_DESCRIPTION extends PredefinedLayout
    
    @js.native
    sealed trait TITLE extends PredefinedLayout
    
    @js.native
    sealed trait TITLE_AND_BODY extends PredefinedLayout
    
    @js.native
    sealed trait TITLE_AND_TWO_COLUMNS extends PredefinedLayout
    
    @js.native
    sealed trait TITLE_ONLY extends PredefinedLayout
    
    @js.native
    sealed trait UNSUPPORTED extends PredefinedLayout
  }
  
  @js.native
  sealed trait SelectionType extends StObject
  /**
    * Type of Selection.
    *
    * The SelectionType represents the most specific type of one or more objects that are
    * selected. As an example if one or more TableCell instances are selected in a Table, the selection type is SelectionType.TABLE_CELL. The TableCellRange can be
    * retrieved by using the Selection.getTableCellRange. The Table can be retrieved by
    * using the Selection.getPageElementRange and the Page can be retrieved from the
    * Selection.getCurrentPage.
    */
  @JSGlobal("GoogleAppsScript.Slides.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @js.native
    sealed trait CURRENT_PAGE extends SelectionType
    
    @js.native
    sealed trait NONE extends SelectionType
    
    @js.native
    sealed trait PAGE extends SelectionType
    
    @js.native
    sealed trait PAGE_ELEMENT extends SelectionType
    
    @js.native
    sealed trait TABLE_CELL extends SelectionType
    
    @js.native
    sealed trait TEXT extends SelectionType
    
    @js.native
    sealed trait UNSUPPORTED extends SelectionType
  }
  
  @js.native
  sealed trait ShapeType extends StObject
  /**
    * The shape types. Many of these shapes correspond to predefined shapes from the ECMA-376 standard.
    * More information on those shapes can be found in the description of the "ST_ShapeType" simple
    * type in section 20.1.10.55 of "Office Open XML File Formats - Fundamentals and Markup Language
    * Reference", part 1 of ECMA-376 4th
    * edition.
    */
  @JSGlobal("GoogleAppsScript.Slides.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @js.native
    sealed trait ARC extends ShapeType
    
    @js.native
    sealed trait ARROW_EAST extends ShapeType
    
    @js.native
    sealed trait ARROW_NORTH extends ShapeType
    
    @js.native
    sealed trait ARROW_NORTH_EAST extends ShapeType
    
    @js.native
    sealed trait BENT_ARROW extends ShapeType
    
    @js.native
    sealed trait BENT_UP_ARROW extends ShapeType
    
    @js.native
    sealed trait BEVEL extends ShapeType
    
    @js.native
    sealed trait BLOCK_ARC extends ShapeType
    
    @js.native
    sealed trait BRACE_PAIR extends ShapeType
    
    @js.native
    sealed trait BRACKET_PAIR extends ShapeType
    
    @js.native
    sealed trait CAN extends ShapeType
    
    @js.native
    sealed trait CHEVRON extends ShapeType
    
    @js.native
    sealed trait CHORD extends ShapeType
    
    @js.native
    sealed trait CLOUD extends ShapeType
    
    @js.native
    sealed trait CLOUD_CALLOUT extends ShapeType
    
    @js.native
    sealed trait CORNER extends ShapeType
    
    @js.native
    sealed trait CUBE extends ShapeType
    
    @js.native
    sealed trait CURVED_DOWN_ARROW extends ShapeType
    
    @js.native
    sealed trait CURVED_LEFT_ARROW extends ShapeType
    
    @js.native
    sealed trait CURVED_RIGHT_ARROW extends ShapeType
    
    @js.native
    sealed trait CURVED_UP_ARROW extends ShapeType
    
    @js.native
    sealed trait CUSTOM extends ShapeType
    
    @js.native
    sealed trait DECAGON extends ShapeType
    
    @js.native
    sealed trait DIAGONAL_STRIPE extends ShapeType
    
    @js.native
    sealed trait DIAMOND extends ShapeType
    
    @js.native
    sealed trait DODECAGON extends ShapeType
    
    @js.native
    sealed trait DONUT extends ShapeType
    
    @js.native
    sealed trait DOUBLE_WAVE extends ShapeType
    
    @js.native
    sealed trait DOWN_ARROW extends ShapeType
    
    @js.native
    sealed trait DOWN_ARROW_CALLOUT extends ShapeType
    
    @js.native
    sealed trait ELLIPSE extends ShapeType
    
    @js.native
    sealed trait ELLIPSE_RIBBON extends ShapeType
    
    @js.native
    sealed trait ELLIPSE_RIBBON_2 extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_ALTERNATE_PROCESS extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_COLLATE extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_CONNECTOR extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_DECISION extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_DELAY extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_DISPLAY extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_DOCUMENT extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_EXTRACT extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_INPUT_OUTPUT extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_INTERNAL_STORAGE extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MAGNETIC_DISK extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MAGNETIC_DRUM extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MAGNETIC_TAPE extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MANUAL_INPUT extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MANUAL_OPERATION extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MERGE extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_MULTIDOCUMENT extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_OFFLINE_STORAGE extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_OFFPAGE_CONNECTOR extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_ONLINE_STORAGE extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_OR extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_PREDEFINED_PROCESS extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_PREPARATION extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_PROCESS extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_PUNCHED_CARD extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_PUNCHED_TAPE extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_SORT extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_SUMMING_JUNCTION extends ShapeType
    
    @js.native
    sealed trait FLOW_CHART_TERMINATOR extends ShapeType
    
    @js.native
    sealed trait FOLDED_CORNER extends ShapeType
    
    @js.native
    sealed trait FRAME extends ShapeType
    
    @js.native
    sealed trait HALF_FRAME extends ShapeType
    
    @js.native
    sealed trait HEART extends ShapeType
    
    @js.native
    sealed trait HEPTAGON extends ShapeType
    
    @js.native
    sealed trait HEXAGON extends ShapeType
    
    @js.native
    sealed trait HOME_PLATE extends ShapeType
    
    @js.native
    sealed trait HORIZONTAL_SCROLL extends ShapeType
    
    @js.native
    sealed trait IRREGULAR_SEAL_1 extends ShapeType
    
    @js.native
    sealed trait IRREGULAR_SEAL_2 extends ShapeType
    
    @js.native
    sealed trait LEFT_ARROW extends ShapeType
    
    @js.native
    sealed trait LEFT_ARROW_CALLOUT extends ShapeType
    
    @js.native
    sealed trait LEFT_BRACE extends ShapeType
    
    @js.native
    sealed trait LEFT_BRACKET extends ShapeType
    
    @js.native
    sealed trait LEFT_RIGHT_ARROW extends ShapeType
    
    @js.native
    sealed trait LEFT_RIGHT_ARROW_CALLOUT extends ShapeType
    
    @js.native
    sealed trait LEFT_RIGHT_UP_ARROW extends ShapeType
    
    @js.native
    sealed trait LEFT_UP_ARROW extends ShapeType
    
    @js.native
    sealed trait LIGHTNING_BOLT extends ShapeType
    
    @js.native
    sealed trait MATH_DIVIDE extends ShapeType
    
    @js.native
    sealed trait MATH_EQUAL extends ShapeType
    
    @js.native
    sealed trait MATH_MINUS extends ShapeType
    
    @js.native
    sealed trait MATH_MULTIPLY extends ShapeType
    
    @js.native
    sealed trait MATH_NOT_EQUAL extends ShapeType
    
    @js.native
    sealed trait MATH_PLUS extends ShapeType
    
    @js.native
    sealed trait MOON extends ShapeType
    
    @js.native
    sealed trait NOTCHED_RIGHT_ARROW extends ShapeType
    
    @js.native
    sealed trait NO_SMOKING extends ShapeType
    
    @js.native
    sealed trait OCTAGON extends ShapeType
    
    @js.native
    sealed trait PARALLELOGRAM extends ShapeType
    
    @js.native
    sealed trait PENTAGON extends ShapeType
    
    @js.native
    sealed trait PIE extends ShapeType
    
    @js.native
    sealed trait PLAQUE extends ShapeType
    
    @js.native
    sealed trait PLUS extends ShapeType
    
    @js.native
    sealed trait QUAD_ARROW extends ShapeType
    
    @js.native
    sealed trait QUAD_ARROW_CALLOUT extends ShapeType
    
    @js.native
    sealed trait RECTANGLE extends ShapeType
    
    @js.native
    sealed trait RIBBON extends ShapeType
    
    @js.native
    sealed trait RIBBON_2 extends ShapeType
    
    @js.native
    sealed trait RIGHT_ARROW extends ShapeType
    
    @js.native
    sealed trait RIGHT_ARROW_CALLOUT extends ShapeType
    
    @js.native
    sealed trait RIGHT_BRACE extends ShapeType
    
    @js.native
    sealed trait RIGHT_BRACKET extends ShapeType
    
    @js.native
    sealed trait RIGHT_TRIANGLE extends ShapeType
    
    @js.native
    sealed trait ROUND_1_RECTANGLE extends ShapeType
    
    @js.native
    sealed trait ROUND_2_DIAGONAL_RECTANGLE extends ShapeType
    
    @js.native
    sealed trait ROUND_2_SAME_RECTANGLE extends ShapeType
    
    @js.native
    sealed trait ROUND_RECTANGLE extends ShapeType
    
    @js.native
    sealed trait SMILEY_FACE extends ShapeType
    
    @js.native
    sealed trait SNIP_1_RECTANGLE extends ShapeType
    
    @js.native
    sealed trait SNIP_2_DIAGONAL_RECTANGLE extends ShapeType
    
    @js.native
    sealed trait SNIP_2_SAME_RECTANGLE extends ShapeType
    
    @js.native
    sealed trait SNIP_ROUND_RECTANGLE extends ShapeType
    
    @js.native
    sealed trait SPEECH extends ShapeType
    
    @js.native
    sealed trait STARBURST extends ShapeType
    
    @js.native
    sealed trait STAR_10 extends ShapeType
    
    @js.native
    sealed trait STAR_12 extends ShapeType
    
    @js.native
    sealed trait STAR_16 extends ShapeType
    
    @js.native
    sealed trait STAR_24 extends ShapeType
    
    @js.native
    sealed trait STAR_32 extends ShapeType
    
    @js.native
    sealed trait STAR_4 extends ShapeType
    
    @js.native
    sealed trait STAR_5 extends ShapeType
    
    @js.native
    sealed trait STAR_6 extends ShapeType
    
    @js.native
    sealed trait STAR_7 extends ShapeType
    
    @js.native
    sealed trait STAR_8 extends ShapeType
    
    @js.native
    sealed trait STRIPED_RIGHT_ARROW extends ShapeType
    
    @js.native
    sealed trait SUN extends ShapeType
    
    @js.native
    sealed trait TEARDROP extends ShapeType
    
    @js.native
    sealed trait TEXT_BOX extends ShapeType
    
    @js.native
    sealed trait TRAPEZOID extends ShapeType
    
    @js.native
    sealed trait TRIANGLE extends ShapeType
    
    @js.native
    sealed trait UNSUPPORTED extends ShapeType
    
    @js.native
    sealed trait UP_ARROW extends ShapeType
    
    @js.native
    sealed trait UP_ARROW_CALLOUT extends ShapeType
    
    @js.native
    sealed trait UP_DOWN_ARROW extends ShapeType
    
    @js.native
    sealed trait UTURN_ARROW extends ShapeType
    
    @js.native
    sealed trait VERTICAL_SCROLL extends ShapeType
    
    @js.native
    sealed trait WAVE extends ShapeType
    
    @js.native
    sealed trait WEDGE_ELLIPSE_CALLOUT extends ShapeType
    
    @js.native
    sealed trait WEDGE_RECTANGLE_CALLOUT extends ShapeType
    
    @js.native
    sealed trait WEDGE_ROUND_RECTANGLE_CALLOUT extends ShapeType
  }
  
  @js.native
  sealed trait SheetsChartEmbedType extends StObject
  /**
    * The Sheets chart's embed type.
    */
  @JSGlobal("GoogleAppsScript.Slides.SheetsChartEmbedType")
  @js.native
  object SheetsChartEmbedType extends StObject {
    
    @js.native
    sealed trait IMAGE extends SheetsChartEmbedType
    
    @js.native
    sealed trait UNSUPPORTED extends SheetsChartEmbedType
  }
  
  @js.native
  sealed trait SlideLinkingMode extends StObject
  /**
    * The mode of links between slides.
    */
  @JSGlobal("GoogleAppsScript.Slides.SlideLinkingMode")
  @js.native
  object SlideLinkingMode extends StObject {
    
    @js.native
    sealed trait LINKED extends SlideLinkingMode
    
    @js.native
    sealed trait NOT_LINKED extends SlideLinkingMode
    
    @js.native
    sealed trait UNSUPPORTED extends SlideLinkingMode
  }
  
  @js.native
  sealed trait SlidePosition extends StObject
  /**
    * The relative position of a Slide.
    */
  @JSGlobal("GoogleAppsScript.Slides.SlidePosition")
  @js.native
  object SlidePosition extends StObject {
    
    @js.native
    sealed trait FIRST_SLIDE extends SlidePosition
    
    @js.native
    sealed trait LAST_SLIDE extends SlidePosition
    
    @js.native
    sealed trait NEXT_SLIDE extends SlidePosition
    
    @js.native
    sealed trait PREVIOUS_SLIDE extends SlidePosition
  }
  
  @js.native
  sealed trait SpacingMode extends StObject
  /**
    * The different modes for paragraph spacing.
    */
  @JSGlobal("GoogleAppsScript.Slides.SpacingMode")
  @js.native
  object SpacingMode extends StObject {
    
    @js.native
    sealed trait COLLAPSE_LISTS extends SpacingMode
    
    @js.native
    sealed trait NEVER_COLLAPSE extends SpacingMode
    
    @js.native
    sealed trait UNSUPPORTED extends SpacingMode
  }
  
  @js.native
  sealed trait TextBaselineOffset extends StObject
  /**
    * The text vertical offset from its normal position.
    */
  @JSGlobal("GoogleAppsScript.Slides.TextBaselineOffset")
  @js.native
  object TextBaselineOffset extends StObject {
    
    @js.native
    sealed trait NONE extends TextBaselineOffset
    
    @js.native
    sealed trait SUBSCRIPT extends TextBaselineOffset
    
    @js.native
    sealed trait SUPERSCRIPT extends TextBaselineOffset
    
    @js.native
    sealed trait UNSUPPORTED extends TextBaselineOffset
  }
  
  @js.native
  sealed trait TextDirection extends StObject
  /**
    * The directions text can flow in.
    */
  @JSGlobal("GoogleAppsScript.Slides.TextDirection")
  @js.native
  object TextDirection extends StObject {
    
    @js.native
    sealed trait LEFT_TO_RIGHT extends TextDirection
    
    @js.native
    sealed trait RIGHT_TO_LEFT extends TextDirection
    
    @js.native
    sealed trait UNSUPPORTED extends TextDirection
  }
  
  @js.native
  sealed trait ThemeColorType extends StObject
  /**
    * The name of an entry in the page's color scheme.
    */
  @JSGlobal("GoogleAppsScript.Slides.ThemeColorType")
  @js.native
  object ThemeColorType extends StObject {
    
    @js.native
    sealed trait ACCENT1 extends ThemeColorType
    
    @js.native
    sealed trait ACCENT2 extends ThemeColorType
    
    @js.native
    sealed trait ACCENT3 extends ThemeColorType
    
    @js.native
    sealed trait ACCENT4 extends ThemeColorType
    
    @js.native
    sealed trait ACCENT5 extends ThemeColorType
    
    @js.native
    sealed trait ACCENT6 extends ThemeColorType
    
    @js.native
    sealed trait DARK1 extends ThemeColorType
    
    @js.native
    sealed trait DARK2 extends ThemeColorType
    
    @js.native
    sealed trait FOLLOWED_HYPERLINK extends ThemeColorType
    
    @js.native
    sealed trait HYPERLINK extends ThemeColorType
    
    @js.native
    sealed trait LIGHT1 extends ThemeColorType
    
    @js.native
    sealed trait LIGHT2 extends ThemeColorType
    
    @js.native
    sealed trait UNSUPPORTED extends ThemeColorType
  }
  
  @js.native
  sealed trait VideoSourceType extends StObject
  /**
    * The video source types.
    */
  @JSGlobal("GoogleAppsScript.Slides.VideoSourceType")
  @js.native
  object VideoSourceType extends StObject {
    
    @js.native
    sealed trait UNSUPPORTED extends VideoSourceType
    
    @js.native
    sealed trait YOUTUBE extends VideoSourceType
  }
  
  /**
    * A 3x3 matrix used to transform source coordinates (x1, y1) into destination coordinates (x2, y2)
    * according to matrix multiplication:
    *
    *     [ x2 ]   [ scaleX shearX translateX ] [ x1 ]
    *     [ y2 ] = [ shearY scaleY translateY ] [ y1 ]
    *     [ 1  ]   [   0      0        1      ] [ 1  ]
    *
    * After transformation,
    *
    *     x2 = scaleX * x1 + shearX * y1 + translateX
    *     y2 = scaleY * y1 + shearY * x1 + translateY
    */
  @js.native
  trait AffineTransform extends StObject {
    
    def getScaleX(): Double = js.native
    
    def getScaleY(): Double = js.native
    
    def getShearX(): Double = js.native
    
    def getShearY(): Double = js.native
    
    def getTranslateX(): Double = js.native
    
    def getTranslateY(): Double = js.native
    
    def toBuilder(): AffineTransformBuilder = js.native
  }
  object AffineTransform {
    
    @scala.inline
    def apply(
      getScaleX: () => Double,
      getScaleY: () => Double,
      getShearX: () => Double,
      getShearY: () => Double,
      getTranslateX: () => Double,
      getTranslateY: () => Double,
      toBuilder: () => AffineTransformBuilder
    ): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = {
      val __obj = js.Dynamic.literal(getScaleX = js.Any.fromFunction0(getScaleX), getScaleY = js.Any.fromFunction0(getScaleY), getShearX = js.Any.fromFunction0(getShearX), getShearY = js.Any.fromFunction0(getShearY), getTranslateX = js.Any.fromFunction0(getTranslateX), getTranslateY = js.Any.fromFunction0(getTranslateY), toBuilder = js.Any.fromFunction0(toBuilder))
      __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform]
    }
    
    @scala.inline
    implicit class AffineTransformMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetScaleX(value: () => Double): Self = StObject.set(x, "getScaleX", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScaleY(value: () => Double): Self = StObject.set(x, "getScaleY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetShearX(value: () => Double): Self = StObject.set(x, "getShearX", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetShearY(value: () => Double): Self = StObject.set(x, "getShearY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTranslateX(value: () => Double): Self = StObject.set(x, "getTranslateX", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTranslateY(value: () => Double): Self = StObject.set(x, "getTranslateY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToBuilder(value: () => AffineTransformBuilder): Self = StObject.set(x, "toBuilder", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A builder for AffineTransform objects. Defaults to the identity transform.
    *
    * Call AffineTransformBuilder#build() to get the AffineTransform object.
    *
    *     var transform =
    *         SlidesApp.newAffineTransformBuilder().setScaleX(2.0).setShearY(1.1).build();
    *
    *     The resulting transform matrix is
    *       [ 2.0   0.0   0.0 ]
    *       [ 1.1   1.0   0.0 ]
    *       [  0     0     1  ]
    */
  @js.native
  trait AffineTransformBuilder extends StObject {
    
    def build(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def setScaleX(scaleX: Double): AffineTransformBuilder = js.native
    
    def setScaleY(scaleY: Double): AffineTransformBuilder = js.native
    
    def setShearX(shearX: Double): AffineTransformBuilder = js.native
    
    def setShearY(shearY: Double): AffineTransformBuilder = js.native
    
    def setTranslateX(translateX: Double): AffineTransformBuilder = js.native
    
    def setTranslateY(translateY: Double): AffineTransformBuilder = js.native
  }
  object AffineTransformBuilder {
    
    @scala.inline
    def apply(
      build: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform,
      setScaleX: Double => AffineTransformBuilder,
      setScaleY: Double => AffineTransformBuilder,
      setShearX: Double => AffineTransformBuilder,
      setShearY: Double => AffineTransformBuilder,
      setTranslateX: Double => AffineTransformBuilder,
      setTranslateY: Double => AffineTransformBuilder
    ): AffineTransformBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setScaleX = js.Any.fromFunction1(setScaleX), setScaleY = js.Any.fromFunction1(setScaleY), setShearX = js.Any.fromFunction1(setShearX), setShearY = js.Any.fromFunction1(setShearY), setTranslateX = js.Any.fromFunction1(setTranslateX), setTranslateY = js.Any.fromFunction1(setTranslateY))
      __obj.asInstanceOf[AffineTransformBuilder]
    }
    
    @scala.inline
    implicit class AffineTransformBuilderMutableBuilder[Self <: AffineTransformBuilder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetScaleX(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setScaleX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetScaleY(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setScaleY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetShearX(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setShearX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetShearY(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setShearY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTranslateX(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setTranslateX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTranslateY(value: Double => AffineTransformBuilder): Self = StObject.set(x, "setTranslateY", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An element of text that is dynamically replaced with content that can change over time, such as a
    * slide number.
    */
  @js.native
  trait AutoText extends StObject {
    
    def getAutoTextType(): AutoTextType = js.native
    
    def getIndex(): Integer = js.native
    
    def getRange(): TextRange = js.native
  }
  object AutoText {
    
    @scala.inline
    def apply(getAutoTextType: () => AutoTextType, getIndex: () => Integer, getRange: () => TextRange): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AutoText = {
      val __obj = js.Dynamic.literal(getAutoTextType = js.Any.fromFunction0(getAutoTextType), getIndex = js.Any.fromFunction0(getIndex), getRange = js.Any.fromFunction0(getRange))
      __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AutoText]
    }
    
    @scala.inline
    implicit class AutoTextMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AutoText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAutoTextType(value: () => AutoTextType): Self = StObject.set(x, "getAutoTextType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRange(value: () => TextRange): Self = StObject.set(x, "getRange", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Describes the border around an element.
    */
  @js.native
  trait Border extends StObject {
    
    def getDashStyle(): DashStyle = js.native
    
    def getLineFill(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineFill = js.native
    
    def getWeight(): Double = js.native
    
    def isVisible(): Boolean = js.native
    
    def setDashStyle(style: DashStyle): Border = js.native
    
    def setTransparent(): Border = js.native
    
    def setWeight(points: Double): Border = js.native
  }
  object Border {
    
    @scala.inline
    def apply(
      getDashStyle: () => DashStyle,
      getLineFill: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineFill,
      getWeight: () => Double,
      isVisible: () => Boolean,
      setDashStyle: DashStyle => Border,
      setTransparent: () => Border,
      setWeight: Double => Border
    ): Border = {
      val __obj = js.Dynamic.literal(getDashStyle = js.Any.fromFunction0(getDashStyle), getLineFill = js.Any.fromFunction0(getLineFill), getWeight = js.Any.fromFunction0(getWeight), isVisible = js.Any.fromFunction0(isVisible), setDashStyle = js.Any.fromFunction1(setDashStyle), setTransparent = js.Any.fromFunction0(setTransparent), setWeight = js.Any.fromFunction1(setWeight))
      __obj.asInstanceOf[Border]
    }
    
    @scala.inline
    implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDashStyle(value: () => DashStyle): Self = StObject.set(x, "getDashStyle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLineFill(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineFill): Self = StObject.set(x, "getLineFill", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWeight(value: () => Double): Self = StObject.set(x, "getWeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetDashStyle(value: DashStyle => Border): Self = StObject.set(x, "setDashStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTransparent(value: () => Border): Self = StObject.set(x, "setTransparent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetWeight(value: Double => Border): Self = StObject.set(x, "setWeight", js.Any.fromFunction1(value))
    }
  }
  
  object Collection {
    
    object Presentations {
      
      @js.native
      trait PagesCollection extends StObject {
        
        // Gets the latest version of the specified page in the presentation.
        def get(presentationId: String, pageObjectId: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page = js.native
        
        // Generates a thumbnail of the latest version of the specified page in the
        // presentation and returns a URL to the thumbnail image.
        // This request counts as an [expensive read request](/slides/limits) for
        // quota purposes.
        def getThumbnail(presentationId: String, pageObjectId: String): Thumbnail = js.native
        // Generates a thumbnail of the latest version of the specified page in the
        // presentation and returns a URL to the thumbnail image.
        // This request counts as an [expensive read request](/slides/limits) for
        // quota purposes.
        def getThumbnail(presentationId: String, pageObjectId: String, optionalArgs: js.Object): Thumbnail = js.native
      }
    }
    
    @js.native
    trait PresentationsCollection extends StObject {
      
      var Pages: js.UndefOr[PagesCollection] = js.native
      
      // Applies one or more updates to the presentation.
      // Each request is validated before
      // being applied. If any request is not valid, then the entire request will
      // fail and nothing will be applied.
      // Some requests have replies to
      // give you some information about how they are applied. Other requests do
      // not need to return information; these each return an empty reply.
      // The order of replies matches that of the requests.
      // For example, suppose you call batchUpdate with four updates, and only the
      // third one returns information. The response would have two empty replies:
      // the reply to the third request, and another empty reply, in that order.
      // Because other users may be editing the presentation, the presentation
      // might not exactly reflect your changes: your changes may
      // be altered with respect to collaborator changes. If there are no
      // collaborators, the presentation should reflect your changes. In any case,
      // the updates in your request are guaranteed to be applied together
      // atomically.
      def batchUpdate(resource: BatchUpdatePresentationRequest, presentationId: String): BatchUpdatePresentationResponse = js.native
      
      // Creates a blank presentation using the title given in the request. If a
      // `presentationId` is provided, it is used as the ID of the new presentation.
      // Otherwise, a new ID is generated. Other fields in the request, including
      // any provided content, are ignored.
      // Returns the created presentation.
      def create(resource: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation = js.native
      
      // Gets the latest version of the specified presentation.
      def get(presentationId: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation = js.native
    }
    object PresentationsCollection {
      
      @scala.inline
      def apply(
        batchUpdate: (BatchUpdatePresentationRequest, String) => BatchUpdatePresentationResponse,
        create: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation,
        get: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation
      ): PresentationsCollection = {
        val __obj = js.Dynamic.literal(batchUpdate = js.Any.fromFunction2(batchUpdate), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get))
        __obj.asInstanceOf[PresentationsCollection]
      }
      
      @scala.inline
      implicit class PresentationsCollectionMutableBuilder[Self <: PresentationsCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBatchUpdate(value: (BatchUpdatePresentationRequest, String) => BatchUpdatePresentationResponse): Self = StObject.set(x, "batchUpdate", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCreate(
          value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation
        ): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGet(value: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPages(value: PagesCollection): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPagesUndefined: Self = StObject.set(x, "Pages", js.undefined)
      }
    }
  }
  
  /**
    * An opaque color
    */
  @js.native
  trait Color extends StObject {
    
    def asRgbColor(): typingsSlinky.googleAppsScript.GoogleAppsScript.Base.RgbColor = js.native
    
    def asThemeColor(): ThemeColor = js.native
    
    def getColorType(): ColorType = js.native
  }
  object Color {
    
    @scala.inline
    def apply(
      asRgbColor: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Base.RgbColor,
      asThemeColor: () => ThemeColor,
      getColorType: () => ColorType
    ): Color = {
      val __obj = js.Dynamic.literal(asRgbColor = js.Any.fromFunction0(asRgbColor), asThemeColor = js.Any.fromFunction0(asThemeColor), getColorType = js.Any.fromFunction0(getColorType))
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsRgbColor(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Base.RgbColor): Self = StObject.set(x, "asRgbColor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsThemeColor(value: () => ThemeColor): Self = StObject.set(x, "asThemeColor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetColorType(value: () => ColorType): Self = StObject.set(x, "getColorType", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A color scheme defines a mapping from members of ThemeColorType to the actual colors used
    * to render them.
    */
  @js.native
  trait ColorScheme extends StObject {
    
    def getConcreteColor(theme: ThemeColorType): Color = js.native
    
    def getThemeColors(): js.Array[ThemeColorType] = js.native
    
    def setConcreteColor(`type`: ThemeColorType, color: Color): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    def setConcreteColor(`type`: ThemeColorType, hexColor: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    def setConcreteColor(`type`: ThemeColorType, red: Integer, green: Integer, blue: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
  }
  
  /**
    * The connection site on a PageElement that can connect to a connector.
    */
  @js.native
  trait ConnectionSite extends StObject {
    
    def getIndex(): Integer = js.native
    
    def getPageElement(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
  }
  object ConnectionSite {
    
    @scala.inline
    def apply(
      getIndex: () => Integer,
      getPageElement: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement
    ): ConnectionSite = {
      val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex), getPageElement = js.Any.fromFunction0(getPageElement))
      __obj.asInstanceOf[ConnectionSite]
    }
    
    @scala.inline
    implicit class ConnectionSiteMutableBuilder[Self <: ConnectionSite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPageElement(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement): Self = StObject.set(x, "getPageElement", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Describes the page element's background
    */
  @js.native
  trait Fill extends StObject {
    
    def getSolidFill(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SolidFill = js.native
    
    def getType(): FillType = js.native
    
    def isVisible(): Boolean = js.native
    
    def setSolidFill(color: Color): Unit = js.native
    def setSolidFill(color: Color, alpha: Double): Unit = js.native
    def setSolidFill(color: ThemeColorType): Unit = js.native
    def setSolidFill(color: ThemeColorType, alpha: Double): Unit = js.native
    def setSolidFill(hexString: String): Unit = js.native
    def setSolidFill(hexString: String, alpha: Double): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer, alpha: Double): Unit = js.native
    
    def setTransparent(): Unit = js.native
  }
  
  /**
    * A collection of PageElements joined as a single unit.
    */
  @js.native
  trait Group extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def bringForward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def bringToFront(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def duplicate(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getChildren(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def remove(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def scaleWidth(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def sendToBack(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setDescription(description: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setHeight(height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setLeft(left: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setRotation(angle: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setTitle(title: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setTop(top: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def setWidth(width: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def ungroup(): Unit = js.native
  }
  
  /**
    * A PageElement representing an image.
    */
  @js.native
  trait Image extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def bringForward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def bringToFront(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def duplicate(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getAs(contentType: String): Blob = js.native
    
    def getBlob(): Blob = js.native
    
    def getBorder(): Border = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getContentUrl(): String = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getLink(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getSourceUrl(): String = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def remove(): Unit = js.native
    
    def removeLink(): Unit = js.native
    
    def replace(blobSource: BlobSource): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replace(blobSource: BlobSource, crop: Boolean): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replace(imageUrl: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replace(imageUrl: String, crop: Boolean): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def scaleHeight(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def scaleWidth(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def sendToBack(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setDescription(description: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setHeight(height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setLeft(left: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slide: Slide): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setLinkUrl(url: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setRotation(angle: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setTitle(title: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setTop(top: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def setWidth(width: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
  }
  
  /**
    * A layout in a presentation.
    *
    * Each layout serves as a template for slides that inherit from it, determining how content on
    * those slides is arranged and styled.
    */
  @js.native
  trait Layout extends StObject {
    
    def getBackground(): PageBackground = js.native
    
    def getColorScheme(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    
    def getGroups(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLayoutName(): String = js.native
    
    def getLines(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getMaster(): Master = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPageType(): PageType = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getTables(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
    
    def group(pageElements: js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement]): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertGroup(group: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertImage(blobSource: BlobSource): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(image: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(line: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def insertPageElement(pageElement: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def insertShape(shapeType: ShapeType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shape: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertSheetsChart(sheetsChart: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertTable(numRows: Integer, numColumns: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(table: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def insertTextBox(text: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertVideo(videoUrl: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(video: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def insertWordArt(wordArt: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def remove(): Unit = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def selectAsCurrentPage(): Unit = js.native
  }
  
  /**
    * A PageElement representing a line.
    */
  @js.native
  trait Line extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def bringForward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def bringToFront(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def duplicate(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDashStyle(): DashStyle = js.native
    
    def getDescription(): String = js.native
    
    def getEnd(): Point = js.native
    
    def getEndArrow(): ArrowStyle = js.native
    
    def getEndConnection(): ConnectionSite = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getLineCategory(): LineCategory = js.native
    
    def getLineFill(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.LineFill = js.native
    
    def getLineType(): LineType = js.native
    
    def getLink(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getStart(): Point = js.native
    
    def getStartArrow(): ArrowStyle = js.native
    
    def getStartConnection(): ConnectionSite = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def isConnector(): Boolean = js.native
    
    def preconcatenateTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def remove(): Unit = js.native
    
    def removeLink(): Unit = js.native
    
    def reroute(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def scaleHeight(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def scaleWidth(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def sendToBack(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setDashStyle(style: DashStyle): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setDescription(description: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setEnd(left: Double, top: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def setEnd(point: Point): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setEndArrow(style: ArrowStyle): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setEndConnection(connectionSite: ConnectionSite): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setHeight(height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setLeft(left: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setLineCategory(lineCategory: LineCategory): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slide: Slide): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setLinkUrl(url: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setRotation(angle: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setStart(left: Double, top: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def setStart(point: Point): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setStartArrow(style: ArrowStyle): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setStartConnection(connectionSite: ConnectionSite): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setTitle(title: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setTop(top: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setWeight(points: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def setWidth(width: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
  }
  
  /**
    * Describes the fill of a line or outline
    */
  @js.native
  trait LineFill extends StObject {
    
    def getFillType(): LineFillType = js.native
    
    def getSolidFill(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SolidFill = js.native
    
    def setSolidFill(color: Color): Unit = js.native
    def setSolidFill(color: Color, alpha: Double): Unit = js.native
    def setSolidFill(color: ThemeColorType): Unit = js.native
    def setSolidFill(color: ThemeColorType, alpha: Double): Unit = js.native
    def setSolidFill(hexString: String): Unit = js.native
    def setSolidFill(hexString: String, alpha: Double): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer, alpha: Double): Unit = js.native
  }
  
  /**
    * A hypertext link.
    */
  @js.native
  trait Link extends StObject {
    
    def getLinkType(): LinkType = js.native
    
    def getLinkedSlide(): Slide = js.native
    
    def getSlideId(): String = js.native
    
    def getSlideIndex(): Integer = js.native
    
    def getSlidePosition(): SlidePosition = js.native
    
    def getUrl(): String = js.native
  }
  object Link {
    
    @scala.inline
    def apply(
      getLinkType: () => LinkType,
      getLinkedSlide: () => Slide,
      getSlideId: () => String,
      getSlideIndex: () => Integer,
      getSlidePosition: () => SlidePosition,
      getUrl: () => String
    ): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = {
      val __obj = js.Dynamic.literal(getLinkType = js.Any.fromFunction0(getLinkType), getLinkedSlide = js.Any.fromFunction0(getLinkedSlide), getSlideId = js.Any.fromFunction0(getSlideId), getSlideIndex = js.Any.fromFunction0(getSlideIndex), getSlidePosition = js.Any.fromFunction0(getSlidePosition), getUrl = js.Any.fromFunction0(getUrl))
      __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLinkType(value: () => LinkType): Self = StObject.set(x, "getLinkType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLinkedSlide(value: () => Slide): Self = StObject.set(x, "getLinkedSlide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSlideId(value: () => String): Self = StObject.set(x, "getSlideId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSlideIndex(value: () => Integer): Self = StObject.set(x, "getSlideIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSlidePosition(value: () => SlidePosition): Self = StObject.set(x, "getSlidePosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A list in the text.
    */
  @js.native
  trait List extends StObject {
    
    def getListId(): String = js.native
    
    def getListParagraphs(): js.Array[Paragraph] = js.native
  }
  object List {
    
    @scala.inline
    def apply(getListId: () => String, getListParagraphs: () => js.Array[Paragraph]): List = {
      val __obj = js.Dynamic.literal(getListId = js.Any.fromFunction0(getListId), getListParagraphs = js.Any.fromFunction0(getListParagraphs))
      __obj.asInstanceOf[List]
    }
    
    @scala.inline
    implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetListId(value: () => String): Self = StObject.set(x, "getListId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetListParagraphs(value: () => js.Array[Paragraph]): Self = StObject.set(x, "getListParagraphs", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * The list styling for a range of text.
    */
  @js.native
  trait ListStyle extends StObject {
    
    def applyListPreset(listPreset: ListPreset): ListStyle = js.native
    
    def getGlyph(): String = js.native
    
    def getList(): List = js.native
    
    def getNestingLevel(): Integer = js.native
    
    def isInList(): Boolean = js.native
    
    def removeFromList(): ListStyle = js.native
  }
  object ListStyle {
    
    @scala.inline
    def apply(
      applyListPreset: ListPreset => ListStyle,
      getGlyph: () => String,
      getList: () => List,
      getNestingLevel: () => Integer,
      isInList: () => Boolean,
      removeFromList: () => ListStyle
    ): ListStyle = {
      val __obj = js.Dynamic.literal(applyListPreset = js.Any.fromFunction1(applyListPreset), getGlyph = js.Any.fromFunction0(getGlyph), getList = js.Any.fromFunction0(getList), getNestingLevel = js.Any.fromFunction0(getNestingLevel), isInList = js.Any.fromFunction0(isInList), removeFromList = js.Any.fromFunction0(removeFromList))
      __obj.asInstanceOf[ListStyle]
    }
    
    @scala.inline
    implicit class ListStyleMutableBuilder[Self <: ListStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyListPreset(value: ListPreset => ListStyle): Self = StObject.set(x, "applyListPreset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetGlyph(value: () => String): Self = StObject.set(x, "getGlyph", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetList(value: () => List): Self = StObject.set(x, "getList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNestingLevel(value: () => Integer): Self = StObject.set(x, "getNestingLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsInList(value: () => Boolean): Self = StObject.set(x, "isInList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveFromList(value: () => ListStyle): Self = StObject.set(x, "removeFromList", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A master in a presentation.
    *
    * Masters contains all common page elements and the common properties for a set of layouts. They
    * serve three purposes:
    *
    * Placeholder shapes on a master contain the default text styles and shape properties of all
    *       placeholder shapes on pages that use that master.
    *
    * The properties of a master page define the common page properties inherited by its layouts.
    *
    * Any other shapes on the master slide appear on all slides using that master, regardless of
    *       their layout.
    */
  @js.native
  trait Master extends StObject {
    
    def getBackground(): PageBackground = js.native
    
    def getColorScheme(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    
    def getGroups(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLayouts(): js.Array[Layout] = js.native
    
    def getLines(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPageType(): PageType = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getTables(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
    
    def group(pageElements: js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement]): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertGroup(group: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertImage(blobSource: BlobSource): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(image: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(line: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def insertPageElement(pageElement: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def insertShape(shapeType: ShapeType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shape: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertSheetsChart(sheetsChart: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertTable(numRows: Integer, numColumns: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(table: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def insertTextBox(text: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertVideo(videoUrl: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(video: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def insertWordArt(wordArt: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def remove(): Unit = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def selectAsCurrentPage(): Unit = js.native
  }
  
  /**
    * A notes master in a presentation.
    *
    * Notes masters define the default text styles and page elements for all notes pages. Notes
    * masters are read-only.
    */
  @js.native
  trait NotesMaster extends StObject {
    
    def getGroups(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLines(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getTables(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
  }
  
  /**
    * A notes page in a presentation.
    *
    * These pages contain the content for presentation handouts, including a a shape that contains
    * the slide's speaker notes. Each slide has one corresponding notes page. Only the text in the
    * speaker notes shape can be modified.
    */
  @js.native
  trait NotesPage extends StObject {
    
    def getGroups(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLines(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getSpeakerNotesShape(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def getTables(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
  }
  
  /**
    * A page in a presentation.
    */
  @js.native
  trait Page extends StObject {
    
    def asLayout(): Layout = js.native
    
    def asMaster(): Master = js.native
    
    def asSlide(): Slide = js.native
    
    def getBackground(): PageBackground = js.native
    
    def getColorScheme(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    
    def getGroups(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLines(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPageType(): PageType = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getTables(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
    
    def group(pageElements: js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement]): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertGroup(group: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertImage(blobSource: BlobSource): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(image: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(line: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def insertPageElement(pageElement: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def insertShape(shapeType: ShapeType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shape: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertSheetsChart(sheetsChart: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertTable(numRows: Integer, numColumns: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(table: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def insertTextBox(text: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertVideo(videoUrl: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(video: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def insertWordArt(wordArt: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def remove(): Unit = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def selectAsCurrentPage(): Unit = js.native
  }
  
  /**
    * Describes the page's background
    */
  @js.native
  trait PageBackground extends StObject {
    
    def getPictureFill(): PictureFill = js.native
    
    def getSolidFill(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SolidFill = js.native
    
    def getType(): PageBackgroundType = js.native
    
    def isVisible(): Boolean = js.native
    
    def setPictureFill(blobSource: BlobSource): Unit = js.native
    def setPictureFill(imageUrl: String): Unit = js.native
    
    def setSolidFill(color: Color): Unit = js.native
    def setSolidFill(color: Color, alpha: Double): Unit = js.native
    def setSolidFill(color: ThemeColorType): Unit = js.native
    def setSolidFill(color: ThemeColorType, alpha: Double): Unit = js.native
    def setSolidFill(hexString: String): Unit = js.native
    def setSolidFill(hexString: String, alpha: Double): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer): Unit = js.native
    def setSolidFill(red: Integer, green: Integer, blue: Integer, alpha: Double): Unit = js.native
    
    def setTransparent(): Unit = js.native
  }
  
  /**
    * A visual element rendered on a page.
    */
  @js.native
  trait PageElement extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def asGroup(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def asImage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def asLine(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def asShape(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def asSheetsChart(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def asTable(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def asVideo(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def asWordArt(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def bringForward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def bringToFront(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def duplicate(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def remove(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def scaleWidth(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def sendToBack(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setDescription(description: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setHeight(height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setLeft(left: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setRotation(angle: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setTitle(title: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setTop(top: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def setWidth(width: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
  }
  
  /**
    * A collection of one or more PageElement instances.
    */
  @js.native
  trait PageElementRange extends StObject {
    
    def getPageElements(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
  }
  object PageElementRange {
    
    @scala.inline
    def apply(
      getPageElements: () => js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement]
    ): PageElementRange = {
      val __obj = js.Dynamic.literal(getPageElements = js.Any.fromFunction0(getPageElements))
      __obj.asInstanceOf[PageElementRange]
    }
    
    @scala.inline
    implicit class PageElementRangeMutableBuilder[Self <: PageElementRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPageElements(value: () => js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement]): Self = StObject.set(x, "getPageElements", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A collection of one or more Page instances.
    */
  @js.native
  trait PageRange extends StObject {
    
    def getPages(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page] = js.native
  }
  object PageRange {
    
    @scala.inline
    def apply(getPages: () => js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page]): PageRange = {
      val __obj = js.Dynamic.literal(getPages = js.Any.fromFunction0(getPages))
      __obj.asInstanceOf[PageRange]
    }
    
    @scala.inline
    implicit class PageRangeMutableBuilder[Self <: PageRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPages(value: () => js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page]): Self = StObject.set(x, "getPages", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A segment of text terminated by a newline character.
    */
  @js.native
  trait Paragraph extends StObject {
    
    def getIndex(): Integer = js.native
    
    def getRange(): TextRange = js.native
  }
  object Paragraph {
    
    @scala.inline
    def apply(getIndex: () => Integer, getRange: () => TextRange): Paragraph = {
      val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex), getRange = js.Any.fromFunction0(getRange))
      __obj.asInstanceOf[Paragraph]
    }
    
    @scala.inline
    implicit class ParagraphMutableBuilder[Self <: Paragraph] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRange(value: () => TextRange): Self = StObject.set(x, "getRange", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * The styles of text that apply to entire paragraphs.
    *
    * Read methods in this class return null if the corresponding TextRange spans
    * multiple paragraphs, and those paragraphs have different values for the read method being called.
    * To avoid this, query for paragraph styles using the TextRange returned by the Paragraph.getRange() method.
    */
  @js.native
  trait ParagraphStyle extends StObject {
    
    def getIndentEnd(): Double = js.native
    
    def getIndentFirstLine(): Double = js.native
    
    def getIndentStart(): Double = js.native
    
    def getLineSpacing(): Double = js.native
    
    def getParagraphAlignment(): ParagraphAlignment = js.native
    
    def getSpaceAbove(): Double = js.native
    
    def getSpaceBelow(): Double = js.native
    
    def getSpacingMode(): SpacingMode = js.native
    
    def getTextDirection(): TextDirection = js.native
    
    def setIndentEnd(indent: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = js.native
    
    def setIndentFirstLine(indent: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = js.native
    
    def setIndentStart(indent: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = js.native
    
    def setLineSpacing(spacing: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = js.native
    
    def setParagraphAlignment(alignment: ParagraphAlignment): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = js.native
    
    def setSpaceAbove(space: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = js.native
    
    def setSpaceBelow(space: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = js.native
    
    def setSpacingMode(mode: SpacingMode): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = js.native
    
    def setTextDirection(direction: TextDirection): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = js.native
  }
  object ParagraphStyle {
    
    @scala.inline
    def apply(
      getIndentEnd: () => Double,
      getIndentFirstLine: () => Double,
      getIndentStart: () => Double,
      getLineSpacing: () => Double,
      getParagraphAlignment: () => ParagraphAlignment,
      getSpaceAbove: () => Double,
      getSpaceBelow: () => Double,
      getSpacingMode: () => SpacingMode,
      getTextDirection: () => TextDirection,
      setIndentEnd: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setIndentFirstLine: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setIndentStart: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setLineSpacing: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setParagraphAlignment: ParagraphAlignment => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setSpaceAbove: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setSpaceBelow: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setSpacingMode: SpacingMode => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle,
      setTextDirection: TextDirection => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle
    ): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = {
      val __obj = js.Dynamic.literal(getIndentEnd = js.Any.fromFunction0(getIndentEnd), getIndentFirstLine = js.Any.fromFunction0(getIndentFirstLine), getIndentStart = js.Any.fromFunction0(getIndentStart), getLineSpacing = js.Any.fromFunction0(getLineSpacing), getParagraphAlignment = js.Any.fromFunction0(getParagraphAlignment), getSpaceAbove = js.Any.fromFunction0(getSpaceAbove), getSpaceBelow = js.Any.fromFunction0(getSpaceBelow), getSpacingMode = js.Any.fromFunction0(getSpacingMode), getTextDirection = js.Any.fromFunction0(getTextDirection), setIndentEnd = js.Any.fromFunction1(setIndentEnd), setIndentFirstLine = js.Any.fromFunction1(setIndentFirstLine), setIndentStart = js.Any.fromFunction1(setIndentStart), setLineSpacing = js.Any.fromFunction1(setLineSpacing), setParagraphAlignment = js.Any.fromFunction1(setParagraphAlignment), setSpaceAbove = js.Any.fromFunction1(setSpaceAbove), setSpaceBelow = js.Any.fromFunction1(setSpaceBelow), setSpacingMode = js.Any.fromFunction1(setSpacingMode), setTextDirection = js.Any.fromFunction1(setTextDirection))
      __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle]
    }
    
    @scala.inline
    implicit class ParagraphStyleMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetIndentEnd(value: () => Double): Self = StObject.set(x, "getIndentEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIndentFirstLine(value: () => Double): Self = StObject.set(x, "getIndentFirstLine", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIndentStart(value: () => Double): Self = StObject.set(x, "getIndentStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLineSpacing(value: () => Double): Self = StObject.set(x, "getLineSpacing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParagraphAlignment(value: () => ParagraphAlignment): Self = StObject.set(x, "getParagraphAlignment", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSpaceAbove(value: () => Double): Self = StObject.set(x, "getSpaceAbove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSpaceBelow(value: () => Double): Self = StObject.set(x, "getSpaceBelow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSpacingMode(value: () => SpacingMode): Self = StObject.set(x, "getSpacingMode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTextDirection(value: () => TextDirection): Self = StObject.set(x, "getTextDirection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetIndentEnd(value: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setIndentEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIndentFirstLine(value: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setIndentFirstLine", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIndentStart(value: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setIndentStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLineSpacing(value: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setLineSpacing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetParagraphAlignment(value: ParagraphAlignment => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setParagraphAlignment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSpaceAbove(value: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setSpaceAbove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSpaceBelow(value: Double => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setSpaceBelow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSpacingMode(value: SpacingMode => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setSpacingMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTextDirection(value: TextDirection => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle): Self = StObject.set(x, "setTextDirection", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A fill that renders an image that's stretched to the dimensions of its container.
    */
  @js.native
  trait PictureFill extends StObject {
    
    def getAs(contentType: String): Blob = js.native
    
    def getBlob(): Blob = js.native
    
    def getContentUrl(): String = js.native
    
    def getSourceUrl(): String = js.native
  }
  object PictureFill {
    
    @scala.inline
    def apply(
      getAs: String => Blob,
      getBlob: () => Blob,
      getContentUrl: () => String,
      getSourceUrl: () => String
    ): PictureFill = {
      val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getContentUrl = js.Any.fromFunction0(getContentUrl), getSourceUrl = js.Any.fromFunction0(getSourceUrl))
      __obj.asInstanceOf[PictureFill]
    }
    
    @scala.inline
    implicit class PictureFillMutableBuilder[Self <: PictureFill] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAs(value: String => Blob): Self = StObject.set(x, "getAs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBlob(value: () => Blob): Self = StObject.set(x, "getBlob", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentUrl(value: () => String): Self = StObject.set(x, "getContentUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSourceUrl(value: () => String): Self = StObject.set(x, "getSourceUrl", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A point representing a location.
    */
  @js.native
  trait Point extends StObject {
    
    def getX(): Double = js.native
    
    def getY(): Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(getX: () => Double, getY: () => Double): Point = {
      val __obj = js.Dynamic.literal(getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY))
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetY(value: () => Double): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A presentation.
    */
  @js.native
  trait Presentation extends StObject {
    
    def addEditor(emailAddress: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    def addEditor(user: User): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def addEditors(emailAddresses: js.Array[String]): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def addViewer(emailAddress: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    def addViewer(user: User): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def addViewers(emailAddresses: js.Array[String]): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def appendSlide(): Slide = js.native
    def appendSlide(layout: Layout): Slide = js.native
    def appendSlide(predefinedLayout: PredefinedLayout): Slide = js.native
    def appendSlide(slide: Slide): Slide = js.native
    def appendSlide(slide: Slide, linkingMode: SlideLinkingMode): Slide = js.native
    
    def getEditors(): js.Array[User] = js.native
    
    def getId(): String = js.native
    
    def getLayouts(): js.Array[Layout] = js.native
    
    def getMasters(): js.Array[Master] = js.native
    
    def getName(): String = js.native
    
    def getNotesMaster(): NotesMaster = js.native
    
    def getNotesPageHeight(): Double = js.native
    
    def getNotesPageWidth(): Double = js.native
    
    def getPageElementById(id: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageHeight(): Double = js.native
    
    def getPageWidth(): Double = js.native
    
    def getSelection(): Selection = js.native
    
    def getSlideById(id: String): Slide = js.native
    
    def getSlides(): js.Array[Slide] = js.native
    
    def getUrl(): String = js.native
    
    def getViewers(): js.Array[User] = js.native
    
    def insertSlide(insertionIndex: Integer): Slide = js.native
    def insertSlide(insertionIndex: Integer, layout: Layout): Slide = js.native
    def insertSlide(insertionIndex: Integer, predefinedLayout: PredefinedLayout): Slide = js.native
    def insertSlide(insertionIndex: Integer, slide: Slide): Slide = js.native
    def insertSlide(insertionIndex: Integer, slide: Slide, linkingMode: SlideLinkingMode): Slide = js.native
    
    def removeEditor(emailAddress: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    def removeEditor(user: User): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def removeViewer(emailAddress: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    def removeViewer(user: User): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def saveAndClose(): Unit = js.native
    
    def setName(name: String): Unit = js.native
  }
  
  object Schema {
    
    @js.native
    trait AffineTransform extends StObject {
      
      var scaleX: js.UndefOr[Double] = js.native
      
      var scaleY: js.UndefOr[Double] = js.native
      
      var shearX: js.UndefOr[Double] = js.native
      
      var shearY: js.UndefOr[Double] = js.native
      
      var translateX: js.UndefOr[Double] = js.native
      
      var translateY: js.UndefOr[Double] = js.native
      
      var unit: js.UndefOr[String] = js.native
    }
    object AffineTransform {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform]
      }
      
      @scala.inline
      implicit class AffineTransformMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
        
        @scala.inline
        def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
        
        @scala.inline
        def setShearX(value: Double): Self = StObject.set(x, "shearX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShearXUndefined: Self = StObject.set(x, "shearX", js.undefined)
        
        @scala.inline
        def setShearY(value: Double): Self = StObject.set(x, "shearY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShearYUndefined: Self = StObject.set(x, "shearY", js.undefined)
        
        @scala.inline
        def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
        
        @scala.inline
        def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
        
        @scala.inline
        def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      }
    }
    
    @js.native
    trait AutoText extends StObject {
      
      var content: js.UndefOr[String] = js.native
      
      var style: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object AutoText {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText]
      }
      
      @scala.inline
      implicit class AutoTextMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setStyle(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait BatchUpdatePresentationRequest extends StObject {
      
      var requests: js.UndefOr[js.Array[Request]] = js.native
      
      var writeControl: js.UndefOr[WriteControl] = js.native
    }
    object BatchUpdatePresentationRequest {
      
      @scala.inline
      def apply(): BatchUpdatePresentationRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdatePresentationRequest]
      }
      
      @scala.inline
      implicit class BatchUpdatePresentationRequestMutableBuilder[Self <: BatchUpdatePresentationRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRequests(value: js.Array[Request]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
        
        @scala.inline
        def setRequestsVarargs(value: Request*): Self = StObject.set(x, "requests", js.Array(value :_*))
        
        @scala.inline
        def setWriteControl(value: WriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
      }
    }
    
    @js.native
    trait BatchUpdatePresentationResponse extends StObject {
      
      var presentationId: js.UndefOr[String] = js.native
      
      var replies: js.UndefOr[js.Array[Response]] = js.native
      
      var writeControl: js.UndefOr[WriteControl] = js.native
    }
    object BatchUpdatePresentationResponse {
      
      @scala.inline
      def apply(): BatchUpdatePresentationResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchUpdatePresentationResponse]
      }
      
      @scala.inline
      implicit class BatchUpdatePresentationResponseMutableBuilder[Self <: BatchUpdatePresentationResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
        
        @scala.inline
        def setReplies(value: js.Array[Response]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
        
        @scala.inline
        def setRepliesVarargs(value: Response*): Self = StObject.set(x, "replies", js.Array(value :_*))
        
        @scala.inline
        def setWriteControl(value: WriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
      }
    }
    
    @js.native
    trait Bullet extends StObject {
      
      var bulletStyle: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle] = js.native
      
      var glyph: js.UndefOr[String] = js.native
      
      var listId: js.UndefOr[String] = js.native
      
      var nestingLevel: js.UndefOr[Double] = js.native
    }
    object Bullet {
      
      @scala.inline
      def apply(): Bullet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Bullet]
      }
      
      @scala.inline
      implicit class BulletMutableBuilder[Self <: Bullet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBulletStyle(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle): Self = StObject.set(x, "bulletStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBulletStyleUndefined: Self = StObject.set(x, "bulletStyle", js.undefined)
        
        @scala.inline
        def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
        
        @scala.inline
        def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
        
        @scala.inline
        def setNestingLevel(value: Double): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
      }
    }
    
    @js.native
    trait ColorScheme extends StObject {
      
      var colors: js.UndefOr[js.Array[ThemeColorPair]] = js.native
    }
    object ColorScheme {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme]
      }
      
      @scala.inline
      implicit class ColorSchemeMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColors(value: js.Array[ThemeColorPair]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
        
        @scala.inline
        def setColorsVarargs(value: ThemeColorPair*): Self = StObject.set(x, "colors", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ColorStop extends StObject {
      
      var alpha: js.UndefOr[Double] = js.native
      
      var color: js.UndefOr[OpaqueColor] = js.native
      
      var position: js.UndefOr[Double] = js.native
    }
    object ColorStop {
      
      @scala.inline
      def apply(): ColorStop = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ColorStop]
      }
      
      @scala.inline
      implicit class ColorStopMutableBuilder[Self <: ColorStop] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
        
        @scala.inline
        def setColor(value: OpaqueColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
    
    @js.native
    trait CreateImageRequest extends StObject {
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var url: js.UndefOr[String] = js.native
    }
    object CreateImageRequest {
      
      @scala.inline
      def apply(): CreateImageRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateImageRequest]
      }
      
      @scala.inline
      implicit class CreateImageRequestMutableBuilder[Self <: CreateImageRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait CreateImageResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object CreateImageResponse {
      
      @scala.inline
      def apply(): CreateImageResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateImageResponse]
      }
      
      @scala.inline
      implicit class CreateImageResponseMutableBuilder[Self <: CreateImageResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait CreateLineRequest extends StObject {
      
      var category: js.UndefOr[String] = js.native
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.native
      
      var lineCategory: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
    }
    object CreateLineRequest {
      
      @scala.inline
      def apply(): CreateLineRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateLineRequest]
      }
      
      @scala.inline
      implicit class CreateLineRequestMutableBuilder[Self <: CreateLineRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
        
        @scala.inline
        def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        @scala.inline
        def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait CreateLineResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object CreateLineResponse {
      
      @scala.inline
      def apply(): CreateLineResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateLineResponse]
      }
      
      @scala.inline
      implicit class CreateLineResponseMutableBuilder[Self <: CreateLineResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait CreateParagraphBulletsRequest extends StObject {
      
      var bulletPreset: js.UndefOr[String] = js.native
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var textRange: js.UndefOr[Range] = js.native
    }
    object CreateParagraphBulletsRequest {
      
      @scala.inline
      def apply(): CreateParagraphBulletsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateParagraphBulletsRequest]
      }
      
      @scala.inline
      implicit class CreateParagraphBulletsRequestMutableBuilder[Self <: CreateParagraphBulletsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBulletPreset(value: String): Self = StObject.set(x, "bulletPreset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBulletPresetUndefined: Self = StObject.set(x, "bulletPreset", js.undefined)
        
        @scala.inline
        def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
      }
    }
    
    @js.native
    trait CreateShapeRequest extends StObject {
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var shapeType: js.UndefOr[String] = js.native
    }
    object CreateShapeRequest {
      
      @scala.inline
      def apply(): CreateShapeRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateShapeRequest]
      }
      
      @scala.inline
      implicit class CreateShapeRequestMutableBuilder[Self <: CreateShapeRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setShapeType(value: String): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShapeTypeUndefined: Self = StObject.set(x, "shapeType", js.undefined)
      }
    }
    
    @js.native
    trait CreateShapeResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object CreateShapeResponse {
      
      @scala.inline
      def apply(): CreateShapeResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateShapeResponse]
      }
      
      @scala.inline
      implicit class CreateShapeResponseMutableBuilder[Self <: CreateShapeResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait CreateSheetsChartRequest extends StObject {
      
      var chartId: js.UndefOr[Double] = js.native
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.native
      
      var linkingMode: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var spreadsheetId: js.UndefOr[String] = js.native
    }
    object CreateSheetsChartRequest {
      
      @scala.inline
      def apply(): CreateSheetsChartRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateSheetsChartRequest]
      }
      
      @scala.inline
      implicit class CreateSheetsChartRequestMutableBuilder[Self <: CreateSheetsChartRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
        
        @scala.inline
        def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        @scala.inline
        def setLinkingMode(value: String): Self = StObject.set(x, "linkingMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkingModeUndefined: Self = StObject.set(x, "linkingMode", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
      }
    }
    
    @js.native
    trait CreateSheetsChartResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object CreateSheetsChartResponse {
      
      @scala.inline
      def apply(): CreateSheetsChartResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateSheetsChartResponse]
      }
      
      @scala.inline
      implicit class CreateSheetsChartResponseMutableBuilder[Self <: CreateSheetsChartResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait CreateSlideRequest extends StObject {
      
      var insertionIndex: js.UndefOr[Double] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var placeholderIdMappings: js.UndefOr[js.Array[LayoutPlaceholderIdMapping]] = js.native
      
      var slideLayoutReference: js.UndefOr[LayoutReference] = js.native
    }
    object CreateSlideRequest {
      
      @scala.inline
      def apply(): CreateSlideRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateSlideRequest]
      }
      
      @scala.inline
      implicit class CreateSlideRequestMutableBuilder[Self <: CreateSlideRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInsertionIndex(value: Double): Self = StObject.set(x, "insertionIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertionIndexUndefined: Self = StObject.set(x, "insertionIndex", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setPlaceholderIdMappings(value: js.Array[LayoutPlaceholderIdMapping]): Self = StObject.set(x, "placeholderIdMappings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholderIdMappingsUndefined: Self = StObject.set(x, "placeholderIdMappings", js.undefined)
        
        @scala.inline
        def setPlaceholderIdMappingsVarargs(value: LayoutPlaceholderIdMapping*): Self = StObject.set(x, "placeholderIdMappings", js.Array(value :_*))
        
        @scala.inline
        def setSlideLayoutReference(value: LayoutReference): Self = StObject.set(x, "slideLayoutReference", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlideLayoutReferenceUndefined: Self = StObject.set(x, "slideLayoutReference", js.undefined)
      }
    }
    
    @js.native
    trait CreateSlideResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object CreateSlideResponse {
      
      @scala.inline
      def apply(): CreateSlideResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateSlideResponse]
      }
      
      @scala.inline
      implicit class CreateSlideResponseMutableBuilder[Self <: CreateSlideResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait CreateTableRequest extends StObject {
      
      var columns: js.UndefOr[Double] = js.native
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var rows: js.UndefOr[Double] = js.native
    }
    object CreateTableRequest {
      
      @scala.inline
      def apply(): CreateTableRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateTableRequest]
      }
      
      @scala.inline
      implicit class CreateTableRequestMutableBuilder[Self <: CreateTableRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        @scala.inline
        def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      }
    }
    
    @js.native
    trait CreateTableResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object CreateTableResponse {
      
      @scala.inline
      def apply(): CreateTableResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateTableResponse]
      }
      
      @scala.inline
      implicit class CreateTableResponseMutableBuilder[Self <: CreateTableResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait CreateVideoRequest extends StObject {
      
      var elementProperties: js.UndefOr[PageElementProperties] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var source: js.UndefOr[String] = js.native
    }
    object CreateVideoRequest {
      
      @scala.inline
      def apply(): CreateVideoRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateVideoRequest]
      }
      
      @scala.inline
      implicit class CreateVideoRequestMutableBuilder[Self <: CreateVideoRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      }
    }
    
    @js.native
    trait CreateVideoResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object CreateVideoResponse {
      
      @scala.inline
      def apply(): CreateVideoResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateVideoResponse]
      }
      
      @scala.inline
      implicit class CreateVideoResponseMutableBuilder[Self <: CreateVideoResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait CropProperties extends StObject {
      
      var angle: js.UndefOr[Double] = js.native
      
      var bottomOffset: js.UndefOr[Double] = js.native
      
      var leftOffset: js.UndefOr[Double] = js.native
      
      var rightOffset: js.UndefOr[Double] = js.native
      
      var topOffset: js.UndefOr[Double] = js.native
    }
    object CropProperties {
      
      @scala.inline
      def apply(): CropProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CropProperties]
      }
      
      @scala.inline
      implicit class CropPropertiesMutableBuilder[Self <: CropProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
        
        @scala.inline
        def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
        
        @scala.inline
        def setLeftOffset(value: Double): Self = StObject.set(x, "leftOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftOffsetUndefined: Self = StObject.set(x, "leftOffset", js.undefined)
        
        @scala.inline
        def setRightOffset(value: Double): Self = StObject.set(x, "rightOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightOffsetUndefined: Self = StObject.set(x, "rightOffset", js.undefined)
        
        @scala.inline
        def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
      }
    }
    
    @js.native
    trait DeleteObjectRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object DeleteObjectRequest {
      
      @scala.inline
      def apply(): DeleteObjectRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteObjectRequest]
      }
      
      @scala.inline
      implicit class DeleteObjectRequestMutableBuilder[Self <: DeleteObjectRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait DeleteParagraphBulletsRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var textRange: js.UndefOr[Range] = js.native
    }
    object DeleteParagraphBulletsRequest {
      
      @scala.inline
      def apply(): DeleteParagraphBulletsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteParagraphBulletsRequest]
      }
      
      @scala.inline
      implicit class DeleteParagraphBulletsRequestMutableBuilder[Self <: DeleteParagraphBulletsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
      }
    }
    
    @js.native
    trait DeleteTableColumnRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.native
      
      var tableObjectId: js.UndefOr[String] = js.native
    }
    object DeleteTableColumnRequest {
      
      @scala.inline
      def apply(): DeleteTableColumnRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteTableColumnRequest]
      }
      
      @scala.inline
      implicit class DeleteTableColumnRequestMutableBuilder[Self <: DeleteTableColumnRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        @scala.inline
        def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
      }
    }
    
    @js.native
    trait DeleteTableRowRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.native
      
      var tableObjectId: js.UndefOr[String] = js.native
    }
    object DeleteTableRowRequest {
      
      @scala.inline
      def apply(): DeleteTableRowRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteTableRowRequest]
      }
      
      @scala.inline
      implicit class DeleteTableRowRequestMutableBuilder[Self <: DeleteTableRowRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        @scala.inline
        def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
      }
    }
    
    @js.native
    trait DeleteTextRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var textRange: js.UndefOr[Range] = js.native
    }
    object DeleteTextRequest {
      
      @scala.inline
      def apply(): DeleteTextRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteTextRequest]
      }
      
      @scala.inline
      implicit class DeleteTextRequestMutableBuilder[Self <: DeleteTextRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
      }
    }
    
    @js.native
    trait Dimension extends StObject {
      
      var magnitude: js.UndefOr[Double] = js.native
      
      var unit: js.UndefOr[String] = js.native
    }
    object Dimension {
      
      @scala.inline
      def apply(): Dimension = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Dimension]
      }
      
      @scala.inline
      implicit class DimensionMutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
        
        @scala.inline
        def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      }
    }
    
    @js.native
    trait DuplicateObjectRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
      
      var objectIds: js.UndefOr[js.Object] = js.native
    }
    object DuplicateObjectRequest {
      
      @scala.inline
      def apply(): DuplicateObjectRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DuplicateObjectRequest]
      }
      
      @scala.inline
      implicit class DuplicateObjectRequestMutableBuilder[Self <: DuplicateObjectRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setObjectIds(value: js.Object): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
      }
    }
    
    @js.native
    trait DuplicateObjectResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object DuplicateObjectResponse {
      
      @scala.inline
      def apply(): DuplicateObjectResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DuplicateObjectResponse]
      }
      
      @scala.inline
      implicit class DuplicateObjectResponseMutableBuilder[Self <: DuplicateObjectResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait Group extends StObject {
      
      var children: js.UndefOr[
            js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement]
          ] = js.native
    }
    object Group {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Group = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Group]
      }
      
      @scala.inline
      implicit class GroupMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Group] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setChildrenVarargs(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      }
    }
    
    @js.native
    trait GroupObjectsRequest extends StObject {
      
      var childrenObjectIds: js.UndefOr[js.Array[String]] = js.native
      
      var groupObjectId: js.UndefOr[String] = js.native
    }
    object GroupObjectsRequest {
      
      @scala.inline
      def apply(): GroupObjectsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupObjectsRequest]
      }
      
      @scala.inline
      implicit class GroupObjectsRequestMutableBuilder[Self <: GroupObjectsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildrenObjectIds(value: js.Array[String]): Self = StObject.set(x, "childrenObjectIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenObjectIdsUndefined: Self = StObject.set(x, "childrenObjectIds", js.undefined)
        
        @scala.inline
        def setChildrenObjectIdsVarargs(value: String*): Self = StObject.set(x, "childrenObjectIds", js.Array(value :_*))
        
        @scala.inline
        def setGroupObjectId(value: String): Self = StObject.set(x, "groupObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupObjectIdUndefined: Self = StObject.set(x, "groupObjectId", js.undefined)
      }
    }
    
    @js.native
    trait GroupObjectsResponse extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object GroupObjectsResponse {
      
      @scala.inline
      def apply(): GroupObjectsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupObjectsResponse]
      }
      
      @scala.inline
      implicit class GroupObjectsResponseMutableBuilder[Self <: GroupObjectsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait Image extends StObject {
      
      var contentUrl: js.UndefOr[String] = js.native
      
      var imageProperties: js.UndefOr[ImageProperties] = js.native
      
      var sourceUrl: js.UndefOr[String] = js.native
    }
    object Image {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Image = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Image]
      }
      
      @scala.inline
      implicit class ImageMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Image] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
        
        @scala.inline
        def setImageProperties(value: ImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImagePropertiesUndefined: Self = StObject.set(x, "imageProperties", js.undefined)
        
        @scala.inline
        def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
      }
    }
    
    @js.native
    trait ImageProperties extends StObject {
      
      var brightness: js.UndefOr[Double] = js.native
      
      var contrast: js.UndefOr[Double] = js.native
      
      var cropProperties: js.UndefOr[CropProperties] = js.native
      
      var link: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link] = js.native
      
      var outline: js.UndefOr[Outline] = js.native
      
      var recolor: js.UndefOr[Recolor] = js.native
      
      var shadow: js.UndefOr[Shadow] = js.native
      
      var transparency: js.UndefOr[Double] = js.native
    }
    object ImageProperties {
      
      @scala.inline
      def apply(): ImageProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ImageProperties]
      }
      
      @scala.inline
      implicit class ImagePropertiesMutableBuilder[Self <: ImageProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
        
        @scala.inline
        def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
        
        @scala.inline
        def setCropProperties(value: CropProperties): Self = StObject.set(x, "cropProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCropPropertiesUndefined: Self = StObject.set(x, "cropProperties", js.undefined)
        
        @scala.inline
        def setLink(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setOutline(value: Outline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
        
        @scala.inline
        def setRecolor(value: Recolor): Self = StObject.set(x, "recolor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRecolorUndefined: Self = StObject.set(x, "recolor", js.undefined)
        
        @scala.inline
        def setShadow(value: Shadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
        
        @scala.inline
        def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
      }
    }
    
    @js.native
    trait InsertTableColumnsRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.native
      
      var insertRight: js.UndefOr[Boolean] = js.native
      
      var number: js.UndefOr[Double] = js.native
      
      var tableObjectId: js.UndefOr[String] = js.native
    }
    object InsertTableColumnsRequest {
      
      @scala.inline
      def apply(): InsertTableColumnsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertTableColumnsRequest]
      }
      
      @scala.inline
      implicit class InsertTableColumnsRequestMutableBuilder[Self <: InsertTableColumnsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        @scala.inline
        def setInsertRight(value: Boolean): Self = StObject.set(x, "insertRight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertRightUndefined: Self = StObject.set(x, "insertRight", js.undefined)
        
        @scala.inline
        def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
        
        @scala.inline
        def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
      }
    }
    
    @js.native
    trait InsertTableRowsRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.native
      
      var insertBelow: js.UndefOr[Boolean] = js.native
      
      var number: js.UndefOr[Double] = js.native
      
      var tableObjectId: js.UndefOr[String] = js.native
    }
    object InsertTableRowsRequest {
      
      @scala.inline
      def apply(): InsertTableRowsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertTableRowsRequest]
      }
      
      @scala.inline
      implicit class InsertTableRowsRequestMutableBuilder[Self <: InsertTableRowsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        @scala.inline
        def setInsertBelow(value: Boolean): Self = StObject.set(x, "insertBelow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertBelowUndefined: Self = StObject.set(x, "insertBelow", js.undefined)
        
        @scala.inline
        def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
        
        @scala.inline
        def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
      }
    }
    
    @js.native
    trait InsertTextRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.native
      
      var insertionIndex: js.UndefOr[Double] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var text: js.UndefOr[String] = js.native
    }
    object InsertTextRequest {
      
      @scala.inline
      def apply(): InsertTextRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InsertTextRequest]
      }
      
      @scala.inline
      implicit class InsertTextRequestMutableBuilder[Self <: InsertTextRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        @scala.inline
        def setInsertionIndex(value: Double): Self = StObject.set(x, "insertionIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertionIndexUndefined: Self = StObject.set(x, "insertionIndex", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    @js.native
    trait LayoutPlaceholderIdMapping extends StObject {
      
      var layoutPlaceholder: js.UndefOr[Placeholder] = js.native
      
      var layoutPlaceholderObjectId: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
    }
    object LayoutPlaceholderIdMapping {
      
      @scala.inline
      def apply(): LayoutPlaceholderIdMapping = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LayoutPlaceholderIdMapping]
      }
      
      @scala.inline
      implicit class LayoutPlaceholderIdMappingMutableBuilder[Self <: LayoutPlaceholderIdMapping] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLayoutPlaceholder(value: Placeholder): Self = StObject.set(x, "layoutPlaceholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutPlaceholderObjectId(value: String): Self = StObject.set(x, "layoutPlaceholderObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutPlaceholderObjectIdUndefined: Self = StObject.set(x, "layoutPlaceholderObjectId", js.undefined)
        
        @scala.inline
        def setLayoutPlaceholderUndefined: Self = StObject.set(x, "layoutPlaceholder", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait LayoutProperties extends StObject {
      
      var displayName: js.UndefOr[String] = js.native
      
      var masterObjectId: js.UndefOr[String] = js.native
      
      var name: js.UndefOr[String] = js.native
    }
    object LayoutProperties {
      
      @scala.inline
      def apply(): LayoutProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LayoutProperties]
      }
      
      @scala.inline
      implicit class LayoutPropertiesMutableBuilder[Self <: LayoutProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setMasterObjectId(value: String): Self = StObject.set(x, "masterObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMasterObjectIdUndefined: Self = StObject.set(x, "masterObjectId", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait LayoutReference extends StObject {
      
      var layoutId: js.UndefOr[String] = js.native
      
      var predefinedLayout: js.UndefOr[String] = js.native
    }
    object LayoutReference {
      
      @scala.inline
      def apply(): LayoutReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LayoutReference]
      }
      
      @scala.inline
      implicit class LayoutReferenceMutableBuilder[Self <: LayoutReference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLayoutId(value: String): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutIdUndefined: Self = StObject.set(x, "layoutId", js.undefined)
        
        @scala.inline
        def setPredefinedLayout(value: String): Self = StObject.set(x, "predefinedLayout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPredefinedLayoutUndefined: Self = StObject.set(x, "predefinedLayout", js.undefined)
      }
    }
    
    @js.native
    trait Line extends StObject {
      
      var lineCategory: js.UndefOr[String] = js.native
      
      var lineProperties: js.UndefOr[LineProperties] = js.native
      
      var lineType: js.UndefOr[String] = js.native
    }
    object Line {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Line = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Line]
      }
      
      @scala.inline
      implicit class LineMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Line] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
        
        @scala.inline
        def setLineProperties(value: LineProperties): Self = StObject.set(x, "lineProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinePropertiesUndefined: Self = StObject.set(x, "lineProperties", js.undefined)
        
        @scala.inline
        def setLineType(value: String): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineTypeUndefined: Self = StObject.set(x, "lineType", js.undefined)
      }
    }
    
    @js.native
    trait LineConnection extends StObject {
      
      var connectedObjectId: js.UndefOr[String] = js.native
      
      var connectionSiteIndex: js.UndefOr[Double] = js.native
    }
    object LineConnection {
      
      @scala.inline
      def apply(): LineConnection = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LineConnection]
      }
      
      @scala.inline
      implicit class LineConnectionMutableBuilder[Self <: LineConnection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnectedObjectId(value: String): Self = StObject.set(x, "connectedObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectedObjectIdUndefined: Self = StObject.set(x, "connectedObjectId", js.undefined)
        
        @scala.inline
        def setConnectionSiteIndex(value: Double): Self = StObject.set(x, "connectionSiteIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectionSiteIndexUndefined: Self = StObject.set(x, "connectionSiteIndex", js.undefined)
      }
    }
    
    @js.native
    trait LineFill extends StObject {
      
      var solidFill: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.native
    }
    object LineFill {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill]
      }
      
      @scala.inline
      implicit class LineFillMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSolidFill(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
      }
    }
    
    @js.native
    trait LineProperties extends StObject {
      
      var dashStyle: js.UndefOr[String] = js.native
      
      var endArrow: js.UndefOr[String] = js.native
      
      var endConnection: js.UndefOr[LineConnection] = js.native
      
      var lineFill: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill] = js.native
      
      var link: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link] = js.native
      
      var startArrow: js.UndefOr[String] = js.native
      
      var startConnection: js.UndefOr[LineConnection] = js.native
      
      var weight: js.UndefOr[Dimension] = js.native
    }
    object LineProperties {
      
      @scala.inline
      def apply(): LineProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LineProperties]
      }
      
      @scala.inline
      implicit class LinePropertiesMutableBuilder[Self <: LineProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
        
        @scala.inline
        def setEndArrow(value: String): Self = StObject.set(x, "endArrow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndArrowUndefined: Self = StObject.set(x, "endArrow", js.undefined)
        
        @scala.inline
        def setEndConnection(value: LineConnection): Self = StObject.set(x, "endConnection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndConnectionUndefined: Self = StObject.set(x, "endConnection", js.undefined)
        
        @scala.inline
        def setLineFill(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill): Self = StObject.set(x, "lineFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineFillUndefined: Self = StObject.set(x, "lineFill", js.undefined)
        
        @scala.inline
        def setLink(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setStartArrow(value: String): Self = StObject.set(x, "startArrow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartArrowUndefined: Self = StObject.set(x, "startArrow", js.undefined)
        
        @scala.inline
        def setStartConnection(value: LineConnection): Self = StObject.set(x, "startConnection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartConnectionUndefined: Self = StObject.set(x, "startConnection", js.undefined)
        
        @scala.inline
        def setWeight(value: Dimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    @js.native
    trait Link extends StObject {
      
      var pageObjectId: js.UndefOr[String] = js.native
      
      var relativeLink: js.UndefOr[String] = js.native
      
      var slideIndex: js.UndefOr[Double] = js.native
      
      var url: js.UndefOr[String] = js.native
    }
    object Link {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link]
      }
      
      @scala.inline
      implicit class LinkMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
        
        @scala.inline
        def setRelativeLink(value: String): Self = StObject.set(x, "relativeLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelativeLinkUndefined: Self = StObject.set(x, "relativeLink", js.undefined)
        
        @scala.inline
        def setSlideIndex(value: Double): Self = StObject.set(x, "slideIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlideIndexUndefined: Self = StObject.set(x, "slideIndex", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait List extends StObject {
      
      var listId: js.UndefOr[String] = js.native
      
      var nestingLevel: js.UndefOr[js.Object] = js.native
    }
    object List {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.List = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.List]
      }
      
      @scala.inline
      implicit class ListMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.List] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
        
        @scala.inline
        def setNestingLevel(value: js.Object): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
      }
    }
    
    @js.native
    trait MasterProperties extends StObject {
      
      var displayName: js.UndefOr[String] = js.native
    }
    object MasterProperties {
      
      @scala.inline
      def apply(): MasterProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MasterProperties]
      }
      
      @scala.inline
      implicit class MasterPropertiesMutableBuilder[Self <: MasterProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      }
    }
    
    @js.native
    trait MergeTableCellsRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
      
      var tableRange: js.UndefOr[TableRange] = js.native
    }
    object MergeTableCellsRequest {
      
      @scala.inline
      def apply(): MergeTableCellsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MergeTableCellsRequest]
      }
      
      @scala.inline
      implicit class MergeTableCellsRequestMutableBuilder[Self <: MergeTableCellsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
      }
    }
    
    @js.native
    trait NestingLevel extends StObject {
      
      var bulletStyle: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle] = js.native
    }
    object NestingLevel {
      
      @scala.inline
      def apply(): NestingLevel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NestingLevel]
      }
      
      @scala.inline
      implicit class NestingLevelMutableBuilder[Self <: NestingLevel] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBulletStyle(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle): Self = StObject.set(x, "bulletStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBulletStyleUndefined: Self = StObject.set(x, "bulletStyle", js.undefined)
      }
    }
    
    @js.native
    trait NotesProperties extends StObject {
      
      var speakerNotesObjectId: js.UndefOr[String] = js.native
    }
    object NotesProperties {
      
      @scala.inline
      def apply(): NotesProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NotesProperties]
      }
      
      @scala.inline
      implicit class NotesPropertiesMutableBuilder[Self <: NotesProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSpeakerNotesObjectId(value: String): Self = StObject.set(x, "speakerNotesObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeakerNotesObjectIdUndefined: Self = StObject.set(x, "speakerNotesObjectId", js.undefined)
      }
    }
    
    @js.native
    trait OpaqueColor extends StObject {
      
      var rgbColor: js.UndefOr[RgbColor] = js.native
      
      var themeColor: js.UndefOr[String] = js.native
    }
    object OpaqueColor {
      
      @scala.inline
      def apply(): OpaqueColor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OpaqueColor]
      }
      
      @scala.inline
      implicit class OpaqueColorMutableBuilder[Self <: OpaqueColor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRgbColor(value: RgbColor): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
        
        @scala.inline
        def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
      }
    }
    
    @js.native
    trait OptionalColor extends StObject {
      
      var opaqueColor: js.UndefOr[OpaqueColor] = js.native
    }
    object OptionalColor {
      
      @scala.inline
      def apply(): OptionalColor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OptionalColor]
      }
      
      @scala.inline
      implicit class OptionalColorMutableBuilder[Self <: OptionalColor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOpaqueColor(value: OpaqueColor): Self = StObject.set(x, "opaqueColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpaqueColorUndefined: Self = StObject.set(x, "opaqueColor", js.undefined)
      }
    }
    
    @js.native
    trait Outline extends StObject {
      
      var dashStyle: js.UndefOr[String] = js.native
      
      var outlineFill: js.UndefOr[OutlineFill] = js.native
      
      var propertyState: js.UndefOr[String] = js.native
      
      var weight: js.UndefOr[Dimension] = js.native
    }
    object Outline {
      
      @scala.inline
      def apply(): Outline = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Outline]
      }
      
      @scala.inline
      implicit class OutlineMutableBuilder[Self <: Outline] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
        
        @scala.inline
        def setOutlineFill(value: OutlineFill): Self = StObject.set(x, "outlineFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutlineFillUndefined: Self = StObject.set(x, "outlineFill", js.undefined)
        
        @scala.inline
        def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
        
        @scala.inline
        def setWeight(value: Dimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    @js.native
    trait OutlineFill extends StObject {
      
      var solidFill: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.native
    }
    object OutlineFill {
      
      @scala.inline
      def apply(): OutlineFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OutlineFill]
      }
      
      @scala.inline
      implicit class OutlineFillMutableBuilder[Self <: OutlineFill] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSolidFill(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
      }
    }
    
    @js.native
    trait Page extends StObject {
      
      var layoutProperties: js.UndefOr[LayoutProperties] = js.native
      
      var masterProperties: js.UndefOr[MasterProperties] = js.native
      
      var notesProperties: js.UndefOr[NotesProperties] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var pageElements: js.UndefOr[
            js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement]
          ] = js.native
      
      var pageProperties: js.UndefOr[PageProperties] = js.native
      
      var pageType: js.UndefOr[String] = js.native
      
      var revisionId: js.UndefOr[String] = js.native
      
      var slideProperties: js.UndefOr[SlideProperties] = js.native
    }
    object Page {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]
      }
      
      @scala.inline
      implicit class PageMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLayoutProperties(value: LayoutProperties): Self = StObject.set(x, "layoutProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutPropertiesUndefined: Self = StObject.set(x, "layoutProperties", js.undefined)
        
        @scala.inline
        def setMasterProperties(value: MasterProperties): Self = StObject.set(x, "masterProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMasterPropertiesUndefined: Self = StObject.set(x, "masterProperties", js.undefined)
        
        @scala.inline
        def setNotesProperties(value: NotesProperties): Self = StObject.set(x, "notesProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesPropertiesUndefined: Self = StObject.set(x, "notesProperties", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setPageElements(value: js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement]): Self = StObject.set(x, "pageElements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageElementsUndefined: Self = StObject.set(x, "pageElements", js.undefined)
        
        @scala.inline
        def setPageElementsVarargs(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement*): Self = StObject.set(x, "pageElements", js.Array(value :_*))
        
        @scala.inline
        def setPageProperties(value: PageProperties): Self = StObject.set(x, "pageProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPagePropertiesUndefined: Self = StObject.set(x, "pageProperties", js.undefined)
        
        @scala.inline
        def setPageType(value: String): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTypeUndefined: Self = StObject.set(x, "pageType", js.undefined)
        
        @scala.inline
        def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
        
        @scala.inline
        def setSlideProperties(value: SlideProperties): Self = StObject.set(x, "slideProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlidePropertiesUndefined: Self = StObject.set(x, "slideProperties", js.undefined)
      }
    }
    
    @js.native
    trait PageBackgroundFill extends StObject {
      
      var propertyState: js.UndefOr[String] = js.native
      
      var solidFill: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.native
      
      var stretchedPictureFill: js.UndefOr[StretchedPictureFill] = js.native
    }
    object PageBackgroundFill {
      
      @scala.inline
      def apply(): PageBackgroundFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PageBackgroundFill]
      }
      
      @scala.inline
      implicit class PageBackgroundFillMutableBuilder[Self <: PageBackgroundFill] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
        
        @scala.inline
        def setSolidFill(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
        
        @scala.inline
        def setStretchedPictureFill(value: StretchedPictureFill): Self = StObject.set(x, "stretchedPictureFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStretchedPictureFillUndefined: Self = StObject.set(x, "stretchedPictureFill", js.undefined)
      }
    }
    
    @js.native
    trait PageElement extends StObject {
      
      var description: js.UndefOr[String] = js.native
      
      var elementGroup: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Group] = js.native
      
      var image: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Image] = js.native
      
      var line: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Line] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var shape: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape] = js.native
      
      var sheetsChart: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart] = js.native
      
      var size: js.UndefOr[Size] = js.native
      
      var table: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Table] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var transform: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform] = js.native
      
      var video: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Video] = js.native
      
      var wordArt: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt] = js.native
    }
    object PageElement {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement]
      }
      
      @scala.inline
      implicit class PageElementMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setElementGroup(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Group): Self = StObject.set(x, "elementGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementGroupUndefined: Self = StObject.set(x, "elementGroup", js.undefined)
        
        @scala.inline
        def setImage(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        @scala.inline
        def setLine(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setShape(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
        
        @scala.inline
        def setSheetsChart(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart): Self = StObject.set(x, "sheetsChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetsChartUndefined: Self = StObject.set(x, "sheetsChart", js.undefined)
        
        @scala.inline
        def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        @scala.inline
        def setTable(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setTransform(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
        
        @scala.inline
        def setVideo(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Video): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
        
        @scala.inline
        def setWordArt(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt): Self = StObject.set(x, "wordArt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWordArtUndefined: Self = StObject.set(x, "wordArt", js.undefined)
      }
    }
    
    @js.native
    trait PageElementProperties extends StObject {
      
      var pageObjectId: js.UndefOr[String] = js.native
      
      var size: js.UndefOr[Size] = js.native
      
      var transform: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform] = js.native
    }
    object PageElementProperties {
      
      @scala.inline
      def apply(): PageElementProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PageElementProperties]
      }
      
      @scala.inline
      implicit class PageElementPropertiesMutableBuilder[Self <: PageElementProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
        
        @scala.inline
        def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        @scala.inline
        def setTransform(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      }
    }
    
    @js.native
    trait PageProperties extends StObject {
      
      var colorScheme: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme] = js.native
      
      var pageBackgroundFill: js.UndefOr[PageBackgroundFill] = js.native
    }
    object PageProperties {
      
      @scala.inline
      def apply(): PageProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PageProperties]
      }
      
      @scala.inline
      implicit class PagePropertiesMutableBuilder[Self <: PageProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColorScheme(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
        
        @scala.inline
        def setPageBackgroundFill(value: PageBackgroundFill): Self = StObject.set(x, "pageBackgroundFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageBackgroundFillUndefined: Self = StObject.set(x, "pageBackgroundFill", js.undefined)
      }
    }
    
    @js.native
    trait ParagraphMarker extends StObject {
      
      var bullet: js.UndefOr[Bullet] = js.native
      
      var style: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle] = js.native
    }
    object ParagraphMarker {
      
      @scala.inline
      def apply(): ParagraphMarker = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParagraphMarker]
      }
      
      @scala.inline
      implicit class ParagraphMarkerMutableBuilder[Self <: ParagraphMarker] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBullet(value: Bullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
        
        @scala.inline
        def setStyle(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
    
    @js.native
    trait ParagraphStyle extends StObject {
      
      var alignment: js.UndefOr[String] = js.native
      
      var direction: js.UndefOr[String] = js.native
      
      var indentEnd: js.UndefOr[Dimension] = js.native
      
      var indentFirstLine: js.UndefOr[Dimension] = js.native
      
      var indentStart: js.UndefOr[Dimension] = js.native
      
      var lineSpacing: js.UndefOr[Double] = js.native
      
      var spaceAbove: js.UndefOr[Dimension] = js.native
      
      var spaceBelow: js.UndefOr[Dimension] = js.native
      
      var spacingMode: js.UndefOr[String] = js.native
    }
    object ParagraphStyle {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle]
      }
      
      @scala.inline
      implicit class ParagraphStyleMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        @scala.inline
        def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
        
        @scala.inline
        def setIndentEnd(value: Dimension): Self = StObject.set(x, "indentEnd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndentEndUndefined: Self = StObject.set(x, "indentEnd", js.undefined)
        
        @scala.inline
        def setIndentFirstLine(value: Dimension): Self = StObject.set(x, "indentFirstLine", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndentFirstLineUndefined: Self = StObject.set(x, "indentFirstLine", js.undefined)
        
        @scala.inline
        def setIndentStart(value: Dimension): Self = StObject.set(x, "indentStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndentStartUndefined: Self = StObject.set(x, "indentStart", js.undefined)
        
        @scala.inline
        def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
        
        @scala.inline
        def setSpaceAbove(value: Dimension): Self = StObject.set(x, "spaceAbove", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpaceAboveUndefined: Self = StObject.set(x, "spaceAbove", js.undefined)
        
        @scala.inline
        def setSpaceBelow(value: Dimension): Self = StObject.set(x, "spaceBelow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpaceBelowUndefined: Self = StObject.set(x, "spaceBelow", js.undefined)
        
        @scala.inline
        def setSpacingMode(value: String): Self = StObject.set(x, "spacingMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpacingModeUndefined: Self = StObject.set(x, "spacingMode", js.undefined)
      }
    }
    
    @js.native
    trait Placeholder extends StObject {
      
      var index: js.UndefOr[Double] = js.native
      
      var parentObjectId: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Placeholder {
      
      @scala.inline
      def apply(): Placeholder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Placeholder]
      }
      
      @scala.inline
      implicit class PlaceholderMutableBuilder[Self <: Placeholder] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        @scala.inline
        def setParentObjectId(value: String): Self = StObject.set(x, "parentObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentObjectIdUndefined: Self = StObject.set(x, "parentObjectId", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Presentation extends StObject {
      
      var layouts: js.UndefOr[js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]] = js.native
      
      var locale: js.UndefOr[String] = js.native
      
      var masters: js.UndefOr[js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]] = js.native
      
      var notesMaster: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page] = js.native
      
      var pageSize: js.UndefOr[Size] = js.native
      
      var presentationId: js.UndefOr[String] = js.native
      
      var revisionId: js.UndefOr[String] = js.native
      
      var slides: js.UndefOr[js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object Presentation {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation]
      }
      
      @scala.inline
      implicit class PresentationMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLayouts(value: js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutsUndefined: Self = StObject.set(x, "layouts", js.undefined)
        
        @scala.inline
        def setLayoutsVarargs(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page*): Self = StObject.set(x, "layouts", js.Array(value :_*))
        
        @scala.inline
        def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        @scala.inline
        def setMasters(value: js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]): Self = StObject.set(x, "masters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMastersUndefined: Self = StObject.set(x, "masters", js.undefined)
        
        @scala.inline
        def setMastersVarargs(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page*): Self = StObject.set(x, "masters", js.Array(value :_*))
        
        @scala.inline
        def setNotesMaster(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page): Self = StObject.set(x, "notesMaster", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesMasterUndefined: Self = StObject.set(x, "notesMaster", js.undefined)
        
        @scala.inline
        def setPageSize(value: Size): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        @scala.inline
        def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
        
        @scala.inline
        def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
        
        @scala.inline
        def setSlides(value: js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
        
        @scala.inline
        def setSlidesVarargs(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page*): Self = StObject.set(x, "slides", js.Array(value :_*))
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait Range extends StObject {
      
      var endIndex: js.UndefOr[Double] = js.native
      
      var startIndex: js.UndefOr[Double] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Range {
      
      @scala.inline
      def apply(): Range = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Range]
      }
      
      @scala.inline
      implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        @scala.inline
        def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Recolor extends StObject {
      
      var name: js.UndefOr[String] = js.native
      
      var recolorStops: js.UndefOr[js.Array[ColorStop]] = js.native
    }
    object Recolor {
      
      @scala.inline
      def apply(): Recolor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Recolor]
      }
      
      @scala.inline
      implicit class RecolorMutableBuilder[Self <: Recolor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setRecolorStops(value: js.Array[ColorStop]): Self = StObject.set(x, "recolorStops", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRecolorStopsUndefined: Self = StObject.set(x, "recolorStops", js.undefined)
        
        @scala.inline
        def setRecolorStopsVarargs(value: ColorStop*): Self = StObject.set(x, "recolorStops", js.Array(value :_*))
      }
    }
    
    @js.native
    trait RefreshSheetsChartRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object RefreshSheetsChartRequest {
      
      @scala.inline
      def apply(): RefreshSheetsChartRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RefreshSheetsChartRequest]
      }
      
      @scala.inline
      implicit class RefreshSheetsChartRequestMutableBuilder[Self <: RefreshSheetsChartRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait ReplaceAllShapesWithImageRequest extends StObject {
      
      var containsText: js.UndefOr[SubstringMatchCriteria] = js.native
      
      var imageReplaceMethod: js.UndefOr[String] = js.native
      
      var imageUrl: js.UndefOr[String] = js.native
      
      var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
      
      var replaceMethod: js.UndefOr[String] = js.native
    }
    object ReplaceAllShapesWithImageRequest {
      
      @scala.inline
      def apply(): ReplaceAllShapesWithImageRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllShapesWithImageRequest]
      }
      
      @scala.inline
      implicit class ReplaceAllShapesWithImageRequestMutableBuilder[Self <: ReplaceAllShapesWithImageRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContainsText(value: SubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
        
        @scala.inline
        def setImageReplaceMethod(value: String): Self = StObject.set(x, "imageReplaceMethod", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageReplaceMethodUndefined: Self = StObject.set(x, "imageReplaceMethod", js.undefined)
        
        @scala.inline
        def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
        
        @scala.inline
        def setPageObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageObjectIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageObjectIdsUndefined: Self = StObject.set(x, "pageObjectIds", js.undefined)
        
        @scala.inline
        def setPageObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageObjectIds", js.Array(value :_*))
        
        @scala.inline
        def setReplaceMethod(value: String): Self = StObject.set(x, "replaceMethod", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceMethodUndefined: Self = StObject.set(x, "replaceMethod", js.undefined)
      }
    }
    
    @js.native
    trait ReplaceAllShapesWithImageResponse extends StObject {
      
      var occurrencesChanged: js.UndefOr[Double] = js.native
    }
    object ReplaceAllShapesWithImageResponse {
      
      @scala.inline
      def apply(): ReplaceAllShapesWithImageResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllShapesWithImageResponse]
      }
      
      @scala.inline
      implicit class ReplaceAllShapesWithImageResponseMutableBuilder[Self <: ReplaceAllShapesWithImageResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
      }
    }
    
    @js.native
    trait ReplaceAllShapesWithSheetsChartRequest extends StObject {
      
      var chartId: js.UndefOr[Double] = js.native
      
      var containsText: js.UndefOr[SubstringMatchCriteria] = js.native
      
      var linkingMode: js.UndefOr[String] = js.native
      
      var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
      
      var spreadsheetId: js.UndefOr[String] = js.native
    }
    object ReplaceAllShapesWithSheetsChartRequest {
      
      @scala.inline
      def apply(): ReplaceAllShapesWithSheetsChartRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartRequest]
      }
      
      @scala.inline
      implicit class ReplaceAllShapesWithSheetsChartRequestMutableBuilder[Self <: ReplaceAllShapesWithSheetsChartRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
        
        @scala.inline
        def setContainsText(value: SubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
        
        @scala.inline
        def setLinkingMode(value: String): Self = StObject.set(x, "linkingMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkingModeUndefined: Self = StObject.set(x, "linkingMode", js.undefined)
        
        @scala.inline
        def setPageObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageObjectIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageObjectIdsUndefined: Self = StObject.set(x, "pageObjectIds", js.undefined)
        
        @scala.inline
        def setPageObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageObjectIds", js.Array(value :_*))
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
      }
    }
    
    @js.native
    trait ReplaceAllShapesWithSheetsChartResponse extends StObject {
      
      var occurrencesChanged: js.UndefOr[Double] = js.native
    }
    object ReplaceAllShapesWithSheetsChartResponse {
      
      @scala.inline
      def apply(): ReplaceAllShapesWithSheetsChartResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartResponse]
      }
      
      @scala.inline
      implicit class ReplaceAllShapesWithSheetsChartResponseMutableBuilder[Self <: ReplaceAllShapesWithSheetsChartResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
      }
    }
    
    @js.native
    trait ReplaceAllTextRequest extends StObject {
      
      var containsText: js.UndefOr[SubstringMatchCriteria] = js.native
      
      var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
      
      var replaceText: js.UndefOr[String] = js.native
    }
    object ReplaceAllTextRequest {
      
      @scala.inline
      def apply(): ReplaceAllTextRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllTextRequest]
      }
      
      @scala.inline
      implicit class ReplaceAllTextRequestMutableBuilder[Self <: ReplaceAllTextRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContainsText(value: SubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
        
        @scala.inline
        def setPageObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageObjectIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageObjectIdsUndefined: Self = StObject.set(x, "pageObjectIds", js.undefined)
        
        @scala.inline
        def setPageObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageObjectIds", js.Array(value :_*))
        
        @scala.inline
        def setReplaceText(value: String): Self = StObject.set(x, "replaceText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceTextUndefined: Self = StObject.set(x, "replaceText", js.undefined)
      }
    }
    
    @js.native
    trait ReplaceAllTextResponse extends StObject {
      
      var occurrencesChanged: js.UndefOr[Double] = js.native
    }
    object ReplaceAllTextResponse {
      
      @scala.inline
      def apply(): ReplaceAllTextResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceAllTextResponse]
      }
      
      @scala.inline
      implicit class ReplaceAllTextResponseMutableBuilder[Self <: ReplaceAllTextResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
      }
    }
    
    @js.native
    trait ReplaceImageRequest extends StObject {
      
      var imageObjectId: js.UndefOr[String] = js.native
      
      var imageReplaceMethod: js.UndefOr[String] = js.native
      
      var url: js.UndefOr[String] = js.native
    }
    object ReplaceImageRequest {
      
      @scala.inline
      def apply(): ReplaceImageRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReplaceImageRequest]
      }
      
      @scala.inline
      implicit class ReplaceImageRequestMutableBuilder[Self <: ReplaceImageRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setImageObjectId(value: String): Self = StObject.set(x, "imageObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageObjectIdUndefined: Self = StObject.set(x, "imageObjectId", js.undefined)
        
        @scala.inline
        def setImageReplaceMethod(value: String): Self = StObject.set(x, "imageReplaceMethod", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageReplaceMethodUndefined: Self = StObject.set(x, "imageReplaceMethod", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait Request extends StObject {
      
      var createImage: js.UndefOr[CreateImageRequest] = js.native
      
      var createLine: js.UndefOr[CreateLineRequest] = js.native
      
      var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.native
      
      var createShape: js.UndefOr[CreateShapeRequest] = js.native
      
      var createSheetsChart: js.UndefOr[CreateSheetsChartRequest] = js.native
      
      var createSlide: js.UndefOr[CreateSlideRequest] = js.native
      
      var createTable: js.UndefOr[CreateTableRequest] = js.native
      
      var createVideo: js.UndefOr[CreateVideoRequest] = js.native
      
      var deleteObject: js.UndefOr[DeleteObjectRequest] = js.native
      
      var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.native
      
      var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.native
      
      var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.native
      
      var deleteText: js.UndefOr[DeleteTextRequest] = js.native
      
      var duplicateObject: js.UndefOr[DuplicateObjectRequest] = js.native
      
      var groupObjects: js.UndefOr[GroupObjectsRequest] = js.native
      
      var insertTableColumns: js.UndefOr[InsertTableColumnsRequest] = js.native
      
      var insertTableRows: js.UndefOr[InsertTableRowsRequest] = js.native
      
      var insertText: js.UndefOr[InsertTextRequest] = js.native
      
      var mergeTableCells: js.UndefOr[MergeTableCellsRequest] = js.native
      
      var refreshSheetsChart: js.UndefOr[RefreshSheetsChartRequest] = js.native
      
      var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageRequest] = js.native
      
      var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartRequest] = js.native
      
      var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.native
      
      var replaceImage: js.UndefOr[ReplaceImageRequest] = js.native
      
      var rerouteLine: js.UndefOr[RerouteLineRequest] = js.native
      
      var ungroupObjects: js.UndefOr[UngroupObjectsRequest] = js.native
      
      var unmergeTableCells: js.UndefOr[UnmergeTableCellsRequest] = js.native
      
      var updateImageProperties: js.UndefOr[UpdateImagePropertiesRequest] = js.native
      
      var updateLineCategory: js.UndefOr[UpdateLineCategoryRequest] = js.native
      
      var updateLineProperties: js.UndefOr[UpdateLinePropertiesRequest] = js.native
      
      var updatePageElementAltText: js.UndefOr[UpdatePageElementAltTextRequest] = js.native
      
      var updatePageElementTransform: js.UndefOr[UpdatePageElementTransformRequest] = js.native
      
      var updatePageElementsZOrder: js.UndefOr[UpdatePageElementsZOrderRequest] = js.native
      
      var updatePageProperties: js.UndefOr[UpdatePagePropertiesRequest] = js.native
      
      var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.native
      
      var updateShapeProperties: js.UndefOr[UpdateShapePropertiesRequest] = js.native
      
      var updateSlidesPosition: js.UndefOr[UpdateSlidesPositionRequest] = js.native
      
      var updateTableBorderProperties: js.UndefOr[UpdateTableBorderPropertiesRequest] = js.native
      
      var updateTableCellProperties: js.UndefOr[UpdateTableCellPropertiesRequest] = js.native
      
      var updateTableColumnProperties: js.UndefOr[UpdateTableColumnPropertiesRequest] = js.native
      
      var updateTableRowProperties: js.UndefOr[UpdateTableRowPropertiesRequest] = js.native
      
      var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.native
      
      var updateVideoProperties: js.UndefOr[UpdateVideoPropertiesRequest] = js.native
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
        def setCreateImage(value: CreateImageRequest): Self = StObject.set(x, "createImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
        
        @scala.inline
        def setCreateLine(value: CreateLineRequest): Self = StObject.set(x, "createLine", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateLineUndefined: Self = StObject.set(x, "createLine", js.undefined)
        
        @scala.inline
        def setCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = StObject.set(x, "createParagraphBullets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateParagraphBulletsUndefined: Self = StObject.set(x, "createParagraphBullets", js.undefined)
        
        @scala.inline
        def setCreateShape(value: CreateShapeRequest): Self = StObject.set(x, "createShape", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateShapeUndefined: Self = StObject.set(x, "createShape", js.undefined)
        
        @scala.inline
        def setCreateSheetsChart(value: CreateSheetsChartRequest): Self = StObject.set(x, "createSheetsChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateSheetsChartUndefined: Self = StObject.set(x, "createSheetsChart", js.undefined)
        
        @scala.inline
        def setCreateSlide(value: CreateSlideRequest): Self = StObject.set(x, "createSlide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateSlideUndefined: Self = StObject.set(x, "createSlide", js.undefined)
        
        @scala.inline
        def setCreateTable(value: CreateTableRequest): Self = StObject.set(x, "createTable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateTableUndefined: Self = StObject.set(x, "createTable", js.undefined)
        
        @scala.inline
        def setCreateVideo(value: CreateVideoRequest): Self = StObject.set(x, "createVideo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateVideoUndefined: Self = StObject.set(x, "createVideo", js.undefined)
        
        @scala.inline
        def setDeleteObject(value: DeleteObjectRequest): Self = StObject.set(x, "deleteObject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteObjectUndefined: Self = StObject.set(x, "deleteObject", js.undefined)
        
        @scala.inline
        def setDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = StObject.set(x, "deleteParagraphBullets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteParagraphBulletsUndefined: Self = StObject.set(x, "deleteParagraphBullets", js.undefined)
        
        @scala.inline
        def setDeleteTableColumn(value: DeleteTableColumnRequest): Self = StObject.set(x, "deleteTableColumn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteTableColumnUndefined: Self = StObject.set(x, "deleteTableColumn", js.undefined)
        
        @scala.inline
        def setDeleteTableRow(value: DeleteTableRowRequest): Self = StObject.set(x, "deleteTableRow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteTableRowUndefined: Self = StObject.set(x, "deleteTableRow", js.undefined)
        
        @scala.inline
        def setDeleteText(value: DeleteTextRequest): Self = StObject.set(x, "deleteText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteTextUndefined: Self = StObject.set(x, "deleteText", js.undefined)
        
        @scala.inline
        def setDuplicateObject(value: DuplicateObjectRequest): Self = StObject.set(x, "duplicateObject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuplicateObjectUndefined: Self = StObject.set(x, "duplicateObject", js.undefined)
        
        @scala.inline
        def setGroupObjects(value: GroupObjectsRequest): Self = StObject.set(x, "groupObjects", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupObjectsUndefined: Self = StObject.set(x, "groupObjects", js.undefined)
        
        @scala.inline
        def setInsertTableColumns(value: InsertTableColumnsRequest): Self = StObject.set(x, "insertTableColumns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertTableColumnsUndefined: Self = StObject.set(x, "insertTableColumns", js.undefined)
        
        @scala.inline
        def setInsertTableRows(value: InsertTableRowsRequest): Self = StObject.set(x, "insertTableRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertTableRowsUndefined: Self = StObject.set(x, "insertTableRows", js.undefined)
        
        @scala.inline
        def setInsertText(value: InsertTextRequest): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
        
        @scala.inline
        def setMergeTableCells(value: MergeTableCellsRequest): Self = StObject.set(x, "mergeTableCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMergeTableCellsUndefined: Self = StObject.set(x, "mergeTableCells", js.undefined)
        
        @scala.inline
        def setRefreshSheetsChart(value: RefreshSheetsChartRequest): Self = StObject.set(x, "refreshSheetsChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefreshSheetsChartUndefined: Self = StObject.set(x, "refreshSheetsChart", js.undefined)
        
        @scala.inline
        def setReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageRequest): Self = StObject.set(x, "replaceAllShapesWithImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceAllShapesWithImageUndefined: Self = StObject.set(x, "replaceAllShapesWithImage", js.undefined)
        
        @scala.inline
        def setReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartRequest): Self = StObject.set(x, "replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceAllShapesWithSheetsChartUndefined: Self = StObject.set(x, "replaceAllShapesWithSheetsChart", js.undefined)
        
        @scala.inline
        def setReplaceAllText(value: ReplaceAllTextRequest): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
        
        @scala.inline
        def setReplaceImage(value: ReplaceImageRequest): Self = StObject.set(x, "replaceImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceImageUndefined: Self = StObject.set(x, "replaceImage", js.undefined)
        
        @scala.inline
        def setRerouteLine(value: RerouteLineRequest): Self = StObject.set(x, "rerouteLine", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRerouteLineUndefined: Self = StObject.set(x, "rerouteLine", js.undefined)
        
        @scala.inline
        def setUngroupObjects(value: UngroupObjectsRequest): Self = StObject.set(x, "ungroupObjects", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUngroupObjectsUndefined: Self = StObject.set(x, "ungroupObjects", js.undefined)
        
        @scala.inline
        def setUnmergeTableCells(value: UnmergeTableCellsRequest): Self = StObject.set(x, "unmergeTableCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnmergeTableCellsUndefined: Self = StObject.set(x, "unmergeTableCells", js.undefined)
        
        @scala.inline
        def setUpdateImageProperties(value: UpdateImagePropertiesRequest): Self = StObject.set(x, "updateImageProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateImagePropertiesUndefined: Self = StObject.set(x, "updateImageProperties", js.undefined)
        
        @scala.inline
        def setUpdateLineCategory(value: UpdateLineCategoryRequest): Self = StObject.set(x, "updateLineCategory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateLineCategoryUndefined: Self = StObject.set(x, "updateLineCategory", js.undefined)
        
        @scala.inline
        def setUpdateLineProperties(value: UpdateLinePropertiesRequest): Self = StObject.set(x, "updateLineProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateLinePropertiesUndefined: Self = StObject.set(x, "updateLineProperties", js.undefined)
        
        @scala.inline
        def setUpdatePageElementAltText(value: UpdatePageElementAltTextRequest): Self = StObject.set(x, "updatePageElementAltText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatePageElementAltTextUndefined: Self = StObject.set(x, "updatePageElementAltText", js.undefined)
        
        @scala.inline
        def setUpdatePageElementTransform(value: UpdatePageElementTransformRequest): Self = StObject.set(x, "updatePageElementTransform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatePageElementTransformUndefined: Self = StObject.set(x, "updatePageElementTransform", js.undefined)
        
        @scala.inline
        def setUpdatePageElementsZOrder(value: UpdatePageElementsZOrderRequest): Self = StObject.set(x, "updatePageElementsZOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatePageElementsZOrderUndefined: Self = StObject.set(x, "updatePageElementsZOrder", js.undefined)
        
        @scala.inline
        def setUpdatePageProperties(value: UpdatePagePropertiesRequest): Self = StObject.set(x, "updatePageProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatePagePropertiesUndefined: Self = StObject.set(x, "updatePageProperties", js.undefined)
        
        @scala.inline
        def setUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = StObject.set(x, "updateParagraphStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateParagraphStyleUndefined: Self = StObject.set(x, "updateParagraphStyle", js.undefined)
        
        @scala.inline
        def setUpdateShapeProperties(value: UpdateShapePropertiesRequest): Self = StObject.set(x, "updateShapeProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateShapePropertiesUndefined: Self = StObject.set(x, "updateShapeProperties", js.undefined)
        
        @scala.inline
        def setUpdateSlidesPosition(value: UpdateSlidesPositionRequest): Self = StObject.set(x, "updateSlidesPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateSlidesPositionUndefined: Self = StObject.set(x, "updateSlidesPosition", js.undefined)
        
        @scala.inline
        def setUpdateTableBorderProperties(value: UpdateTableBorderPropertiesRequest): Self = StObject.set(x, "updateTableBorderProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateTableBorderPropertiesUndefined: Self = StObject.set(x, "updateTableBorderProperties", js.undefined)
        
        @scala.inline
        def setUpdateTableCellProperties(value: UpdateTableCellPropertiesRequest): Self = StObject.set(x, "updateTableCellProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateTableCellPropertiesUndefined: Self = StObject.set(x, "updateTableCellProperties", js.undefined)
        
        @scala.inline
        def setUpdateTableColumnProperties(value: UpdateTableColumnPropertiesRequest): Self = StObject.set(x, "updateTableColumnProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateTableColumnPropertiesUndefined: Self = StObject.set(x, "updateTableColumnProperties", js.undefined)
        
        @scala.inline
        def setUpdateTableRowProperties(value: UpdateTableRowPropertiesRequest): Self = StObject.set(x, "updateTableRowProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateTableRowPropertiesUndefined: Self = StObject.set(x, "updateTableRowProperties", js.undefined)
        
        @scala.inline
        def setUpdateTextStyle(value: UpdateTextStyleRequest): Self = StObject.set(x, "updateTextStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateTextStyleUndefined: Self = StObject.set(x, "updateTextStyle", js.undefined)
        
        @scala.inline
        def setUpdateVideoProperties(value: UpdateVideoPropertiesRequest): Self = StObject.set(x, "updateVideoProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateVideoPropertiesUndefined: Self = StObject.set(x, "updateVideoProperties", js.undefined)
      }
    }
    
    @js.native
    trait RerouteLineRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
    }
    object RerouteLineRequest {
      
      @scala.inline
      def apply(): RerouteLineRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RerouteLineRequest]
      }
      
      @scala.inline
      implicit class RerouteLineRequestMutableBuilder[Self <: RerouteLineRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait Response extends StObject {
      
      var createImage: js.UndefOr[CreateImageResponse] = js.native
      
      var createLine: js.UndefOr[CreateLineResponse] = js.native
      
      var createShape: js.UndefOr[CreateShapeResponse] = js.native
      
      var createSheetsChart: js.UndefOr[CreateSheetsChartResponse] = js.native
      
      var createSlide: js.UndefOr[CreateSlideResponse] = js.native
      
      var createTable: js.UndefOr[CreateTableResponse] = js.native
      
      var createVideo: js.UndefOr[CreateVideoResponse] = js.native
      
      var duplicateObject: js.UndefOr[DuplicateObjectResponse] = js.native
      
      var groupObjects: js.UndefOr[GroupObjectsResponse] = js.native
      
      var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageResponse] = js.native
      
      var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartResponse] = js.native
      
      var replaceAllText: js.UndefOr[ReplaceAllTextResponse] = js.native
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
        def setCreateImage(value: CreateImageResponse): Self = StObject.set(x, "createImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
        
        @scala.inline
        def setCreateLine(value: CreateLineResponse): Self = StObject.set(x, "createLine", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateLineUndefined: Self = StObject.set(x, "createLine", js.undefined)
        
        @scala.inline
        def setCreateShape(value: CreateShapeResponse): Self = StObject.set(x, "createShape", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateShapeUndefined: Self = StObject.set(x, "createShape", js.undefined)
        
        @scala.inline
        def setCreateSheetsChart(value: CreateSheetsChartResponse): Self = StObject.set(x, "createSheetsChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateSheetsChartUndefined: Self = StObject.set(x, "createSheetsChart", js.undefined)
        
        @scala.inline
        def setCreateSlide(value: CreateSlideResponse): Self = StObject.set(x, "createSlide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateSlideUndefined: Self = StObject.set(x, "createSlide", js.undefined)
        
        @scala.inline
        def setCreateTable(value: CreateTableResponse): Self = StObject.set(x, "createTable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateTableUndefined: Self = StObject.set(x, "createTable", js.undefined)
        
        @scala.inline
        def setCreateVideo(value: CreateVideoResponse): Self = StObject.set(x, "createVideo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateVideoUndefined: Self = StObject.set(x, "createVideo", js.undefined)
        
        @scala.inline
        def setDuplicateObject(value: DuplicateObjectResponse): Self = StObject.set(x, "duplicateObject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuplicateObjectUndefined: Self = StObject.set(x, "duplicateObject", js.undefined)
        
        @scala.inline
        def setGroupObjects(value: GroupObjectsResponse): Self = StObject.set(x, "groupObjects", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupObjectsUndefined: Self = StObject.set(x, "groupObjects", js.undefined)
        
        @scala.inline
        def setReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageResponse): Self = StObject.set(x, "replaceAllShapesWithImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceAllShapesWithImageUndefined: Self = StObject.set(x, "replaceAllShapesWithImage", js.undefined)
        
        @scala.inline
        def setReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartResponse): Self = StObject.set(x, "replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceAllShapesWithSheetsChartUndefined: Self = StObject.set(x, "replaceAllShapesWithSheetsChart", js.undefined)
        
        @scala.inline
        def setReplaceAllText(value: ReplaceAllTextResponse): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
      }
    }
    
    @js.native
    trait RgbColor extends StObject {
      
      var blue: js.UndefOr[Double] = js.native
      
      var green: js.UndefOr[Double] = js.native
      
      var red: js.UndefOr[Double] = js.native
    }
    object RgbColor {
      
      @scala.inline
      def apply(): RgbColor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RgbColor]
      }
      
      @scala.inline
      implicit class RgbColorMutableBuilder[Self <: RgbColor] (val x: Self) extends AnyVal {
        
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
    trait Shadow extends StObject {
      
      var alignment: js.UndefOr[String] = js.native
      
      var alpha: js.UndefOr[Double] = js.native
      
      var blurRadius: js.UndefOr[Dimension] = js.native
      
      var color: js.UndefOr[OpaqueColor] = js.native
      
      var propertyState: js.UndefOr[String] = js.native
      
      var rotateWithShape: js.UndefOr[Boolean] = js.native
      
      var transform: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Shadow {
      
      @scala.inline
      def apply(): Shadow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Shadow]
      }
      
      @scala.inline
      implicit class ShadowMutableBuilder[Self <: Shadow] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        @scala.inline
        def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
        
        @scala.inline
        def setBlurRadius(value: Dimension): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
        
        @scala.inline
        def setColor(value: OpaqueColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
        
        @scala.inline
        def setRotateWithShape(value: Boolean): Self = StObject.set(x, "rotateWithShape", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRotateWithShapeUndefined: Self = StObject.set(x, "rotateWithShape", js.undefined)
        
        @scala.inline
        def setTransform(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Shape extends StObject {
      
      var placeholder: js.UndefOr[Placeholder] = js.native
      
      var shapeProperties: js.UndefOr[ShapeProperties] = js.native
      
      var shapeType: js.UndefOr[String] = js.native
      
      var text: js.UndefOr[TextContent] = js.native
    }
    object Shape {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape]
      }
      
      @scala.inline
      implicit class ShapeMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPlaceholder(value: Placeholder): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        @scala.inline
        def setShapeProperties(value: ShapeProperties): Self = StObject.set(x, "shapeProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShapePropertiesUndefined: Self = StObject.set(x, "shapeProperties", js.undefined)
        
        @scala.inline
        def setShapeType(value: String): Self = StObject.set(x, "shapeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShapeTypeUndefined: Self = StObject.set(x, "shapeType", js.undefined)
        
        @scala.inline
        def setText(value: TextContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    @js.native
    trait ShapeBackgroundFill extends StObject {
      
      var propertyState: js.UndefOr[String] = js.native
      
      var solidFill: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.native
    }
    object ShapeBackgroundFill {
      
      @scala.inline
      def apply(): ShapeBackgroundFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ShapeBackgroundFill]
      }
      
      @scala.inline
      implicit class ShapeBackgroundFillMutableBuilder[Self <: ShapeBackgroundFill] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
        
        @scala.inline
        def setSolidFill(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
      }
    }
    
    @js.native
    trait ShapeProperties extends StObject {
      
      var contentAlignment: js.UndefOr[String] = js.native
      
      var link: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link] = js.native
      
      var outline: js.UndefOr[Outline] = js.native
      
      var shadow: js.UndefOr[Shadow] = js.native
      
      var shapeBackgroundFill: js.UndefOr[ShapeBackgroundFill] = js.native
    }
    object ShapeProperties {
      
      @scala.inline
      def apply(): ShapeProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ShapeProperties]
      }
      
      @scala.inline
      implicit class ShapePropertiesMutableBuilder[Self <: ShapeProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
        
        @scala.inline
        def setLink(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setOutline(value: Outline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
        
        @scala.inline
        def setShadow(value: Shadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
        
        @scala.inline
        def setShapeBackgroundFill(value: ShapeBackgroundFill): Self = StObject.set(x, "shapeBackgroundFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShapeBackgroundFillUndefined: Self = StObject.set(x, "shapeBackgroundFill", js.undefined)
      }
    }
    
    @js.native
    trait SheetsChart extends StObject {
      
      var chartId: js.UndefOr[Double] = js.native
      
      var contentUrl: js.UndefOr[String] = js.native
      
      var sheetsChartProperties: js.UndefOr[SheetsChartProperties] = js.native
      
      var spreadsheetId: js.UndefOr[String] = js.native
    }
    object SheetsChart {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart]
      }
      
      @scala.inline
      implicit class SheetsChartMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
        
        @scala.inline
        def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
        
        @scala.inline
        def setSheetsChartProperties(value: SheetsChartProperties): Self = StObject.set(x, "sheetsChartProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSheetsChartPropertiesUndefined: Self = StObject.set(x, "sheetsChartProperties", js.undefined)
        
        @scala.inline
        def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
      }
    }
    
    @js.native
    trait SheetsChartProperties extends StObject {
      
      var chartImageProperties: js.UndefOr[ImageProperties] = js.native
    }
    object SheetsChartProperties {
      
      @scala.inline
      def apply(): SheetsChartProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SheetsChartProperties]
      }
      
      @scala.inline
      implicit class SheetsChartPropertiesMutableBuilder[Self <: SheetsChartProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChartImageProperties(value: ImageProperties): Self = StObject.set(x, "chartImageProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChartImagePropertiesUndefined: Self = StObject.set(x, "chartImageProperties", js.undefined)
      }
    }
    
    @js.native
    trait Size extends StObject {
      
      var height: js.UndefOr[Dimension] = js.native
      
      var width: js.UndefOr[Dimension] = js.native
    }
    object Size {
      
      @scala.inline
      def apply(): Size = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Size]
      }
      
      @scala.inline
      implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Dimension): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    @js.native
    trait SlideProperties extends StObject {
      
      var layoutObjectId: js.UndefOr[String] = js.native
      
      var masterObjectId: js.UndefOr[String] = js.native
      
      var notesPage: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page] = js.native
    }
    object SlideProperties {
      
      @scala.inline
      def apply(): SlideProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SlideProperties]
      }
      
      @scala.inline
      implicit class SlidePropertiesMutableBuilder[Self <: SlideProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLayoutObjectId(value: String): Self = StObject.set(x, "layoutObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutObjectIdUndefined: Self = StObject.set(x, "layoutObjectId", js.undefined)
        
        @scala.inline
        def setMasterObjectId(value: String): Self = StObject.set(x, "masterObjectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMasterObjectIdUndefined: Self = StObject.set(x, "masterObjectId", js.undefined)
        
        @scala.inline
        def setNotesPage(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page): Self = StObject.set(x, "notesPage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesPageUndefined: Self = StObject.set(x, "notesPage", js.undefined)
      }
    }
    
    @js.native
    trait SolidFill extends StObject {
      
      var alpha: js.UndefOr[Double] = js.native
      
      var color: js.UndefOr[OpaqueColor] = js.native
    }
    object SolidFill {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill]
      }
      
      @scala.inline
      implicit class SolidFillMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
        
        @scala.inline
        def setColor(value: OpaqueColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      }
    }
    
    @js.native
    trait StretchedPictureFill extends StObject {
      
      var contentUrl: js.UndefOr[String] = js.native
      
      var size: js.UndefOr[Size] = js.native
    }
    object StretchedPictureFill {
      
      @scala.inline
      def apply(): StretchedPictureFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StretchedPictureFill]
      }
      
      @scala.inline
      implicit class StretchedPictureFillMutableBuilder[Self <: StretchedPictureFill] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
        
        @scala.inline
        def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
    
    @js.native
    trait SubstringMatchCriteria extends StObject {
      
      var matchCase: js.UndefOr[Boolean] = js.native
      
      var text: js.UndefOr[String] = js.native
    }
    object SubstringMatchCriteria {
      
      @scala.inline
      def apply(): SubstringMatchCriteria = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubstringMatchCriteria]
      }
      
      @scala.inline
      implicit class SubstringMatchCriteriaMutableBuilder[Self <: SubstringMatchCriteria] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    @js.native
    trait Table extends StObject {
      
      var columns: js.UndefOr[Double] = js.native
      
      var horizontalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.native
      
      var rows: js.UndefOr[Double] = js.native
      
      var tableColumns: js.UndefOr[js.Array[TableColumnProperties]] = js.native
      
      var tableRows: js.UndefOr[js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow]] = js.native
      
      var verticalBorderRows: js.UndefOr[js.Array[TableBorderRow]] = js.native
    }
    object Table {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Table = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Table]
      }
      
      @scala.inline
      implicit class TableMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Table] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        @scala.inline
        def setHorizontalBorderRows(value: js.Array[TableBorderRow]): Self = StObject.set(x, "horizontalBorderRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizontalBorderRowsUndefined: Self = StObject.set(x, "horizontalBorderRows", js.undefined)
        
        @scala.inline
        def setHorizontalBorderRowsVarargs(value: TableBorderRow*): Self = StObject.set(x, "horizontalBorderRows", js.Array(value :_*))
        
        @scala.inline
        def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        @scala.inline
        def setTableColumns(value: js.Array[TableColumnProperties]): Self = StObject.set(x, "tableColumns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableColumnsUndefined: Self = StObject.set(x, "tableColumns", js.undefined)
        
        @scala.inline
        def setTableColumnsVarargs(value: TableColumnProperties*): Self = StObject.set(x, "tableColumns", js.Array(value :_*))
        
        @scala.inline
        def setTableRows(value: js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow]): Self = StObject.set(x, "tableRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableRowsUndefined: Self = StObject.set(x, "tableRows", js.undefined)
        
        @scala.inline
        def setTableRowsVarargs(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow*): Self = StObject.set(x, "tableRows", js.Array(value :_*))
        
        @scala.inline
        def setVerticalBorderRows(value: js.Array[TableBorderRow]): Self = StObject.set(x, "verticalBorderRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerticalBorderRowsUndefined: Self = StObject.set(x, "verticalBorderRows", js.undefined)
        
        @scala.inline
        def setVerticalBorderRowsVarargs(value: TableBorderRow*): Self = StObject.set(x, "verticalBorderRows", js.Array(value :_*))
      }
    }
    
    @js.native
    trait TableBorderCell extends StObject {
      
      var location: js.UndefOr[TableCellLocation] = js.native
      
      var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.native
    }
    object TableBorderCell {
      
      @scala.inline
      def apply(): TableBorderCell = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableBorderCell]
      }
      
      @scala.inline
      implicit class TableBorderCellMutableBuilder[Self <: TableBorderCell] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocation(value: TableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setTableBorderProperties(value: TableBorderProperties): Self = StObject.set(x, "tableBorderProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableBorderPropertiesUndefined: Self = StObject.set(x, "tableBorderProperties", js.undefined)
      }
    }
    
    @js.native
    trait TableBorderFill extends StObject {
      
      var solidFill: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.native
    }
    object TableBorderFill {
      
      @scala.inline
      def apply(): TableBorderFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableBorderFill]
      }
      
      @scala.inline
      implicit class TableBorderFillMutableBuilder[Self <: TableBorderFill] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSolidFill(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
      }
    }
    
    @js.native
    trait TableBorderProperties extends StObject {
      
      var dashStyle: js.UndefOr[String] = js.native
      
      var tableBorderFill: js.UndefOr[TableBorderFill] = js.native
      
      var weight: js.UndefOr[Dimension] = js.native
    }
    object TableBorderProperties {
      
      @scala.inline
      def apply(): TableBorderProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableBorderProperties]
      }
      
      @scala.inline
      implicit class TableBorderPropertiesMutableBuilder[Self <: TableBorderProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
        
        @scala.inline
        def setTableBorderFill(value: TableBorderFill): Self = StObject.set(x, "tableBorderFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableBorderFillUndefined: Self = StObject.set(x, "tableBorderFill", js.undefined)
        
        @scala.inline
        def setWeight(value: Dimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    @js.native
    trait TableBorderRow extends StObject {
      
      var tableBorderCells: js.UndefOr[js.Array[TableBorderCell]] = js.native
    }
    object TableBorderRow {
      
      @scala.inline
      def apply(): TableBorderRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableBorderRow]
      }
      
      @scala.inline
      implicit class TableBorderRowMutableBuilder[Self <: TableBorderRow] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTableBorderCells(value: js.Array[TableBorderCell]): Self = StObject.set(x, "tableBorderCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableBorderCellsUndefined: Self = StObject.set(x, "tableBorderCells", js.undefined)
        
        @scala.inline
        def setTableBorderCellsVarargs(value: TableBorderCell*): Self = StObject.set(x, "tableBorderCells", js.Array(value :_*))
      }
    }
    
    @js.native
    trait TableCell extends StObject {
      
      var columnSpan: js.UndefOr[Double] = js.native
      
      var location: js.UndefOr[TableCellLocation] = js.native
      
      var rowSpan: js.UndefOr[Double] = js.native
      
      var tableCellProperties: js.UndefOr[TableCellProperties] = js.native
      
      var text: js.UndefOr[TextContent] = js.native
    }
    object TableCell {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell]
      }
      
      @scala.inline
      implicit class TableCellMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
        
        @scala.inline
        def setLocation(value: TableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
        
        @scala.inline
        def setTableCellProperties(value: TableCellProperties): Self = StObject.set(x, "tableCellProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableCellPropertiesUndefined: Self = StObject.set(x, "tableCellProperties", js.undefined)
        
        @scala.inline
        def setText(value: TextContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    @js.native
    trait TableCellBackgroundFill extends StObject {
      
      var propertyState: js.UndefOr[String] = js.native
      
      var solidFill: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.native
    }
    object TableCellBackgroundFill {
      
      @scala.inline
      def apply(): TableCellBackgroundFill = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCellBackgroundFill]
      }
      
      @scala.inline
      implicit class TableCellBackgroundFillMutableBuilder[Self <: TableCellBackgroundFill] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
        
        @scala.inline
        def setSolidFill(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
      }
    }
    
    @js.native
    trait TableCellLocation extends StObject {
      
      var columnIndex: js.UndefOr[Double] = js.native
      
      var rowIndex: js.UndefOr[Double] = js.native
    }
    object TableCellLocation {
      
      @scala.inline
      def apply(): TableCellLocation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCellLocation]
      }
      
      @scala.inline
      implicit class TableCellLocationMutableBuilder[Self <: TableCellLocation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
        
        @scala.inline
        def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      }
    }
    
    @js.native
    trait TableCellProperties extends StObject {
      
      var contentAlignment: js.UndefOr[String] = js.native
      
      var tableCellBackgroundFill: js.UndefOr[TableCellBackgroundFill] = js.native
    }
    object TableCellProperties {
      
      @scala.inline
      def apply(): TableCellProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCellProperties]
      }
      
      @scala.inline
      implicit class TableCellPropertiesMutableBuilder[Self <: TableCellProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
        
        @scala.inline
        def setTableCellBackgroundFill(value: TableCellBackgroundFill): Self = StObject.set(x, "tableCellBackgroundFill", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableCellBackgroundFillUndefined: Self = StObject.set(x, "tableCellBackgroundFill", js.undefined)
      }
    }
    
    @js.native
    trait TableColumnProperties extends StObject {
      
      var columnWidth: js.UndefOr[Dimension] = js.native
    }
    object TableColumnProperties {
      
      @scala.inline
      def apply(): TableColumnProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableColumnProperties]
      }
      
      @scala.inline
      implicit class TableColumnPropertiesMutableBuilder[Self <: TableColumnProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnWidth(value: Dimension): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      }
    }
    
    @js.native
    trait TableRange extends StObject {
      
      var columnSpan: js.UndefOr[Double] = js.native
      
      var location: js.UndefOr[TableCellLocation] = js.native
      
      var rowSpan: js.UndefOr[Double] = js.native
    }
    object TableRange {
      
      @scala.inline
      def apply(): TableRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableRange]
      }
      
      @scala.inline
      implicit class TableRangeMutableBuilder[Self <: TableRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
        
        @scala.inline
        def setLocation(value: TableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      }
    }
    
    @js.native
    trait TableRow extends StObject {
      
      var rowHeight: js.UndefOr[Dimension] = js.native
      
      var tableCells: js.UndefOr[
            js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell]
          ] = js.native
      
      var tableRowProperties: js.UndefOr[TableRowProperties] = js.native
    }
    object TableRow {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow]
      }
      
      @scala.inline
      implicit class TableRowMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRowHeight(value: Dimension): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
        
        @scala.inline
        def setTableCells(value: js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell]): Self = StObject.set(x, "tableCells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableCellsUndefined: Self = StObject.set(x, "tableCells", js.undefined)
        
        @scala.inline
        def setTableCellsVarargs(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell*): Self = StObject.set(x, "tableCells", js.Array(value :_*))
        
        @scala.inline
        def setTableRowProperties(value: TableRowProperties): Self = StObject.set(x, "tableRowProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableRowPropertiesUndefined: Self = StObject.set(x, "tableRowProperties", js.undefined)
      }
    }
    
    @js.native
    trait TableRowProperties extends StObject {
      
      var minRowHeight: js.UndefOr[Dimension] = js.native
    }
    object TableRowProperties {
      
      @scala.inline
      def apply(): TableRowProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableRowProperties]
      }
      
      @scala.inline
      implicit class TableRowPropertiesMutableBuilder[Self <: TableRowProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMinRowHeight(value: Dimension): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
      }
    }
    
    @js.native
    trait TextContent extends StObject {
      
      var lists: js.UndefOr[js.Object] = js.native
      
      var textElements: js.UndefOr[js.Array[TextElement]] = js.native
    }
    object TextContent {
      
      @scala.inline
      def apply(): TextContent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextContent]
      }
      
      @scala.inline
      implicit class TextContentMutableBuilder[Self <: TextContent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLists(value: js.Object): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
        
        @scala.inline
        def setTextElements(value: js.Array[TextElement]): Self = StObject.set(x, "textElements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextElementsUndefined: Self = StObject.set(x, "textElements", js.undefined)
        
        @scala.inline
        def setTextElementsVarargs(value: TextElement*): Self = StObject.set(x, "textElements", js.Array(value :_*))
      }
    }
    
    @js.native
    trait TextElement extends StObject {
      
      var autoText: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText] = js.native
      
      var endIndex: js.UndefOr[Double] = js.native
      
      var paragraphMarker: js.UndefOr[ParagraphMarker] = js.native
      
      var startIndex: js.UndefOr[Double] = js.native
      
      var textRun: js.UndefOr[TextRun] = js.native
    }
    object TextElement {
      
      @scala.inline
      def apply(): TextElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextElement]
      }
      
      @scala.inline
      implicit class TextElementMutableBuilder[Self <: TextElement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoText(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
        
        @scala.inline
        def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        @scala.inline
        def setParagraphMarker(value: ParagraphMarker): Self = StObject.set(x, "paragraphMarker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParagraphMarkerUndefined: Self = StObject.set(x, "paragraphMarker", js.undefined)
        
        @scala.inline
        def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        @scala.inline
        def setTextRun(value: TextRun): Self = StObject.set(x, "textRun", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextRunUndefined: Self = StObject.set(x, "textRun", js.undefined)
      }
    }
    
    @js.native
    trait TextRun extends StObject {
      
      var content: js.UndefOr[String] = js.native
      
      var style: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle] = js.native
    }
    object TextRun {
      
      @scala.inline
      def apply(): TextRun = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TextRun]
      }
      
      @scala.inline
      implicit class TextRunMutableBuilder[Self <: TextRun] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setStyle(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
    
    @js.native
    trait TextStyle extends StObject {
      
      var backgroundColor: js.UndefOr[OptionalColor] = js.native
      
      var baselineOffset: js.UndefOr[String] = js.native
      
      var bold: js.UndefOr[Boolean] = js.native
      
      var fontFamily: js.UndefOr[String] = js.native
      
      var fontSize: js.UndefOr[Dimension] = js.native
      
      var foregroundColor: js.UndefOr[OptionalColor] = js.native
      
      var italic: js.UndefOr[Boolean] = js.native
      
      var link: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link] = js.native
      
      var smallCaps: js.UndefOr[Boolean] = js.native
      
      var strikethrough: js.UndefOr[Boolean] = js.native
      
      var underline: js.UndefOr[Boolean] = js.native
      
      var weightedFontFamily: js.UndefOr[WeightedFontFamily] = js.native
    }
    object TextStyle {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle]
      }
      
      @scala.inline
      implicit class TextStyleMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackgroundColor(value: OptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        @scala.inline
        def setBaselineOffset(value: String): Self = StObject.set(x, "baselineOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaselineOffsetUndefined: Self = StObject.set(x, "baselineOffset", js.undefined)
        
        @scala.inline
        def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
        
        @scala.inline
        def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
        
        @scala.inline
        def setFontSize(value: Dimension): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
        
        @scala.inline
        def setForegroundColor(value: OptionalColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
        
        @scala.inline
        def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
        
        @scala.inline
        def setLink(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setSmallCaps(value: Boolean): Self = StObject.set(x, "smallCaps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSmallCapsUndefined: Self = StObject.set(x, "smallCaps", js.undefined)
        
        @scala.inline
        def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
        
        @scala.inline
        def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
        
        @scala.inline
        def setWeightedFontFamily(value: WeightedFontFamily): Self = StObject.set(x, "weightedFontFamily", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeightedFontFamilyUndefined: Self = StObject.set(x, "weightedFontFamily", js.undefined)
      }
    }
    
    @js.native
    trait ThemeColorPair extends StObject {
      
      var color: js.UndefOr[RgbColor] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object ThemeColorPair {
      
      @scala.inline
      def apply(): ThemeColorPair = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ThemeColorPair]
      }
      
      @scala.inline
      implicit class ThemeColorPairMutableBuilder[Self <: ThemeColorPair] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColor(value: RgbColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Thumbnail extends StObject {
      
      var contentUrl: js.UndefOr[String] = js.native
      
      var height: js.UndefOr[Double] = js.native
      
      var width: js.UndefOr[Double] = js.native
    }
    object Thumbnail {
      
      @scala.inline
      def apply(): Thumbnail = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Thumbnail]
      }
      
      @scala.inline
      implicit class ThumbnailMutableBuilder[Self <: Thumbnail] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    @js.native
    trait UngroupObjectsRequest extends StObject {
      
      var objectIds: js.UndefOr[js.Array[String]] = js.native
    }
    object UngroupObjectsRequest {
      
      @scala.inline
      def apply(): UngroupObjectsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UngroupObjectsRequest]
      }
      
      @scala.inline
      implicit class UngroupObjectsRequestMutableBuilder[Self <: UngroupObjectsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
        
        @scala.inline
        def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
      }
    }
    
    @js.native
    trait UnmergeTableCellsRequest extends StObject {
      
      var objectId: js.UndefOr[String] = js.native
      
      var tableRange: js.UndefOr[TableRange] = js.native
    }
    object UnmergeTableCellsRequest {
      
      @scala.inline
      def apply(): UnmergeTableCellsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UnmergeTableCellsRequest]
      }
      
      @scala.inline
      implicit class UnmergeTableCellsRequestMutableBuilder[Self <: UnmergeTableCellsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
      }
    }
    
    @js.native
    trait UpdateImagePropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var imageProperties: js.UndefOr[ImageProperties] = js.native
      
      var objectId: js.UndefOr[String] = js.native
    }
    object UpdateImagePropertiesRequest {
      
      @scala.inline
      def apply(): UpdateImagePropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateImagePropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdateImagePropertiesRequestMutableBuilder[Self <: UpdateImagePropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setImageProperties(value: ImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImagePropertiesUndefined: Self = StObject.set(x, "imageProperties", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait UpdateLineCategoryRequest extends StObject {
      
      var lineCategory: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
    }
    object UpdateLineCategoryRequest {
      
      @scala.inline
      def apply(): UpdateLineCategoryRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateLineCategoryRequest]
      }
      
      @scala.inline
      implicit class UpdateLineCategoryRequestMutableBuilder[Self <: UpdateLineCategoryRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait UpdateLinePropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var lineProperties: js.UndefOr[LineProperties] = js.native
      
      var objectId: js.UndefOr[String] = js.native
    }
    object UpdateLinePropertiesRequest {
      
      @scala.inline
      def apply(): UpdateLinePropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateLinePropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdateLinePropertiesRequestMutableBuilder[Self <: UpdateLinePropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setLineProperties(value: LineProperties): Self = StObject.set(x, "lineProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinePropertiesUndefined: Self = StObject.set(x, "lineProperties", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      }
    }
    
    @js.native
    trait UpdatePageElementAltTextRequest extends StObject {
      
      var description: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object UpdatePageElementAltTextRequest {
      
      @scala.inline
      def apply(): UpdatePageElementAltTextRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdatePageElementAltTextRequest]
      }
      
      @scala.inline
      implicit class UpdatePageElementAltTextRequestMutableBuilder[Self <: UpdatePageElementAltTextRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait UpdatePageElementTransformRequest extends StObject {
      
      var applyMode: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var transform: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform] = js.native
    }
    object UpdatePageElementTransformRequest {
      
      @scala.inline
      def apply(): UpdatePageElementTransformRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdatePageElementTransformRequest]
      }
      
      @scala.inline
      implicit class UpdatePageElementTransformRequestMutableBuilder[Self <: UpdatePageElementTransformRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApplyMode(value: String): Self = StObject.set(x, "applyMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApplyModeUndefined: Self = StObject.set(x, "applyMode", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setTransform(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      }
    }
    
    @js.native
    trait UpdatePageElementsZOrderRequest extends StObject {
      
      var operation: js.UndefOr[String] = js.native
      
      var pageElementObjectIds: js.UndefOr[js.Array[String]] = js.native
    }
    object UpdatePageElementsZOrderRequest {
      
      @scala.inline
      def apply(): UpdatePageElementsZOrderRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdatePageElementsZOrderRequest]
      }
      
      @scala.inline
      implicit class UpdatePageElementsZOrderRequestMutableBuilder[Self <: UpdatePageElementsZOrderRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
        
        @scala.inline
        def setPageElementObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageElementObjectIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageElementObjectIdsUndefined: Self = StObject.set(x, "pageElementObjectIds", js.undefined)
        
        @scala.inline
        def setPageElementObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageElementObjectIds", js.Array(value :_*))
      }
    }
    
    @js.native
    trait UpdatePagePropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var pageProperties: js.UndefOr[PageProperties] = js.native
    }
    object UpdatePagePropertiesRequest {
      
      @scala.inline
      def apply(): UpdatePagePropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdatePagePropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdatePagePropertiesRequestMutableBuilder[Self <: UpdatePagePropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setPageProperties(value: PageProperties): Self = StObject.set(x, "pageProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPagePropertiesUndefined: Self = StObject.set(x, "pageProperties", js.undefined)
      }
    }
    
    @js.native
    trait UpdateParagraphStyleRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.native
      
      var fields: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var style: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle] = js.native
      
      var textRange: js.UndefOr[Range] = js.native
    }
    object UpdateParagraphStyleRequest {
      
      @scala.inline
      def apply(): UpdateParagraphStyleRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateParagraphStyleRequest]
      }
      
      @scala.inline
      implicit class UpdateParagraphStyleRequestMutableBuilder[Self <: UpdateParagraphStyleRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setStyle(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
      }
    }
    
    @js.native
    trait UpdateShapePropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var shapeProperties: js.UndefOr[ShapeProperties] = js.native
    }
    object UpdateShapePropertiesRequest {
      
      @scala.inline
      def apply(): UpdateShapePropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateShapePropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdateShapePropertiesRequestMutableBuilder[Self <: UpdateShapePropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setShapeProperties(value: ShapeProperties): Self = StObject.set(x, "shapeProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShapePropertiesUndefined: Self = StObject.set(x, "shapeProperties", js.undefined)
      }
    }
    
    @js.native
    trait UpdateSlidesPositionRequest extends StObject {
      
      var insertionIndex: js.UndefOr[Double] = js.native
      
      var slideObjectIds: js.UndefOr[js.Array[String]] = js.native
    }
    object UpdateSlidesPositionRequest {
      
      @scala.inline
      def apply(): UpdateSlidesPositionRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateSlidesPositionRequest]
      }
      
      @scala.inline
      implicit class UpdateSlidesPositionRequestMutableBuilder[Self <: UpdateSlidesPositionRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInsertionIndex(value: Double): Self = StObject.set(x, "insertionIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertionIndexUndefined: Self = StObject.set(x, "insertionIndex", js.undefined)
        
        @scala.inline
        def setSlideObjectIds(value: js.Array[String]): Self = StObject.set(x, "slideObjectIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlideObjectIdsUndefined: Self = StObject.set(x, "slideObjectIds", js.undefined)
        
        @scala.inline
        def setSlideObjectIdsVarargs(value: String*): Self = StObject.set(x, "slideObjectIds", js.Array(value :_*))
      }
    }
    
    @js.native
    trait UpdateTableBorderPropertiesRequest extends StObject {
      
      var borderPosition: js.UndefOr[String] = js.native
      
      var fields: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.native
      
      var tableRange: js.UndefOr[TableRange] = js.native
    }
    object UpdateTableBorderPropertiesRequest {
      
      @scala.inline
      def apply(): UpdateTableBorderPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateTableBorderPropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdateTableBorderPropertiesRequestMutableBuilder[Self <: UpdateTableBorderPropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBorderPosition(value: String): Self = StObject.set(x, "borderPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBorderPositionUndefined: Self = StObject.set(x, "borderPosition", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setTableBorderProperties(value: TableBorderProperties): Self = StObject.set(x, "tableBorderProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableBorderPropertiesUndefined: Self = StObject.set(x, "tableBorderProperties", js.undefined)
        
        @scala.inline
        def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
      }
    }
    
    @js.native
    trait UpdateTableCellPropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var tableCellProperties: js.UndefOr[TableCellProperties] = js.native
      
      var tableRange: js.UndefOr[TableRange] = js.native
    }
    object UpdateTableCellPropertiesRequest {
      
      @scala.inline
      def apply(): UpdateTableCellPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateTableCellPropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdateTableCellPropertiesRequestMutableBuilder[Self <: UpdateTableCellPropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setTableCellProperties(value: TableCellProperties): Self = StObject.set(x, "tableCellProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableCellPropertiesUndefined: Self = StObject.set(x, "tableCellProperties", js.undefined)
        
        @scala.inline
        def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
      }
    }
    
    @js.native
    trait UpdateTableColumnPropertiesRequest extends StObject {
      
      var columnIndices: js.UndefOr[js.Array[Double]] = js.native
      
      var fields: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var tableColumnProperties: js.UndefOr[TableColumnProperties] = js.native
    }
    object UpdateTableColumnPropertiesRequest {
      
      @scala.inline
      def apply(): UpdateTableColumnPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateTableColumnPropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdateTableColumnPropertiesRequestMutableBuilder[Self <: UpdateTableColumnPropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnIndices(value: js.Array[Double]): Self = StObject.set(x, "columnIndices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnIndicesUndefined: Self = StObject.set(x, "columnIndices", js.undefined)
        
        @scala.inline
        def setColumnIndicesVarargs(value: Double*): Self = StObject.set(x, "columnIndices", js.Array(value :_*))
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setTableColumnProperties(value: TableColumnProperties): Self = StObject.set(x, "tableColumnProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableColumnPropertiesUndefined: Self = StObject.set(x, "tableColumnProperties", js.undefined)
      }
    }
    
    @js.native
    trait UpdateTableRowPropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var rowIndices: js.UndefOr[js.Array[Double]] = js.native
      
      var tableRowProperties: js.UndefOr[TableRowProperties] = js.native
    }
    object UpdateTableRowPropertiesRequest {
      
      @scala.inline
      def apply(): UpdateTableRowPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateTableRowPropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdateTableRowPropertiesRequestMutableBuilder[Self <: UpdateTableRowPropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setRowIndices(value: js.Array[Double]): Self = StObject.set(x, "rowIndices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowIndicesUndefined: Self = StObject.set(x, "rowIndices", js.undefined)
        
        @scala.inline
        def setRowIndicesVarargs(value: Double*): Self = StObject.set(x, "rowIndices", js.Array(value :_*))
        
        @scala.inline
        def setTableRowProperties(value: TableRowProperties): Self = StObject.set(x, "tableRowProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTableRowPropertiesUndefined: Self = StObject.set(x, "tableRowProperties", js.undefined)
      }
    }
    
    @js.native
    trait UpdateTextStyleRequest extends StObject {
      
      var cellLocation: js.UndefOr[TableCellLocation] = js.native
      
      var fields: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var style: js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle] = js.native
      
      var textRange: js.UndefOr[Range] = js.native
    }
    object UpdateTextStyleRequest {
      
      @scala.inline
      def apply(): UpdateTextStyleRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateTextStyleRequest]
      }
      
      @scala.inline
      implicit class UpdateTextStyleRequestMutableBuilder[Self <: UpdateTextStyleRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setStyle(value: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
      }
    }
    
    @js.native
    trait UpdateVideoPropertiesRequest extends StObject {
      
      var fields: js.UndefOr[String] = js.native
      
      var objectId: js.UndefOr[String] = js.native
      
      var videoProperties: js.UndefOr[VideoProperties] = js.native
    }
    object UpdateVideoPropertiesRequest {
      
      @scala.inline
      def apply(): UpdateVideoPropertiesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateVideoPropertiesRequest]
      }
      
      @scala.inline
      implicit class UpdateVideoPropertiesRequestMutableBuilder[Self <: UpdateVideoPropertiesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
        
        @scala.inline
        def setVideoProperties(value: VideoProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideoPropertiesUndefined: Self = StObject.set(x, "videoProperties", js.undefined)
      }
    }
    
    @js.native
    trait Video extends StObject {
      
      var id: js.UndefOr[String] = js.native
      
      var source: js.UndefOr[String] = js.native
      
      var url: js.UndefOr[String] = js.native
      
      var videoProperties: js.UndefOr[VideoProperties] = js.native
    }
    object Video {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Video = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Video]
      }
      
      @scala.inline
      implicit class VideoMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Video] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        
        @scala.inline
        def setVideoProperties(value: VideoProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideoPropertiesUndefined: Self = StObject.set(x, "videoProperties", js.undefined)
      }
    }
    
    @js.native
    trait VideoProperties extends StObject {
      
      var autoPlay: js.UndefOr[Boolean] = js.native
      
      var end: js.UndefOr[Double] = js.native
      
      var mute: js.UndefOr[Boolean] = js.native
      
      var outline: js.UndefOr[Outline] = js.native
      
      var start: js.UndefOr[Double] = js.native
    }
    object VideoProperties {
      
      @scala.inline
      def apply(): VideoProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VideoProperties]
      }
      
      @scala.inline
      implicit class VideoPropertiesMutableBuilder[Self <: VideoProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
        
        @scala.inline
        def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        @scala.inline
        def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
        
        @scala.inline
        def setOutline(value: Outline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
    
    @js.native
    trait WeightedFontFamily extends StObject {
      
      var fontFamily: js.UndefOr[String] = js.native
      
      var weight: js.UndefOr[Double] = js.native
    }
    object WeightedFontFamily {
      
      @scala.inline
      def apply(): WeightedFontFamily = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WeightedFontFamily]
      }
      
      @scala.inline
      implicit class WeightedFontFamilyMutableBuilder[Self <: WeightedFontFamily] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
        
        @scala.inline
        def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    @js.native
    trait WordArt extends StObject {
      
      var renderedText: js.UndefOr[String] = js.native
    }
    object WordArt {
      
      @scala.inline
      def apply(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt]
      }
      
      @scala.inline
      implicit class WordArtMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRenderedText(value: String): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderedTextUndefined: Self = StObject.set(x, "renderedText", js.undefined)
      }
    }
    
    @js.native
    trait WriteControl extends StObject {
      
      var requiredRevisionId: js.UndefOr[String] = js.native
    }
    object WriteControl {
      
      @scala.inline
      def apply(): WriteControl = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[WriteControl]
      }
      
      @scala.inline
      implicit class WriteControlMutableBuilder[Self <: WriteControl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRequiredRevisionId(value: String): Self = StObject.set(x, "requiredRevisionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequiredRevisionIdUndefined: Self = StObject.set(x, "requiredRevisionId", js.undefined)
      }
    }
  }
  
  /**
    * The user's selection in the active presentation.
    *
    *     var selection = SlidesApp.getActivePresentation().getSelection();
    *     var currentPage = selection.getCurrentPage();
    *     var selectionType = selection.getSelectionType();
    *     }
    */
  @js.native
  trait Selection extends StObject {
    
    def getCurrentPage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getPageElementRange(): PageElementRange = js.native
    
    def getPageRange(): PageRange = js.native
    
    def getSelectionType(): SelectionType = js.native
    
    def getTableCellRange(): TableCellRange = js.native
    
    def getTextRange(): TextRange = js.native
  }
  object Selection {
    
    @scala.inline
    def apply(
      getCurrentPage: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page,
      getPageElementRange: () => PageElementRange,
      getPageRange: () => PageRange,
      getSelectionType: () => SelectionType,
      getTableCellRange: () => TableCellRange,
      getTextRange: () => TextRange
    ): Selection = {
      val __obj = js.Dynamic.literal(getCurrentPage = js.Any.fromFunction0(getCurrentPage), getPageElementRange = js.Any.fromFunction0(getPageElementRange), getPageRange = js.Any.fromFunction0(getPageRange), getSelectionType = js.Any.fromFunction0(getSelectionType), getTableCellRange = js.Any.fromFunction0(getTableCellRange), getTextRange = js.Any.fromFunction0(getTextRange))
      __obj.asInstanceOf[Selection]
    }
    
    @scala.inline
    implicit class SelectionMutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCurrentPage(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page): Self = StObject.set(x, "getCurrentPage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPageElementRange(value: () => PageElementRange): Self = StObject.set(x, "getPageElementRange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPageRange(value: () => PageRange): Self = StObject.set(x, "getPageRange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectionType(value: () => SelectionType): Self = StObject.set(x, "getSelectionType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTableCellRange(value: () => TableCellRange): Self = StObject.set(x, "getTableCellRange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTextRange(value: () => TextRange): Self = StObject.set(x, "getTextRange", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A PageElement representing a generic shape that does not have a more specific
    * classification. Includes text boxes, rectangles, and other predefined shapes.
    */
  @js.native
  trait Shape extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def bringForward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def bringToFront(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def duplicate(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getBorder(): Border = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getContentAlignment(): ContentAlignment = js.native
    
    def getDescription(): String = js.native
    
    def getFill(): Fill = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getLink(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getParentPlaceholder(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholderIndex(): Integer = js.native
    
    def getPlaceholderType(): PlaceholderType = js.native
    
    def getRotation(): Double = js.native
    
    def getShapeType(): ShapeType = js.native
    
    def getText(): TextRange = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def remove(): Unit = js.native
    
    def removeLink(): Unit = js.native
    
    def replaceWithImage(blobSource: BlobSource): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replaceWithImage(blobSource: BlobSource, crop: Boolean): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replaceWithImage(imageUrl: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def replaceWithImage(imageUrl: String, crop: Boolean): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def replaceWithSheetsChart(sourceChart: EmbeddedChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def replaceWithSheetsChartAsImage(sourceChart: EmbeddedChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def scaleHeight(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def scaleWidth(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def sendToBack(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setContentAlignment(contentAlignment: ContentAlignment): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setDescription(description: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setHeight(height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setLeft(left: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slide: Slide): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setLinkUrl(url: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setRotation(angle: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setTitle(title: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setTop(top: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def setWidth(width: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
  }
  
  /**
    * A PageElement representing a linked chart embedded from Google Sheets.
    */
  @js.native
  trait SheetsChart extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def asImage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def bringForward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def bringToFront(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def duplicate(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getChartId(): Integer = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getEmbedType(): SheetsChartEmbedType = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getLink(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getSpreadsheetId(): String = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def refresh(): Unit = js.native
    
    def remove(): Unit = js.native
    
    def removeLink(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def scaleWidth(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def sendToBack(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setDescription(description: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setHeight(height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setLeft(left: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slide: Slide): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setLinkUrl(url: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setRotation(angle: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setTitle(title: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setTop(top: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def setWidth(width: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
  }
  
  /**
    * A slide in a presentation.
    *
    * These pages contain the content you are presenting to your audience. Most slides are based on
    * a master and a layout. You can specify which layout to use for each slide when it is created.
    */
  @js.native
  trait Slide extends StObject {
    
    def duplicate(): Slide = js.native
    
    def getBackground(): PageBackground = js.native
    
    def getColorScheme(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ColorScheme = js.native
    
    def getGroups(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group] = js.native
    
    def getImages(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image] = js.native
    
    def getLayout(): Layout = js.native
    
    def getLines(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line] = js.native
    
    def getNotesPage(): NotesPage = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementById(id: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPageElements(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getPageType(): PageType = js.native
    
    def getPlaceholder(placeholderType: PlaceholderType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    def getPlaceholder(placeholderType: PlaceholderType, placeholderIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getPlaceholders(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement] = js.native
    
    def getShapes(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape] = js.native
    
    def getSheetsCharts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart] = js.native
    
    def getSlideLinkingMode(): SlideLinkingMode = js.native
    
    def getSourcePresentationId(): String = js.native
    
    def getSourceSlideObjectId(): String = js.native
    
    def getTables(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table] = js.native
    
    def getVideos(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video] = js.native
    
    def getWordArts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt] = js.native
    
    def group(pageElements: js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement]): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertGroup(group: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def insertImage(blobSource: BlobSource): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(blobSource: BlobSource, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(imageUrl: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertImage(image: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertLine(lineCategory: LineCategory, startConnectionSite: ConnectionSite, endConnectionSite: ConnectionSite): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(lineCategory: LineCategory, startLeft: Double, startTop: Double, endLeft: Double, endTop: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    def insertLine(line: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Line = js.native
    
    def insertPageElement(pageElement: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def insertShape(shapeType: ShapeType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shapeType: ShapeType, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertShape(shape: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertSheetsChart(sheetsChart: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    def insertSheetsChart(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SheetsChart = js.native
    
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    def insertSheetsChartAsImage(sourceChart: EmbeddedChart, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Image = js.native
    
    def insertTable(numRows: Integer, numColumns: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(numRows: Integer, numColumns: Integer, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    def insertTable(table: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def insertTextBox(text: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    def insertTextBox(text: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Shape = js.native
    
    def insertVideo(videoUrl: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(videoUrl: String, left: Double, top: Double, width: Double, height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    def insertVideo(video: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def insertWordArt(wordArt: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def move(index: Integer): Unit = js.native
    
    def refreshSlide(): Unit = js.native
    
    def remove(): Unit = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def selectAsCurrentPage(): Unit = js.native
    
    def unlink(): Unit = js.native
  }
  
  /**
    * Creates and opens Presentations that can be edited.
    *
    *     // Open a presentation by ID.
    *     var preso = SlidesApp.openById('PRESENTATION_ID_GOES_HERE');
    *
    *     // Create and open a presentation.
    *     preso = SlidesApp.create('Presentation Name');
    */
  @js.native
  trait SlidesApp extends StObject {
    
    var AlignmentPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ js.Any = js.native
    
    var ArrowStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ js.Any = js.native
    
    var AutoTextType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ js.Any = js.native
    
    var CellMergeState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ js.Any = js.native
    
    var ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ js.Any = js.native
    
    var ContentAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ js.Any = js.native
    
    var DashStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ js.Any = js.native
    
    var FillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ js.Any = js.native
    
    var LineCategory: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ js.Any = js.native
    
    var LineFillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ js.Any = js.native
    
    var LineType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ js.Any = js.native
    
    var LinkType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ js.Any = js.native
    
    var ListPreset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ js.Any = js.native
    
    var PageBackgroundType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ js.Any = js.native
    
    var PageElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ js.Any = js.native
    
    var PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any = js.native
    
    var ParagraphAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ js.Any = js.native
    
    var PlaceholderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ js.Any = js.native
    
    var PredefinedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ js.Any = js.native
    
    var SelectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ js.Any = js.native
    
    var ShapeType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ js.Any = js.native
    
    var SheetsChartEmbedType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ js.Any = js.native
    
    var SlideLinkingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ js.Any = js.native
    
    var SlidePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any = js.native
    
    var SpacingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any = js.native
    
    var TextBaselineOffset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any = js.native
    
    var TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any = js.native
    
    var ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any = js.native
    
    var VideoSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any = js.native
    
    def create(name: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def getActivePresentation(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def getUi(): Ui = js.native
    
    def newAffineTransformBuilder(): AffineTransformBuilder = js.native
    
    def openById(id: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
    
    def openByUrl(url: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation = js.native
  }
  object SlidesApp {
    
    @scala.inline
    def apply(
      AlignmentPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ js.Any,
      ArrowStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ js.Any,
      AutoTextType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ js.Any,
      CellMergeState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ js.Any,
      ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ js.Any,
      ContentAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ js.Any,
      DashStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ js.Any,
      FillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ js.Any,
      LineCategory: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ js.Any,
      LineFillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ js.Any,
      LineType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ js.Any,
      LinkType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ js.Any,
      ListPreset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ js.Any,
      PageBackgroundType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ js.Any,
      PageElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ js.Any,
      PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any,
      ParagraphAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ js.Any,
      PlaceholderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ js.Any,
      PredefinedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ js.Any,
      SelectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ js.Any,
      ShapeType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ js.Any,
      SheetsChartEmbedType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ js.Any,
      SlideLinkingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ js.Any,
      SlidePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any,
      SpacingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any,
      TextBaselineOffset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any,
      TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any,
      ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any,
      VideoSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any,
      create: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation,
      getActivePresentation: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation,
      getUi: () => Ui,
      newAffineTransformBuilder: () => AffineTransformBuilder,
      openById: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation,
      openByUrl: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation
    ): SlidesApp = {
      val __obj = js.Dynamic.literal(AlignmentPosition = AlignmentPosition.asInstanceOf[js.Any], ArrowStyle = ArrowStyle.asInstanceOf[js.Any], AutoTextType = AutoTextType.asInstanceOf[js.Any], CellMergeState = CellMergeState.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], ContentAlignment = ContentAlignment.asInstanceOf[js.Any], DashStyle = DashStyle.asInstanceOf[js.Any], FillType = FillType.asInstanceOf[js.Any], LineCategory = LineCategory.asInstanceOf[js.Any], LineFillType = LineFillType.asInstanceOf[js.Any], LineType = LineType.asInstanceOf[js.Any], LinkType = LinkType.asInstanceOf[js.Any], ListPreset = ListPreset.asInstanceOf[js.Any], PageBackgroundType = PageBackgroundType.asInstanceOf[js.Any], PageElementType = PageElementType.asInstanceOf[js.Any], PageType = PageType.asInstanceOf[js.Any], ParagraphAlignment = ParagraphAlignment.asInstanceOf[js.Any], PlaceholderType = PlaceholderType.asInstanceOf[js.Any], PredefinedLayout = PredefinedLayout.asInstanceOf[js.Any], SelectionType = SelectionType.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], SheetsChartEmbedType = SheetsChartEmbedType.asInstanceOf[js.Any], SlideLinkingMode = SlideLinkingMode.asInstanceOf[js.Any], SlidePosition = SlidePosition.asInstanceOf[js.Any], SpacingMode = SpacingMode.asInstanceOf[js.Any], TextBaselineOffset = TextBaselineOffset.asInstanceOf[js.Any], TextDirection = TextDirection.asInstanceOf[js.Any], ThemeColorType = ThemeColorType.asInstanceOf[js.Any], VideoSourceType = VideoSourceType.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), getActivePresentation = js.Any.fromFunction0(getActivePresentation), getUi = js.Any.fromFunction0(getUi), newAffineTransformBuilder = js.Any.fromFunction0(newAffineTransformBuilder), openById = js.Any.fromFunction1(openById), openByUrl = js.Any.fromFunction1(openByUrl))
      __obj.asInstanceOf[SlidesApp]
    }
    
    @scala.inline
    implicit class SlidesAppMutableBuilder[Self <: SlidesApp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignmentPosition(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ js.Any
      ): Self = StObject.set(x, "AlignmentPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ js.Any): Self = StObject.set(x, "ArrowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoTextType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ js.Any
      ): Self = StObject.set(x, "AutoTextType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellMergeState(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ js.Any
      ): Self = StObject.set(x, "CellMergeState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ js.Any
      ): Self = StObject.set(x, "ColorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentAlignment(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ js.Any
      ): Self = StObject.set(x, "ContentAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreate(value: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDashStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ js.Any): Self = StObject.set(x, "DashStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ js.Any): Self = StObject.set(x, "FillType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetActivePresentation(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation): Self = StObject.set(x, "getActivePresentation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUi(value: () => Ui): Self = StObject.set(x, "getUi", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLineCategory(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ js.Any
      ): Self = StObject.set(x, "LineCategory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineFillType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ js.Any
      ): Self = StObject.set(x, "LineFillType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ js.Any): Self = StObject.set(x, "LineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ js.Any): Self = StObject.set(x, "LinkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListPreset(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ js.Any): Self = StObject.set(x, "ListPreset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewAffineTransformBuilder(value: () => AffineTransformBuilder): Self = StObject.set(x, "newAffineTransformBuilder", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpenById(value: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation): Self = StObject.set(x, "openById", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenByUrl(value: String => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Presentation): Self = StObject.set(x, "openByUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageBackgroundType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ js.Any
      ): Self = StObject.set(x, "PageBackgroundType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageElementType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ js.Any
      ): Self = StObject.set(x, "PageElementType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any): Self = StObject.set(x, "PageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphAlignment(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ js.Any
      ): Self = StObject.set(x, "ParagraphAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ js.Any
      ): Self = StObject.set(x, "PlaceholderType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedLayout(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ js.Any
      ): Self = StObject.set(x, "PredefinedLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ js.Any
      ): Self = StObject.set(x, "SelectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ js.Any): Self = StObject.set(x, "ShapeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetsChartEmbedType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ js.Any
      ): Self = StObject.set(x, "SheetsChartEmbedType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideLinkingMode(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ js.Any
      ): Self = StObject.set(x, "SlideLinkingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidePosition(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any
      ): Self = StObject.set(x, "SlidePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingMode(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any): Self = StObject.set(x, "SpacingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBaselineOffset(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any
      ): Self = StObject.set(x, "TextBaselineOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDirection(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any
      ): Self = StObject.set(x, "TextDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeColorType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any
      ): Self = StObject.set(x, "ThemeColorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoSourceType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any
      ): Self = StObject.set(x, "VideoSourceType", value.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  implicit class SlidesMutableBuilder[Self <: Slides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewAffineTransform(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AffineTransform): Self = StObject.set(x, "newAffineTransform", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAutoText(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.AutoText): Self = StObject.set(x, "newAutoText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBatchUpdatePresentationRequest(value: () => BatchUpdatePresentationRequest): Self = StObject.set(x, "newBatchUpdatePresentationRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBullet(value: () => Bullet): Self = StObject.set(x, "newBullet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewColorScheme(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ColorScheme): Self = StObject.set(x, "newColorScheme", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewColorStop(value: () => ColorStop): Self = StObject.set(x, "newColorStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateImageRequest(value: () => CreateImageRequest): Self = StObject.set(x, "newCreateImageRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateLineRequest(value: () => CreateLineRequest): Self = StObject.set(x, "newCreateLineRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateParagraphBulletsRequest(value: () => CreateParagraphBulletsRequest): Self = StObject.set(x, "newCreateParagraphBulletsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateShapeRequest(value: () => CreateShapeRequest): Self = StObject.set(x, "newCreateShapeRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateSheetsChartRequest(value: () => CreateSheetsChartRequest): Self = StObject.set(x, "newCreateSheetsChartRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateSlideRequest(value: () => CreateSlideRequest): Self = StObject.set(x, "newCreateSlideRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateTableRequest(value: () => CreateTableRequest): Self = StObject.set(x, "newCreateTableRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateVideoRequest(value: () => CreateVideoRequest): Self = StObject.set(x, "newCreateVideoRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCropProperties(value: () => CropProperties): Self = StObject.set(x, "newCropProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteObjectRequest(value: () => DeleteObjectRequest): Self = StObject.set(x, "newDeleteObjectRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteParagraphBulletsRequest(value: () => DeleteParagraphBulletsRequest): Self = StObject.set(x, "newDeleteParagraphBulletsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteTableColumnRequest(value: () => DeleteTableColumnRequest): Self = StObject.set(x, "newDeleteTableColumnRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteTableRowRequest(value: () => DeleteTableRowRequest): Self = StObject.set(x, "newDeleteTableRowRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDeleteTextRequest(value: () => DeleteTextRequest): Self = StObject.set(x, "newDeleteTextRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDimension(value: () => Dimension): Self = StObject.set(x, "newDimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDuplicateObjectRequest(value: () => DuplicateObjectRequest): Self = StObject.set(x, "newDuplicateObjectRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGroup(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Group): Self = StObject.set(x, "newGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGroupObjectsRequest(value: () => GroupObjectsRequest): Self = StObject.set(x, "newGroupObjectsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewImage(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Image): Self = StObject.set(x, "newImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewImageProperties(value: () => ImageProperties): Self = StObject.set(x, "newImageProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewInsertTableColumnsRequest(value: () => InsertTableColumnsRequest): Self = StObject.set(x, "newInsertTableColumnsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewInsertTableRowsRequest(value: () => InsertTableRowsRequest): Self = StObject.set(x, "newInsertTableRowsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewInsertTextRequest(value: () => InsertTextRequest): Self = StObject.set(x, "newInsertTextRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLayoutPlaceholderIdMapping(value: () => LayoutPlaceholderIdMapping): Self = StObject.set(x, "newLayoutPlaceholderIdMapping", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLayoutProperties(value: () => LayoutProperties): Self = StObject.set(x, "newLayoutProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLayoutReference(value: () => LayoutReference): Self = StObject.set(x, "newLayoutReference", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLine(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Line): Self = StObject.set(x, "newLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLineConnection(value: () => LineConnection): Self = StObject.set(x, "newLineConnection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLineFill(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.LineFill): Self = StObject.set(x, "newLineFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLineProperties(value: () => LineProperties): Self = StObject.set(x, "newLineProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLink(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Link): Self = StObject.set(x, "newLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMasterProperties(value: () => MasterProperties): Self = StObject.set(x, "newMasterProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMergeTableCellsRequest(value: () => MergeTableCellsRequest): Self = StObject.set(x, "newMergeTableCellsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewNotesProperties(value: () => NotesProperties): Self = StObject.set(x, "newNotesProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOpaqueColor(value: () => OpaqueColor): Self = StObject.set(x, "newOpaqueColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOptionalColor(value: () => OptionalColor): Self = StObject.set(x, "newOptionalColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOutline(value: () => Outline): Self = StObject.set(x, "newOutline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOutlineFill(value: () => OutlineFill): Self = StObject.set(x, "newOutlineFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPage(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Page): Self = StObject.set(x, "newPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPageBackgroundFill(value: () => PageBackgroundFill): Self = StObject.set(x, "newPageBackgroundFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPageElement(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.PageElement): Self = StObject.set(x, "newPageElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPageElementProperties(value: () => PageElementProperties): Self = StObject.set(x, "newPageElementProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPageProperties(value: () => PageProperties): Self = StObject.set(x, "newPageProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewParagraphMarker(value: () => ParagraphMarker): Self = StObject.set(x, "newParagraphMarker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewParagraphStyle(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.ParagraphStyle): Self = StObject.set(x, "newParagraphStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPlaceholder(value: () => Placeholder): Self = StObject.set(x, "newPlaceholder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPresentation(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Presentation): Self = StObject.set(x, "newPresentation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRange(value: () => Range): Self = StObject.set(x, "newRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRecolor(value: () => Recolor): Self = StObject.set(x, "newRecolor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRefreshSheetsChartRequest(value: () => RefreshSheetsChartRequest): Self = StObject.set(x, "newRefreshSheetsChartRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewReplaceAllShapesWithImageRequest(value: () => ReplaceAllShapesWithImageRequest): Self = StObject.set(x, "newReplaceAllShapesWithImageRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewReplaceAllShapesWithSheetsChartRequest(value: () => ReplaceAllShapesWithSheetsChartRequest): Self = StObject.set(x, "newReplaceAllShapesWithSheetsChartRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewReplaceAllTextRequest(value: () => ReplaceAllTextRequest): Self = StObject.set(x, "newReplaceAllTextRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewReplaceImageRequest(value: () => ReplaceImageRequest): Self = StObject.set(x, "newReplaceImageRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRequest(value: () => Request): Self = StObject.set(x, "newRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRerouteLineRequest(value: () => RerouteLineRequest): Self = StObject.set(x, "newRerouteLineRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRgbColor(value: () => RgbColor): Self = StObject.set(x, "newRgbColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewShadow(value: () => Shadow): Self = StObject.set(x, "newShadow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewShape(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Shape): Self = StObject.set(x, "newShape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewShapeBackgroundFill(value: () => ShapeBackgroundFill): Self = StObject.set(x, "newShapeBackgroundFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewShapeProperties(value: () => ShapeProperties): Self = StObject.set(x, "newShapeProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSheetsChart(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SheetsChart): Self = StObject.set(x, "newSheetsChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSheetsChartProperties(value: () => SheetsChartProperties): Self = StObject.set(x, "newSheetsChartProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSize(value: () => Size): Self = StObject.set(x, "newSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSlideProperties(value: () => SlideProperties): Self = StObject.set(x, "newSlideProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSolidFill(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.SolidFill): Self = StObject.set(x, "newSolidFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewStretchedPictureFill(value: () => StretchedPictureFill): Self = StObject.set(x, "newStretchedPictureFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSubstringMatchCriteria(value: () => SubstringMatchCriteria): Self = StObject.set(x, "newSubstringMatchCriteria", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTable(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Table): Self = StObject.set(x, "newTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableBorderCell(value: () => TableBorderCell): Self = StObject.set(x, "newTableBorderCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableBorderFill(value: () => TableBorderFill): Self = StObject.set(x, "newTableBorderFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableBorderProperties(value: () => TableBorderProperties): Self = StObject.set(x, "newTableBorderProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableBorderRow(value: () => TableBorderRow): Self = StObject.set(x, "newTableBorderRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableCell(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableCell): Self = StObject.set(x, "newTableCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableCellBackgroundFill(value: () => TableCellBackgroundFill): Self = StObject.set(x, "newTableCellBackgroundFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableCellLocation(value: () => TableCellLocation): Self = StObject.set(x, "newTableCellLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableCellProperties(value: () => TableCellProperties): Self = StObject.set(x, "newTableCellProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableColumnProperties(value: () => TableColumnProperties): Self = StObject.set(x, "newTableColumnProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableRange(value: () => TableRange): Self = StObject.set(x, "newTableRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableRow(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TableRow): Self = StObject.set(x, "newTableRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableRowProperties(value: () => TableRowProperties): Self = StObject.set(x, "newTableRowProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextContent(value: () => TextContent): Self = StObject.set(x, "newTextContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextElement(value: () => TextElement): Self = StObject.set(x, "newTextElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextRun(value: () => TextRun): Self = StObject.set(x, "newTextRun", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextStyle(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.TextStyle): Self = StObject.set(x, "newTextStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewThemeColorPair(value: () => ThemeColorPair): Self = StObject.set(x, "newThemeColorPair", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUngroupObjectsRequest(value: () => UngroupObjectsRequest): Self = StObject.set(x, "newUngroupObjectsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUnmergeTableCellsRequest(value: () => UnmergeTableCellsRequest): Self = StObject.set(x, "newUnmergeTableCellsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateImagePropertiesRequest(value: () => UpdateImagePropertiesRequest): Self = StObject.set(x, "newUpdateImagePropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateLineCategoryRequest(value: () => UpdateLineCategoryRequest): Self = StObject.set(x, "newUpdateLineCategoryRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateLinePropertiesRequest(value: () => UpdateLinePropertiesRequest): Self = StObject.set(x, "newUpdateLinePropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdatePageElementAltTextRequest(value: () => UpdatePageElementAltTextRequest): Self = StObject.set(x, "newUpdatePageElementAltTextRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdatePageElementTransformRequest(value: () => UpdatePageElementTransformRequest): Self = StObject.set(x, "newUpdatePageElementTransformRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdatePageElementsZOrderRequest(value: () => UpdatePageElementsZOrderRequest): Self = StObject.set(x, "newUpdatePageElementsZOrderRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdatePagePropertiesRequest(value: () => UpdatePagePropertiesRequest): Self = StObject.set(x, "newUpdatePagePropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateParagraphStyleRequest(value: () => UpdateParagraphStyleRequest): Self = StObject.set(x, "newUpdateParagraphStyleRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateShapePropertiesRequest(value: () => UpdateShapePropertiesRequest): Self = StObject.set(x, "newUpdateShapePropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateSlidesPositionRequest(value: () => UpdateSlidesPositionRequest): Self = StObject.set(x, "newUpdateSlidesPositionRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateTableBorderPropertiesRequest(value: () => UpdateTableBorderPropertiesRequest): Self = StObject.set(x, "newUpdateTableBorderPropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateTableCellPropertiesRequest(value: () => UpdateTableCellPropertiesRequest): Self = StObject.set(x, "newUpdateTableCellPropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateTableColumnPropertiesRequest(value: () => UpdateTableColumnPropertiesRequest): Self = StObject.set(x, "newUpdateTableColumnPropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateTableRowPropertiesRequest(value: () => UpdateTableRowPropertiesRequest): Self = StObject.set(x, "newUpdateTableRowPropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateTextStyleRequest(value: () => UpdateTextStyleRequest): Self = StObject.set(x, "newUpdateTextStyleRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUpdateVideoPropertiesRequest(value: () => UpdateVideoPropertiesRequest): Self = StObject.set(x, "newUpdateVideoPropertiesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewVideo(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.Video): Self = StObject.set(x, "newVideo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewVideoProperties(value: () => VideoProperties): Self = StObject.set(x, "newVideoProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWeightedFontFamily(value: () => WeightedFontFamily): Self = StObject.set(x, "newWeightedFontFamily", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWordArt(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema.WordArt): Self = StObject.set(x, "newWordArt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewWriteControl(value: () => WriteControl): Self = StObject.set(x, "newWriteControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPresentations(value: PresentationsCollection): Self = StObject.set(x, "Presentations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationsUndefined: Self = StObject.set(x, "Presentations", js.undefined)
  }
  
  /**
    * A solid color fill.
    *
    * SolidFill objects are detached and immutable, so do not reflect changes made after
    * they have been created.
    */
  @js.native
  trait SolidFill extends StObject {
    
    def getAlpha(): Double = js.native
    
    def getColor(): Color = js.native
  }
  object SolidFill {
    
    @scala.inline
    def apply(getAlpha: () => Double, getColor: () => Color): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SolidFill = {
      val __obj = js.Dynamic.literal(getAlpha = js.Any.fromFunction0(getAlpha), getColor = js.Any.fromFunction0(getColor))
      __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SolidFill]
    }
    
    @scala.inline
    implicit class SolidFillMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.SolidFill] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAlpha(value: () => Double): Self = StObject.set(x, "getAlpha", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetColor(value: () => Color): Self = StObject.set(x, "getColor", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A PageElement representing a table.
    */
  @js.native
  trait Table extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def appendColumn(): TableColumn = js.native
    
    def appendRow(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableRow = js.native
    
    def bringForward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def bringToFront(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def duplicate(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getCell(rowIndex: Integer, columnIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell = js.native
    
    def getColumn(columnIndex: Integer): TableColumn = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getNumColumns(): Integer = js.native
    
    def getNumRows(): Integer = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getRow(rowIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableRow = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def insertColumn(index: Integer): TableColumn = js.native
    
    def insertRow(index: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableRow = js.native
    
    def preconcatenateTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def remove(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def scaleWidth(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def sendToBack(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setDescription(description: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setHeight(height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setLeft(left: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setRotation(angle: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setTitle(title: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setTop(top: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def setWidth(width: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
  }
  
  /**
    * A cell in a table.
    */
  @js.native
  trait TableCell extends StObject {
    
    def getColumnIndex(): Integer = js.native
    
    def getColumnSpan(): Integer = js.native
    
    def getContentAlignment(): ContentAlignment = js.native
    
    def getFill(): Fill = js.native
    
    def getHeadCell(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell = js.native
    
    def getMergeState(): CellMergeState = js.native
    
    def getParentColumn(): TableColumn = js.native
    
    def getParentRow(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableRow = js.native
    
    def getParentTable(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def getRowIndex(): Integer = js.native
    
    def getRowSpan(): Integer = js.native
    
    def getText(): TextRange = js.native
    
    def setContentAlignment(contentAlignment: ContentAlignment): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell = js.native
  }
  object TableCell {
    
    @scala.inline
    def apply(
      getColumnIndex: () => Integer,
      getColumnSpan: () => Integer,
      getContentAlignment: () => ContentAlignment,
      getFill: () => Fill,
      getHeadCell: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell,
      getMergeState: () => CellMergeState,
      getParentColumn: () => TableColumn,
      getParentRow: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableRow,
      getParentTable: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table,
      getRowIndex: () => Integer,
      getRowSpan: () => Integer,
      getText: () => TextRange,
      setContentAlignment: ContentAlignment => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell
    ): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell = {
      val __obj = js.Dynamic.literal(getColumnIndex = js.Any.fromFunction0(getColumnIndex), getColumnSpan = js.Any.fromFunction0(getColumnSpan), getContentAlignment = js.Any.fromFunction0(getContentAlignment), getFill = js.Any.fromFunction0(getFill), getHeadCell = js.Any.fromFunction0(getHeadCell), getMergeState = js.Any.fromFunction0(getMergeState), getParentColumn = js.Any.fromFunction0(getParentColumn), getParentRow = js.Any.fromFunction0(getParentRow), getParentTable = js.Any.fromFunction0(getParentTable), getRowIndex = js.Any.fromFunction0(getRowIndex), getRowSpan = js.Any.fromFunction0(getRowSpan), getText = js.Any.fromFunction0(getText), setContentAlignment = js.Any.fromFunction1(setContentAlignment))
      __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell]
    }
    
    @scala.inline
    implicit class TableCellMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetColumnIndex(value: () => Integer): Self = StObject.set(x, "getColumnIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetColumnSpan(value: () => Integer): Self = StObject.set(x, "getColumnSpan", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentAlignment(value: () => ContentAlignment): Self = StObject.set(x, "getContentAlignment", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFill(value: () => Fill): Self = StObject.set(x, "getFill", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeadCell(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell): Self = StObject.set(x, "getHeadCell", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMergeState(value: () => CellMergeState): Self = StObject.set(x, "getMergeState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentColumn(value: () => TableColumn): Self = StObject.set(x, "getParentColumn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentRow(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableRow): Self = StObject.set(x, "getParentRow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentTable(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table): Self = StObject.set(x, "getParentTable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRowIndex(value: () => Integer): Self = StObject.set(x, "getRowIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRowSpan(value: () => Integer): Self = StObject.set(x, "getRowSpan", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetText(value: () => TextRange): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetContentAlignment(value: ContentAlignment => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell): Self = StObject.set(x, "setContentAlignment", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A collection of one or more TableCell instances.
    */
  @js.native
  trait TableCellRange extends StObject {
    
    def getTableCells(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell] = js.native
  }
  object TableCellRange {
    
    @scala.inline
    def apply(getTableCells: () => js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell]): TableCellRange = {
      val __obj = js.Dynamic.literal(getTableCells = js.Any.fromFunction0(getTableCells))
      __obj.asInstanceOf[TableCellRange]
    }
    
    @scala.inline
    implicit class TableCellRangeMutableBuilder[Self <: TableCellRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTableCells(value: () => js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell]): Self = StObject.set(x, "getTableCells", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A column in a table. A column consists of a list of table cells. A column is identified by the
    * column index.
    */
  @js.native
  trait TableColumn extends StObject {
    
    def getCell(cellIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell = js.native
    
    def getIndex(): Integer = js.native
    
    def getNumCells(): Integer = js.native
    
    def getParentTable(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def getWidth(): Double = js.native
    
    def remove(): Unit = js.native
  }
  object TableColumn {
    
    @scala.inline
    def apply(
      getCell: Integer => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell,
      getIndex: () => Integer,
      getNumCells: () => Integer,
      getParentTable: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table,
      getWidth: () => Double,
      remove: () => Unit
    ): TableColumn = {
      val __obj = js.Dynamic.literal(getCell = js.Any.fromFunction1(getCell), getIndex = js.Any.fromFunction0(getIndex), getNumCells = js.Any.fromFunction0(getNumCells), getParentTable = js.Any.fromFunction0(getParentTable), getWidth = js.Any.fromFunction0(getWidth), remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[TableColumn]
    }
    
    @scala.inline
    implicit class TableColumnMutableBuilder[Self <: TableColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCell(value: Integer => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell): Self = StObject.set(x, "getCell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNumCells(value: () => Integer): Self = StObject.set(x, "getNumCells", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentTable(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table): Self = StObject.set(x, "getParentTable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A row in a table. A row consists of a list of table cells. A row is identified by the row index.
    */
  @js.native
  trait TableRow extends StObject {
    
    def getCell(cellIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell = js.native
    
    def getIndex(): Integer = js.native
    
    def getMinimumHeight(): Double = js.native
    
    def getNumCells(): Integer = js.native
    
    def getParentTable(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table = js.native
    
    def remove(): Unit = js.native
  }
  object TableRow {
    
    @scala.inline
    def apply(
      getCell: Integer => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell,
      getIndex: () => Integer,
      getMinimumHeight: () => Double,
      getNumCells: () => Integer,
      getParentTable: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table,
      remove: () => Unit
    ): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableRow = {
      val __obj = js.Dynamic.literal(getCell = js.Any.fromFunction1(getCell), getIndex = js.Any.fromFunction0(getIndex), getMinimumHeight = js.Any.fromFunction0(getMinimumHeight), getNumCells = js.Any.fromFunction0(getNumCells), getParentTable = js.Any.fromFunction0(getParentTable), remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableRow]
    }
    
    @scala.inline
    implicit class TableRowMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCell(value: Integer => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TableCell): Self = StObject.set(x, "getCell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMinimumHeight(value: () => Double): Self = StObject.set(x, "getMinimumHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNumCells(value: () => Integer): Self = StObject.set(x, "getNumCells", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentTable(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Table): Self = StObject.set(x, "getParentTable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A segment of the text contents of a Shape or a TableCell.
    */
  @js.native
  trait TextRange extends StObject {
    
    def appendParagraph(text: String): Paragraph = js.native
    
    def appendRange(textRange: TextRange): TextRange = js.native
    def appendRange(textRange: TextRange, matchSourceFormatting: Boolean): TextRange = js.native
    
    def appendText(text: String): TextRange = js.native
    
    def asRenderedString(): String = js.native
    
    def asString(): String = js.native
    
    def clear(): Unit = js.native
    def clear(startOffset: Integer, endOffset: Integer): Unit = js.native
    
    def find(pattern: String): js.Array[TextRange] = js.native
    def find(pattern: String, startOffset: Integer): js.Array[TextRange] = js.native
    
    def getAutoTexts(): js.Array[typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AutoText] = js.native
    
    def getEndIndex(): Integer = js.native
    
    def getLength(): Integer = js.native
    
    def getLinks(): js.Array[TextRange] = js.native
    
    def getListParagraphs(): js.Array[Paragraph] = js.native
    
    def getListStyle(): ListStyle = js.native
    
    def getParagraphStyle(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.ParagraphStyle = js.native
    
    def getParagraphs(): js.Array[Paragraph] = js.native
    
    def getRange(startOffset: Integer, endOffset: Integer): TextRange = js.native
    
    def getRuns(): js.Array[TextRange] = js.native
    
    def getStartIndex(): Integer = js.native
    
    def getTextStyle(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def insertParagraph(startOffset: Integer, text: String): Paragraph = js.native
    
    def insertRange(startOffset: Integer, textRange: TextRange): TextRange = js.native
    def insertRange(startOffset: Integer, textRange: TextRange, matchSourceFormatting: Boolean): TextRange = js.native
    
    def insertText(startOffset: Integer, text: String): TextRange = js.native
    
    def isEmpty(): Boolean = js.native
    
    def replaceAllText(findText: String, replaceText: String): Integer = js.native
    def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
    
    def select(): Unit = js.native
    
    def setText(newText: String): TextRange = js.native
  }
  
  /**
    * The style of text.
    *
    * Read methods in this class return null if the corresponding TextRange spans
    * multiple text runs, and those runs have different values for the read method being called. To
    * avoid this, query for text styles using the TextRanges returned by the TextRange.getRuns() method.
    */
  @js.native
  trait TextStyle extends StObject {
    
    def getBackgroundColor(): Color = js.native
    
    def getBaselineOffset(): TextBaselineOffset = js.native
    
    def getFontFamily(): String = js.native
    
    def getFontSize(): Double = js.native
    
    def getFontWeight(): Integer = js.native
    
    def getForegroundColor(): Color = js.native
    
    def getLink(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def hasLink(): Boolean = js.native
    
    def isBackgroundTransparent(): Boolean = js.native
    
    def isBold(): Boolean = js.native
    
    def isItalic(): Boolean = js.native
    
    def isSmallCaps(): Boolean = js.native
    
    def isStrikethrough(): Boolean = js.native
    
    def isUnderline(): Boolean = js.native
    
    def removeLink(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setBackgroundColor(color: Color): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setBackgroundColor(color: ThemeColorType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setBackgroundColor(hexColor: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setBackgroundColor(red: Integer, green: Integer, blue: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setBackgroundColorTransparent(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setBaselineOffset(offset: TextBaselineOffset): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setBold(bold: Boolean): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setFontFamily(fontFamily: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setFontFamilyAndWeight(fontFamily: String, fontWeight: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setFontSize(fontSize: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setForegroundColor(color: ThemeColorType): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setForegroundColor(foregroundColor: Color): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setForegroundColor(hexColor: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setForegroundColor(red: Integer, green: Integer, blue: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setItalic(italic: Boolean): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    def setLinkSlide(slide: Slide): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setLinkUrl(url: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setSmallCaps(smallCaps: Boolean): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setStrikethrough(strikethrough: Boolean): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
    
    def setUnderline(underline: Boolean): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.TextStyle = js.native
  }
  
  /**
    * A color that refers to an entry in the page's ColorScheme.
    */
  @js.native
  trait ThemeColor extends StObject {
    
    def getColorType(): ColorType = js.native
    
    def getThemeColorType(): ThemeColorType = js.native
  }
  object ThemeColor {
    
    @scala.inline
    def apply(getColorType: () => ColorType, getThemeColorType: () => ThemeColorType): ThemeColor = {
      val __obj = js.Dynamic.literal(getColorType = js.Any.fromFunction0(getColorType), getThemeColorType = js.Any.fromFunction0(getThemeColorType))
      __obj.asInstanceOf[ThemeColor]
    }
    
    @scala.inline
    implicit class ThemeColorMutableBuilder[Self <: ThemeColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetColorType(value: () => ColorType): Self = StObject.set(x, "getColorType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetThemeColorType(value: () => ThemeColorType): Self = StObject.set(x, "getThemeColorType", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A PageElement representing a video.
    */
  @js.native
  trait Video extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def bringForward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def bringToFront(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def duplicate(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getBorder(): Border = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRotation(): Double = js.native
    
    def getSource(): VideoSourceType = js.native
    
    def getThumbnailUrl(): String = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getUrl(): String = js.native
    
    def getVideoId(): String = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def remove(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def scaleWidth(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def sendToBack(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setDescription(description: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setHeight(height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setLeft(left: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setRotation(angle: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setTitle(title: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setTop(top: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
    
    def setWidth(width: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Video = js.native
  }
  
  /**
    * A PageElement representing word art.
    */
  @js.native
  trait WordArt extends StObject {
    
    def alignOnPage(alignmentPosition: AlignmentPosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def bringForward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def bringToFront(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def duplicate(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.PageElement = js.native
    
    def getConnectionSites(): js.Array[ConnectionSite] = js.native
    
    def getDescription(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getInherentHeight(): Double = js.native
    
    def getInherentWidth(): Double = js.native
    
    def getLeft(): Double = js.native
    
    def getLink(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def getObjectId(): String = js.native
    
    def getPageElementType(): PageElementType = js.native
    
    def getParentGroup(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Group = js.native
    
    def getParentPage(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Page = js.native
    
    def getRenderedText(): String = js.native
    
    def getRotation(): Double = js.native
    
    def getTitle(): String = js.native
    
    def getTop(): Double = js.native
    
    def getTransform(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform = js.native
    
    def getWidth(): Double = js.native
    
    def preconcatenateTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def remove(): Unit = js.native
    
    def removeLink(): Unit = js.native
    
    def scaleHeight(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def scaleWidth(ratio: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def select(): Unit = js.native
    def select(replace: Boolean): Unit = js.native
    
    def sendBackward(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def sendToBack(): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setDescription(description: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setHeight(height: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setLeft(left: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setLinkSlide(slideIndex: Integer): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slidePosition: SlidePosition): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    def setLinkSlide(slide: Slide): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setLinkUrl(url: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Link = js.native
    
    def setRotation(angle: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setTitle(title: String): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setTop(top: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setTransform(transform: typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.AffineTransform): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
    
    def setWidth(width: Double): typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.WordArt = js.native
  }
}
