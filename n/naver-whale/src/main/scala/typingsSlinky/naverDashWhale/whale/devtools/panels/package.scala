package typingsSlinky.naverDashWhale.whale.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object panels {
  import typingsSlinky.chrome.chrome.events.Event
  import typingsSlinky.chrome.chrome.windows.Window

  type ButtonClickedEvent = Event[js.Function0[Unit]]
  type ExtensionSidebarPaneHiddenEvent = Event[js.Function0[Unit]]
  type ExtensionSidebarPaneShownEvent = Event[js.Function1[/* window */ Window, Unit]]
  type PanelHiddenEvent = Event[js.Function0[Unit]]
  type PanelSearchEvent = Event[js.Function2[/* action */ String, /* queryString */ js.UndefOr[String], Unit]]
  type PanelShownEvent = Event[js.Function1[/* window */ typingsSlinky.chrome.Window, Unit]]
  type SelectionChangedEvent = Event[js.Function0[Unit]]
}
