package typingsSlinky.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object permissions {
  
  type PermissionEvent = typingsSlinky.chromeApps.chrome.events.Event[
    js.Function1[
      /* permissions */ typingsSlinky.chromeApps.chrome.permissions.Permissions, 
      scala.Unit
    ]
  ]
}
