package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeight extends js.Object {
  val Height: Double = js.native
}

object AnonHeight {
  @scala.inline
  def apply(Height: Double): AnonHeight = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
  @scala.inline
  implicit class AnonHeightOps[Self <: AnonHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

