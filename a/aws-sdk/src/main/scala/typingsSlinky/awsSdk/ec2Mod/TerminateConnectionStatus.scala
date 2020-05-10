package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateConnectionStatus extends js.Object {
  /**
    * The ID of the client connection.
    */
  var ConnectionId: js.UndefOr[String] = js.native
  /**
    * A message about the status of the client connection, if applicable.
    */
  var CurrentStatus: js.UndefOr[ClientVpnConnectionStatus] = js.native
  /**
    * The state of the client connection.
    */
  var PreviousStatus: js.UndefOr[ClientVpnConnectionStatus] = js.native
}

object TerminateConnectionStatus {
  @scala.inline
  def apply(): TerminateConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateConnectionStatus]
  }
  @scala.inline
  implicit class TerminateConnectionStatusOps[Self <: TerminateConnectionStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentStatus(value: ClientVpnConnectionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousStatus(value: ClientVpnConnectionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousStatus")(js.undefined)
        ret
    }
  }
  
}

