package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterResponse extends js.Object {
  /**
    * The full description of your new cluster.
    */
  var cluster: js.UndefOr[Cluster] = js.native
}

object CreateClusterResponse {
  @scala.inline
  def apply(): CreateClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterResponse]
  }
  @scala.inline
  implicit class CreateClusterResponseOps[Self <: CreateClusterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCluster(value: Cluster): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(js.undefined)
        ret
    }
  }
  
}

