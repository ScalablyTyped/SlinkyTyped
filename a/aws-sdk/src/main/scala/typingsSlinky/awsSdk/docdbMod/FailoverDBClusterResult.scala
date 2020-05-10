package typingsSlinky.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailoverDBClusterResult extends js.Object {
  var DBCluster: js.UndefOr[typingsSlinky.awsSdk.docdbMod.DBCluster] = js.native
}

object FailoverDBClusterResult {
  @scala.inline
  def apply(): FailoverDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverDBClusterResult]
  }
  @scala.inline
  implicit class FailoverDBClusterResultOps[Self <: FailoverDBClusterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBCluster(value: DBCluster): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBCluster")(js.undefined)
        ret
    }
  }
  
}

