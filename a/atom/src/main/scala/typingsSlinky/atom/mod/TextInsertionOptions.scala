package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInsertionOptions extends TextEditOptions {
  /**
    *  If true, decreases indent level appropriately (for example, when a closing
    *  bracket is inserted).
    */
  var autoDecreaseIndent: js.UndefOr[Boolean] = js.native
  /** If true, indents all inserted text appropriately. */
  var autoIndent: js.UndefOr[Boolean] = js.native
  /** If true, indent newline appropriately. */
  var autoIndentNewline: js.UndefOr[Boolean] = js.native
  /**
    *  By default, when pasting multiple lines, Atom attempts to preserve the relative
    *  indent level between the first line and trailing lines, even if the indent
    *  level of the first line has changed from the copied text. If this option is
    *  true, this behavior is suppressed.
    */
  var preserveTrailingLineIndentation: js.UndefOr[Boolean] = js.native
  /** If true, selects the newly added text. */
  var select: js.UndefOr[Boolean] = js.native
}

object TextInsertionOptions {
  @scala.inline
  def apply(): TextInsertionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInsertionOptions]
  }
  @scala.inline
  implicit class TextInsertionOptionsOps[Self <: TextInsertionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDecreaseIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDecreaseIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDecreaseIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDecreaseIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoIndentNewline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndentNewline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIndentNewline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndentNewline")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveTrailingLineIndentation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveTrailingLineIndentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveTrailingLineIndentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveTrailingLineIndentation")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
  }
  
}

