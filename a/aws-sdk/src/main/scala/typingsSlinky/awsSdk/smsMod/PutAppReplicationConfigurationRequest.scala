package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAppReplicationConfigurationRequest extends js.Object {
  /**
    * ID of the application tassociated with the replication configuration.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Replication configurations for server groups in the application.
    */
  var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.native
}

object PutAppReplicationConfigurationRequest {
  @scala.inline
  def apply(): PutAppReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppReplicationConfigurationRequest]
  }
  @scala.inline
  implicit class PutAppReplicationConfigurationRequestOps[Self <: PutAppReplicationConfigurationRequest] (val x: Self) extends AnyVal {
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
    def withServerGroupReplicationConfigurations(value: ServerGroupReplicationConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroupReplicationConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerGroupReplicationConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroupReplicationConfigurations")(js.undefined)
        ret
    }
  }
  
}

