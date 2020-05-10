package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGlobalTablesInput extends js.Object {
  /**
    * The first global table name that this operation will evaluate.
    */
  var ExclusiveStartGlobalTableName: js.UndefOr[TableName] = js.native
  /**
    * The maximum number of table names to return, if the parameter is not specified DynamoDB defaults to 100. If the number of global tables DynamoDB finds reaches this limit, it stops the operation and returns the table names collected up to that point, with a table name in the LastEvaluatedGlobalTableName to apply in a subsequent operation to the ExclusiveStartGlobalTableName parameter.
    */
  var Limit: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * Lists the global tables in a specific Region.
    */
  var RegionName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.RegionName] = js.native
}

object ListGlobalTablesInput {
  @scala.inline
  def apply(): ListGlobalTablesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGlobalTablesInput]
  }
  @scala.inline
  implicit class ListGlobalTablesInputOps[Self <: ListGlobalTablesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusiveStartGlobalTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartGlobalTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveStartGlobalTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartGlobalTableName")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: PositiveIntegerObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionName(value: RegionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionName")(js.undefined)
        ret
    }
  }
  
}

