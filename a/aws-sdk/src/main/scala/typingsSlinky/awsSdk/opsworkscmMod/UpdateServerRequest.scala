package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServerRequest extends js.Object {
  /**
    * Sets the number of automated backups that you want to keep. 
    */
  var BackupRetentionCount: js.UndefOr[Integer] = js.native
  /**
    * Setting DisableAutomatedBackup to true disables automated or scheduled backups. Automated backups are enabled by default. 
    */
  var DisableAutomatedBackup: js.UndefOr[Boolean] = js.native
  var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.native
  var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.native
  /**
    * The name of the server to update. 
    */
  var ServerName: typingsSlinky.awsSdk.opsworkscmMod.ServerName = js.native
}

object UpdateServerRequest {
  @scala.inline
  def apply(ServerName: ServerName): UpdateServerRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerRequest]
  }
  @scala.inline
  implicit class UpdateServerRequestOps[Self <: UpdateServerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerName(value: ServerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupRetentionCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupRetentionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupRetentionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupRetentionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAutomatedBackup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableAutomatedBackup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAutomatedBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableAutomatedBackup")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredBackupWindow(value: TimeWindowDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredBackupWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredBackupWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredBackupWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: TimeWindowDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(js.undefined)
        ret
    }
  }
  
}

