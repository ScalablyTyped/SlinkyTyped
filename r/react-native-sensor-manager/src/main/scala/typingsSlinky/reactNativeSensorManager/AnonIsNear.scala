package typingsSlinky.reactNativeSensorManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsNear extends js.Object {
  var isNear: Boolean = js.native
  var maxRange: Double = js.native
  var value: Double = js.native
}

object AnonIsNear {
  @scala.inline
  def apply(isNear: Boolean, maxRange: Double, value: Double): AnonIsNear = {
    val __obj = js.Dynamic.literal(isNear = isNear.asInstanceOf[js.Any], maxRange = maxRange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsNear]
  }
  @scala.inline
  implicit class AnonIsNearOps[Self <: AnonIsNear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsNear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

