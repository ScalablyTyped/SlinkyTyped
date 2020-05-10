package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.Window
import typingsSlinky.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWn extends js.Object {
  val Wb: Workbook = js.native
  val Wn: Window = js.native
}

object AnonWn {
  @scala.inline
  def apply(Wb: Workbook, Wn: Window): AnonWn = {
    val __obj = js.Dynamic.literal(Wb = Wb.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWn]
  }
  @scala.inline
  implicit class AnonWnOps[Self <: AnonWn] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withWn(value: Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

