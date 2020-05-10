package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetValuesByDataFilterRequest extends js.Object {
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  var dateTimeRenderOption: js.UndefOr[String] = js.native
  var majorDimension: js.UndefOr[String] = js.native
  var valueRenderOption: js.UndefOr[String] = js.native
}

object BatchGetValuesByDataFilterRequest {
  @scala.inline
  def apply(): BatchGetValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetValuesByDataFilterRequest]
  }
  @scala.inline
  implicit class BatchGetValuesByDataFilterRequestOps[Self <: BatchGetValuesByDataFilterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFilters(value: js.Array[DataFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimeRenderOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRenderOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeRenderOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRenderOption")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorDimension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withValueRenderOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRenderOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRenderOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRenderOption")(js.undefined)
        ret
    }
  }
  
}

