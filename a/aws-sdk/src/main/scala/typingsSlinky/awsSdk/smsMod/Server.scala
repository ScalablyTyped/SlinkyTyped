package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.native
  /**
    * Indicates whether the replication job is deleted or failed.
    */
  var replicationJobTerminated: js.UndefOr[ReplicationJobTerminated] = js.native
  /**
    * The identifier of the server.
    */
  var serverId: js.UndefOr[ServerId] = js.native
  /**
    * The type of server.
    */
  var serverType: js.UndefOr[ServerType] = js.native
  /**
    * Information about the VM server.
    */
  var vmServer: js.UndefOr[VmServer] = js.native
}

object Server {
  @scala.inline
  def apply(): Server = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Server]
  }
  @scala.inline
  implicit class ServerOps[Self <: Server] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationJobId(value: ReplicationJobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationJobId")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationJobTerminated(value: ReplicationJobTerminated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationJobTerminated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationJobTerminated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationJobTerminated")(js.undefined)
        ret
    }
    @scala.inline
    def withServerId(value: ServerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverId")(js.undefined)
        ret
    }
    @scala.inline
    def withServerType(value: ServerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverType")(js.undefined)
        ret
    }
    @scala.inline
    def withVmServer(value: VmServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmServer")(js.undefined)
        ret
    }
  }
  
}

