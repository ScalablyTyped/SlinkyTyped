package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabs {
  type TabActivatedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* activeInfo */ typingsSlinky.chrome.chrome.tabs.TabActiveInfo, scala.Unit]
  ]
  type TabAttachedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* attachInfo */ typingsSlinky.chrome.chrome.tabs.TabAttachInfo, 
      scala.Unit
    ]
  ]
  type TabCreatedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* tab */ typingsSlinky.chrome.chrome.tabs.Tab, scala.Unit]]
  type TabDetachedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* detachInfo */ typingsSlinky.chrome.chrome.tabs.TabDetachInfo, 
      scala.Unit
    ]
  ]
  type TabHighlightedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* highlightInfo */ typingsSlinky.chrome.chrome.tabs.TabHighlightInfo, scala.Unit]
  ]
  type TabMovedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* moveInfo */ typingsSlinky.chrome.chrome.tabs.TabMoveInfo, 
      scala.Unit
    ]
  ]
  type TabRemovedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* removeInfo */ typingsSlinky.chrome.chrome.tabs.TabRemoveInfo, 
      scala.Unit
    ]
  ]
  type TabReplacedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[/* addedTabId */ scala.Double, /* removedTabId */ scala.Double, scala.Unit]
  ]
  type TabSelectedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* selectInfo */ typingsSlinky.chrome.chrome.tabs.TabWindowInfo, 
      scala.Unit
    ]
  ]
  type TabUpdatedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* tabId */ scala.Double, 
      /* changeInfo */ typingsSlinky.chrome.chrome.tabs.TabChangeInfo, 
      /* tab */ typingsSlinky.chrome.chrome.tabs.Tab, 
      scala.Unit
    ]
  ]
  type TabZoomChangeEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* ZoomChangeInfo */ typingsSlinky.chrome.chrome.tabs.ZoomChangeInfo, scala.Unit]
  ]
}
