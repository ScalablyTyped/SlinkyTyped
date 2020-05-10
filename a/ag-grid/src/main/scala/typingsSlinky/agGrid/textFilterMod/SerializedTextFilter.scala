package typingsSlinky.agGrid.textFilterMod

import typingsSlinky.agGrid.iFilterMod.SerializedFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedTextFilter extends SerializedFilter {
  var filter: String = js.native
  var `type`: String = js.native
}

object SerializedTextFilter {
  @scala.inline
  def apply(filter: String, filterType: String, `type`: String): SerializedTextFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedTextFilter]
  }
  @scala.inline
  implicit class SerializedTextFilterOps[Self <: SerializedTextFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
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

