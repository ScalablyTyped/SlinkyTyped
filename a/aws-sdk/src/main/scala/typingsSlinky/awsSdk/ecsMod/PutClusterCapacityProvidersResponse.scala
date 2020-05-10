package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutClusterCapacityProvidersResponse extends js.Object {
  var cluster: js.UndefOr[Cluster] = js.native
}

object PutClusterCapacityProvidersResponse {
  @scala.inline
  def apply(): PutClusterCapacityProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutClusterCapacityProvidersResponse]
  }
  @scala.inline
  implicit class PutClusterCapacityProvidersResponseOps[Self <: PutClusterCapacityProvidersResponse] (val x: Self) extends AnyVal {
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

