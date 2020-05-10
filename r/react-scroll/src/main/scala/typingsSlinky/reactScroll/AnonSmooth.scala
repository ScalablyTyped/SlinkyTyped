package typingsSlinky.reactScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSmooth extends js.Object {
  var smooth: Boolean | String = js.native
}

object AnonSmooth {
  @scala.inline
  def apply(smooth: Boolean | String): AnonSmooth = {
    val __obj = js.Dynamic.literal(smooth = smooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSmooth]
  }
  @scala.inline
  implicit class AnonSmoothOps[Self <: AnonSmooth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSmooth(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

