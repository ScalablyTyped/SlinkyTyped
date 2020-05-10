package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailoverGlobalReplicationGroupMessage extends js.Object {
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  /**
    * The AWS region of the primary cluster of the Global Datastore
    */
  var PrimaryRegion: String = js.native
  /**
    * The name of the primary replication group
    */
  var PrimaryReplicationGroupId: String = js.native
}

object FailoverGlobalReplicationGroupMessage {
  @scala.inline
  def apply(GlobalReplicationGroupId: String, PrimaryRegion: String, PrimaryReplicationGroupId: String): FailoverGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], PrimaryRegion = PrimaryRegion.asInstanceOf[js.Any], PrimaryReplicationGroupId = PrimaryReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverGlobalReplicationGroupMessage]
  }
  @scala.inline
  implicit class FailoverGlobalReplicationGroupMessageOps[Self <: FailoverGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
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
    def withPrimaryRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

