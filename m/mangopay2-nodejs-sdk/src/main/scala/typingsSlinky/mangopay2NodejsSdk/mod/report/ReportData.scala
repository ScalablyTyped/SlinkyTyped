package typingsSlinky.mangopay2NodejsSdk.mod.report

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTIONS
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportData extends EntityBaseData {
  /**
    * A URL that we will ping when the report is ready to download(works in a similar way to the hooks)
    */
  var CallbackURL: String = js.native
  /**
    * A list of columns / infos to show in the report
    */
  var Columns: js.Array[Column] = js.native
  /**
    * The format of the report download
    */
  var DownloadFormat: CSV = js.native
  /**
    * The URL to download the report
    */
  var DownloadURL: String = js.native
  /**
    * An object of various filters for the report
    */
  var Filters: typingsSlinky.mangopay2NodejsSdk.mod.report.Filters = js.native
  /**
    * Whether the report should be limited to the first 10 lines(and therefore quicker to execute)
    */
  var Preview: Boolean = js.native
  /**
    * The date when the report was executed
    */
  var ReportDate: Timestamp = js.native
  /**
    * The type of report
    */
  var ReportType: TRANSACTIONS = js.native
  /**
    * The result code
    */
  var ResultCode: String = js.native
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String = js.native
  /**
    * The column to sort against and direction seperate by a `:`
    */
  var Sort: String = js.native
}

object ReportData {
  @scala.inline
  def apply(
    CallbackURL: String,
    Columns: js.Array[Column],
    CreationDate: Double,
    DownloadFormat: CSV,
    DownloadURL: String,
    Filters: Filters,
    Id: String,
    Preview: Boolean,
    ReportDate: Timestamp,
    ReportType: TRANSACTIONS,
    ResultCode: String,
    ResultMessage: String,
    Sort: String,
    Tag: String
  ): ReportData = {
    val __obj = js.Dynamic.literal(CallbackURL = CallbackURL.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DownloadFormat = DownloadFormat.asInstanceOf[js.Any], DownloadURL = DownloadURL.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], ReportDate = ReportDate.asInstanceOf[js.Any], ReportType = ReportType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Sort = Sort.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportData]
  }
  @scala.inline
  implicit class ReportDataOps[Self <: ReportData] (val x: Self) extends AnyVal {
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
    def withColumns(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadFormat(value: CSV): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportType(value: TRANSACTIONS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

