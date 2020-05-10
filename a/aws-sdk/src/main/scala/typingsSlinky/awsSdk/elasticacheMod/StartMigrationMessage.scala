package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMigrationMessage extends js.Object {
  /**
    * List of endpoints from which data should be migrated. For Redis (cluster mode disabled), list should have only one element.
    */
  var CustomerNodeEndpointList: typingsSlinky.awsSdk.elasticacheMod.CustomerNodeEndpointList = js.native
  /**
    * The ID of the replication group to which data should be migrated.
    */
  var ReplicationGroupId: String = js.native
}

object StartMigrationMessage {
  @scala.inline
  def apply(CustomerNodeEndpointList: CustomerNodeEndpointList, ReplicationGroupId: String): StartMigrationMessage = {
    val __obj = js.Dynamic.literal(CustomerNodeEndpointList = CustomerNodeEndpointList.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMigrationMessage]
  }
  @scala.inline
  implicit class StartMigrationMessageOps[Self <: StartMigrationMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerNodeEndpointList(value: CustomerNodeEndpointList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerNodeEndpointList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

