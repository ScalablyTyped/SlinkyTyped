package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandActions extends js.Object {
  def closeTag(cm: Editor): Unit = js.native
  /** If something is selected, indent it by one indent unit. If nothing is selected, insert a tab character. */
  def defaultTabTab(cm: Editor): Unit = js.native
  /** Delete the character after the cursor. */
  def delCharAfter(cm: Editor): Unit = js.native
  /** Delete the character before the cursor. */
  def delCharBefore(cm: Editor): Unit = js.native
  /** Delete to the start of the group after the cursor. */
  def delGroupAfter(cm: Editor): Unit = js.native
  /** Delete to the left of the group before the cursor. */
  def delGroupBefore(cm: Editor): Unit = js.native
  /** Delete the part of the line before the cursor. */
  def delLineLeft(cm: Editor): Unit = js.native
  /** Delete up to the end of the word after the cursor. */
  def delWordAfter(cm: Editor): Unit = js.native
  /** Delete up to the start of the word before the cursor. */
  def delWordBefore(cm: Editor): Unit = js.native
  /** Delete the part of the line from the left side of the visual line the cursor is on to the cursor. */
  def delWrappedLineLeft(cm: Editor): Unit = js.native
  /** Delete the part of the line from the cursor to the right side of the visual line the cursor is on. */
  def delWrappedLineRight(cm: Editor): Unit = js.native
  /** Deletes the whole line under the cursor, including newline at the end. */
  def deleteLine(cm: Editor): Unit = js.native
  /** Move the cursor one character left, going to the previous line when hitting the start of line. */
  def goCharLeft(cm: Editor): Unit = js.native
  /** Move the cursor one character right, going to the next line when hitting the end of line. */
  def goCharRight(cm: Editor): Unit = js.native
  /** Move the cursor one character left, but don't cross line boundaries. */
  def goColumnLeft(cm: Editor): Unit = js.native
  /** Move the cursor one character right, don't cross line boundaries. */
  def goColumnRight(cm: Editor): Unit = js.native
  /** Move the cursor to the end of the document. */
  def goDocEnd(cm: Editor): Unit = js.native
  /** Move the cursor to the start of the document. */
  def goDocStart(cm: Editor): Unit = js.native
  /** Move to the left of the group before the cursor. A group is a stretch of word characters, a stretch of punctuation characters, a newline, or a stretch of more than one whitespace character. */
  def goGroupLeft(cm: Editor): Unit = js.native
  /** Move to the right of the group after the cursor (see above). */
  def goGroupRight(cm: Editor): Unit = js.native
  /** Move down one line. */
  def goLineDown(cm: Editor): Unit = js.native
  /** Move the cursor to the end of the line. */
  def goLineEnd(cm: Editor): Unit = js.native
  /** Move the cursor to the left side of the visual line it is on. If this line is wrapped, that may not be the start of the line. */
  def goLineLeft(cm: Editor): Unit = js.native
  /** Move the cursor to the left side of the visual line it is on. If that takes it to the start of the line, behave like goLineStartSmart. */
  def goLineLeftSmart(cm: Editor): Unit = js.native
  /** Move the cursor to the right side of the visual line it is on. */
  def goLineRight(cm: Editor): Unit = js.native
  /** Move the cursor to the start of the line. */
  def goLineStart(cm: Editor): Unit = js.native
  /** Move to the start of the text on the line, or if we are already there, to the actual start of the line (including whitespace). */
  def goLineStartSmart(cm: Editor): Unit = js.native
  /** Move the cursor up one line. */
  def goLineUp(cm: Editor): Unit = js.native
  /** Move cursor to the next diff */
  def goNextDiff(cm: Editor): Unit = js.native
  /** Move the cursor down one screen, and scroll down by the same distance. */
  def goPageDown(cm: Editor): Unit = js.native
  /** Move the cursor up one screen, and scroll up by the same distance. */
  def goPageUp(cm: Editor): Unit = js.native
  /** Move cursor to the previous diff */
  def goPrevDiff(cm: Editor): Unit = js.native
  /** Move the cursor to the start of the previous word. */
  def goWordLeft(cm: Editor): Unit = js.native
  /** Move the cursor to the end of the next word. */
  def goWordRight(cm: Editor): Unit = js.native
  /** Auto-indent the current line or selection. */
  def indentAuto(cm: Editor): Unit = js.native
  /** Dedent the current line or selection by one indent unit. */
  def indentLess(cm: Editor): Unit = js.native
  /** Indent the current line or selection by one indent unit. */
  def indentMore(cm: Editor): Unit = js.native
  /** Insert the amount of spaces that match the width a tab at the cursor position would have. */
  def insertSoftTab(cm: Editor): Unit = js.native
  /** Insert a tab character at the cursor. */
  def insertTab(cm: Editor): Unit = js.native
  /** Emacs-style line killing. Deletes the part of the line after the cursor. If that consists only of whitespace, the newline at the end of the line is also deleted. */
  def killLine(cm: Editor): Unit = js.native
  /** Insert a newline and auto-indent the new line. */
  def newlineAndIndent(cm: Editor): Unit = js.native
  /** Redo the last undone change. */
  def redo(cm: Editor): Unit = js.native
  /** Redo the last change to the selection, or the last text change if no selection changes remain. */
  def redoSelection(cm: Editor): Unit = js.native
  /** Select the whole content of the editor. */
  def selectAll(cm: Editor): Unit = js.native
  /** When multiple selections are present, this deselects all but the primary selection. */
  def singleSelection(cm: Editor): Unit = js.native
  /**
    * You can bind a key to in order to jump to the tag matching the one under the cursor.
    */
  def toMatchingTag(cm: Editor): Unit = js.native
  /** Flip the overwrite flag. */
  def toggleOverwrite(cm: Editor): Unit = js.native
  /** Swap the characters before and after the cursor. */
  def transposeChars(cm: Editor): Unit = js.native
  /** Undo the last change. Note that, because browsers still don't make it possible for scripts to react to or customize the context menu, selecting undo (or redo) from the context menu in a CodeMirror instance does not work. */
  def undo(cm: Editor): Unit = js.native
  /** Undo the last change to the selection, or if there are no selection-only changes at the top of the history, undo the last change. */
  def undoSelection(cm: Editor): Unit = js.native
}

object CommandActions {
  @scala.inline
  def apply(
    closeTag: Editor => Unit,
    defaultTabTab: Editor => Unit,
    delCharAfter: Editor => Unit,
    delCharBefore: Editor => Unit,
    delGroupAfter: Editor => Unit,
    delGroupBefore: Editor => Unit,
    delLineLeft: Editor => Unit,
    delWordAfter: Editor => Unit,
    delWordBefore: Editor => Unit,
    delWrappedLineLeft: Editor => Unit,
    delWrappedLineRight: Editor => Unit,
    deleteLine: Editor => Unit,
    goCharLeft: Editor => Unit,
    goCharRight: Editor => Unit,
    goColumnLeft: Editor => Unit,
    goColumnRight: Editor => Unit,
    goDocEnd: Editor => Unit,
    goDocStart: Editor => Unit,
    goGroupLeft: Editor => Unit,
    goGroupRight: Editor => Unit,
    goLineDown: Editor => Unit,
    goLineEnd: Editor => Unit,
    goLineLeft: Editor => Unit,
    goLineLeftSmart: Editor => Unit,
    goLineRight: Editor => Unit,
    goLineStart: Editor => Unit,
    goLineStartSmart: Editor => Unit,
    goLineUp: Editor => Unit,
    goNextDiff: Editor => Unit,
    goPageDown: Editor => Unit,
    goPageUp: Editor => Unit,
    goPrevDiff: Editor => Unit,
    goWordLeft: Editor => Unit,
    goWordRight: Editor => Unit,
    indentAuto: Editor => Unit,
    indentLess: Editor => Unit,
    indentMore: Editor => Unit,
    insertSoftTab: Editor => Unit,
    insertTab: Editor => Unit,
    killLine: Editor => Unit,
    newlineAndIndent: Editor => Unit,
    redo: Editor => Unit,
    redoSelection: Editor => Unit,
    selectAll: Editor => Unit,
    singleSelection: Editor => Unit,
    toMatchingTag: Editor => Unit,
    toggleOverwrite: Editor => Unit,
    transposeChars: Editor => Unit,
    undo: Editor => Unit,
    undoSelection: Editor => Unit
  ): CommandActions = {
    val __obj = js.Dynamic.literal(closeTag = js.Any.fromFunction1(closeTag), defaultTabTab = js.Any.fromFunction1(defaultTabTab), delCharAfter = js.Any.fromFunction1(delCharAfter), delCharBefore = js.Any.fromFunction1(delCharBefore), delGroupAfter = js.Any.fromFunction1(delGroupAfter), delGroupBefore = js.Any.fromFunction1(delGroupBefore), delLineLeft = js.Any.fromFunction1(delLineLeft), delWordAfter = js.Any.fromFunction1(delWordAfter), delWordBefore = js.Any.fromFunction1(delWordBefore), delWrappedLineLeft = js.Any.fromFunction1(delWrappedLineLeft), delWrappedLineRight = js.Any.fromFunction1(delWrappedLineRight), deleteLine = js.Any.fromFunction1(deleteLine), goCharLeft = js.Any.fromFunction1(goCharLeft), goCharRight = js.Any.fromFunction1(goCharRight), goColumnLeft = js.Any.fromFunction1(goColumnLeft), goColumnRight = js.Any.fromFunction1(goColumnRight), goDocEnd = js.Any.fromFunction1(goDocEnd), goDocStart = js.Any.fromFunction1(goDocStart), goGroupLeft = js.Any.fromFunction1(goGroupLeft), goGroupRight = js.Any.fromFunction1(goGroupRight), goLineDown = js.Any.fromFunction1(goLineDown), goLineEnd = js.Any.fromFunction1(goLineEnd), goLineLeft = js.Any.fromFunction1(goLineLeft), goLineLeftSmart = js.Any.fromFunction1(goLineLeftSmart), goLineRight = js.Any.fromFunction1(goLineRight), goLineStart = js.Any.fromFunction1(goLineStart), goLineStartSmart = js.Any.fromFunction1(goLineStartSmart), goLineUp = js.Any.fromFunction1(goLineUp), goNextDiff = js.Any.fromFunction1(goNextDiff), goPageDown = js.Any.fromFunction1(goPageDown), goPageUp = js.Any.fromFunction1(goPageUp), goPrevDiff = js.Any.fromFunction1(goPrevDiff), goWordLeft = js.Any.fromFunction1(goWordLeft), goWordRight = js.Any.fromFunction1(goWordRight), indentAuto = js.Any.fromFunction1(indentAuto), indentLess = js.Any.fromFunction1(indentLess), indentMore = js.Any.fromFunction1(indentMore), insertSoftTab = js.Any.fromFunction1(insertSoftTab), insertTab = js.Any.fromFunction1(insertTab), killLine = js.Any.fromFunction1(killLine), newlineAndIndent = js.Any.fromFunction1(newlineAndIndent), redo = js.Any.fromFunction1(redo), redoSelection = js.Any.fromFunction1(redoSelection), selectAll = js.Any.fromFunction1(selectAll), singleSelection = js.Any.fromFunction1(singleSelection), toMatchingTag = js.Any.fromFunction1(toMatchingTag), toggleOverwrite = js.Any.fromFunction1(toggleOverwrite), transposeChars = js.Any.fromFunction1(transposeChars), undo = js.Any.fromFunction1(undo), undoSelection = js.Any.fromFunction1(undoSelection))
    __obj.asInstanceOf[CommandActions]
  }
  @scala.inline
  implicit class CommandActionsOps[Self <: CommandActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseTag(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefaultTabTab(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTabTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelCharAfter(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delCharAfter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelCharBefore(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delCharBefore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelGroupAfter(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delGroupAfter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelGroupBefore(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delGroupBefore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelLineLeft(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delLineLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelWordAfter(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delWordAfter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelWordBefore(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delWordBefore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelWrappedLineLeft(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delWrappedLineLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelWrappedLineRight(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delWrappedLineRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteLine(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoCharLeft(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goCharLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoCharRight(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goCharRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoColumnLeft(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goColumnLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoColumnRight(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goColumnRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoDocEnd(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goDocEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoDocStart(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goDocStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoGroupLeft(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goGroupLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoGroupRight(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goGroupRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoLineDown(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goLineDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoLineEnd(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goLineEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoLineLeft(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goLineLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoLineLeftSmart(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goLineLeftSmart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoLineRight(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goLineRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoLineStart(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goLineStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoLineStartSmart(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goLineStartSmart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoLineUp(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goLineUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoNextDiff(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goNextDiff")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoPageDown(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goPageDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoPageUp(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goPageUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoPrevDiff(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goPrevDiff")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoWordLeft(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goWordLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGoWordRight(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goWordRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndentAuto(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentAuto")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndentLess(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentLess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndentMore(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentMore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertSoftTab(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSoftTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertTab(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKillLine(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewlineAndIndent(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newlineAndIndent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRedo(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRedoSelection(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redoSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectAll(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSingleSelection(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToMatchingTag(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toMatchingTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggleOverwrite(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOverwrite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransposeChars(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transposeChars")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUndo(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUndoSelection(value: Editor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoSelection")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

