package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreDBClusterFromS3Result extends js.Object {
  var DBCluster: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBCluster] = js.native
}

object RestoreDBClusterFromS3Result {
  @scala.inline
  def apply(): RestoreDBClusterFromS3Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBClusterFromS3Result]
  }
  @scala.inline
  implicit class RestoreDBClusterFromS3ResultOps[Self <: RestoreDBClusterFromS3Result] (val x: Self) extends AnyVal {
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

