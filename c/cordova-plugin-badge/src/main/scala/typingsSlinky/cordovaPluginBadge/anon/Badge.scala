package typingsSlinky.cordovaPluginBadge.anon

import typingsSlinky.cordovaPluginBadge.CordovaPluginBadge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Badge extends js.Object {
  var badge: CordovaPluginBadge
}

object Badge {
  @scala.inline
  def apply(badge: CordovaPluginBadge): Badge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
}

