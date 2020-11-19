package typingsSlinky.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object alarms {
  
  type AlarmEvent = typingsSlinky.chromeApps.chrome.events.Event[
    js.Function1[/* alarm */ typingsSlinky.chromeApps.chrome.alarms.Alarm, scala.Unit]
  ]
}
