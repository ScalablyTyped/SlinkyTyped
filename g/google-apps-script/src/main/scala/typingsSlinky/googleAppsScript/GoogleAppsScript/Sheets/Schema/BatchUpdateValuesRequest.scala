package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateValuesRequest extends js.Object {
  var data: js.UndefOr[js.Array[ValueRange]] = js.native
  var includeValuesInResponse: js.UndefOr[Boolean] = js.native
  var responseDateTimeRenderOption: js.UndefOr[String] = js.native
  var responseValueRenderOption: js.UndefOr[String] = js.native
  var valueInputOption: js.UndefOr[String] = js.native
}

object BatchUpdateValuesRequest {
  @scala.inline
  def apply(): BatchUpdateValuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateValuesRequest]
  }
  @scala.inline
  implicit class BatchUpdateValuesRequestOps[Self <: BatchUpdateValuesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[ValueRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeValuesInResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeValuesInResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeValuesInResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeValuesInResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDateTimeRenderOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDateTimeRenderOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDateTimeRenderOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDateTimeRenderOption")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseValueRenderOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseValueRenderOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseValueRenderOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseValueRenderOption")(js.undefined)
        ret
    }
    @scala.inline
    def withValueInputOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInputOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueInputOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInputOption")(js.undefined)
        ret
    }
  }
  
}

