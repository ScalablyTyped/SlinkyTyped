package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSheetsChartRequest extends js.Object {
  /** The ID of the specific chart in the Google Sheets spreadsheet. */
  var chartId: js.UndefOr[Double] = js.native
  /**
    * The element properties for the chart.
    *
    * When the aspect ratio of the provided size does not match the chart aspect
    * ratio, the chart is scaled and centered with respect to the size in order
    * to maintain aspect ratio. The provided transform is applied after this
    * operation.
    */
  var elementProperties: js.UndefOr[PageElementProperties] = js.native
  /**
    * The mode with which the chart is linked to the source spreadsheet. When
    * not specified, the chart will be an image that is not linked.
    */
  var linkingMode: js.UndefOr[String] = js.native
  /**
    * A user-supplied object ID.
    *
    * If specified, the ID must be unique among all pages and page elements in
    * the presentation. The ID should start with a word character [a-zA-Z0-9_]
    * and then followed by any number of the following characters [a-zA-Z0-9_-:].
    * The length of the ID should not be less than 5 or greater than 50.
    * If empty, a unique identifier will be generated.
    */
  var objectId: js.UndefOr[String] = js.native
  /** The ID of the Google Sheets spreadsheet that contains the chart. */
  var spreadsheetId: js.UndefOr[String] = js.native
}

object CreateSheetsChartRequest {
  @scala.inline
  def apply(): CreateSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSheetsChartRequest]
  }
  @scala.inline
  implicit class CreateSheetsChartRequestOps[Self <: CreateSheetsChartRequest] (val x: Self) extends AnyVal {
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
    def withElementProperties(value: PageElementProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
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

