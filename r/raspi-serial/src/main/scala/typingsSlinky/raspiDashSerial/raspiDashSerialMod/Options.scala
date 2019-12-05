package typingsSlinky.raspiDashSerial.raspiDashSerialMod

import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`110`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`115200`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`1200`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`134`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`150`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`1800`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`19200`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`1`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`200`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`2400`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`2`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`300`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`38400`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`4800`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`50`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`57600`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`5`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`600`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`6`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`75`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`7`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`8`
import typingsSlinky.raspiDashSerial.raspiDashSerialNumbers.`9600`
import typingsSlinky.raspiDashSerial.raspiDashSerialStrings.even
import typingsSlinky.raspiDashSerial.raspiDashSerialStrings.mark
import typingsSlinky.raspiDashSerial.raspiDashSerialStrings.none
import typingsSlinky.raspiDashSerial.raspiDashSerialStrings.odd
import typingsSlinky.raspiDashSerial.raspiDashSerialStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var baudRate: js.UndefOr[
    `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
  ] = js.undefined
  var dataBits: js.UndefOr[`8` | `7` | `6` | `5`] = js.undefined
  var parity: js.UndefOr[none | even | mark | odd | space] = js.undefined
  var portId: js.UndefOr[String] = js.undefined
  var stopBits: js.UndefOr[`1` | `2`] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    baudRate: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double = null,
    dataBits: `8` | `7` | `6` | `5` = null,
    parity: none | even | mark | odd | space = null,
    portId: String = null,
    stopBits: `1` | `2` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (baudRate != null) __obj.updateDynamic("baudRate")(baudRate.asInstanceOf[js.Any])
    if (dataBits != null) __obj.updateDynamic("dataBits")(dataBits.asInstanceOf[js.Any])
    if (parity != null) __obj.updateDynamic("parity")(parity.asInstanceOf[js.Any])
    if (portId != null) __obj.updateDynamic("portId")(portId.asInstanceOf[js.Any])
    if (stopBits != null) __obj.updateDynamic("stopBits")(stopBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

