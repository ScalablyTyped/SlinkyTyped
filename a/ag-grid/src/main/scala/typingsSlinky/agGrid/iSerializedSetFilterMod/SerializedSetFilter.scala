package typingsSlinky.agGrid.iSerializedSetFilterMod

import typingsSlinky.agGrid.iFilterMod.SerializedFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedSetFilter extends SerializedFilter {
  var values: js.Array[String] = js.native
}

object SerializedSetFilter {
  @scala.inline
  def apply(filterType: String, values: js.Array[String]): SerializedSetFilter = {
    val __obj = js.Dynamic.literal(filterType = filterType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedSetFilter]
  }
  @scala.inline
  implicit class SerializedSetFilterOps[Self <: SerializedSetFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

