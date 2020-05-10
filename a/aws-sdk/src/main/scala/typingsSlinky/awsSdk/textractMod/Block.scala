package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  /**
    * The type of text item that's recognized. In operations for text detection, the following types are returned:    PAGE - Contains a list of the LINE Block objects that are detected on a document page.    WORD - A word detected on a document page. A word is one or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of tab-delimited, contiguous words that are detected on a document page.   In text analysis operations, the following types are returned:    PAGE - Contains a list of child Block objects that are detected on a document page.    KEY_VALUE_SET - Stores the KEY and VALUE Block objects for linked text that's detected on a document page. Use the EntityType field to determine if a KEY_VALUE_SET object is a KEY Block object or a VALUE Block object.     WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of tab-delimited, contiguous words that are detected on a document page.    TABLE - A table that's detected on a document page. A table is grid-based information with two or more rows or columns, with a cell span of one row and one column each.     CELL - A cell within a detected table. The cell is the parent of the block that contains the text in the cell.    SELECTION_ELEMENT - A selection element such as an option button (radio button) or a check box that's detected on a document page. Use the value of SelectionStatus to determine the status of the selection element.  
    */
  var BlockType: js.UndefOr[typingsSlinky.awsSdk.textractMod.BlockType] = js.native
  /**
    * The column in which a table cell appears. The first column position is 1. ColumnIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var ColumnIndex: js.UndefOr[UInteger] = js.native
  /**
    * The number of columns that a table cell spans. Currently this value is always 1, even if the number of columns spanned is greater than 1. ColumnSpan isn't returned by DetectDocumentText and GetDocumentTextDetection. 
    */
  var ColumnSpan: js.UndefOr[UInteger] = js.native
  /**
    * The confidence score that Amazon Textract has in the accuracy of the recognized text and the accuracy of the geometry points around the recognized text.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * The type of entity. The following can be returned:    KEY - An identifier for a field on the document.    VALUE - The field text.    EntityTypes isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var EntityTypes: js.UndefOr[typingsSlinky.awsSdk.textractMod.EntityTypes] = js.native
  /**
    * The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that surrounds the text, and a finer-grain polygon for more accurate spatial information. 
    */
  var Geometry: js.UndefOr[typingsSlinky.awsSdk.textractMod.Geometry] = js.native
  /**
    * The identifier for the recognized text. The identifier is only unique for a single operation. 
    */
  var Id: js.UndefOr[NonEmptyString] = js.native
  /**
    * The page on which a block was detected. Page is returned by asynchronous operations. Page values greater than 1 are only returned for multipage documents that are in PDF format. A scanned image (JPEG/PNG), even if it contains multiple document pages, is considered to be a single-page document. The value of Page is always 1. Synchronous operations don't return Page because every input document is considered to be a single-page document.
    */
  var Page: js.UndefOr[UInteger] = js.native
  /**
    * A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD block that's part of the line of text. There aren't Relationship objects in the list for relationships that don't exist, such as when the current block has no child blocks. The list size can be the following:   0 - The block has no child blocks.   1 - The block has child blocks.  
    */
  var Relationships: js.UndefOr[RelationshipList] = js.native
  /**
    * The row in which a table cell is located. The first row position is 1. RowIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var RowIndex: js.UndefOr[UInteger] = js.native
  /**
    * The number of rows that a table cell spans. Currently this value is always 1, even if the number of rows spanned is greater than 1. RowSpan isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var RowSpan: js.UndefOr[UInteger] = js.native
  /**
    * The selection status of a selection element, such as an option button or check box. 
    */
  var SelectionStatus: js.UndefOr[typingsSlinky.awsSdk.textractMod.SelectionStatus] = js.native
  /**
    * The word or line of text that's recognized by Amazon Textract. 
    */
  var Text: js.UndefOr[String] = js.native
}

object Block {
  @scala.inline
  def apply(): Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockType(value: BlockType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockType")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnIndex(value: UInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSpan(value: UInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withConfidence(value: Percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityTypes(value: EntityTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometry(value: Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: UInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Page")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationships(value: RelationshipList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Relationships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Relationships")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIndex(value: UInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSpan(value: UInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStatus(value: SelectionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(js.undefined)
        ret
    }
  }
  
}

