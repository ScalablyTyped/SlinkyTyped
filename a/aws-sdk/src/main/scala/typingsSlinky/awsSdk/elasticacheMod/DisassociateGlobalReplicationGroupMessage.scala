package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateGlobalReplicationGroupMessage extends js.Object {
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  /**
    * The name of the secondary cluster you wish to remove from the Global Datastore
    */
  var ReplicationGroupId: String = js.native
  /**
    * The AWS region of secondary cluster you wish to remove from the Global Datastore
    */
  var ReplicationGroupRegion: String = js.native
}

object DisassociateGlobalReplicationGroupMessage {
  @scala.inline
  def apply(GlobalReplicationGroupId: String, ReplicationGroupId: String, ReplicationGroupRegion: String): DisassociateGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any], ReplicationGroupRegion = ReplicationGroupRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateGlobalReplicationGroupMessage]
  }
  @scala.inline
  implicit class DisassociateGlobalReplicationGroupMessageOps[Self <: DisassociateGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationGroupRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupRegion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

