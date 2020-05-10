package typingsSlinky.fundamentalReact

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRowData extends js.Object {
  var rowData: js.Array[String | TagMod[Any]] = js.native
}

object AnonRowData {
  @scala.inline
  def apply(rowData: js.Array[String | TagMod[Any]]): AnonRowData = {
    val __obj = js.Dynamic.literal(rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowData]
  }
  @scala.inline
  implicit class AnonRowDataOps[Self <: AnonRowData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowData(value: js.Array[String | TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

