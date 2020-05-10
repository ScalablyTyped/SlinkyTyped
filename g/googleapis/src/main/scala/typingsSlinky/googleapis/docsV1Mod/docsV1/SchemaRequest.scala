package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single update to apply to a document.
  */
@js.native
trait SchemaRequest extends js.Object {
  /**
    * Creates a named range.
    */
  var createNamedRange: js.UndefOr[SchemaCreateNamedRangeRequest] = js.native
  /**
    * Creates bullets for paragraphs.
    */
  var createParagraphBullets: js.UndefOr[SchemaCreateParagraphBulletsRequest] = js.native
  /**
    * Deletes content from the document.
    */
  var deleteContentRange: js.UndefOr[SchemaDeleteContentRangeRequest] = js.native
  /**
    * Deletes a named range.
    */
  var deleteNamedRange: js.UndefOr[SchemaDeleteNamedRangeRequest] = js.native
  /**
    * Deletes bullets from paragraphs.
    */
  var deleteParagraphBullets: js.UndefOr[SchemaDeleteParagraphBulletsRequest] = js.native
  /**
    * Deletes a positioned object from the document.
    */
  var deletePositionedObject: js.UndefOr[SchemaDeletePositionedObjectRequest] = js.native
  /**
    * Deletes a column from a table.
    */
  var deleteTableColumn: js.UndefOr[SchemaDeleteTableColumnRequest] = js.native
  /**
    * Deletes a row from a table.
    */
  var deleteTableRow: js.UndefOr[SchemaDeleteTableRowRequest] = js.native
  /**
    * Inserts an inline image at the specified location.
    */
  var insertInlineImage: js.UndefOr[SchemaInsertInlineImageRequest] = js.native
  /**
    * Inserts a page break at the specified location.
    */
  var insertPageBreak: js.UndefOr[SchemaInsertPageBreakRequest] = js.native
  /**
    * Inserts a table at the specified location.
    */
  var insertTable: js.UndefOr[SchemaInsertTableRequest] = js.native
  /**
    * Inserts an empty row into a table.
    */
  var insertTableRow: js.UndefOr[SchemaInsertTableRowRequest] = js.native
  /**
    * Inserts text at the specified location.
    */
  var insertText: js.UndefOr[SchemaInsertTextRequest] = js.native
  /**
    * Replaces all instances of the specified text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextRequest] = js.native
  /**
    * Updates the paragraph style at the specified range.
    */
  var updateParagraphStyle: js.UndefOr[SchemaUpdateParagraphStyleRequest] = js.native
  /**
    * Updates the text style at the specified range.
    */
  var updateTextStyle: js.UndefOr[SchemaUpdateTextStyleRequest] = js.native
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
    def withCreateNamedRange(value: SchemaCreateNamedRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNamedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateNamedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNamedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateParagraphBullets(value: SchemaCreateParagraphBulletsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createParagraphBullets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateParagraphBullets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createParagraphBullets")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteContentRange(value: SchemaDeleteContentRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteContentRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteContentRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteContentRange")(js.undefined)
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
    def withDeleteParagraphBullets(value: SchemaDeleteParagraphBulletsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteParagraphBullets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteParagraphBullets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteParagraphBullets")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletePositionedObject(value: SchemaDeletePositionedObjectRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePositionedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletePositionedObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletePositionedObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteTableColumn(value: SchemaDeleteTableColumnRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteTableColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteTableRow(value: SchemaDeleteTableRowRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteTableRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTableRow")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertInlineImage(value: SchemaInsertInlineImageRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertInlineImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertInlineImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertInlineImage")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertPageBreak(value: SchemaInsertPageBreakRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertPageBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertPageBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertPageBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertTable(value: SchemaInsertTableRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTable")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertTableRow(value: SchemaInsertTableRowRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertTableRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableRow")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertText(value: SchemaInsertTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceAllText(value: SchemaReplaceAllTextRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllText")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateParagraphStyle(value: SchemaUpdateParagraphStyleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateParagraphStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateParagraphStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateParagraphStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTextStyle(value: SchemaUpdateTextStyleRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTextStyle")(js.undefined)
        ret
    }
  }
  
}

