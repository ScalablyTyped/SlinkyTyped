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

