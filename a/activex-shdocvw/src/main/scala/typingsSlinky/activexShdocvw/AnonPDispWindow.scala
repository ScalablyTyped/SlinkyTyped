package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPDispWindow extends js.Object {
  val pDispWindow: js.Any = js.native
}

object AnonPDispWindow {
  @scala.inline
  def apply(pDispWindow: js.Any): AnonPDispWindow = {
    val __obj = js.Dynamic.literal(pDispWindow = pDispWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPDispWindow]
  }
  @scala.inline
  implicit class AnonPDispWindowOps[Self <: AnonPDispWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPDispWindow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pDispWindow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

