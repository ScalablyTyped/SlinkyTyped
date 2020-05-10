package typingsSlinky.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPushTimeDays extends js.Object {
  var pushTimeDays: js.Array[Double] = js.native
  var pushTimeEndHour: Double = js.native
  var pushTimeStartHour: Double = js.native
}

object AnonPushTimeDays {
  @scala.inline
  def apply(pushTimeDays: js.Array[Double], pushTimeEndHour: Double, pushTimeStartHour: Double): AnonPushTimeDays = {
    val __obj = js.Dynamic.literal(pushTimeDays = pushTimeDays.asInstanceOf[js.Any], pushTimeEndHour = pushTimeEndHour.asInstanceOf[js.Any], pushTimeStartHour = pushTimeStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPushTimeDays]
  }
  @scala.inline
  implicit class AnonPushTimeDaysOps[Self <: AnonPushTimeDays] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPushTimeDays(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushTimeDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushTimeEndHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushTimeEndHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushTimeStartHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushTimeStartHour")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

