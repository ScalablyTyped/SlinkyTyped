package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.bookmarks.BookmarkChangedEvent
import typingsSlinky.chrome.chrome.bookmarks.BookmarkChangesArg
import typingsSlinky.chrome.chrome.bookmarks.BookmarkChildrenReordered
import typingsSlinky.chrome.chrome.bookmarks.BookmarkCreateArg
import typingsSlinky.chrome.chrome.bookmarks.BookmarkCreatedEvent
import typingsSlinky.chrome.chrome.bookmarks.BookmarkDestinationArg
import typingsSlinky.chrome.chrome.bookmarks.BookmarkImportBeganEvent
import typingsSlinky.chrome.chrome.bookmarks.BookmarkImportEndedEvent
import typingsSlinky.chrome.chrome.bookmarks.BookmarkMovedEvent
import typingsSlinky.chrome.chrome.bookmarks.BookmarkRemovedEvent
import typingsSlinky.chrome.chrome.bookmarks.BookmarkSearchQuery
import typingsSlinky.chrome.chrome.bookmarks.BookmarkTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofbookmarks extends StObject {
  
  var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Double = js.native
  
  var MAX_WRITE_OPERATIONS_PER_HOUR: Double = js.native
  
  def create(bookmark: BookmarkCreateArg): Unit = js.native
  def create(bookmark: BookmarkCreateArg, callback: js.Function1[/* result */ BookmarkTreeNode, Unit]): Unit = js.native
  
  def get(idList: js.Array[String], callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def get(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def getChildren(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def getRecent(numberOfItems: Double, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def getSubTree(id: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def getTree(callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def move(id: String, destination: BookmarkDestinationArg): Unit = js.native
  def move(
    id: String,
    destination: BookmarkDestinationArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = js.native
  
  var onChanged: BookmarkChangedEvent = js.native
  
  var onChildrenReordered: BookmarkChildrenReordered = js.native
  
  var onCreated: BookmarkCreatedEvent = js.native
  
  var onImportBegan: BookmarkImportBeganEvent = js.native
  
  var onImportEnded: BookmarkImportEndedEvent = js.native
  
  var onMoved: BookmarkMovedEvent = js.native
  
  var onRemoved: BookmarkRemovedEvent = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: String, callback: js.Function): Unit = js.native
  
  def removeTree(id: String): Unit = js.native
  def removeTree(id: String, callback: js.Function): Unit = js.native
  
  def search(query: String, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  def search(query: BookmarkSearchQuery, callback: js.Function1[/* results */ js.Array[BookmarkTreeNode], Unit]): Unit = js.native
  
  def update(id: String, changes: BookmarkChangesArg): Unit = js.native
  def update(
    id: String,
    changes: BookmarkChangesArg,
    callback: js.Function1[/* result */ BookmarkTreeNode, Unit]
  ): Unit = js.native
}
