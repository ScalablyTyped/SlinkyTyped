package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroupUpdate extends js.Object {
  /**
    * The parameters required for creating a replica for the table.
    */
  var Create: js.UndefOr[CreateReplicationGroupMemberAction] = js.native
  /**
    * The parameters required for deleting a replica for the table.
    */
  var Delete: js.UndefOr[DeleteReplicationGroupMemberAction] = js.native
  /**
    * The parameters required for updating a replica for the table.
    */
  var Update: js.UndefOr[UpdateReplicationGroupMemberAction] = js.native
}

object ReplicationGroupUpdate {
  @scala.inline
  def apply(): ReplicationGroupUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroupUpdate]
  }
  @scala.inline
  implicit class ReplicationGroupUpdateOps[Self <: ReplicationGroupUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: CreateReplicationGroupMemberAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Create")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: DeleteReplicationGroupMemberAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: UpdateReplicationGroupMemberAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.undefined)
        ret
    }
  }
  
}

