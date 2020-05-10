package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterRequest extends js.Object {
  /**
    * The name of the cluster to be deleted.
    */
  var ClusterName: String = js.native
}

object DeleteClusterRequest {
  @scala.inline
  def apply(ClusterName: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
  @scala.inline
  implicit class DeleteClusterRequestOps[Self <: DeleteClusterRequest] (val x: Self) extends AnyVal {
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
  }
  
}

