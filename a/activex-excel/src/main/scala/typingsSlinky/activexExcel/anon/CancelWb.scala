package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelWb extends js.Object {
  var Cancel: Boolean = js.native
  val Wb: Workbook = js.native
}

object CancelWb {
  @scala.inline
  def apply(Cancel: Boolean, Wb: Workbook): CancelWb = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelWb]
  }
  @scala.inline
  implicit class CancelWbOps[Self <: CancelWb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWb(value: Workbook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

