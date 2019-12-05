package typingsSlinky.chromeDashApps

import typingsSlinky.chromeDashApps.chromeDashAppsStrings.admin
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.development
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.normal
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.other_
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.sideload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ADMIN extends js.Object {
  var ADMIN: admin
  var DEVELOPMENT: development
  var NORMAL: normal
  var OTHER: other_
  var SIDELOAD: sideload
}

object Anon_ADMIN {
  @scala.inline
  def apply(ADMIN: admin, DEVELOPMENT: development, NORMAL: normal, OTHER: other_, SIDELOAD: sideload): Anon_ADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], DEVELOPMENT = DEVELOPMENT.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], SIDELOAD = SIDELOAD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ADMIN]
  }
}

