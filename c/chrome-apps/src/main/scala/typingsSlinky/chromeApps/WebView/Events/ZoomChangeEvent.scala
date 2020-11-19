package typingsSlinky.chromeApps.WebView.Events

import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Fired when the page's zoom changes. */
@js.native
trait ZoomChangeEvent extends Event {
  
  /** The new zoom factor that the page was zoomed to. */
  var newzoomFactor: double = js.native
  
  /** The page's previous zoom factor. */
  var oldzoomFactor: double = js.native
}
