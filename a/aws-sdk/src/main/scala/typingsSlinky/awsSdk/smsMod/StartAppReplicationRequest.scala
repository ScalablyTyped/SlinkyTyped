package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAppReplicationRequest extends js.Object {
  /**
    * ID of the application to replicate.
    */
  var appId: js.UndefOr[AppId] = js.native
}

object StartAppReplicationRequest {
  @scala.inline
  def apply(): StartAppReplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAppReplicationRequest]
  }
  @scala.inline
  implicit class StartAppReplicationRequestOps[Self <: StartAppReplicationRequest] (val x: Self) extends AnyVal {
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

