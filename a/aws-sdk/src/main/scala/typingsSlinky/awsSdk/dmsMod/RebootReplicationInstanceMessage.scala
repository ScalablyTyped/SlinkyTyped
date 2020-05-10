package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootReplicationInstanceMessage extends js.Object {
  /**
    * If this parameter is true, the reboot is conducted through a Multi-AZ failover. (If the instance isn't configured for Multi-AZ, then you can't specify true.)
    */
  var ForceFailover: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: String = js.native
}

object RebootReplicationInstanceMessage {
  @scala.inline
  def apply(ReplicationInstanceArn: String): RebootReplicationInstanceMessage = {
    val __obj = js.Dynamic.literal(ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootReplicationInstanceMessage]
  }
  @scala.inline
  implicit class RebootReplicationInstanceMessageOps[Self <: RebootReplicationInstanceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceFailover(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceFailover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFailover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceFailover")(js.undefined)
        ret
    }
  }
  
}

