package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bookmarks {
  type BookmarkChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* changeInfo */ typingsSlinky.chrome.chrome.bookmarks.BookmarkChangeInfo, 
      scala.Unit
    ]
  ]
  type BookmarkChildrenReordered = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* reorderInfo */ typingsSlinky.chrome.chrome.bookmarks.BookmarkReorderInfo, 
      scala.Unit
    ]
  ]
  type BookmarkCreatedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* bookmark */ typingsSlinky.chrome.chrome.bookmarks.BookmarkTreeNode, 
      scala.Unit
    ]
  ]
  type BookmarkImportBeganEvent = typingsSlinky.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type BookmarkImportEndedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type BookmarkMovedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* moveInfo */ typingsSlinky.chrome.chrome.bookmarks.BookmarkMoveInfo, 
      scala.Unit
    ]
  ]
  type BookmarkRemovedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* removeInfo */ typingsSlinky.chrome.chrome.bookmarks.BookmarkRemoveInfo, 
      scala.Unit
    ]
  ]
}
