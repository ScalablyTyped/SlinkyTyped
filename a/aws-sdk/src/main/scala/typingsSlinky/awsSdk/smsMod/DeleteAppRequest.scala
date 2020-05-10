package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAppRequest extends js.Object {
  /**
    * ID of the application to delete.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * While deleting the application, stop all replication jobs corresponding to the servers in the application.
    */
  var forceStopAppReplication: js.UndefOr[ForceStopAppReplication] = js.native
  /**
    * While deleting the application, terminate the stack corresponding to the application.
    */
  var forceTerminateApp: js.UndefOr[ForceTerminateApp] = js.native
}

object DeleteAppRequest {
  @scala.inline
  def apply(): DeleteAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAppRequest]
  }
  @scala.inline
  implicit class DeleteAppRequestOps[Self <: DeleteAppRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withForceStopAppReplication(value: ForceStopAppReplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceStopAppReplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceStopAppReplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceStopAppReplication")(js.undefined)
        ret
    }
    @scala.inline
    def withForceTerminateApp(value: ForceTerminateApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceTerminateApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceTerminateApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceTerminateApp")(js.undefined)
        ret
    }
  }
  
}

