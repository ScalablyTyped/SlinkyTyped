package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var createNamedRange: js.UndefOr[CreateNamedRangeRequest] = js.native
  var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.native
  var deleteContentRange: js.UndefOr[DeleteContentRangeRequest] = js.native
  var deleteNamedRange: js.UndefOr[DeleteNamedRangeRequest] = js.native
  var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.native
  var deletePositionedObject: js.UndefOr[DeletePositionedObjectRequest] = js.native
  var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.native
  var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.native
  var insertInlineImage: js.UndefOr[InsertInlineImageRequest] = js.native
  var insertPageBreak: js.UndefOr[InsertPageBreakRequest] = js.native
  var insertTable: js.UndefOr[InsertTableRequest] = js.native
  var insertTableRow: js.UndefOr[InsertTableRowRequest] = js.native
  var insertText: js.UndefOr[InsertTextRequest] = js.native
  var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.native
  var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.native
  var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.native
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
    def withCreateNamedRange(value: CreateNamedRangeRequest): Self = {
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
    def withCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = {
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
    def withDeleteContentRange(value: DeleteContentRangeRequest): Self = {
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
    def withDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = {
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
    def withDeletePositionedObject(value: DeletePositionedObjectRequest): Self = {
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
    def withDeleteTableColumn(value: DeleteTableColumnRequest): Self = {
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
    def withDeleteTableRow(value: DeleteTableRowRequest): Self = {
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
    def withInsertInlineImage(value: InsertInlineImageRequest): Self = {
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
    def withInsertPageBreak(value: InsertPageBreakRequest): Self = {
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
    def withInsertTable(value: InsertTableRequest): Self = {
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
    def withInsertTableRow(value: InsertTableRowRequest): Self = {
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
    def withInsertText(value: InsertTextRequest): Self = {
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
    def withReplaceAllText(value: ReplaceAllTextRequest): Self = {
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
    def withUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = {
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
    def withUpdateTextStyle(value: UpdateTextStyleRequest): Self = {
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

