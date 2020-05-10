package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationSubnetGroupMessage extends js.Object {
  /**
    * The description for the subnet group.
    */
  var ReplicationSubnetGroupDescription: String = js.native
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters, periods, spaces, underscores, or hyphens. Must not be "default". Example: mySubnetgroup 
    */
  var ReplicationSubnetGroupIdentifier: String = js.native
  /**
    * One or more subnet IDs to be assigned to the subnet group.
    */
  var SubnetIds: SubnetIdentifierList = js.native
  /**
    * One or more tags to be assigned to the subnet group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateReplicationSubnetGroupMessage {
  @scala.inline
  def apply(
    ReplicationSubnetGroupDescription: String,
    ReplicationSubnetGroupIdentifier: String,
    SubnetIds: SubnetIdentifierList
  ): CreateReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupDescription = ReplicationSubnetGroupDescription.asInstanceOf[js.Any], ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationSubnetGroupMessage]
  }
  @scala.inline
  implicit class CreateReplicationSubnetGroupMessageOps[Self <: CreateReplicationSubnetGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationSubnetGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationSubnetGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

