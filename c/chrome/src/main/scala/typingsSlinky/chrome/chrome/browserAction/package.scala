package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object browserAction {
  
  type BrowserClickedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* tab */ typingsSlinky.chrome.chrome.tabs.Tab, scala.Unit]]
  
  type ColorArray = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
}
