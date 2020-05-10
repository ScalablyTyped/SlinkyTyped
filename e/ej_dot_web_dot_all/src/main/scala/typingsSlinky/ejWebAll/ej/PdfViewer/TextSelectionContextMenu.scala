package typingsSlinky.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSelectionContextMenu extends js.Object {
  /** Enables/disables the copy menu in the text selection context menu.
    */
  var isCopyEnable: js.UndefOr[Boolean] = js.native
  /** Enables/ disables the text selection context menu.
    */
  var isEnable: js.UndefOr[Boolean] = js.native
  /** Enables/disables the highlight annotation menu in the text selection context menu.
    */
  var isHighlightEnable: js.UndefOr[Boolean] = js.native
  /** Enables/disables the search menu in the text selection context menu.
    */
  var isSearchEnable: js.UndefOr[Boolean] = js.native
  /** Enables/disables the strikeout annotation menu in the text selection context menu.
    */
  var isStrikeoutEnable: js.UndefOr[Boolean] = js.native
}

object TextSelectionContextMenu {
  @scala.inline
  def apply(): TextSelectionContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSelectionContextMenu]
  }
  @scala.inline
  implicit class TextSelectionContextMenuOps[Self <: TextSelectionContextMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCopyEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCopyEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCopyEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCopyEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHighlightEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHighlightEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHighlightEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHighlightEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSearchEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSearchEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStrikeoutEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStrikeoutEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStrikeoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStrikeoutEnable")(js.undefined)
        ret
    }
  }
  
}

