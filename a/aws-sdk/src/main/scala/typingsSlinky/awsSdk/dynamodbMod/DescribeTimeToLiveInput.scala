package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTimeToLiveInput extends js.Object {
  /**
    * The name of the table to be described.
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
}

object DescribeTimeToLiveInput {
  @scala.inline
  def apply(TableName: TableName): DescribeTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTimeToLiveInput]
  }
  @scala.inline
  implicit class DescribeTimeToLiveInputOps[Self <: DescribeTimeToLiveInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

