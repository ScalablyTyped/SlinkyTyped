package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportSnapshotRecordsResult extends js.Object {
  /**
    * A list of objects describing the export snapshot records.
    */
  var exportSnapshotRecords: js.UndefOr[ExportSnapshotRecordList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetExportSnapshotRecords request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetExportSnapshotRecordsResult {
  @scala.inline
  def apply(): GetExportSnapshotRecordsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExportSnapshotRecordsResult]
  }
  @scala.inline
  implicit class GetExportSnapshotRecordsResultOps[Self <: GetExportSnapshotRecordsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportSnapshotRecords(value: ExportSnapshotRecordList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSnapshotRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportSnapshotRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSnapshotRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

