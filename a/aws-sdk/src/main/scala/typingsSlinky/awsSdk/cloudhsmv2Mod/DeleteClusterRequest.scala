package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterRequest extends js.Object {
  /**
    * The identifier (ID) of the cluster that you are deleting. To find the cluster ID, use DescribeClusters.
    */
  var ClusterId: typingsSlinky.awsSdk.cloudhsmv2Mod.ClusterId = js.native
}

object DeleteClusterRequest {
  @scala.inline
  def apply(ClusterId: ClusterId): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
  @scala.inline
  implicit class DeleteClusterRequestOps[Self <: DeleteClusterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

