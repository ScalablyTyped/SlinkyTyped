package typingsSlinky.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterInfo extends js.Object {
  var cluster_enabled: Flag = js.native
}

object ClusterInfo {
  @scala.inline
  def apply(cluster_enabled: Flag): ClusterInfo = {
    val __obj = js.Dynamic.literal(cluster_enabled = cluster_enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInfo]
  }
  @scala.inline
  implicit class ClusterInfoOps[Self <: ClusterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCluster_enabled(value: Flag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster_enabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

