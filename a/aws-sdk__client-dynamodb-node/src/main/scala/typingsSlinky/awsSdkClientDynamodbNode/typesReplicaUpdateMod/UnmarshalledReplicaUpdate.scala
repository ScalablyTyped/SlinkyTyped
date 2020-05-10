package typingsSlinky.awsSdkClientDynamodbNode.typesReplicaUpdateMod

import typingsSlinky.awsSdkClientDynamodbNode.typesCreateReplicaActionMod.UnmarshalledCreateReplicaAction
import typingsSlinky.awsSdkClientDynamodbNode.typesDeleteReplicaActionMod.UnmarshalledDeleteReplicaAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledReplicaUpdate extends ReplicaUpdate {
  /**
    * <p>The parameters required for creating a replica on an existing global table.</p>
    */
  @JSName("Create")
  var Create_UnmarshalledReplicaUpdate: js.UndefOr[UnmarshalledCreateReplicaAction] = js.native
  /**
    * <p>The name of the existing replica to be removed.</p>
    */
  @JSName("Delete")
  var Delete_UnmarshalledReplicaUpdate: js.UndefOr[UnmarshalledDeleteReplicaAction] = js.native
}

object UnmarshalledReplicaUpdate {
  @scala.inline
  def apply(): UnmarshalledReplicaUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledReplicaUpdate]
  }
  @scala.inline
  implicit class UnmarshalledReplicaUpdateOps[Self <: UnmarshalledReplicaUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: UnmarshalledCreateReplicaAction): Self = {
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
    def withDelete(value: UnmarshalledDeleteReplicaAction): Self = {
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

