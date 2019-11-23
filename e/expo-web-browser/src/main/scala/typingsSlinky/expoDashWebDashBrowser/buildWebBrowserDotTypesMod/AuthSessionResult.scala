package typingsSlinky.expoDashWebDashBrowser.buildWebBrowserDotTypesMod

import typingsSlinky.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.cancel
import typingsSlinky.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.dismiss
import typingsSlinky.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.opened
import typingsSlinky.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod.RedirectResult
  - typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod.BrowserResult
*/
trait AuthSessionResult extends js.Object

object AuthSessionResult {
  @scala.inline
  def RedirectResult(`type`: success, url: String): AuthSessionResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionResult]
  }
  @scala.inline
  def BrowserResult(`type`: cancel | dismiss | opened): AuthSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionResult]
  }
}

