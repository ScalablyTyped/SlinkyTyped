package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterResponse extends js.Object {
  /**
    * Information about the cluster that was deleted.
    */
  var Cluster: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.Cluster] = js.native
}

object DeleteClusterResponse {
  @scala.inline
  def apply(): DeleteClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClusterResponse]
  }
  @scala.inline
  implicit class DeleteClusterResponseOps[Self <: DeleteClusterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCluster(value: Cluster): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cluster")(js.undefined)
        ret
    }
  }
  
}

