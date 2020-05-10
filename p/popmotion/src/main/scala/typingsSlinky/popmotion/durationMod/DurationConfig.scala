package typingsSlinky.popmotion.durationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurationConfig extends js.Object {
  var dampingRatio: Double = js.native
  var duration: Double = js.native
  var initialVelocity: Double = js.native
  var mass: Double = js.native
}

object DurationConfig {
  @scala.inline
  def apply(dampingRatio: Double, duration: Double, initialVelocity: Double, mass: Double): DurationConfig = {
    val __obj = js.Dynamic.literal(dampingRatio = dampingRatio.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], initialVelocity = initialVelocity.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationConfig]
  }
  @scala.inline
  implicit class DurationConfigOps[Self <: DurationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDampingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dampingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

