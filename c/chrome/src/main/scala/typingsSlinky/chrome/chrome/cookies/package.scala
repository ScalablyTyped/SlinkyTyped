package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cookies {
  
  type CookieChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* changeInfo */ typingsSlinky.chrome.chrome.cookies.CookieChangeInfo, scala.Unit]
  ]
}
