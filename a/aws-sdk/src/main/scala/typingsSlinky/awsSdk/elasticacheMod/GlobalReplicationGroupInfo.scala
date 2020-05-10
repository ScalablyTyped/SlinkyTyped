package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalReplicationGroupInfo extends js.Object {
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * The role of the replication group in a Global Datastore. Can be primary or secondary.
    */
  var GlobalReplicationGroupMemberRole: js.UndefOr[String] = js.native
}

object GlobalReplicationGroupInfo {
  @scala.inline
  def apply(): GlobalReplicationGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalReplicationGroupInfo]
  }
  @scala.inline
  implicit class GlobalReplicationGroupInfoOps[Self <: GlobalReplicationGroupInfo] (val x: Self) extends AnyVal {
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
    def withoutGlobalReplicationGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalReplicationGroupMemberRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupMemberRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalReplicationGroupMemberRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroupMemberRole")(js.undefined)
        ret
    }
  }
  
}

