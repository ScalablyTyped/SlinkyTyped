package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorWrappingInfo extends js.Object {
  val inDiffEditor: Boolean = js.native
  val isDominatedByLongLines: Boolean = js.native
  val isViewportWrapping: Boolean = js.native
  val isWordWrapMinified: Boolean = js.native
  val wordWrapBreakAfterCharacters: String = js.native
  val wordWrapBreakBeforeCharacters: String = js.native
  val wordWrapBreakObtrusiveCharacters: String = js.native
  val wrappingColumn: Double = js.native
  val wrappingIndent: WrappingIndent = js.native
}

object EditorWrappingInfo {
  @scala.inline
  def apply(
    inDiffEditor: Boolean,
    isDominatedByLongLines: Boolean,
    isViewportWrapping: Boolean,
    isWordWrapMinified: Boolean,
    wordWrapBreakAfterCharacters: String,
    wordWrapBreakBeforeCharacters: String,
    wordWrapBreakObtrusiveCharacters: String,
    wrappingColumn: Double,
    wrappingIndent: WrappingIndent
  ): EditorWrappingInfo = {
    val __obj = js.Dynamic.literal(inDiffEditor = inDiffEditor.asInstanceOf[js.Any], isDominatedByLongLines = isDominatedByLongLines.asInstanceOf[js.Any], isViewportWrapping = isViewportWrapping.asInstanceOf[js.Any], isWordWrapMinified = isWordWrapMinified.asInstanceOf[js.Any], wordWrapBreakAfterCharacters = wordWrapBreakAfterCharacters.asInstanceOf[js.Any], wordWrapBreakBeforeCharacters = wordWrapBreakBeforeCharacters.asInstanceOf[js.Any], wordWrapBreakObtrusiveCharacters = wordWrapBreakObtrusiveCharacters.asInstanceOf[js.Any], wrappingColumn = wrappingColumn.asInstanceOf[js.Any], wrappingIndent = wrappingIndent.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorWrappingInfo]
  }
  @scala.inline
  implicit class EditorWrappingInfoOps[Self <: EditorWrappingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInDiffEditor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDiffEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDominatedByLongLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDominatedByLongLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsViewportWrapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isViewportWrapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWordWrapMinified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWordWrapMinified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrapBreakAfterCharacters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakAfterCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrapBreakBeforeCharacters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakBeforeCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrapBreakObtrusiveCharacters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakObtrusiveCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrappingColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappingColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrappingIndent(value: WrappingIndent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappingIndent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

