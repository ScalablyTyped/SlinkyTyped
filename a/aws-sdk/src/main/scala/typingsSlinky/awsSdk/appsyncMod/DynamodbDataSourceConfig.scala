package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamodbDataSourceConfig extends js.Object {
  /**
    * The AWS Region.
    */
  var awsRegion: String = js.native
  /**
    * The DeltaSyncConfig for a versioned datasource.
    */
  var deltaSyncConfig: js.UndefOr[DeltaSyncConfig] = js.native
  /**
    * The table name.
    */
  var tableName: String = js.native
  /**
    * Set to TRUE to use Amazon Cognito credentials with this data source.
    */
  var useCallerCredentials: js.UndefOr[Boolean] = js.native
  /**
    * Set to TRUE to use Conflict Detection and Resolution with this data source.
    */
  var versioned: js.UndefOr[Boolean] = js.native
}

object DynamodbDataSourceConfig {
  @scala.inline
  def apply(awsRegion: String, tableName: String): DynamodbDataSourceConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamodbDataSourceConfig]
  }
  @scala.inline
  implicit class DynamodbDataSourceConfigOps[Self <: DynamodbDataSourceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaSyncConfig(value: DeltaSyncConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaSyncConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaSyncConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaSyncConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCallerCredentials(value: Boolean): Self = {
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
    @scala.inline
    def withVersioned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersioned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioned")(js.undefined)
        ret
    }
  }
  
}

