package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationInstanceResponse extends js.Object {
  /**
    * The replication instance that was deleted.
    */
  var ReplicationInstance: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ReplicationInstance] = js.native
}

object DeleteReplicationInstanceResponse {
  @scala.inline
  def apply(): DeleteReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReplicationInstanceResponse]
  }
  @scala.inline
  implicit class DeleteReplicationInstanceResponseOps[Self <: DeleteReplicationInstanceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationInstance(value: ReplicationInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstance")(js.undefined)
        ret
    }
  }
  
}

