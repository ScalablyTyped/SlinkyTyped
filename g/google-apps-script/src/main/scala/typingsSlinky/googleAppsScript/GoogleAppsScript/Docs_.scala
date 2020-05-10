package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Collection.DocumentsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.AutoText
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Background
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.BatchUpdateDocumentRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Body
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Bullet
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Color
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.ColumnBreak
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.CreateNamedRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.CreateParagraphBulletsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteContentRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteNamedRangeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteParagraphBulletsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.DeletePositionedObjectRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteTableColumnRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.DeleteTableRowRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Dimension
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.DocumentStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.EndOfSegmentLocation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Equation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.FootnoteReference
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.HorizontalRule
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.InlineObjectElement
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertInlineImageRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertPageBreakRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertTableRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertTableRowRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.InsertTextRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Link
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Location
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.NamedStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.NamedStyles
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.OptionalColor
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.PageBreak
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Paragraph
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.ParagraphBorder
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.ParagraphElement
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.ParagraphStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Range
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.ReplaceAllTextRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Request
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.RgbColor
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.SectionBreak
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.SectionColumnProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.SectionStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Shading
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Size
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.StructuralElement
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.SubstringMatchCriteria
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TabStop
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Table
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCell
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCellBorder
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCellLocation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TableCellStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TableColumnProperties
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TableOfContents
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TableRow
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TableRowStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TableStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TextRun
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.TextStyle
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.UpdateParagraphStyleRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.UpdateTextStyleRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.WeightedFontFamily
import typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.WriteControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Docs_ extends js.Object {
  var Documents: js.UndefOr[DocumentsCollection] = js.native
  // Create a new instance of AutoText
  def newAutoText(): AutoText = js.native
  // Create a new instance of Background
  def newBackground(): Background = js.native
  // Create a new instance of BatchUpdateDocumentRequest
  def newBatchUpdateDocumentRequest(): BatchUpdateDocumentRequest = js.native
  // Create a new instance of Body
  def newBody(): Body = js.native
  // Create a new instance of Bullet
  def newBullet(): Bullet = js.native
  // Create a new instance of Color
  def newColor(): Color = js.native
  // Create a new instance of ColumnBreak
  def newColumnBreak(): ColumnBreak = js.native
  // Create a new instance of CreateNamedRangeRequest
  def newCreateNamedRangeRequest(): CreateNamedRangeRequest = js.native
  // Create a new instance of CreateParagraphBulletsRequest
  def newCreateParagraphBulletsRequest(): CreateParagraphBulletsRequest = js.native
  // Create a new instance of DeleteContentRangeRequest
  def newDeleteContentRangeRequest(): DeleteContentRangeRequest = js.native
  // Create a new instance of DeleteNamedRangeRequest
  def newDeleteNamedRangeRequest(): DeleteNamedRangeRequest = js.native
  // Create a new instance of DeleteParagraphBulletsRequest
  def newDeleteParagraphBulletsRequest(): DeleteParagraphBulletsRequest = js.native
  // Create a new instance of DeletePositionedObjectRequest
  def newDeletePositionedObjectRequest(): DeletePositionedObjectRequest = js.native
  // Create a new instance of DeleteTableColumnRequest
  def newDeleteTableColumnRequest(): DeleteTableColumnRequest = js.native
  // Create a new instance of DeleteTableRowRequest
  def newDeleteTableRowRequest(): DeleteTableRowRequest = js.native
  // Create a new instance of Dimension
  def newDimension(): Dimension = js.native
  // Create a new instance of Document
  def newDocument(): typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Document = js.native
  // Create a new instance of DocumentStyle
  def newDocumentStyle(): DocumentStyle = js.native
  // Create a new instance of EndOfSegmentLocation
  def newEndOfSegmentLocation(): EndOfSegmentLocation = js.native
  // Create a new instance of Equation
  def newEquation(): Equation = js.native
  // Create a new instance of FootnoteReference
  def newFootnoteReference(): FootnoteReference = js.native
  // Create a new instance of HorizontalRule
  def newHorizontalRule(): HorizontalRule = js.native
  // Create a new instance of InlineObjectElement
  def newInlineObjectElement(): InlineObjectElement = js.native
  // Create a new instance of InsertInlineImageRequest
  def newInsertInlineImageRequest(): InsertInlineImageRequest = js.native
  // Create a new instance of InsertPageBreakRequest
  def newInsertPageBreakRequest(): InsertPageBreakRequest = js.native
  // Create a new instance of InsertTableRequest
  def newInsertTableRequest(): InsertTableRequest = js.native
  // Create a new instance of InsertTableRowRequest
  def newInsertTableRowRequest(): InsertTableRowRequest = js.native
  // Create a new instance of InsertTextRequest
  def newInsertTextRequest(): InsertTextRequest = js.native
  // Create a new instance of Link
  def newLink(): Link = js.native
  // Create a new instance of Location
  def newLocation(): Location = js.native
  // Create a new instance of NamedStyle
  def newNamedStyle(): NamedStyle = js.native
  // Create a new instance of NamedStyles
  def newNamedStyles(): NamedStyles = js.native
  // Create a new instance of OptionalColor
  def newOptionalColor(): OptionalColor = js.native
  // Create a new instance of PageBreak
  def newPageBreak(): PageBreak = js.native
  // Create a new instance of Paragraph
  def newParagraph(): Paragraph = js.native
  // Create a new instance of ParagraphBorder
  def newParagraphBorder(): ParagraphBorder = js.native
  // Create a new instance of ParagraphElement
  def newParagraphElement(): ParagraphElement = js.native
  // Create a new instance of ParagraphStyle
  def newParagraphStyle(): ParagraphStyle = js.native
  // Create a new instance of Range
  def newRange(): Range = js.native
  // Create a new instance of ReplaceAllTextRequest
  def newReplaceAllTextRequest(): ReplaceAllTextRequest = js.native
  // Create a new instance of Request
  def newRequest(): Request = js.native
  // Create a new instance of RgbColor
  def newRgbColor(): RgbColor = js.native
  // Create a new instance of SectionBreak
  def newSectionBreak(): SectionBreak = js.native
  // Create a new instance of SectionColumnProperties
  def newSectionColumnProperties(): SectionColumnProperties = js.native
  // Create a new instance of SectionStyle
  def newSectionStyle(): SectionStyle = js.native
  // Create a new instance of Shading
  def newShading(): Shading = js.native
  // Create a new instance of Size
  def newSize(): Size = js.native
  // Create a new instance of StructuralElement
  def newStructuralElement(): StructuralElement = js.native
  // Create a new instance of SubstringMatchCriteria
  def newSubstringMatchCriteria(): SubstringMatchCriteria = js.native
  // Create a new instance of TabStop
  def newTabStop(): TabStop = js.native
  // Create a new instance of Table
  def newTable(): Table = js.native
  // Create a new instance of TableCell
  def newTableCell(): TableCell = js.native
  // Create a new instance of TableCellBorder
  def newTableCellBorder(): TableCellBorder = js.native
  // Create a new instance of TableCellLocation
  def newTableCellLocation(): TableCellLocation = js.native
  // Create a new instance of TableCellStyle
  def newTableCellStyle(): TableCellStyle = js.native
  // Create a new instance of TableColumnProperties
  def newTableColumnProperties(): TableColumnProperties = js.native
  // Create a new instance of TableOfContents
  def newTableOfContents(): TableOfContents = js.native
  // Create a new instance of TableRow
  def newTableRow(): TableRow = js.native
  // Create a new instance of TableRowStyle
  def newTableRowStyle(): TableRowStyle = js.native
  // Create a new instance of TableStyle
  def newTableStyle(): TableStyle = js.native
  // Create a new instance of TextRun
  def newTextRun(): TextRun = js.native
  // Create a new instance of TextStyle
  def newTextStyle(): TextStyle = js.native
  // Create a new instance of UpdateParagraphStyleRequest
  def newUpdateParagraphStyleRequest(): UpdateParagraphStyleRequest = js.native
  // Create a new instance of UpdateTextStyleRequest
  def newUpdateTextStyleRequest(): UpdateTextStyleRequest = js.native
  // Create a new instance of WeightedFontFamily
  def newWeightedFontFamily(): WeightedFontFamily = js.native
  // Create a new instance of WriteControl
  def newWriteControl(): WriteControl = js.native
}

object Docs_ {
  @scala.inline
  def apply(
    newAutoText: () => AutoText,
    newBackground: () => Background,
    newBatchUpdateDocumentRequest: () => BatchUpdateDocumentRequest,
    newBody: () => Body,
    newBullet: () => Bullet,
    newColor: () => Color,
    newColumnBreak: () => ColumnBreak,
    newCreateNamedRangeRequest: () => CreateNamedRangeRequest,
    newCreateParagraphBulletsRequest: () => CreateParagraphBulletsRequest,
    newDeleteContentRangeRequest: () => DeleteContentRangeRequest,
    newDeleteNamedRangeRequest: () => DeleteNamedRangeRequest,
    newDeleteParagraphBulletsRequest: () => DeleteParagraphBulletsRequest,
    newDeletePositionedObjectRequest: () => DeletePositionedObjectRequest,
    newDeleteTableColumnRequest: () => DeleteTableColumnRequest,
    newDeleteTableRowRequest: () => DeleteTableRowRequest,
    newDimension: () => Dimension,
    newDocument: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Document,
    newDocumentStyle: () => DocumentStyle,
    newEndOfSegmentLocation: () => EndOfSegmentLocation,
    newEquation: () => Equation,
    newFootnoteReference: () => FootnoteReference,
    newHorizontalRule: () => HorizontalRule,
    newInlineObjectElement: () => InlineObjectElement,
    newInsertInlineImageRequest: () => InsertInlineImageRequest,
    newInsertPageBreakRequest: () => InsertPageBreakRequest,
    newInsertTableRequest: () => InsertTableRequest,
    newInsertTableRowRequest: () => InsertTableRowRequest,
    newInsertTextRequest: () => InsertTextRequest,
    newLink: () => Link,
    newLocation: () => Location,
    newNamedStyle: () => NamedStyle,
    newNamedStyles: () => NamedStyles,
    newOptionalColor: () => OptionalColor,
    newPageBreak: () => PageBreak,
    newParagraph: () => Paragraph,
    newParagraphBorder: () => ParagraphBorder,
    newParagraphElement: () => ParagraphElement,
    newParagraphStyle: () => ParagraphStyle,
    newRange: () => Range,
    newReplaceAllTextRequest: () => ReplaceAllTextRequest,
    newRequest: () => Request,
    newRgbColor: () => RgbColor,
    newSectionBreak: () => SectionBreak,
    newSectionColumnProperties: () => SectionColumnProperties,
    newSectionStyle: () => SectionStyle,
    newShading: () => Shading,
    newSize: () => Size,
    newStructuralElement: () => StructuralElement,
    newSubstringMatchCriteria: () => SubstringMatchCriteria,
    newTabStop: () => TabStop,
    newTable: () => Table,
    newTableCell: () => TableCell,
    newTableCellBorder: () => TableCellBorder,
    newTableCellLocation: () => TableCellLocation,
    newTableCellStyle: () => TableCellStyle,
    newTableColumnProperties: () => TableColumnProperties,
    newTableOfContents: () => TableOfContents,
    newTableRow: () => TableRow,
    newTableRowStyle: () => TableRowStyle,
    newTableStyle: () => TableStyle,
    newTextRun: () => TextRun,
    newTextStyle: () => TextStyle,
    newUpdateParagraphStyleRequest: () => UpdateParagraphStyleRequest,
    newUpdateTextStyleRequest: () => UpdateTextStyleRequest,
    newWeightedFontFamily: () => WeightedFontFamily,
    newWriteControl: () => WriteControl
  ): Docs_ = {
    val __obj = js.Dynamic.literal(newAutoText = js.Any.fromFunction0(newAutoText), newBackground = js.Any.fromFunction0(newBackground), newBatchUpdateDocumentRequest = js.Any.fromFunction0(newBatchUpdateDocumentRequest), newBody = js.Any.fromFunction0(newBody), newBullet = js.Any.fromFunction0(newBullet), newColor = js.Any.fromFunction0(newColor), newColumnBreak = js.Any.fromFunction0(newColumnBreak), newCreateNamedRangeRequest = js.Any.fromFunction0(newCreateNamedRangeRequest), newCreateParagraphBulletsRequest = js.Any.fromFunction0(newCreateParagraphBulletsRequest), newDeleteContentRangeRequest = js.Any.fromFunction0(newDeleteContentRangeRequest), newDeleteNamedRangeRequest = js.Any.fromFunction0(newDeleteNamedRangeRequest), newDeleteParagraphBulletsRequest = js.Any.fromFunction0(newDeleteParagraphBulletsRequest), newDeletePositionedObjectRequest = js.Any.fromFunction0(newDeletePositionedObjectRequest), newDeleteTableColumnRequest = js.Any.fromFunction0(newDeleteTableColumnRequest), newDeleteTableRowRequest = js.Any.fromFunction0(newDeleteTableRowRequest), newDimension = js.Any.fromFunction0(newDimension), newDocument = js.Any.fromFunction0(newDocument), newDocumentStyle = js.Any.fromFunction0(newDocumentStyle), newEndOfSegmentLocation = js.Any.fromFunction0(newEndOfSegmentLocation), newEquation = js.Any.fromFunction0(newEquation), newFootnoteReference = js.Any.fromFunction0(newFootnoteReference), newHorizontalRule = js.Any.fromFunction0(newHorizontalRule), newInlineObjectElement = js.Any.fromFunction0(newInlineObjectElement), newInsertInlineImageRequest = js.Any.fromFunction0(newInsertInlineImageRequest), newInsertPageBreakRequest = js.Any.fromFunction0(newInsertPageBreakRequest), newInsertTableRequest = js.Any.fromFunction0(newInsertTableRequest), newInsertTableRowRequest = js.Any.fromFunction0(newInsertTableRowRequest), newInsertTextRequest = js.Any.fromFunction0(newInsertTextRequest), newLink = js.Any.fromFunction0(newLink), newLocation = js.Any.fromFunction0(newLocation), newNamedStyle = js.Any.fromFunction0(newNamedStyle), newNamedStyles = js.Any.fromFunction0(newNamedStyles), newOptionalColor = js.Any.fromFunction0(newOptionalColor), newPageBreak = js.Any.fromFunction0(newPageBreak), newParagraph = js.Any.fromFunction0(newParagraph), newParagraphBorder = js.Any.fromFunction0(newParagraphBorder), newParagraphElement = js.Any.fromFunction0(newParagraphElement), newParagraphStyle = js.Any.fromFunction0(newParagraphStyle), newRange = js.Any.fromFunction0(newRange), newReplaceAllTextRequest = js.Any.fromFunction0(newReplaceAllTextRequest), newRequest = js.Any.fromFunction0(newRequest), newRgbColor = js.Any.fromFunction0(newRgbColor), newSectionBreak = js.Any.fromFunction0(newSectionBreak), newSectionColumnProperties = js.Any.fromFunction0(newSectionColumnProperties), newSectionStyle = js.Any.fromFunction0(newSectionStyle), newShading = js.Any.fromFunction0(newShading), newSize = js.Any.fromFunction0(newSize), newStructuralElement = js.Any.fromFunction0(newStructuralElement), newSubstringMatchCriteria = js.Any.fromFunction0(newSubstringMatchCriteria), newTabStop = js.Any.fromFunction0(newTabStop), newTable = js.Any.fromFunction0(newTable), newTableCell = js.Any.fromFunction0(newTableCell), newTableCellBorder = js.Any.fromFunction0(newTableCellBorder), newTableCellLocation = js.Any.fromFunction0(newTableCellLocation), newTableCellStyle = js.Any.fromFunction0(newTableCellStyle), newTableColumnProperties = js.Any.fromFunction0(newTableColumnProperties), newTableOfContents = js.Any.fromFunction0(newTableOfContents), newTableRow = js.Any.fromFunction0(newTableRow), newTableRowStyle = js.Any.fromFunction0(newTableRowStyle), newTableStyle = js.Any.fromFunction0(newTableStyle), newTextRun = js.Any.fromFunction0(newTextRun), newTextStyle = js.Any.fromFunction0(newTextStyle), newUpdateParagraphStyleRequest = js.Any.fromFunction0(newUpdateParagraphStyleRequest), newUpdateTextStyleRequest = js.Any.fromFunction0(newUpdateTextStyleRequest), newWeightedFontFamily = js.Any.fromFunction0(newWeightedFontFamily), newWriteControl = js.Any.fromFunction0(newWriteControl))
    __obj.asInstanceOf[Docs_]
  }
  @scala.inline
  implicit class Docs_Ops[Self <: Docs_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewAutoText(value: () => AutoText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAutoText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBackground(value: () => Background): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBackground")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBatchUpdateDocumentRequest(value: () => BatchUpdateDocumentRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBatchUpdateDocumentRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBody(value: () => Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBody")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewBullet(value: () => Bullet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBullet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewColor(value: () => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewColumnBreak(value: () => ColumnBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newColumnBreak")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateNamedRangeRequest(value: () => CreateNamedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateNamedRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCreateParagraphBulletsRequest(value: () => CreateParagraphBulletsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCreateParagraphBulletsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteContentRangeRequest(value: () => DeleteContentRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteContentRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteNamedRangeRequest(value: () => DeleteNamedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteNamedRangeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeleteParagraphBulletsRequest(value: () => DeleteParagraphBulletsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeleteParagraphBulletsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDeletePositionedObjectRequest(value: () => DeletePositionedObjectRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeletePositionedObjectRequest")(js.Any.fromFunction0(value))
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
    def withNewDimension(value: () => Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDimension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDocument(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema.Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDocumentStyle(value: () => DocumentStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDocumentStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEndOfSegmentLocation(value: () => EndOfSegmentLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEndOfSegmentLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewEquation(value: () => Equation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEquation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFootnoteReference(value: () => FootnoteReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFootnoteReference")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewHorizontalRule(value: () => HorizontalRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHorizontalRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInlineObjectElement(value: () => InlineObjectElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInlineObjectElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInsertInlineImageRequest(value: () => InsertInlineImageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInsertInlineImageRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInsertPageBreakRequest(value: () => InsertPageBreakRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInsertPageBreakRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInsertTableRequest(value: () => InsertTableRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInsertTableRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInsertTableRowRequest(value: () => InsertTableRowRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInsertTableRowRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewInsertTextRequest(value: () => InsertTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newInsertTextRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLink(value: () => Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLocation(value: () => Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewNamedStyle(value: () => NamedStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNamedStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewNamedStyles(value: () => NamedStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNamedStyles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOptionalColor(value: () => OptionalColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOptionalColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPageBreak(value: () => PageBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPageBreak")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewParagraph(value: () => Paragraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParagraph")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewParagraphBorder(value: () => ParagraphBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParagraphBorder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewParagraphElement(value: () => ParagraphElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParagraphElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewParagraphStyle(value: () => ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParagraphStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRange(value: () => Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewReplaceAllTextRequest(value: () => ReplaceAllTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newReplaceAllTextRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRequest(value: () => Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewRgbColor(value: () => RgbColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRgbColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSectionBreak(value: () => SectionBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSectionBreak")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSectionColumnProperties(value: () => SectionColumnProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSectionColumnProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSectionStyle(value: () => SectionStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSectionStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewShading(value: () => Shading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newShading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewStructuralElement(value: () => StructuralElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStructuralElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSubstringMatchCriteria(value: () => SubstringMatchCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSubstringMatchCriteria")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTabStop(value: () => TabStop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTabStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTable(value: () => Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableCell(value: () => TableCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableCellBorder(value: () => TableCellBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableCellBorder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableCellLocation(value: () => TableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableCellLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableCellStyle(value: () => TableCellStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableCellStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableColumnProperties(value: () => TableColumnProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableColumnProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableOfContents(value: () => TableOfContents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableOfContents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableRow(value: () => TableRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableRowStyle(value: () => TableRowStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableRowStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewTableStyle(value: () => TableStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTableStyle")(js.Any.fromFunction0(value))
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
    def withNewUpdateParagraphStyleRequest(value: () => UpdateParagraphStyleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateParagraphStyleRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUpdateTextStyleRequest(value: () => UpdateTextStyleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUpdateTextStyleRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWeightedFontFamily(value: () => WeightedFontFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWeightedFontFamily")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewWriteControl(value: () => WriteControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWriteControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDocuments(value: DocumentsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Documents")(js.undefined)
        ret
    }
  }
  
}

