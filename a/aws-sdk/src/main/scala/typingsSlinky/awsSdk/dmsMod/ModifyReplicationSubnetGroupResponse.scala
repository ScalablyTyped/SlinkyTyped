package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationSubnetGroupResponse extends js.Object {
  /**
    * The modified replication subnet group.
    */
  var ReplicationSubnetGroup: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ReplicationSubnetGroup] = js.native
}

object ModifyReplicationSubnetGroupResponse {
  @scala.inline
  def apply(): ModifyReplicationSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationSubnetGroupResponse]
  }
  @scala.inline
  implicit class ModifyReplicationSubnetGroupResponseOps[Self <: ModifyReplicationSubnetGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationSubnetGroup(value: ReplicationSubnetGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSubnetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationSubnetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSubnetGroup")(js.undefined)
        ret
    }
  }
  
}

