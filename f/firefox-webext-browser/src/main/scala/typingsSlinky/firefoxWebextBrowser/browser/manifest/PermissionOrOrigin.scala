package typingsSlinky.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.browser.manifest.Permission
  - typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPattern
*/
trait PermissionOrOrigin extends js.Object

object PermissionOrOrigin {
  @scala.inline
  implicit def apply(value: MatchPattern): PermissionOrOrigin = value.asInstanceOf[PermissionOrOrigin]
  @scala.inline
  implicit def apply(value: Permission): PermissionOrOrigin = value.asInstanceOf[PermissionOrOrigin]
}

