package typingsSlinky.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* _manifest types */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.firefoxWebextBrowser.browser.manifest.OptionalPermission
  - typingsSlinky.firefoxWebextBrowser.browser.manifest._Permission
*/
trait Permission extends PermissionOrOrigin

object Permission {
  @scala.inline
  implicit def apply(value: OptionalPermission): Permission = value.asInstanceOf[Permission]
  @scala.inline
  implicit def apply(value: String): Permission = value.asInstanceOf[Permission]
  @scala.inline
  implicit def apply(value: _Permission): Permission = value.asInstanceOf[Permission]
}

