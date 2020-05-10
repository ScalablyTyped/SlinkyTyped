package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSheetsChartRequest extends js.Object {
  var chartId: js.UndefOr[Double] = js.native
  var elementProperties: js.UndefOr[PageElementProperties] = js.native
  var linkingMode: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
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

