package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backup extends js.Object {
  /**
    * The identifier (ID) of the backup.
    */
  var BackupId: typingsSlinky.awsSdk.cloudhsmv2Mod.BackupId = js.native
  /**
    * The state of the backup.
    */
  var BackupState: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.BackupState] = js.native
  /**
    * The identifier (ID) of the cluster that was backed up.
    */
  var ClusterId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.ClusterId] = js.native
  /**
    * The date and time when the backup was copied from a source backup.
    */
  var CopyTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when the backup was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when the backup will be permanently deleted.
    */
  var DeleteTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The identifier (ID) of the source backup from which the new backup was copied.
    */
  var SourceBackup: js.UndefOr[BackupId] = js.native
  /**
    * The identifier (ID) of the cluster containing the source backup from which the new backup was copied. .
    */
  var SourceCluster: js.UndefOr[ClusterId] = js.native
  /**
    * The AWS region that contains the source backup from which the new backup was copied.
    */
  var SourceRegion: js.UndefOr[Region] = js.native
  var TagList: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.TagList] = js.native
}

object Backup {
  @scala.inline
  def apply(BackupId: BackupId): Backup = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backup]
  }
  @scala.inline
  implicit class BackupOps[Self <: Backup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupId(value: BackupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupState(value: BackupState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupState")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceBackup(value: BackupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBackup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBackup")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCluster(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCluster")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withTagList(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(js.undefined)
        ret
    }
  }
  
}

