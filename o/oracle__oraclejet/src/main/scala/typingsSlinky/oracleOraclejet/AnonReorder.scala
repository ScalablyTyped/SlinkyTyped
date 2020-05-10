package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReorder extends js.Object {
  var reorder: AnonRow = js.native
}

object AnonReorder {
  @scala.inline
  def apply(reorder: AnonRow): AnonReorder = {
    val __obj = js.Dynamic.literal(reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReorder]
  }
  @scala.inline
  implicit class AnonReorderOps[Self <: AnonReorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReorder(value: AnonRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

