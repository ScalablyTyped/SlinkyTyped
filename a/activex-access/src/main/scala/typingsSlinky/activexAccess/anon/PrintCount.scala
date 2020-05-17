package typingsSlinky.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintCount extends js.Object {
  var Cancel: Double = js.native
  var PrintCount: Double = js.native
}

object PrintCount {
  @scala.inline
  def apply(Cancel: Double, PrintCount: Double): PrintCount = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PrintCount = PrintCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCount]
  }
  @scala.inline
  implicit class PrintCountOps[Self <: PrintCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

