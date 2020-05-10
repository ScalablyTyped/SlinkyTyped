package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGlobalClusterResult extends js.Object {
  var GlobalCluster: js.UndefOr[typingsSlinky.awsSdk.rdsMod.GlobalCluster] = js.native
}

object DeleteGlobalClusterResult {
  @scala.inline
  def apply(): DeleteGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGlobalClusterResult]
  }
  @scala.inline
  implicit class DeleteGlobalClusterResultOps[Self <: DeleteGlobalClusterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalCluster(value: GlobalCluster): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalCluster")(js.undefined)
        ret
    }
  }
  
}

