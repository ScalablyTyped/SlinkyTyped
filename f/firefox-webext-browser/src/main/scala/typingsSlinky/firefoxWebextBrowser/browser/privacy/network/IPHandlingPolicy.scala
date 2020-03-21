package typingsSlinky.firefoxWebextBrowser.browser.privacy.network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* privacy.network types */
/** The IP handling policy of WebRTC. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_and_private_interfaces
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_interface_only
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_non_proxied_udp
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.proxy_only
*/
trait IPHandlingPolicy extends js.Object

object IPHandlingPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default = this.cast("default")
  @scala.inline
  def default_public_and_private_interfaces: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_and_private_interfaces = this.cast("default_public_and_private_interfaces")
  @scala.inline
  def default_public_interface_only: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_interface_only = this.cast("default_public_interface_only")
  @scala.inline
  def disable_non_proxied_udp: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_non_proxied_udp = this.cast("disable_non_proxied_udp")
  @scala.inline
  def proxy_only: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.proxy_only = this.cast("proxy_only")
}

