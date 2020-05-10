package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootNodeRequest extends js.Object {
  /**
    * The name of the DAX cluster containing the node to be rebooted.
    */
  var ClusterName: String = js.native
  /**
    * The system-assigned ID of the node to be rebooted.
    */
  var NodeId: String = js.native
}

object RebootNodeRequest {
  @scala.inline
  def apply(ClusterName: String, NodeId: String): RebootNodeRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootNodeRequest]
  }
  @scala.inline
  implicit class RebootNodeRequestOps[Self <: RebootNodeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

