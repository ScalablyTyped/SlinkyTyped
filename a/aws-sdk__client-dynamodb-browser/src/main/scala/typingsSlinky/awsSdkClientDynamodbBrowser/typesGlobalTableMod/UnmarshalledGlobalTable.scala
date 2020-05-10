package typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaMod.UnmarshalledReplica
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGlobalTable extends GlobalTable {
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  @JSName("ReplicationGroup")
  var ReplicationGroup_UnmarshalledGlobalTable: js.UndefOr[js.Array[UnmarshalledReplica]] = js.native
}

object UnmarshalledGlobalTable {
  @scala.inline
  def apply(): UnmarshalledGlobalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledGlobalTable]
  }
  @scala.inline
  implicit class UnmarshalledGlobalTableOps[Self <: UnmarshalledGlobalTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationGroup(value: js.Array[UnmarshalledReplica]): Self = {
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

