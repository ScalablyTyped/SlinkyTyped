package typingsSlinky.chromeApps.chrome.signedInDevices

import typingsSlinky.chromeApps.chromeAppsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.win
  - typingsSlinky.chromeApps.chromeAppsStrings.mac
  - typingsSlinky.chromeApps.chromeAppsStrings.linux
  - typingsSlinky.chromeApps.chromeAppsStrings.chrome_os
  - typingsSlinky.chromeApps.chromeAppsStrings.android
  - typingsSlinky.chromeApps.chromeAppsStrings.ios
  - typingsSlinky.chromeApps.chromeAppsStrings.unknown_
*/
trait OS extends js.Object

object OS {
  @scala.inline
  def android: typingsSlinky.chromeApps.chromeAppsStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chrome_os: typingsSlinky.chromeApps.chromeAppsStrings.chrome_os = this.cast("chrome_os")
  @scala.inline
  def ios: typingsSlinky.chromeApps.chromeAppsStrings.ios = this.cast("ios")
  @scala.inline
  def linux: typingsSlinky.chromeApps.chromeAppsStrings.linux = this.cast("linux")
  @scala.inline
  def mac: typingsSlinky.chromeApps.chromeAppsStrings.mac = this.cast("mac")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def win: typingsSlinky.chromeApps.chromeAppsStrings.win = this.cast("win")
}

