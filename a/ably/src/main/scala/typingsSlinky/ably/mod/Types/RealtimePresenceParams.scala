package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimePresenceParams extends js.Object {
  var clientId: js.UndefOr[String] = js.native
  var connectionId: js.UndefOr[String] = js.native
  var waitForSync: js.UndefOr[Boolean] = js.native
}

object RealtimePresenceParams {
  @scala.inline
  def apply(): RealtimePresenceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealtimePresenceParams]
  }
  @scala.inline
  implicit class RealtimePresenceParamsOps[Self <: RealtimePresenceParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSync")(js.undefined)
        ret
    }
  }
  
}

