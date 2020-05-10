package typingsSlinky.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportProjectResult extends js.Object {
  /**
    *  URL which can be used to download the exported project configuation file(s). 
    */
  var downloadUrl: js.UndefOr[DownloadUrl] = js.native
  /**
    *  URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the same configuration as the specified project. This URL pertains to a snapshot in time of the project configuration that is created when this API is called. If you want to share additional changes to your project configuration, then you will need to create and share a new snapshot by calling this method again. 
    */
  var shareUrl: js.UndefOr[ShareUrl] = js.native
  /**
    *  Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is included in the share URL. 
    */
  var snapshotId: js.UndefOr[SnapshotId] = js.native
}

object ExportProjectResult {
  @scala.inline
  def apply(): ExportProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportProjectResult]
  }
  @scala.inline
  implicit class ExportProjectResultOps[Self <: ExportProjectResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadUrl(value: DownloadUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withShareUrl(value: ShareUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotId")(js.undefined)
        ret
    }
  }
  
}

