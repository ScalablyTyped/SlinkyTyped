package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.anon.ChildIds
import typingsSlinky.firefoxWebextBrowser.anon.Index
import typingsSlinky.firefoxWebextBrowser.anon.Node
import typingsSlinky.firefoxWebextBrowser.anon.OldIndex
import typingsSlinky.firefoxWebextBrowser.anon.Query
import typingsSlinky.firefoxWebextBrowser.anon.TitleString
import typingsSlinky.firefoxWebextBrowser.anon.TitleUrl
import typingsSlinky.firefoxWebextBrowser.browser.bookmarks.BookmarkTreeNode
import typingsSlinky.firefoxWebextBrowser.browser.bookmarks.CreateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.bookmarks` API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages,
  * which you can use to create a custom Bookmark Manager page.
  *
  * Permissions: `bookmarks`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.bookmarks")
@js.native
object bookmarks extends js.Object {
  
  /**
    * Creates a bookmark or folder under the specified parentId. If url is NULL or missing, it will be a folder.
    */
  def create(bookmark: CreateDetails): js.Promise[BookmarkTreeNode] = js.native
  
  /* bookmarks functions */
  /**
    * Retrieves the specified BookmarkTreeNode(s).
    * @param idOrIdList A single string-valued id, or an array of string-valued ids
    */
  def get(idOrIdList: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def get(idOrIdList: js.Array[String]): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /** Retrieves the children of the specified BookmarkTreeNode id. */
  def getChildren(id: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /**
    * Retrieves the recently added bookmarks.
    * @param numberOfItems The maximum number of items to return.
    */
  def getRecent(numberOfItems: Double): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /**
    * Retrieves part of the Bookmarks hierarchy, starting at the specified node.
    * @param id The ID of the root of the subtree to retrieve.
    */
  def getSubTree(id: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /** Retrieves the entire Bookmarks hierarchy. */
  def getTree(): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /** Moves the specified BookmarkTreeNode to the provided location. */
  def move(id: String, destination: Index): js.Promise[BookmarkTreeNode] = js.native
  
  /**
    * Fired when a bookmark or folder changes. **Note:** Currently, only title and url changes trigger this.
    */
  val onChanged: WebExtEvent[js.Function2[/* id */ String, /* changeInfo */ TitleString, Unit]] = js.native
  
  /**
    * Fired when the children of a folder have changed their order due to the order being sorted in the UI. This is
    * not called as a result of a move().
    * @deprecated Unsupported on Firefox at this time.
    */
  val onChildrenReordered: js.UndefOr[WebExtEvent[js.Function2[/* id */ String, /* reorderInfo */ ChildIds, Unit]]] = js.native
  
  /* bookmarks events */
  /** Fired when a bookmark or folder is created. */
  val onCreated: WebExtEvent[js.Function2[/* id */ String, /* bookmark */ BookmarkTreeNode, Unit]] = js.native
  
  /** Fired when a bookmark or folder is moved to a different parent folder. */
  val onMoved: WebExtEvent[js.Function2[/* id */ String, /* moveInfo */ OldIndex, Unit]] = js.native
  
  /**
    * Fired when a bookmark or folder is removed. When a folder is removed recursively, a single notification is fired
    * for the folder, and none for its contents.
    */
  val onRemoved: WebExtEvent[js.Function2[/* id */ String, /* removeInfo */ Node, Unit]] = js.native
  
  /** Removes a bookmark or an empty bookmark folder. */
  def remove(id: String): js.Promise[Unit] = js.native
  
  /** Recursively removes a bookmark folder. */
  def removeTree(id: String): js.Promise[Unit] = js.native
  
  /**
    * Searches for BookmarkTreeNodes matching the given query. Queries specified with an object produce
    * BookmarkTreeNodes matching all specified properties.
    * @param query Either a string of words that are matched against bookmark URLs and titles, or an object. If an
    *     object, the properties `query`, `url`, and `title` may be specified and bookmarks matching all specified
    *     properties will be produced.
    */
  def search(query: String): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  def search(query: Query): js.Promise[js.Array[BookmarkTreeNode]] = js.native
  
  /**
    * Updates the properties of a bookmark or folder. Specify only the properties that you want to change; unspecified
    * properties will be left unchanged. **Note:** Currently, only 'title' and 'url' are supported.
    */
  def update(id: String, changes: TitleUrl): js.Promise[BookmarkTreeNode] = js.native
}
