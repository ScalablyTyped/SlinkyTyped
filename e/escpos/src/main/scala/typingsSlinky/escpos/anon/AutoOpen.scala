package typingsSlinky.escpos.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoOpen extends js.Object {
  var autoOpen: Boolean = js.native
  var baudRate: Double = js.native
}

object AutoOpen {
  @scala.inline
  def apply(autoOpen: Boolean, baudRate: Double): AutoOpen = {
    val __obj = js.Dynamic.literal(autoOpen = autoOpen.asInstanceOf[js.Any], baudRate = baudRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoOpen]
  }
  @scala.inline
  implicit class AutoOpenOps[Self <: AutoOpen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaudRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baudRate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

