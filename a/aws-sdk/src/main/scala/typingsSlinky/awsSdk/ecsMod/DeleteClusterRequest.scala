package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to delete.
    */
  var cluster: String = js.native
}

object DeleteClusterRequest {
  @scala.inline
  def apply(cluster: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
  @scala.inline
  implicit class DeleteClusterRequestOps[Self <: DeleteClusterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCluster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

