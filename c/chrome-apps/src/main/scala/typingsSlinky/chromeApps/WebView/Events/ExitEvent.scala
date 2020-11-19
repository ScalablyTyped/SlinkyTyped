package typingsSlinky.chromeApps.WebView.Events

import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the process rendering the guest web content has exited.
  */
@js.native
trait ExitEvent extends Event {
  
  /** Chrome's internal ID of the process that exited. */
  var processID: integer = js.native
  
  /** String indicating the reason for the exit. */
  var reason: ExitEventReason = js.native
}
