package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationGroupShardConfigurationResult extends js.Object {
  var ReplicationGroup: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ReplicationGroup] = js.native
}

object ModifyReplicationGroupShardConfigurationResult {
  @scala.inline
  def apply(): ModifyReplicationGroupShardConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationGroupShardConfigurationResult]
  }
  @scala.inline
  implicit class ModifyReplicationGroupShardConfigurationResultOps[Self <: ModifyReplicationGroupShardConfigurationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationGroup(value: ReplicationGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroup")(js.undefined)
        ret
    }
  }
  
}

