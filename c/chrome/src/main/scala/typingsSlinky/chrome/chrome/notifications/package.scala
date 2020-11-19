package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object notifications {
  
  type NotificationButtonClickedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[/* notificationId */ java.lang.String, /* buttonIndex */ scala.Double, scala.Unit]
  ]
  
  type NotificationClickedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* notificationId */ java.lang.String, scala.Unit]]
  
  type NotificationClosedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[/* notificationId */ java.lang.String, /* byUser */ scala.Boolean, scala.Unit]
  ]
  
  type NotificationPermissionLevelChangedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* level */ java.lang.String, scala.Unit]]
  
  type NotificationShowSettingsEvent = typingsSlinky.chrome.chrome.events.Event[js.Function0[scala.Unit]]
}
