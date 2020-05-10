package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertTextRequest extends js.Object {
  /**
    * The optional table cell location if the text is to be inserted into a table
    * cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  /**
    * The index where the text will be inserted, in Unicode code units, based
    * on TextElement indexes.
    *
    * The index is zero-based and is computed from the start of the string.
    * The index may be adjusted to prevent insertions inside Unicode grapheme
    * clusters. In these cases, the text will be inserted immediately after the
    * grapheme cluster.
    */
  var insertionIndex: js.UndefOr[Double] = js.native
  /** The object ID of the shape or table where the text will be inserted. */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The text to be inserted.
    *
    * Inserting a newline character will implicitly create a new
    * ParagraphMarker at that index.
    * The paragraph style of the new paragraph will be copied from the paragraph
    * at the current insertion index, including lists and bullets.
    *
    * Text styles for inserted text will be determined automatically, generally
    * preserving the styling of neighboring text. In most cases, the text will be
    * added to the TextRun that exists at the
    * insertion index.
    *
    * Some control characters (U+0000-U+0008, U+000C-U+001F) and characters
    * from the Unicode Basic Multilingual Plane Private Use Area (U+E000-U+F8FF)
    * will be stripped out of the inserted text.
    */
  var text: js.UndefOr[String] = js.native
}

object InsertTextRequest {
  @scala.inline
  def apply(): InsertTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTextRequest]
  }
  @scala.inline
  implicit class InsertTextRequestOps[Self <: InsertTextRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellLocation(value: TableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertionIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

