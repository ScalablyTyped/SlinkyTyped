package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTablesOutput extends js.Object {
  /**
    * The name of the last table in the current page of results. Use this value as the ExclusiveStartTableName in a new request to obtain the next page of results, until all the table names are returned. If you do not receive a LastEvaluatedTableName value in the response, this means that there are no more table names to be retrieved.
    */
  var LastEvaluatedTableName: js.UndefOr[TableName] = js.native
  /**
    * The names of the tables associated with the current account at the current endpoint. The maximum size of this array is 100. If LastEvaluatedTableName also appears in the output, you can use this value as the ExclusiveStartTableName parameter in a subsequent ListTables request and obtain the next page of results.
    */
  var TableNames: js.UndefOr[TableNameList] = js.native
}

object ListTablesOutput {
  @scala.inline
  def apply(): ListTablesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesOutput]
  }
  @scala.inline
  implicit class ListTablesOutputOps[Self <: ListTablesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastEvaluatedTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEvaluatedTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastEvaluatedTableName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableNames(value: TableNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableNames")(js.undefined)
        ret
    }
  }
  
}

