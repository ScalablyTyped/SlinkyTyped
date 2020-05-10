package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMicros extends js.Object {
  var micros: Double = js.native
  var millis: Double = js.native
  var seconds: Double = js.native
}

object AnonMicros {
  @scala.inline
  def apply(micros: Double, millis: Double, seconds: Double): AnonMicros = {
    val __obj = js.Dynamic.literal(micros = micros.asInstanceOf[js.Any], millis = millis.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMicros]
  }
  @scala.inline
  implicit class AnonMicrosOps[Self <: AnonMicros] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMicros(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("micros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

