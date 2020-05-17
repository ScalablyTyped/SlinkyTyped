package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Micros extends js.Object {
  var micros: Double = js.native
  var millis: Double = js.native
  var seconds: Double = js.native
}

object Micros {
  @scala.inline
  def apply(micros: Double, millis: Double, seconds: Double): Micros = {
    val __obj = js.Dynamic.literal(micros = micros.asInstanceOf[js.Any], millis = millis.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Micros]
  }
  @scala.inline
  implicit class MicrosOps[Self <: Micros] (val x: Self) extends AnyVal {
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

