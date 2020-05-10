package typingsSlinky.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridMapping extends js.Object {
  var dataField: js.UndefOr[String] = js.native
  var totalRecordsField: js.UndefOr[String] = js.native
}

object GridMapping {
  @scala.inline
  def apply(): GridMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMapping]
  }
  @scala.inline
  implicit class GridMappingOps[Self <: GridMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRecordsField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecordsField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRecordsField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecordsField")(js.undefined)
        ret
    }
  }
  
}

