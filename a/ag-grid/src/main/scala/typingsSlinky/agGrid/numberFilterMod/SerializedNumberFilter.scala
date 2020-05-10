package typingsSlinky.agGrid.numberFilterMod

import typingsSlinky.agGrid.iFilterMod.SerializedFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedNumberFilter extends SerializedFilter {
  var filter: Double = js.native
  var filterTo: Double = js.native
  var `type`: String = js.native
}

object SerializedNumberFilter {
  @scala.inline
  def apply(filter: Double, filterTo: Double, filterType: String, `type`: String): SerializedNumberFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterTo = filterTo.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedNumberFilter]
  }
  @scala.inline
  implicit class SerializedNumberFilterOps[Self <: SerializedNumberFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

