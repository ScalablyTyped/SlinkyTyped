package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxDataRequestColumn extends js.Object {
  var data: String | Double = js.native
  var name: String = js.native
  var orderable: Boolean = js.native
  var search: AjaxDataRequestSearch = js.native
  var searchable: Boolean = js.native
}

object AjaxDataRequestColumn {
  @scala.inline
  def apply(
    data: String | Double,
    name: String,
    orderable: Boolean,
    search: AjaxDataRequestSearch,
    searchable: Boolean
  ): AjaxDataRequestColumn = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orderable = orderable.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDataRequestColumn]
  }
  @scala.inline
  implicit class AjaxDataRequestColumnOps[Self <: AjaxDataRequestColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrderable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: AjaxDataRequestSearch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

