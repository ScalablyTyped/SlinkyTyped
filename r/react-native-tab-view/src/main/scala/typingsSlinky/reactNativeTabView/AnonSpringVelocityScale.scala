package typingsSlinky.reactNativeTabView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSpringVelocityScale extends js.Object {
  var springVelocityScale: Double = js.native
  var swipeVelocityImpact: Double = js.native
}

object AnonSpringVelocityScale {
  @scala.inline
  def apply(springVelocityScale: Double, swipeVelocityImpact: Double): AnonSpringVelocityScale = {
    val __obj = js.Dynamic.literal(springVelocityScale = springVelocityScale.asInstanceOf[js.Any], swipeVelocityImpact = swipeVelocityImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpringVelocityScale]
  }
  @scala.inline
  implicit class AnonSpringVelocityScaleOps[Self <: AnonSpringVelocityScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpringVelocityScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springVelocityScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeVelocityImpact(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeVelocityImpact")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

