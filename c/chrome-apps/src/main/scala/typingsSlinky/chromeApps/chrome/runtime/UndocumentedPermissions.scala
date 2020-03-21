package typingsSlinky.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Undocumented but used permissions */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotime
  - typingsSlinky.chromeApps.chromeAppsStrings.fullscreen
  - typingsSlinky.chromeApps.chromeAppsStrings.overrideEscFullscreen
*/
trait UndocumentedPermissions extends js.Object

object UndocumentedPermissions {
  @scala.inline
  def appDotwindowDotime: typingsSlinky.chromeApps.chromeAppsStrings.appDotwindowDotime = this.cast("app.window.ime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullscreen: typingsSlinky.chromeApps.chromeAppsStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def overrideEscFullscreen: typingsSlinky.chromeApps.chromeAppsStrings.overrideEscFullscreen = this.cast("overrideEscFullscreen")
}

