package typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableDescriptionMod

import typingsSlinky.awsSdkClientDynamodbNode.typesReplicaDescriptionMod.UnmarshalledReplicaDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGlobalTableDescription extends GlobalTableDescription {
  /**
    * <p>The creation time of the global table.</p>
    */
  @JSName("CreationDateTime")
  var CreationDateTime_UnmarshalledGlobalTableDescription: js.UndefOr[js.Date] = js.native
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  @JSName("ReplicationGroup")
  var ReplicationGroup_UnmarshalledGlobalTableDescription: js.UndefOr[js.Array[UnmarshalledReplicaDescription]] = js.native
}

object UnmarshalledGlobalTableDescription {
  @scala.inline
  def apply(): UnmarshalledGlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGlobalTableDescription]
  }
  @scala.inline
  implicit class UnmarshalledGlobalTableDescriptionOps[Self <: UnmarshalledGlobalTableDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationGroup(value: js.Array[UnmarshalledReplicaDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroup")(js.undefined)
        ret
    }
  }
  
}

