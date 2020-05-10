package typingsSlinky.cordovaPluginBadge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBadge extends js.Object {
  var badge: CordovaPluginBadge = js.native
}

object AnonBadge {
  @scala.inline
  def apply(badge: CordovaPluginBadge): AnonBadge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBadge]
  }
  @scala.inline
  implicit class AnonBadgeOps[Self <: AnonBadge] (val x: Self) extends AnyVal {
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

