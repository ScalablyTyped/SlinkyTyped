package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseDataSourceConfig extends js.Object {
  /**
    * Amazon RDS HTTP endpoint settings.
    */
  var rdsHttpEndpointConfig: js.UndefOr[RdsHttpEndpointConfig] = js.native
  /**
    * Source type for the relational database.    RDS_HTTP_ENDPOINT: The relational database source type is an Amazon RDS HTTP endpoint.  
    */
  var relationalDatabaseSourceType: js.UndefOr[RelationalDatabaseSourceType] = js.native
}

object RelationalDatabaseDataSourceConfig {
  @scala.inline
  def apply(): RelationalDatabaseDataSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseDataSourceConfig]
  }
  @scala.inline
  implicit class RelationalDatabaseDataSourceConfigOps[Self <: RelationalDatabaseDataSourceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRdsHttpEndpointConfig(value: RdsHttpEndpointConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdsHttpEndpointConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRdsHttpEndpointConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdsHttpEndpointConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationalDatabaseSourceType(value: RelationalDatabaseSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationalDatabaseSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseSourceType")(js.undefined)
        ret
    }
  }
  
}

