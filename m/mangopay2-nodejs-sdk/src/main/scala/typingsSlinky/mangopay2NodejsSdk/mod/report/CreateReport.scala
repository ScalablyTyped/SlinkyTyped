package typingsSlinky.mangopay2NodejsSdk.mod.report

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.ReportData, 'Tag' | 'CallbackURL' | 'DownloadFormat' | 'Sort' | 'Preview' | 'Filters' | 'Columns'> */
@js.native
trait CreateReport extends js.Object {
  var CallbackURL: js.UndefOr[String] = js.native
  var Columns: js.UndefOr[js.Array[Column]] = js.native
  var DownloadFormat: js.UndefOr[CSV] = js.native
  var Filters: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.report.Filters] = js.native
  var Preview: js.UndefOr[Boolean] = js.native
  var Sort: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateReport {
  @scala.inline
  def apply(): CreateReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReport]
  }
  @scala.inline
  implicit class CreateReportOps[Self <: CreateReport] (val x: Self) extends AnyVal {
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

