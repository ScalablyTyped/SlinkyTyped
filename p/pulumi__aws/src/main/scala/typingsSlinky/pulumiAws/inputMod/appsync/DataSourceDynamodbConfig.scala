package typingsSlinky.pulumiAws.inputMod.appsync

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceDynamodbConfig extends js.Object {
  /**
    * AWS region of Elasticsearch domain. Defaults to current region.
    */
  var region: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the DynamoDB table.
    */
  var tableName: Input[String] = js.native
  /**
    * Set to `true` to use Amazon Cognito credentials with this data source.
    */
  var useCallerCredentials: js.UndefOr[Input[Boolean]] = js.native
}

object DataSourceDynamodbConfig {
  @scala.inline
  def apply(tableName: Input[String]): DataSourceDynamodbConfig = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceDynamodbConfig]
  }
  @scala.inline
  implicit class DataSourceDynamodbConfigOps[Self <: DataSourceDynamodbConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCallerCredentials(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCallerCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCallerCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCallerCredentials")(js.undefined)
        ret
    }
  }
  
}

