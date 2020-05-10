package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWnWindow extends js.Object {
  val Wn: Window = js.native
}

object AnonWnWindow {
  @scala.inline
  def apply(Wn: Window): AnonWnWindow = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWnWindow]
  }
  @scala.inline
  implicit class AnonWnWindowOps[Self <: AnonWnWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWn(value: Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

