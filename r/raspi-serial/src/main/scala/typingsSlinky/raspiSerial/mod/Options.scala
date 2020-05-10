package typingsSlinky.raspiSerial.mod

import typingsSlinky.raspiSerial.raspiSerialNumbers.`110`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`115200`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`1200`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`134`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`150`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`1800`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`19200`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`1`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`200`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`2400`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`2`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`300`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`38400`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`4800`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`50`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`57600`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`5`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`600`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`6`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`75`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`7`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`8`
import typingsSlinky.raspiSerial.raspiSerialNumbers.`9600`
import typingsSlinky.raspiSerial.raspiSerialStrings.even
import typingsSlinky.raspiSerial.raspiSerialStrings.mark
import typingsSlinky.raspiSerial.raspiSerialStrings.none
import typingsSlinky.raspiSerial.raspiSerialStrings.odd
import typingsSlinky.raspiSerial.raspiSerialStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var baudRate: js.UndefOr[
    `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
  ] = js.native
  var dataBits: js.UndefOr[`8` | `7` | `6` | `5`] = js.native
  var parity: js.UndefOr[none | even | mark | odd | space] = js.native
  var portId: js.UndefOr[String] = js.native
  var stopBits: js.UndefOr[`1` | `2`] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaudRate(
      value: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baudRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaudRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baudRate")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBits(value: `8` | `7` | `6` | `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBits")(js.undefined)
        ret
    }
    @scala.inline
    def withParity(value: none | even | mark | odd | space): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parity")(js.undefined)
        ret
    }
    @scala.inline
    def withPortId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portId")(js.undefined)
        ret
    }
    @scala.inline
    def withStopBits(value: `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopBits")(js.undefined)
        ret
    }
  }
  
}

