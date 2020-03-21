package typingsSlinky.firefoxWebextBrowser.browser.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.client_redirect
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.server_redirect
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.forward_back
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.from_address_bar
*/
trait TransitionQualifier extends js.Object

object TransitionQualifier {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client_redirect: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.client_redirect = this.cast("client_redirect")
  @scala.inline
  def forward_back: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.forward_back = this.cast("forward_back")
  @scala.inline
  def from_address_bar: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.from_address_bar = this.cast("from_address_bar")
  @scala.inline
  def server_redirect: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.server_redirect = this.cast("server_redirect")
}

