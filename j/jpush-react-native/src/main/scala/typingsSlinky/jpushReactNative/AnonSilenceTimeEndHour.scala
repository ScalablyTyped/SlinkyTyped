package typingsSlinky.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSilenceTimeEndHour extends js.Object {
  var silenceTimeEndHour: Double = js.native
  var silenceTimeEndMinute: Double = js.native
  var silenceTimeStartHour: Double = js.native
  var silenceTimeStartMinute: Double = js.native
}

object AnonSilenceTimeEndHour {
  @scala.inline
  def apply(
    silenceTimeEndHour: Double,
    silenceTimeEndMinute: Double,
    silenceTimeStartHour: Double,
    silenceTimeStartMinute: Double
  ): AnonSilenceTimeEndHour = {
    val __obj = js.Dynamic.literal(silenceTimeEndHour = silenceTimeEndHour.asInstanceOf[js.Any], silenceTimeEndMinute = silenceTimeEndMinute.asInstanceOf[js.Any], silenceTimeStartHour = silenceTimeStartHour.asInstanceOf[js.Any], silenceTimeStartMinute = silenceTimeStartMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSilenceTimeEndHour]
  }
  @scala.inline
  implicit class AnonSilenceTimeEndHourOps[Self <: AnonSilenceTimeEndHour] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSilenceTimeEndHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silenceTimeEndHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilenceTimeEndMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silenceTimeEndMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilenceTimeStartHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silenceTimeStartHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilenceTimeStartMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silenceTimeStartMinute")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

