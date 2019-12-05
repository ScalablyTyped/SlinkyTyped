package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabs {
  import typingsSlinky.chrome.chrome.events.Event

  type TabActivatedEvent = Event[
    js.Function1[/* activeInfo */ typingsSlinky.chrome.chrome.tabs.TabActiveInfo, Unit]
  ]
  type TabAttachedEvent = Event[
    js.Function2[
      /* tabId */ Double, 
      /* attachInfo */ typingsSlinky.chrome.chrome.tabs.TabAttachInfo, 
      Unit
    ]
  ]
  type TabCreatedEvent = Event[js.Function1[/* tab */ typingsSlinky.chrome.chrome.tabs.Tab, Unit]]
  type TabDetachedEvent = Event[
    js.Function2[
      /* tabId */ Double, 
      /* detachInfo */ typingsSlinky.chrome.chrome.tabs.TabDetachInfo, 
      Unit
    ]
  ]
  type TabHighlightedEvent = Event[
    js.Function1[/* highlightInfo */ typingsSlinky.chrome.chrome.tabs.TabHighlightInfo, Unit]
  ]
  type TabMovedEvent = Event[
    js.Function2[
      /* tabId */ Double, 
      /* moveInfo */ typingsSlinky.chrome.chrome.tabs.TabMoveInfo, 
      Unit
    ]
  ]
  type TabRemovedEvent = Event[
    js.Function2[
      /* tabId */ Double, 
      /* removeInfo */ typingsSlinky.chrome.chrome.tabs.TabRemoveInfo, 
      Unit
    ]
  ]
  type TabReplacedEvent = Event[js.Function2[/* addedTabId */ Double, /* removedTabId */ Double, Unit]]
  type TabSelectedEvent = Event[
    js.Function2[
      /* tabId */ Double, 
      /* selectInfo */ typingsSlinky.chrome.chrome.tabs.TabWindowInfo, 
      Unit
    ]
  ]
  type TabUpdatedEvent = Event[
    js.Function3[
      /* tabId */ Double, 
      /* changeInfo */ typingsSlinky.chrome.chrome.tabs.TabChangeInfo, 
      /* tab */ typingsSlinky.chrome.chrome.tabs.Tab, 
      Unit
    ]
  ]
  type TabZoomChangeEvent = Event[
    js.Function1[/* ZoomChangeInfo */ typingsSlinky.chrome.chrome.tabs.ZoomChangeInfo, Unit]
  ]
}
