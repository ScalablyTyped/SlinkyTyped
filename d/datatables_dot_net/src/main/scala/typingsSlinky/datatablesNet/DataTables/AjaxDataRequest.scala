package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region "ajax-settings"
@js.native
trait AjaxDataRequest extends js.Object {
  var columns: js.Array[AjaxDataRequestColumn] = js.native
  var data: js.Any = js.native
  var draw: Double = js.native
  var length: Double = js.native
  var order: js.Array[AjaxDataRequestOrder] = js.native
  var search: AjaxDataRequestSearch = js.native
  var start: Double = js.native
}

object AjaxDataRequest {
  @scala.inline
  def apply(
    columns: js.Array[AjaxDataRequestColumn],
    data: js.Any,
    draw: Double,
    length: Double,
    order: js.Array[AjaxDataRequestOrder],
    search: AjaxDataRequestSearch,
    start: Double
  ): AjaxDataRequest = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], draw = draw.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDataRequest]
  }
  @scala.inline
  implicit class AjaxDataRequestOps[Self <: AjaxDataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[AjaxDataRequestColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraw(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[AjaxDataRequestOrder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: AjaxDataRequestSearch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

