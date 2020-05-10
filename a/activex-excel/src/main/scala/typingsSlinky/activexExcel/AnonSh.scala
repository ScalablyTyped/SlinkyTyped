package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.Chart
import typingsSlinky.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSh extends js.Object {
  val Sh: Chart | Worksheet = js.native
}

object AnonSh {
  @scala.inline
  def apply(Sh: Chart | Worksheet): AnonSh = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSh]
  }
  @scala.inline
  implicit class AnonShOps[Self <: AnonSh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSh(value: Chart | Worksheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sh")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

