package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuplicateSheetRequest extends js.Object {
  var insertSheetIndex: js.UndefOr[Double] = js.native
  var newSheetId: js.UndefOr[Double] = js.native
  var newSheetName: js.UndefOr[String] = js.native
  var sourceSheetId: js.UndefOr[Double] = js.native
}

object DuplicateSheetRequest {
  @scala.inline
  def apply(): DuplicateSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateSheetRequest]
  }
  @scala.inline
  implicit class DuplicateSheetRequestOps[Self <: DuplicateSheetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertSheetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSheetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSheetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSheetIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withNewSheetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheetId")(js.undefined)
        ret
    }
    @scala.inline
    def withNewSheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSheetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSheetName")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSheetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSheetId")(js.undefined)
        ret
    }
  }
  
}

