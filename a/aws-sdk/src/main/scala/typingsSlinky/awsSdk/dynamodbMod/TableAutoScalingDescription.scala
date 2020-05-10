package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableAutoScalingDescription extends js.Object {
  /**
    * Represents replicas of the global table.
    */
  var Replicas: js.UndefOr[ReplicaAutoScalingDescriptionList] = js.native
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableName] = js.native
  /**
    * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.  
    */
  var TableStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableStatus] = js.native
}

object TableAutoScalingDescription {
  @scala.inline
  def apply(): TableAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableAutoScalingDescription]
  }
  @scala.inline
  implicit class TableAutoScalingDescriptionOps[Self <: TableAutoScalingDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicas(value: ReplicaAutoScalingDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replicas")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableStatus(value: TableStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableStatus")(js.undefined)
        ret
    }
  }
  
}

