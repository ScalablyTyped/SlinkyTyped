package typingsSlinky.expoDashWebDashBrowser.buildWebBrowserDotTypesMod

import typingsSlinky.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.cancel
import typingsSlinky.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.dismiss
import typingsSlinky.expoDashWebDashBrowser.expoDashWebDashBrowserStrings.opened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserResult extends AuthSessionResult {
  var `type`: cancel | dismiss | opened
}

object BrowserResult {
  @scala.inline
  def apply(`type`: cancel | dismiss | opened): BrowserResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserResult]
  }
}

