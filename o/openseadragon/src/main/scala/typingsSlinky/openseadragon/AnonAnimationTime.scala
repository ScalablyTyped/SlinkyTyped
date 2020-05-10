package typingsSlinky.openseadragon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimationTime extends js.Object {
  var animationTime: Double = js.native
  var exponential: js.UndefOr[Boolean] = js.native
  var initial: js.UndefOr[Double] = js.native
  var springStiffness: Double = js.native
}

object AnonAnimationTime {
  @scala.inline
  def apply(animationTime: Double, springStiffness: Double): AnonAnimationTime = {
    val __obj = js.Dynamic.literal(animationTime = animationTime.asInstanceOf[js.Any], springStiffness = springStiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationTime]
  }
  @scala.inline
  implicit class AnonAnimationTimeOps[Self <: AnonAnimationTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpringStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springStiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExponential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponential")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
  }
  
}

