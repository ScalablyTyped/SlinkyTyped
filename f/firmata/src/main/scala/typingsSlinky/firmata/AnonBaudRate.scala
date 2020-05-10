package typingsSlinky.firmata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaudRate extends js.Object {
  var baudRate: Double = js.native
  var bufferSize: Double = js.native
}

object AnonBaudRate {
  @scala.inline
  def apply(baudRate: Double, bufferSize: Double): AnonBaudRate = {
    val __obj = js.Dynamic.literal(baudRate = baudRate.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaudRate]
  }
  @scala.inline
  implicit class AnonBaudRateOps[Self <: AnonBaudRate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaudRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baudRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

