package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPvw extends js.Object {
  val Pvw: ProtectedViewWindow = js.native
}

object AnonPvw {
  @scala.inline
  def apply(Pvw: ProtectedViewWindow): AnonPvw = {
    val __obj = js.Dynamic.literal(Pvw = Pvw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPvw]
  }
  @scala.inline
  implicit class AnonPvwOps[Self <: AnonPvw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPvw(value: ProtectedViewWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pvw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

