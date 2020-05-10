package typingsSlinky.pulumiAws.getClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterArgs extends js.Object {
  /**
    * The id of Cloud HSM v2 cluster.
    */
  val clusterId: String = js.native
  /**
    * The state of the cluster to be found.
    */
  val clusterState: js.UndefOr[String] = js.native
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterId: String): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterArgs]
  }
  @scala.inline
  implicit class GetClusterArgsOps[Self <: GetClusterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterState")(js.undefined)
        ret
    }
  }
  
}

