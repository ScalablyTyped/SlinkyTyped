package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing a linked chart embedded from Google Sheets.
  */
@js.native
trait SchemaSheetsChart extends js.Object {
  /**
    * The ID of the specific chart in the Google Sheets spreadsheet that is
    * embedded.
    */
  var chartId: js.UndefOr[Double] = js.native
  /**
    * The URL of an image of the embedded chart, with a default lifetime of 30
    * minutes. This URL is tagged with the account of the requester. Anyone
    * with the URL effectively accesses the image as the original requester.
    * Access to the image may be lost if the presentation&#39;s sharing
    * settings change.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * The properties of the Sheets chart.
    */
  var sheetsChartProperties: js.UndefOr[SchemaSheetsChartProperties] = js.native
  /**
    * The ID of the Google Sheets spreadsheet that contains the source chart.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}

object SchemaSheetsChart {
  @scala.inline
  def apply(): SchemaSheetsChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheetsChart]
  }
  @scala.inline
  implicit class SchemaSheetsChartOps[Self <: SchemaSheetsChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartId")(js.undefined)
        ret
    }
    @scala.inline
    def withContentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetsChartProperties(value: SchemaSheetsChartProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsChartProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetsChartProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsChartProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadsheetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadsheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheetId")(js.undefined)
        ret
    }
  }
  
}

