package typingsSlinky.chromeApps.chrome.signedInDevices

import typingsSlinky.chromeApps.chromeAppsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.desktop_or_laptop
  - typingsSlinky.chromeApps.chromeAppsStrings.phone
  - typingsSlinky.chromeApps.chromeAppsStrings.tablet
  - typingsSlinky.chromeApps.chromeAppsStrings.unknown_
*/
trait DeviceType extends js.Object

object DeviceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desktop_or_laptop: typingsSlinky.chromeApps.chromeAppsStrings.desktop_or_laptop = this.cast("desktop_or_laptop")
  @scala.inline
  def phone: typingsSlinky.chromeApps.chromeAppsStrings.phone = this.cast("phone")
  @scala.inline
  def tablet: typingsSlinky.chromeApps.chromeAppsStrings.tablet = this.cast("tablet")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

