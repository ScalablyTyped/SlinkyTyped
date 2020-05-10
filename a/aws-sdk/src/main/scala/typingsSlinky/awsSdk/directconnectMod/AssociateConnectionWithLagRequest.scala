package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateConnectionWithLagRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId = js.native
  /**
    * The ID of the LAG with which to associate the connection.
    */
  var lagId: LagId = js.native
}

object AssociateConnectionWithLagRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, lagId: LagId): AssociateConnectionWithLagRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], lagId = lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateConnectionWithLagRequest]
  }
  @scala.inline
  implicit class AssociateConnectionWithLagRequestOps[Self <: AssociateConnectionWithLagRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionId(value: ConnectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLagId(value: LagId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lagId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

