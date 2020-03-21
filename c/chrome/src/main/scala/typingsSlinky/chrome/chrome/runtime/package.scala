package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtime {
  type ExtensionConnectEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* port */ typingsSlinky.chrome.chrome.runtime.Port, scala.Unit]]
  type ExtensionMessageEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ typingsSlinky.chrome.chrome.runtime.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ]
  type ManifestIcons = org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  type PortDisconnectEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* port */ typingsSlinky.chrome.chrome.runtime.Port, scala.Unit]]
  type PortMessageEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* message */ js.Any, 
      /* port */ typingsSlinky.chrome.chrome.runtime.Port, 
      scala.Unit
    ]
  ]
  type RuntimeEvent = typingsSlinky.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type RuntimeInstalledEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* details */ typingsSlinky.chrome.chrome.runtime.InstalledDetails, scala.Unit]
  ]
  type RuntimeRestartRequiredEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* reason */ java.lang.String, scala.Unit]]
  type RuntimeUpdateAvailableEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[
      /* details */ typingsSlinky.chrome.chrome.runtime.UpdateAvailableDetails, 
      scala.Unit
    ]
  ]
}
