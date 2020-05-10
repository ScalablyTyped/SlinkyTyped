package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupProvider extends DataProvider {
  def backup(connectionUri: String, backupInfo: StringDictionary[js.Any], taskExecutionMode: TaskExecutionMode): Thenable[BackupResponse] = js.native
  def getBackupConfigInfo(connectionUri: String): Thenable[BackupConfigInfo] = js.native
}

object BackupProvider {
  @scala.inline
  def apply(
    backup: (String, StringDictionary[js.Any], TaskExecutionMode) => Thenable[BackupResponse],
    getBackupConfigInfo: String => Thenable[BackupConfigInfo],
    providerId: String
  ): BackupProvider = {
    val __obj = js.Dynamic.literal(backup = js.Any.fromFunction3(backup), getBackupConfigInfo = js.Any.fromFunction1(getBackupConfigInfo), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupProvider]
  }
  @scala.inline
  implicit class BackupProviderOps[Self <: BackupProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackup(value: (String, StringDictionary[js.Any], TaskExecutionMode) => Thenable[BackupResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backup")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetBackupConfigInfo(value: String => Thenable[BackupConfigInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackupConfigInfo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

