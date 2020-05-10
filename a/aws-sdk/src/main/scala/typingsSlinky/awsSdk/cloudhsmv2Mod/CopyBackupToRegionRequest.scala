package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyBackupToRegionRequest extends js.Object {
  /**
    * The ID of the backup that will be copied to the destination region. 
    */
  var BackupId: typingsSlinky.awsSdk.cloudhsmv2Mod.BackupId = js.native
  /**
    * The AWS region that will contain your copied CloudHSM cluster backup.
    */
  var DestinationRegion: Region = js.native
  var TagList: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.TagList] = js.native
}

object CopyBackupToRegionRequest {
  @scala.inline
  def apply(BackupId: BackupId, DestinationRegion: Region): CopyBackupToRegionRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], DestinationRegion = DestinationRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyBackupToRegionRequest]
  }
  @scala.inline
  implicit class CopyBackupToRegionRequestOps[Self <: CopyBackupToRegionRequest] (val x: Self) extends AnyVal {
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
    def withDestinationRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationRegion")(value.asInstanceOf[js.Any])
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

