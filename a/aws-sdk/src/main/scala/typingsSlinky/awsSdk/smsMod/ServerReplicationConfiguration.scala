package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerReplicationConfiguration extends js.Object {
  /**
    * Identifier of the server this replication configuration is associated with.
    */
  var server: js.UndefOr[Server] = js.native
  /**
    * Parameters for replicating the server.
    */
  var serverReplicationParameters: js.UndefOr[ServerReplicationParameters] = js.native
}

object ServerReplicationConfiguration {
  @scala.inline
  def apply(): ServerReplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerReplicationConfiguration]
  }
  @scala.inline
  implicit class ServerReplicationConfigurationOps[Self <: ServerReplicationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServer(value: Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
    @scala.inline
    def withServerReplicationParameters(value: ServerReplicationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverReplicationParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerReplicationParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverReplicationParameters")(js.undefined)
        ret
    }
  }
  
}

