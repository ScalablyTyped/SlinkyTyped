package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableRowPropertiesRequest extends js.Object {
  var fields: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
  var rowIndices: js.UndefOr[js.Array[Double]] = js.native
  var tableRowProperties: js.UndefOr[TableRowProperties] = js.native
}

object UpdateTableRowPropertiesRequest {
  @scala.inline
  def apply(): UpdateTableRowPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableRowPropertiesRequest]
  }
  @scala.inline
  implicit class UpdateTableRowPropertiesRequestOps[Self <: UpdateTableRowPropertiesRequest] (val x: Self) extends AnyVal {
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
    def withRowIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRowProperties(value: TableRowProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRowProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowProperties")(js.undefined)
        ret
    }
  }
  
}

