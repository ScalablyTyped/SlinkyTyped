package typingsSlinky.chromeApps.WebView.Events

import typingsSlinky.chromeApps.chromeAppsStrings.filesystem_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.media
  - typingsSlinky.chromeApps.chromeAppsStrings.geolocation
  - typingsSlinky.chromeApps.chromeAppsStrings.pointerLock
  - typingsSlinky.chromeApps.chromeAppsStrings.download
  - typingsSlinky.chromeApps.chromeAppsStrings.loadplugin
  - typingsSlinky.chromeApps.chromeAppsStrings.filesystem_
  - typingsSlinky.chromeApps.chromeAppsStrings.fullscreen
*/
trait RequestedPermission extends js.Object

object RequestedPermission {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def download: typingsSlinky.chromeApps.chromeAppsStrings.download = this.cast("download")
  @scala.inline
  def filesystem: filesystem_ = this.cast("filesystem")
  @scala.inline
  def fullscreen: typingsSlinky.chromeApps.chromeAppsStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def geolocation: typingsSlinky.chromeApps.chromeAppsStrings.geolocation = this.cast("geolocation")
  @scala.inline
  def loadplugin: typingsSlinky.chromeApps.chromeAppsStrings.loadplugin = this.cast("loadplugin")
  @scala.inline
  def media: typingsSlinky.chromeApps.chromeAppsStrings.media = this.cast("media")
  @scala.inline
  def pointerLock: typingsSlinky.chromeApps.chromeAppsStrings.pointerLock = this.cast("pointerLock")
}

