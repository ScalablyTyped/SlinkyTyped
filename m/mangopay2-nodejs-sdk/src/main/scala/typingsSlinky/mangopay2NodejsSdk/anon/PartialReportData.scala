package typingsSlinky.mangopay2NodejsSdk.anon

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTIONS
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.report.Column
import typingsSlinky.mangopay2NodejsSdk.mod.report.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.ReportData> */
@js.native
trait PartialReportData extends js.Object {
  var CallbackURL: js.UndefOr[String] = js.native
  var Columns: js.UndefOr[js.Array[Column]] = js.native
  var CreationDate: js.UndefOr[Double] = js.native
  var DownloadFormat: js.UndefOr[CSV] = js.native
  var DownloadURL: js.UndefOr[String] = js.native
  var Filters: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.report.Filters] = js.native
  var Id: js.UndefOr[String] = js.native
  var Preview: js.UndefOr[Boolean] = js.native
  var ReportDate: js.UndefOr[Timestamp] = js.native
  var ReportType: js.UndefOr[TRANSACTIONS] = js.native
  var ResultCode: js.UndefOr[String] = js.native
  var ResultMessage: js.UndefOr[String] = js.native
  var Sort: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object PartialReportData {
  @scala.inline
  def apply(): PartialReportData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReportData]
  }
  @scala.inline
  implicit class PartialReportDataOps[Self <: PartialReportData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallbackURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallbackURL")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadFormat(value: CSV): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadURL")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preview")(js.undefined)
        ret
    }
    @scala.inline
    def withReportDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportDate")(js.undefined)
        ret
    }
    @scala.inline
    def withReportType(value: TRANSACTIONS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportType")(js.undefined)
        ret
    }
    @scala.inline
    def withResultCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultCode")(js.undefined)
        ret
    }
    @scala.inline
    def withResultMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

