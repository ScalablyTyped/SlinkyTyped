package typingsSlinky.dynogels.mod

import typingsSlinky.dynogels.mod.AWS.DynamoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelConfig extends js.Object {
  var docClient: js.UndefOr[js.Any] = js.native
  var dynamodb: js.UndefOr[DynamoDB] = js.native
  var tableName: js.UndefOr[String] = js.native
}

object ModelConfig {
  @scala.inline
  def apply(): ModelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelConfig]
  }
  @scala.inline
  implicit class ModelConfigOps[Self <: ModelConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocClient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docClient")(js.undefined)
        ret
    }
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

