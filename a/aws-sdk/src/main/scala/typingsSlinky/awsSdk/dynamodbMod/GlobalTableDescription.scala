package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableDescription extends js.Object {
  /**
    * The creation time of the global table.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The unique identifier of the global table.
    */
  var GlobalTableArn: js.UndefOr[GlobalTableArnString] = js.native
  /**
    * The global table name.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.native
  /**
    * The current state of the global table:    CREATING - The global table is being created.    UPDATING - The global table is being updated.    DELETING - The global table is being deleted.    ACTIVE - The global table is ready for use.  
    */
  var GlobalTableStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.GlobalTableStatus] = js.native
  /**
    * The Regions where the global table has replicas.
    */
  var ReplicationGroup: js.UndefOr[ReplicaDescriptionList] = js.native
}

object GlobalTableDescription {
  @scala.inline
  def apply(): GlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTableDescription]
  }
  @scala.inline
  implicit class GlobalTableDescriptionOps[Self <: GlobalTableDescription] (val x: Self) extends AnyVal {
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
    def withGlobalTableArn(value: GlobalTableArnString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableArn")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTableName(value: TableName): Self = {
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
    def withGlobalTableStatus(value: GlobalTableStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationGroup(value: ReplicaDescriptionList): Self = {
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

