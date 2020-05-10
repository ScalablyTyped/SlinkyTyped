package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopAppReplicationRequest extends js.Object {
  /**
    * ID of the application to stop replicating.
    */
  var appId: js.UndefOr[AppId] = js.native
}

object StopAppReplicationRequest {
  @scala.inline
  def apply(): StopAppReplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopAppReplicationRequest]
  }
  @scala.inline
  implicit class StopAppReplicationRequestOps[Self <: StopAppReplicationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: AppId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
  }
  
}

