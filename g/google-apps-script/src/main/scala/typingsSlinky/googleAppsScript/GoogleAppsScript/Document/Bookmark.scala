package typingsSlinky.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Bookmark extends StObject {
  
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
  implicit class BookmarkMutableBuilder[Self <: Bookmark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => Position): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
