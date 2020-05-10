package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceDynamoDb extends js.Object {
  // AWS region name of DynamoDB table, by default us-west-2 is used
  var aws_region: js.UndefOr[String] = js.native
  // name of DynamoDB table containing data
  var table_name: String = js.native
}

object SourceDynamoDb {
  @scala.inline
  def apply(table_name: String): SourceDynamoDb = {
    val __obj = js.Dynamic.literal(table_name = table_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDynamoDb]
  }
  @scala.inline
  implicit class SourceDynamoDbOps[Self <: SourceDynamoDb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTable_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAws_region(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAws_region: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_region")(js.undefined)
        ret
    }
  }
  
}

