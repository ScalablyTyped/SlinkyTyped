package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVisible extends js.Object {
  val Visible: Boolean = js.native
}

object AnonVisible {
  @scala.inline
  def apply(Visible: Boolean): AnonVisible = {
    val __obj = js.Dynamic.literal(Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVisible]
  }
  @scala.inline
  implicit class AnonVisibleOps[Self <: AnonVisible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

