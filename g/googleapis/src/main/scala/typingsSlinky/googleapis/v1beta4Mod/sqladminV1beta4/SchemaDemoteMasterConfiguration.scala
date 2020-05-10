package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Read-replica configuration for connecting to the on-premises master.
  */
@js.native
trait SchemaDemoteMasterConfiguration extends js.Object {
  /**
    * This is always sql#demoteMasterConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * MySQL specific configuration when replicating from a MySQL on-premises
    * master. Replication configuration information such as the username,
    * password, certificates, and keys are not stored in the instance metadata.
    * The configuration information is used only to set up the replication
    * connection and is stored by MySQL in a file named master.info in the data
    * directory.
    */
  var mysqlReplicaConfiguration: js.UndefOr[SchemaDemoteMasterMySqlReplicaConfiguration] = js.native
}

object SchemaDemoteMasterConfiguration {
  @scala.inline
  def apply(): SchemaDemoteMasterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDemoteMasterConfiguration]
  }
  @scala.inline
  implicit class SchemaDemoteMasterConfigurationOps[Self <: SchemaDemoteMasterConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMysqlReplicaConfiguration(value: SchemaDemoteMasterMySqlReplicaConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mysqlReplicaConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMysqlReplicaConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mysqlReplicaConfiguration")(js.undefined)
        ret
    }
  }
  
}

