package typingsSlinky.awsSdkClientDynamodbNode.typesGlobalTableMod

import typingsSlinky.awsSdkClientDynamodbNode.typesReplicaMod.Replica
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTable extends js.Object {
  /**
    * <p>The global table name.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.native
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  var ReplicationGroup: js.UndefOr[js.Array[Replica] | js.Iterable[Replica]] = js.native
}

object GlobalTable {
  @scala.inline
  def apply(): GlobalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTable]
  }
  @scala.inline
  implicit class GlobalTableOps[Self <: GlobalTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableName")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationGroupIterable(value: js.Iterable[Replica]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationGroup(value: js.Array[Replica] | js.Iterable[Replica]): Self = {
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

