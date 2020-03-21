package typingsSlinky.chrome.chrome.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object panels {
  type ButtonClickedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type ExtensionSidebarPaneHiddenEvent = typingsSlinky.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type ExtensionSidebarPaneShownEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* window */ typingsSlinky.chrome.chrome.windows.Window, scala.Unit]
  ]
  type PanelHiddenEvent = typingsSlinky.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type PanelSearchEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* action */ java.lang.String, 
      /* queryString */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ]
  type PanelShownEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* window */ typingsSlinky.chrome.Window, scala.Unit]]
  type SelectionChangedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function0[scala.Unit]]
}
