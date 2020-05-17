package typingsSlinky.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.browser.manifest.OptionalPermission
  - typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPattern
*/
trait OptionalPermissionOrOrigin extends js.Object

object OptionalPermissionOrOrigin {
  @scala.inline
  implicit def apply(value: MatchPattern): OptionalPermissionOrOrigin = value.asInstanceOf[OptionalPermissionOrOrigin]
  @scala.inline
  implicit def apply(value: OptionalPermission): OptionalPermissionOrOrigin = value.asInstanceOf[OptionalPermissionOrOrigin]
}

