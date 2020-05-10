package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableCellPropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
  var tableCellProperties: js.UndefOr[TableCellProperties] = js.native
  var tableRange: js.UndefOr[TableRange] = js.native
}

object UpdateTableCellPropertiesRequest {
  @scala.inline
  def apply(): UpdateTableCellPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableCellPropertiesRequest]
  }
  @scala.inline
  implicit class UpdateTableCellPropertiesRequestOps[Self <: UpdateTableCellPropertiesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
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
    def withTableCellProperties(value: TableCellProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCellProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRange(value: TableRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRange")(js.undefined)
        ret
    }
  }
  
}

