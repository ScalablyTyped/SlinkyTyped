package typingsSlinky.firmata.anon

import typingsSlinky.firmata.mod.SERIAL_PORT_ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Baud extends js.Object {
  var baud: Double = js.native
  var portId: SERIAL_PORT_ID = js.native
  var rxPin: js.UndefOr[Double] = js.native
  var txPin: js.UndefOr[Double] = js.native
}

object Baud {
  @scala.inline
  def apply(baud: Double, portId: SERIAL_PORT_ID): Baud = {
    val __obj = js.Dynamic.literal(baud = baud.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baud]
  }
  @scala.inline
  implicit class BaudOps[Self <: Baud] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaud(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortId(value: SERIAL_PORT_ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRxPin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rxPin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRxPin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rxPin")(js.undefined)
        ret
    }
    @scala.inline
    def withTxPin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txPin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTxPin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txPin")(js.undefined)
        ret
    }
  }
  
}

