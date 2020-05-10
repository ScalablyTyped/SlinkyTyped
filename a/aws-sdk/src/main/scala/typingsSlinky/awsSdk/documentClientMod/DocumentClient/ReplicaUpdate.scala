package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaUpdate extends js.Object {
  /**
    * The parameters required for creating a replica on an existing global table.
    */
  var Create: js.UndefOr[CreateReplicaAction] = js.native
  /**
    * The name of the existing replica to be removed.
    */
  var Delete: js.UndefOr[DeleteReplicaAction] = js.native
}

object ReplicaUpdate {
  @scala.inline
  def apply(): ReplicaUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaUpdate]
  }
  @scala.inline
  implicit class ReplicaUpdateOps[Self <: ReplicaUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: CreateReplicaAction): Self = {
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
    def withDelete(value: DeleteReplicaAction): Self = {
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
  }
  
}

