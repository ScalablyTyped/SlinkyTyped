package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncreaseReplicationFactorResponse extends js.Object {
  /**
    * A description of the DAX cluster. with its new replication factor.
    */
  var Cluster: js.UndefOr[typingsSlinky.awsSdk.daxMod.Cluster] = js.native
}

object IncreaseReplicationFactorResponse {
  @scala.inline
  def apply(): IncreaseReplicationFactorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncreaseReplicationFactorResponse]
  }
  @scala.inline
  implicit class IncreaseReplicationFactorResponseOps[Self <: IncreaseReplicationFactorResponse] (val x: Self) extends AnyVal {
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

