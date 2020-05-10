package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableBorderPropertiesRequest extends js.Object {
  var borderPosition: js.UndefOr[String] = js.native
  var fields: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
  var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.native
  var tableRange: js.UndefOr[TableRange] = js.native
}

object UpdateTableBorderPropertiesRequest {
  @scala.inline
  def apply(): UpdateTableBorderPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableBorderPropertiesRequest]
  }
  @scala.inline
  implicit class UpdateTableBorderPropertiesRequestOps[Self <: UpdateTableBorderPropertiesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderPosition")(js.undefined)
        ret
    }
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
    def withTableBorderProperties(value: TableBorderProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBorderProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBorderProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBorderProperties")(js.undefined)
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

