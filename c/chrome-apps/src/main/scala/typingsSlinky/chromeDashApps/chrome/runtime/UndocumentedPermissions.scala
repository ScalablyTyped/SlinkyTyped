package typingsSlinky.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Undocumented but used permissions */
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.appDotwindowDotime
  - typings.chromeDashApps.chromeDashAppsStrings.fullscreen
  - typings.chromeDashApps.chromeDashAppsStrings.overrideEscFullscreen
*/
trait UndocumentedPermissions extends js.Object

object UndocumentedPermissions {
  @scala.inline
  def appDotwindowDotime: typingsSlinky.chromeDashApps.chromeDashAppsStrings.appDotwindowDotime = this.cast("app.window.ime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullscreen: typingsSlinky.chromeDashApps.chromeDashAppsStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def overrideEscFullscreen: typingsSlinky.chromeDashApps.chromeDashAppsStrings.overrideEscFullscreen = this.cast("overrideEscFullscreen")
}

