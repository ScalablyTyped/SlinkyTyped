package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConfiguration extends js.Object {
  /**
    * Information about the database column that provides information for user context filtering.
    */
  var AclConfiguration: js.UndefOr[typingsSlinky.awsSdk.kendraMod.AclConfiguration] = js.native
  /**
    * Information about where the index should get the document information from the database.
    */
  var ColumnConfiguration: typingsSlinky.awsSdk.kendraMod.ColumnConfiguration = js.native
  /**
    * The information necessary to connect to a database.
    */
  var ConnectionConfiguration: typingsSlinky.awsSdk.kendraMod.ConnectionConfiguration = js.native
  /**
    * The type of database engine that runs the database.
    */
  var DatabaseEngineType: typingsSlinky.awsSdk.kendraMod.DatabaseEngineType = js.native
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.native
}

object DatabaseConfiguration {
  @scala.inline
  def apply(
    ColumnConfiguration: ColumnConfiguration,
    ConnectionConfiguration: ConnectionConfiguration,
    DatabaseEngineType: DatabaseEngineType
  ): DatabaseConfiguration = {
    val __obj = js.Dynamic.literal(ColumnConfiguration = ColumnConfiguration.asInstanceOf[js.Any], ConnectionConfiguration = ConnectionConfiguration.asInstanceOf[js.Any], DatabaseEngineType = DatabaseEngineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseConfiguration]
  }
  @scala.inline
  implicit class DatabaseConfigurationOps[Self <: DatabaseConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnConfiguration(value: ColumnConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionConfiguration(value: ConnectionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseEngineType(value: DatabaseEngineType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseEngineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAclConfiguration(value: AclConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AclConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAclConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AclConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfiguration(value: DataSourceVpcConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfiguration")(js.undefined)
        ret
    }
  }
  
}

