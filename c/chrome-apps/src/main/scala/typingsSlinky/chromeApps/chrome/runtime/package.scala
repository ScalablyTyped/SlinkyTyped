package typingsSlinky.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtime {
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.chromeApps.chrome.runtime.AutomationDesktop
    - typingsSlinky.chromeApps.chrome.runtime.AutomationNonInteractive
  */
  type AutomationOptions = typingsSlinky.chromeApps.chrome.runtime._AutomationOptions | scala.Boolean
  type ExtensionConnectEvent = typingsSlinky.chromeApps.chrome.events.Event[
    js.Function1[/* port */ typingsSlinky.chromeApps.chrome.runtime.Port, scala.Unit]
  ]
  type ExtensionMessageEvent = typingsSlinky.chromeApps.chrome.events.Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ typingsSlinky.chromeApps.chrome.runtime.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ]
  type ManifestIcons = /**
    * @example
    * {
    *   '16': 'icon16.png',
    *   '48': 'icon48.png',
    *   '128': 'icon128.png'
    * }
    */
  org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  type RuntimeEvent = typingsSlinky.chromeApps.chrome.events.Event[js.Function0[scala.Unit]]
}
