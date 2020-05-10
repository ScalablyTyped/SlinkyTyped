package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsampledReportDriveDownloadDetails extends js.Object {
  var documentId: js.UndefOr[String] = js.native
}

object UnsampledReportDriveDownloadDetails {
  @scala.inline
  def apply(): UnsampledReportDriveDownloadDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsampledReportDriveDownloadDetails]
  }
  @scala.inline
  implicit class UnsampledReportDriveDownloadDetailsOps[Self <: UnsampledReportDriveDownloadDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentId")(js.undefined)
        ret
    }
  }
  
}

