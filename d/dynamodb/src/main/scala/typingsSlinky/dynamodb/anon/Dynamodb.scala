package typingsSlinky.dynamodb.anon

import typingsSlinky.dynamodb.dynamoDBMod.DynamoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dynamodb extends js.Object {
  var dynamodb: js.UndefOr[DynamoDB] = js.native
  var tableName: js.UndefOr[String] = js.native
}

object Dynamodb {
  @scala.inline
  def apply(): Dynamodb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dynamodb]
  }
  @scala.inline
  implicit class DynamodbOps[Self <: Dynamodb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamodb(value: DynamoDB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamodb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamodb")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
  }
  
}

