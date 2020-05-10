package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationSubnetGroupResponse extends js.Object {
  /**
    * The replication subnet group that was created.
    */
  var ReplicationSubnetGroup: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ReplicationSubnetGroup] = js.native
}

object CreateReplicationSubnetGroupResponse {
  @scala.inline
  def apply(): CreateReplicationSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationSubnetGroupResponse]
  }
  @scala.inline
  implicit class CreateReplicationSubnetGroupResponseOps[Self <: CreateReplicationSubnetGroupResponse] (val x: Self) extends AnyVal {
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

