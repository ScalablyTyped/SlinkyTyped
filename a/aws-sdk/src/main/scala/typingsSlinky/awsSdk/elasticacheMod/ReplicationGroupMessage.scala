package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroupMessage extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of replication groups. Each item in the list contains detailed information about one replication group.
    */
  var ReplicationGroups: js.UndefOr[ReplicationGroupList] = js.native
}

object ReplicationGroupMessage {
  @scala.inline
  def apply(): ReplicationGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroupMessage]
  }
  @scala.inline
  implicit class ReplicationGroupMessageOps[Self <: ReplicationGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationGroups(value: ReplicationGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroups")(js.undefined)
        ret
    }
  }
  
}

