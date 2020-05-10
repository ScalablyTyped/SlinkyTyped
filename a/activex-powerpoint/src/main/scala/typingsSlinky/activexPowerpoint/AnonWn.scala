package typingsSlinky.activexPowerpoint

import typingsSlinky.activexPowerpoint.PowerPoint.SlideShowWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWn extends js.Object {
  val Wn: SlideShowWindow = js.native
}

object AnonWn {
  @scala.inline
  def apply(Wn: SlideShowWindow): AnonWn = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWn]
  }
  @scala.inline
  implicit class AnonWnOps[Self <: AnonWn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWn(value: SlideShowWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

