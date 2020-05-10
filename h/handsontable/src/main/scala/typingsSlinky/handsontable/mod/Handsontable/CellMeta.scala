package typingsSlinky.handsontable.mod.Handsontable

import typingsSlinky.handsontable.mod.Handsontable.comments.CommentObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional cell-specific meta data.
  */
@js.native
trait CellMeta extends ColumnSettings {
  var comment: js.UndefOr[CommentObject] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var isSearchResult: js.UndefOr[Boolean] = js.native
  var skipRowOnPaste: js.UndefOr[Boolean] = js.native
  var valid: js.UndefOr[Boolean] = js.native
}

object CellMeta {
  @scala.inline
  def apply(): CellMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellMeta]
  }
  @scala.inline
  implicit class CellMetaOps[Self <: CellMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: CommentObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSearchResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSearchResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchResult")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipRowOnPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRowOnPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipRowOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRowOnPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
  }
  
}

