package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTablesInput extends js.Object {
  /**
    * The first table name that this operation will evaluate. Use the value that was returned for LastEvaluatedTableName in a previous operation, so that you can obtain the next page of results.
    */
  var ExclusiveStartTableName: js.UndefOr[TableName] = js.native
  /**
    * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
    */
  var Limit: js.UndefOr[ListTablesInputLimit] = js.native
}

object ListTablesInput {
  @scala.inline
  def apply(): ListTablesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesInput]
  }
  @scala.inline
  implicit class ListTablesInputOps[Self <: ListTablesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusiveStartTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveStartTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveStartTableName")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: ListTablesInputLimit): Self = {
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
  }
  
}

