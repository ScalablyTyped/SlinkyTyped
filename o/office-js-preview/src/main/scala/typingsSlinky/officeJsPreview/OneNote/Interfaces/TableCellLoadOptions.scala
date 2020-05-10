package typingsSlinky.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell in a OneNote table.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait TableCellLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the index of the cell in its row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the ID of the cell. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the collection of Paragraph objects in the TableCell.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[ParagraphCollectionLoadOptions] = js.native
  /**
    *
    * Gets the parent row of the cell.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentRow: js.UndefOr[TableRowLoadOptions] = js.native
  /**
    *
    * Gets the index of the cell's row in the table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets and sets the shading color of the cell
    *
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[Boolean] = js.native
}

object TableCellLoadOptions {
  @scala.inline
  def apply(): TableCellLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellLoadOptions]
  }
  @scala.inline
  implicit class TableCellLoadOptionsOps[Self <: TableCellLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withCellIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphs(value: ParagraphCollectionLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphs")(js.undefined)
        ret
    }
    @scala.inline
    def withParentRow(value: TableRowLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRow")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShadingColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadingColor")(js.undefined)
        ret
    }
  }
  
}

