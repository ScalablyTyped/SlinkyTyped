package typingsSlinky.chromeApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface attached to dialog DOM events. */
@js.native
trait DialogController extends js.Object {
  
  /** Reject the dialog. Equivalent to clicking Cancel in a confirm or prompt dialog. */
  def cancel(): Unit = js.native
  
  /**
    * Accept the dialog. Equivalent to clicking OK in an alert, confirm, or prompt dialog.
    * @param response The response string to provide to the guest when accepting a prompt dialog.
    */
  def ok(): Unit = js.native
  def ok(response: String): Unit = js.native
}
