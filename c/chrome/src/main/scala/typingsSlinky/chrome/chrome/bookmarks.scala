package typingsSlinky.chrome.chrome

import typingsSlinky.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Bookmarks
////////////////////
/**
  * Use the chrome.bookmarks API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages, which you can use to create a custom Bookmark Manager page.
  * Availability: Since Chrome 5.
  * Permissions:  "bookmarks"
  */
object bookmarks {
  
  @js.native
  trait BookmarkChangeInfo extends StObject {
    
    var title: String = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object BookmarkChangeInfo {
    
    @scala.inline
    def apply(title: String): BookmarkChangeInfo = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookmarkChangeInfo]
    }
    
    @scala.inline
    implicit class BookmarkChangeInfoMutableBuilder[Self <: BookmarkChangeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type BookmarkChangedEvent = Event[js.Function2[/* id */ String, /* changeInfo */ BookmarkChangeInfo, Unit]]
  
  @js.native
  trait BookmarkChangesArg extends StObject {
    
    var title: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object BookmarkChangesArg {
    
    @scala.inline
    def apply(): BookmarkChangesArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkChangesArg]
    }
    
    @scala.inline
    implicit class BookmarkChangesArgMutableBuilder[Self <: BookmarkChangesArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type BookmarkChildrenReordered = Event[js.Function2[/* id */ String, /* reorderInfo */ BookmarkReorderInfo, Unit]]
  
  @js.native
  trait BookmarkCreateArg extends StObject {
    
    var index: js.UndefOr[Double] = js.native
    
    /** Optional. Defaults to the Other Bookmarks folder.  */
    var parentId: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object BookmarkCreateArg {
    
    @scala.inline
    def apply(): BookmarkCreateArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkCreateArg]
    }
    
    @scala.inline
    implicit class BookmarkCreateArgMutableBuilder[Self <: BookmarkCreateArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type BookmarkCreatedEvent = Event[js.Function2[/* id */ String, /* bookmark */ BookmarkTreeNode, Unit]]
  
  @js.native
  trait BookmarkDestinationArg extends StObject {
    
    var index: js.UndefOr[Double] = js.native
    
    var parentId: js.UndefOr[String] = js.native
  }
  object BookmarkDestinationArg {
    
    @scala.inline
    def apply(): BookmarkDestinationArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkDestinationArg]
    }
    
    @scala.inline
    implicit class BookmarkDestinationArgMutableBuilder[Self <: BookmarkDestinationArg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    }
  }
  
  type BookmarkImportBeganEvent = Event[js.Function0[Unit]]
  
  type BookmarkImportEndedEvent = Event[js.Function0[Unit]]
  
  @js.native
  trait BookmarkMoveInfo extends StObject {
    
    var index: Double = js.native
    
    var oldIndex: Double = js.native
    
    var oldParentId: String = js.native
    
    var parentId: String = js.native
  }
  object BookmarkMoveInfo {
    
    @scala.inline
    def apply(index: Double, oldIndex: Double, oldParentId: String, parentId: String): BookmarkMoveInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldParentId = oldParentId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookmarkMoveInfo]
    }
    
    @scala.inline
    implicit class BookmarkMoveInfoMutableBuilder[Self <: BookmarkMoveInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldParentId(value: String): Self = StObject.set(x, "oldParentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  type BookmarkMovedEvent = Event[js.Function2[/* id */ String, /* moveInfo */ BookmarkMoveInfo, Unit]]
  
  @js.native
  trait BookmarkRemoveInfo extends StObject {
    
    var index: Double = js.native
    
    var node: BookmarkTreeNode = js.native
    
    var parentId: String = js.native
  }
  object BookmarkRemoveInfo {
    
    @scala.inline
    def apply(index: Double, node: BookmarkTreeNode, parentId: String): BookmarkRemoveInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookmarkRemoveInfo]
    }
    
    @scala.inline
    implicit class BookmarkRemoveInfoMutableBuilder[Self <: BookmarkRemoveInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: BookmarkTreeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  type BookmarkRemovedEvent = Event[js.Function2[/* id */ String, /* removeInfo */ BookmarkRemoveInfo, Unit]]
  
  @js.native
  trait BookmarkReorderInfo extends StObject {
    
    var childIds: js.Array[String] = js.native
  }
  object BookmarkReorderInfo {
    
    @scala.inline
    def apply(childIds: js.Array[String]): BookmarkReorderInfo = {
      val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookmarkReorderInfo]
    }
    
    @scala.inline
    implicit class BookmarkReorderInfoMutableBuilder[Self <: BookmarkReorderInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildIds(value: js.Array[String]): Self = StObject.set(x, "childIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildIdsVarargs(value: String*): Self = StObject.set(x, "childIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BookmarkSearchQuery extends StObject {
    
    var query: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object BookmarkSearchQuery {
    
    @scala.inline
    def apply(): BookmarkSearchQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkSearchQuery]
    }
    
    @scala.inline
    implicit class BookmarkSearchQueryMutableBuilder[Self <: BookmarkSearchQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait BookmarkTreeNode extends StObject {
    
    /** Optional. An ordered list of children of this node.  */
    var children: js.UndefOr[js.Array[BookmarkTreeNode]] = js.native
    
    /** Optional. When this node was created, in milliseconds since the epoch (new Date(dateAdded)).  */
    var dateAdded: js.UndefOr[Double] = js.native
    
    /** Optional. When the contents of this folder last changed, in milliseconds since the epoch.   */
    var dateGroupModified: js.UndefOr[Double] = js.native
    
    /** The unique identifier for the node. IDs are unique within the current profile, and they remain valid even after the browser is restarted.  */
    var id: String = js.native
    
    /** Optional. The 0-based position of this node within its parent folder.  */
    var index: js.UndefOr[Double] = js.native
    
    /** Optional. The id of the parent folder. Omitted for the root node.   */
    var parentId: js.UndefOr[String] = js.native
    
    /** The text displayed for the node. */
    var title: String = js.native
    
    /**
      * Optional.
      * Since Chrome 37.
      * Indicates the reason why this node is unmodifiable. The managed value indicates that this node was configured by the system administrator or by the custodian of a supervised user. Omitted if the node can be modified by the user and the extension (default).
      */
    var unmodifiable: js.UndefOr[js.Any] = js.native
    
    /** Optional. The URL navigated to when a user clicks the bookmark. Omitted for folders.   */
    var url: js.UndefOr[String] = js.native
  }
  object BookmarkTreeNode {
    
    @scala.inline
    def apply(id: String, title: String): BookmarkTreeNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookmarkTreeNode]
    }
    
    @scala.inline
    implicit class BookmarkTreeNodeMutableBuilder[Self <: BookmarkTreeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[BookmarkTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: BookmarkTreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDateAdded(value: Double): Self = StObject.set(x, "dateAdded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateAddedUndefined: Self = StObject.set(x, "dateAdded", js.undefined)
      
      @scala.inline
      def setDateGroupModified(value: Double): Self = StObject.set(x, "dateGroupModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateGroupModifiedUndefined: Self = StObject.set(x, "dateGroupModified", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmodifiable(value: js.Any): Self = StObject.set(x, "unmodifiable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmodifiableUndefined: Self = StObject.set(x, "unmodifiable", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
