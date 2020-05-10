package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerGroupReplicationConfiguration extends js.Object {
  /**
    * Identifier of the server group this replication configuration is associated with.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.native
  /**
    * Replication configuration for servers in the server group.
    */
  var serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations] = js.native
}

object ServerGroupReplicationConfiguration {
  @scala.inline
  def apply(): ServerGroupReplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupReplicationConfiguration]
  }
  @scala.inline
  implicit class ServerGroupReplicationConfigurationOps[Self <: ServerGroupReplicationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerGroupId(value: ServerGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withServerReplicationConfigurations(value: ServerReplicationConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverReplicationConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerReplicationConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverReplicationConfigurations")(js.undefined)
        ret
    }
  }
  
}

