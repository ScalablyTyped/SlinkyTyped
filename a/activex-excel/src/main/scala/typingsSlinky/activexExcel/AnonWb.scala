package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWb extends js.Object {
  val Wb: Workbook = js.native
}

object AnonWb {
  @scala.inline
  def apply(Wb: Workbook): AnonWb = {
    val __obj = js.Dynamic.literal(Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWb]
  }
  @scala.inline
  implicit class AnonWbOps[Self <: AnonWb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWb(value: Workbook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

