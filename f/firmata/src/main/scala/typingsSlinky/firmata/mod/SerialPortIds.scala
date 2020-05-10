package typingsSlinky.firmata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialPortIds extends js.Object {
  var DEFAULT: SERIAL_PORT_ID = js.native
  var HW_SERIAL0: SERIAL_PORT_ID = js.native
  var HW_SERIAL1: SERIAL_PORT_ID = js.native
  var HW_SERIAL2: SERIAL_PORT_ID = js.native
  var HW_SERIAL3: SERIAL_PORT_ID = js.native
  var SW_SERIAL0: SERIAL_PORT_ID = js.native
  var SW_SERIAL1: SERIAL_PORT_ID = js.native
  var SW_SERIAL2: SERIAL_PORT_ID = js.native
  var SW_SERIAL3: SERIAL_PORT_ID = js.native
}

object SerialPortIds {
  @scala.inline
  def apply(
    DEFAULT: SERIAL_PORT_ID,
    HW_SERIAL0: SERIAL_PORT_ID,
    HW_SERIAL1: SERIAL_PORT_ID,
    HW_SERIAL2: SERIAL_PORT_ID,
    HW_SERIAL3: SERIAL_PORT_ID,
    SW_SERIAL0: SERIAL_PORT_ID,
    SW_SERIAL1: SERIAL_PORT_ID,
    SW_SERIAL2: SERIAL_PORT_ID,
    SW_SERIAL3: SERIAL_PORT_ID
  ): SerialPortIds = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], HW_SERIAL0 = HW_SERIAL0.asInstanceOf[js.Any], HW_SERIAL1 = HW_SERIAL1.asInstanceOf[js.Any], HW_SERIAL2 = HW_SERIAL2.asInstanceOf[js.Any], HW_SERIAL3 = HW_SERIAL3.asInstanceOf[js.Any], SW_SERIAL0 = SW_SERIAL0.asInstanceOf[js.Any], SW_SERIAL1 = SW_SERIAL1.asInstanceOf[js.Any], SW_SERIAL2 = SW_SERIAL2.asInstanceOf[js.Any], SW_SERIAL3 = SW_SERIAL3.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPortIds]
  }
  @scala.inline
  implicit class SerialPortIdsOps[Self <: SerialPortIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEFAULT(value: SERIAL_PORT_ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHW_SERIAL0(value: SERIAL_PORT_ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HW_SERIAL0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHW_SERIAL1(value: SERIAL_PORT_ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HW_SERIAL1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHW_SERIAL2(value: SERIAL_PORT_ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HW_SERIAL2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHW_SERIAL3(value: SERIAL_PORT_ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HW_SERIAL3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSW_SERIAL0(value: SERIAL_PORT_ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SW_SERIAL0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSW_SERIAL1(value: SERIAL_PORT_ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SW_SERIAL1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSW_SERIAL2(value: SERIAL_PORT_ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SW_SERIAL2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSW_SERIAL3(value: SERIAL_PORT_ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SW_SERIAL3")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

