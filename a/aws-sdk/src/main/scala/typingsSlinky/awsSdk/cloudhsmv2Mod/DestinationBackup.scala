package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationBackup extends js.Object {
  /**
    * The date and time when both the source backup was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The identifier (ID) of the source backup from which the new backup was copied.
    */
  var SourceBackup: js.UndefOr[BackupId] = js.native
  /**
    * The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
    */
  var SourceCluster: js.UndefOr[ClusterId] = js.native
  /**
    * The AWS region that contains the source backup from which the new backup was copied.
    */
  var SourceRegion: js.UndefOr[Region] = js.native
}

object DestinationBackup {
  @scala.inline
  def apply(): DestinationBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationBackup]
  }
  @scala.inline
  implicit class DestinationBackupOps[Self <: DestinationBackup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

