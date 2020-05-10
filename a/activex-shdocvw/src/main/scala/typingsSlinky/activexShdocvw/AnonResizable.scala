package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResizable extends js.Object {
  val Resizable: Boolean = js.native
}

object AnonResizable {
  @scala.inline
  def apply(Resizable: Boolean): AnonResizable = {
    val __obj = js.Dynamic.literal(Resizable = Resizable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResizable]
  }
  @scala.inline
  implicit class AnonResizableOps[Self <: AnonResizable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resizable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

