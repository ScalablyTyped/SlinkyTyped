package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGlobalTablesOutput extends js.Object {
  /**
    * List of global table names.
    */
  var GlobalTables: js.UndefOr[GlobalTableList] = js.native
  /**
    * Last evaluated global table name.
    */
  var LastEvaluatedGlobalTableName: js.UndefOr[TableName] = js.native
}

object ListGlobalTablesOutput {
  @scala.inline
  def apply(): ListGlobalTablesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGlobalTablesOutput]
  }
  @scala.inline
  implicit class ListGlobalTablesOutputOps[Self <: ListGlobalTablesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalTables(value: GlobalTableList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTables")(js.undefined)
        ret
    }
    @scala.inline
    def withLastEvaluatedGlobalTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedGlobalTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEvaluatedGlobalTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedGlobalTableName")(js.undefined)
        ret
    }
  }
  
}

