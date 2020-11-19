package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object management {
  
  type ManagementDisabledEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* info */ typingsSlinky.chrome.chrome.management.ExtensionInfo, scala.Unit]
  ]
  
  type ManagementEnabledEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* info */ typingsSlinky.chrome.chrome.management.ExtensionInfo, scala.Unit]
  ]
  
  type ManagementInstalledEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* info */ typingsSlinky.chrome.chrome.management.ExtensionInfo, scala.Unit]
  ]
  
  type ManagementUninstalledEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
}
