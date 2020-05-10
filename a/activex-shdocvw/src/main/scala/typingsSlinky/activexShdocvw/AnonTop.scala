package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTop extends js.Object {
  val Top: Double = js.native
}

object AnonTop {
  @scala.inline
  def apply(Top: Double): AnonTop = {
    val __obj = js.Dynamic.literal(Top = Top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTop]
  }
  @scala.inline
  implicit class AnonTopOps[Self <: AnonTop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

