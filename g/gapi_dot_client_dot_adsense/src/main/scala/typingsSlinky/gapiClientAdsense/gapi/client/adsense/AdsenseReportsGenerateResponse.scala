package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClientAdsense.anon.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdsenseReportsGenerateResponse extends js.Object {
  /** The averages of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty. */
  var averages: js.UndefOr[js.Array[String]] = js.native
  /** The requested end date in yyyy-mm-dd format. */
  var endDate: js.UndefOr[String] = js.native
  /**
    * The header information of the columns requested in the report. This is a list of headers; one for each dimension in the request, followed by one for
    * each metric in the request.
    */
  var headers: js.UndefOr[js.Array[Currency]] = js.native
  /** Kind this is, in this case adsense#report. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The output rows of the report. Each row is a list of cells; one for each dimension in the request, followed by one for each metric in the request. The
    * dimension cells contain strings, and the metric cells contain numbers.
    */
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /** The requested start date in yyyy-mm-dd format. */
  var startDate: js.UndefOr[String] = js.native
  /**
    * The total number of rows matched by the report request. Fewer rows may be returned in the response due to being limited by the row count requested or
    * the report row limit.
    */
  var totalMatchedRows: js.UndefOr[String] = js.native
  /** The totals of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty. */
  var totals: js.UndefOr[js.Array[String]] = js.native
  /** Any warnings associated with generation of the report. */
  var warnings: js.UndefOr[js.Array[String]] = js.native
}

object AdsenseReportsGenerateResponse {
  @scala.inline
  def apply(): AdsenseReportsGenerateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdsenseReportsGenerateResponse]
  }
  @scala.inline
  implicit class AdsenseReportsGenerateResponseOps[Self <: AdsenseReportsGenerateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averages")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[Currency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalMatchedRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMatchedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalMatchedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMatchedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withTotals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totals")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

