package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceConnectionStatus extends js.Object {
  /**
    * The connection state of the WorkSpace. The connection state is unknown if the WorkSpace is stopped.
    */
  var ConnectionState: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.ConnectionState] = js.native
  /**
    * The timestamp of the connection status check.
    */
  var ConnectionStateCheckTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The timestamp of the last known user connection.
    */
  var LastKnownUserConnectionTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.WorkspaceId] = js.native
}

object WorkspaceConnectionStatus {
  @scala.inline
  def apply(): WorkspaceConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceConnectionStatus]
  }
  @scala.inline
  implicit class WorkspaceConnectionStatusOps[Self <: WorkspaceConnectionStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionState(value: ConnectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionState")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionStateCheckTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionStateCheckTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionStateCheckTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionStateCheckTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withLastKnownUserConnectionTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastKnownUserConnectionTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastKnownUserConnectionTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastKnownUserConnectionTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceId(value: WorkspaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceId")(js.undefined)
        ret
    }
  }
  
}

