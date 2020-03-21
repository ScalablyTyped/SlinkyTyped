package typingsSlinky.firefoxWebextBrowser.browser.networkStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** If known, the type of network connection that is avialable. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.`2g`
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.`3g`
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.`4g`
*/
trait NetworkLinkInfoType extends js.Object

object NetworkLinkInfoType {
  @scala.inline
  def `2g`: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.`2g` = this.cast("2g")
  @scala.inline
  def `3g`: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.`3g` = this.cast("3g")
  @scala.inline
  def `4g`: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.`4g` = this.cast("4g")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ethernet: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet = this.cast("ethernet")
  @scala.inline
  def unknown: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = this.cast("unknown")
  @scala.inline
  def usb: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb = this.cast("usb")
  @scala.inline
  def wifi: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi = this.cast("wifi")
  @scala.inline
  def wimax: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax = this.cast("wimax")
}

