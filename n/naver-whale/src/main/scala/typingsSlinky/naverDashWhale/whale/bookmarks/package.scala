package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bookmarks {
  import typingsSlinky.chrome.chrome.events.Event

  type BookmarkChangedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* changeInfo */ typingsSlinky.chrome.chrome.bookmarks.BookmarkChangeInfo, 
      Unit
    ]
  ]
  type BookmarkChildrenReordered = Event[
    js.Function2[
      /* id */ String, 
      /* reorderInfo */ typingsSlinky.chrome.chrome.bookmarks.BookmarkReorderInfo, 
      Unit
    ]
  ]
  type BookmarkCreatedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* bookmark */ typingsSlinky.chrome.chrome.bookmarks.BookmarkTreeNode, 
      Unit
    ]
  ]
  type BookmarkImportBeganEvent = Event[js.Function0[Unit]]
  type BookmarkImportEndedEvent = Event[js.Function0[Unit]]
  type BookmarkMovedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* moveInfo */ typingsSlinky.chrome.chrome.bookmarks.BookmarkMoveInfo, 
      Unit
    ]
  ]
  type BookmarkRemovedEvent = Event[
    js.Function2[
      /* id */ String, 
      /* removeInfo */ typingsSlinky.chrome.chrome.bookmarks.BookmarkRemoveInfo, 
      Unit
    ]
  ]
}
