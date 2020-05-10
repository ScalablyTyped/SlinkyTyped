package typingsSlinky.reactRouterNavigationCore

import typingsSlinky.reactRouterNavigationCore.reactRouterNavigationCoreBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForceSync extends js.Object {
  var forceSync: `false` = js.native
}

object AnonForceSync {
  @scala.inline
  def apply(forceSync: `false`): AnonForceSync = {
    val __obj = js.Dynamic.literal(forceSync = forceSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceSync]
  }
  @scala.inline
  implicit class AnonForceSyncOps[Self <: AnonForceSync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceSync(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSync")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

