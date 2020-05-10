package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHostedConnectionsRequest extends js.Object {
  /**
    * The ID of the interconnect or LAG.
    */
  var connectionId: ConnectionId = js.native
}

object DescribeHostedConnectionsRequest {
  @scala.inline
  def apply(connectionId: ConnectionId): DescribeHostedConnectionsRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHostedConnectionsRequest]
  }
  @scala.inline
  implicit class DescribeHostedConnectionsRequestOps[Self <: DescribeHostedConnectionsRequest] (val x: Self) extends AnyVal {
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
  }
  
}

