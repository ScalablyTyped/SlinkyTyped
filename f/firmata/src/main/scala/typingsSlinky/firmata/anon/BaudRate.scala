package typingsSlinky.firmata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaudRate extends js.Object {
  var baudRate: Double = js.native
  var bufferSize: Double = js.native
}

object BaudRate {
  @scala.inline
  def apply(baudRate: Double, bufferSize: Double): BaudRate = {
    val __obj = js.Dynamic.literal(baudRate = baudRate.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaudRate]
  }
  @scala.inline
  implicit class BaudRateOps[Self <: BaudRate] (val x: Self) extends AnyVal {
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

