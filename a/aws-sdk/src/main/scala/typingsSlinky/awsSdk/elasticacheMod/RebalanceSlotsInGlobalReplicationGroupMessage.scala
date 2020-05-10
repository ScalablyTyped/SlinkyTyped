package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebalanceSlotsInGlobalReplicationGroupMessage extends js.Object {
  /**
    * If True, redistribution is applied immediately.
    */
  var ApplyImmediately: Boolean = js.native
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
}

object RebalanceSlotsInGlobalReplicationGroupMessage {
  @scala.inline
  def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String): RebalanceSlotsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebalanceSlotsInGlobalReplicationGroupMessage]
  }
  @scala.inline
  implicit class RebalanceSlotsInGlobalReplicationGroupMessageOps[Self <: RebalanceSlotsInGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

