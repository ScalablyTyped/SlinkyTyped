package typingsSlinky.googleAppsScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing a bookmark.
  *
  *     // Insert a bookmark at the cursor position and log its ID.
  *     var doc = DocumentApp.getActiveDocument();
  *     var cursor = doc.getCursor();
  *     var bookmark = doc.addBookmark(cursor);
  *     Logger.log(bookmark.getId());
  */
@js.native
trait Bookmark extends js.Object {
  def getId(): String = js.native
  def getPosition(): Position = js.native
  def remove(): Unit = js.native
}

object Bookmark {
  @scala.inline
  def apply(getId: () => String, getPosition: () => Position, remove: () => Unit): Bookmark = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Bookmark]
  }
  @scala.inline
  implicit class BookmarkOps[Self <: Bookmark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

