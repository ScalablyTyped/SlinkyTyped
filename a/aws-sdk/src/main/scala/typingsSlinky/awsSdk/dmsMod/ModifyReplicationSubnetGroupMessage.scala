package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationSubnetGroupMessage extends js.Object {
  /**
    * A description for the replication instance subnet group.
    */
  var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name of the replication instance subnet group.
    */
  var ReplicationSubnetGroupIdentifier: String = js.native
  /**
    * A list of subnet IDs.
    */
  var SubnetIds: SubnetIdentifierList = js.native
}

object ModifyReplicationSubnetGroupMessage {
  @scala.inline
  def apply(ReplicationSubnetGroupIdentifier: String, SubnetIds: SubnetIdentifierList): ModifyReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationSubnetGroupMessage]
  }
  @scala.inline
  implicit class ModifyReplicationSubnetGroupMessageOps[Self <: ModifyReplicationSubnetGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationSubnetGroupIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSubnetGroupIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationSubnetGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSubnetGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationSubnetGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSubnetGroupDescription")(js.undefined)
        ret
    }
  }
  
}

