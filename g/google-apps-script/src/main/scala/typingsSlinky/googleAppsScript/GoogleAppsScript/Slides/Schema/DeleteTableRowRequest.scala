package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTableRowRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  var tableObjectId: js.UndefOr[String] = js.native
}

object DeleteTableRowRequest {
  @scala.inline
  def apply(): DeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableRowRequest]
  }
  @scala.inline
  implicit class DeleteTableRowRequestOps[Self <: DeleteTableRowRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellLocation(value: TableCellLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withTableObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableObjectId")(js.undefined)
        ret
    }
  }
  
}

