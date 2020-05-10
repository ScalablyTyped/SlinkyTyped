package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingModifiedRelationalDatabaseValues extends js.Object {
  /**
    * A Boolean value indicating whether automated backup retention is enabled.
    */
  var backupRetentionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The database engine version.
    */
  var engineVersion: js.UndefOr[String] = js.native
  /**
    * The password for the master user of the database.
    */
  var masterUserPassword: js.UndefOr[String] = js.native
}

object PendingModifiedRelationalDatabaseValues {
  @scala.inline
  def apply(): PendingModifiedRelationalDatabaseValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedRelationalDatabaseValues]
  }
  @scala.inline
  implicit class PendingModifiedRelationalDatabaseValuesOps[Self <: PendingModifiedRelationalDatabaseValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupRetentionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupRetentionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupRetentionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupRetentionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterUserPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterUserPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterUserPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterUserPassword")(js.undefined)
        ret
    }
  }
  
}

