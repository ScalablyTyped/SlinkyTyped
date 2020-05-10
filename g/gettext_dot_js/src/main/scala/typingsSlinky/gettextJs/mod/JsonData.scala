package typingsSlinky.gettextJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonData extends JsonDataMessages {
  @JSName("")
  var _empty: JsonDataHeader = js.native
}

object JsonData {
  @scala.inline
  def apply(_empty: JsonDataHeader): JsonData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonData]
  }
  @scala.inline
  implicit class JsonDataOps[Self <: JsonData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_empty(value: JsonDataHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

