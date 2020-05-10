package typingsSlinky.googleAppsScript.GoogleAppsScript.Document

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a location in the document, relative to a specific element. The user's cursor is
  * represented as a Position, among other uses. Scripts can only access the cursor of the
  * user who is running the script, and only if the script is bound to the document.
  *
  *     // Insert some text at the cursor position and make it bold.
  *     var cursor = DocumentApp.getActiveDocument().getCursor();
  *     if (cursor) {
  *       // Attempt to insert text at the cursor position. If the insertion returns null, the cursor's
  *       // containing element doesn't allow insertions, so show the user an error message.
  *       var element = cursor.insertText('ಠ‿ಠ');
  *       if (element) {
  *         element.setBold(true);
  *       } else {
  *         DocumentApp.getUi().alert('Cannot insert text here.');
  *       }
  *     } else {
  *       DocumentApp.getUi().alert('Cannot find a cursor.');
  *     }
  */
@js.native
trait Position extends js.Object {
  def getElement(): Element = js.native
  def getOffset(): Integer = js.native
  def getSurroundingText(): Text = js.native
  def getSurroundingTextOffset(): Integer = js.native
  def insertBookmark(): Bookmark = js.native
  def insertInlineImage(image: BlobSource): InlineImage = js.native
  def insertText(text: String): Text = js.native
}

object Position {
  @scala.inline
  def apply(
    getElement: () => Element,
    getOffset: () => Integer,
    getSurroundingText: () => Text,
    getSurroundingTextOffset: () => Integer,
    insertBookmark: () => Bookmark,
    insertInlineImage: BlobSource => InlineImage,
    insertText: String => Text
  ): Position = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getOffset = js.Any.fromFunction0(getOffset), getSurroundingText = js.Any.fromFunction0(getSurroundingText), getSurroundingTextOffset = js.Any.fromFunction0(getSurroundingTextOffset), insertBookmark = js.Any.fromFunction0(insertBookmark), insertInlineImage = js.Any.fromFunction1(insertInlineImage), insertText = js.Any.fromFunction1(insertText))
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetElement(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffset(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSurroundingText(value: () => Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurroundingText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSurroundingTextOffset(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurroundingTextOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertBookmark(value: () => Bookmark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBookmark")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertInlineImage(value: BlobSource => InlineImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertInlineImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertText(value: String => Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

