package typingsSlinky.expoWebBrowser.webBrowserTypesMod

import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.cancel
import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.dismiss
import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.opened
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

