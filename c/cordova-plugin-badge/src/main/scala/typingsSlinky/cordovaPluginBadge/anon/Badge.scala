package typingsSlinky.cordovaPluginBadge.anon

import typingsSlinky.cordovaPluginBadge.CordovaPluginBadge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Badge extends js.Object {
  var badge: CordovaPluginBadge = js.native
}

object Badge {
  @scala.inline
  def apply(badge: CordovaPluginBadge): Badge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
  @scala.inline
  implicit class BadgeOps[Self <: Badge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: CordovaPluginBadge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

