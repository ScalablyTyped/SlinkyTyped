package typingsSlinky.j5IoTypes.mod

import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`110`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`115200`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`1200`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`134`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`150`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`1800`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`19200`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`1`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`200`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`2400`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`2`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`300`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`38400`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`4800`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`50`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`57600`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`5`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`600`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`6`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`75`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`7`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`8`
import typingsSlinky.j5IoTypes.j5IoTypesNumbers.`9600`
import typingsSlinky.j5IoTypes.j5IoTypesStrings.even
import typingsSlinky.j5IoTypes.j5IoTypesStrings.mark
import typingsSlinky.j5IoTypes.j5IoTypesStrings.none
import typingsSlinky.j5IoTypes.j5IoTypesStrings.odd
import typingsSlinky.j5IoTypes.j5IoTypesStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerialOptions extends js.Object {
  var baudRate: js.UndefOr[
    `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
  ] = js.undefined
  var dataBits: js.UndefOr[`8` | `7` | `6` | `5`] = js.undefined
  var parity: js.UndefOr[none | even | mark | odd | space] = js.undefined
  var portId: js.UndefOr[String] = js.undefined
  var stopBits: js.UndefOr[`1` | `2`] = js.undefined
}

object ISerialOptions {
  @scala.inline
  def apply(
    baudRate: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double = null,
    dataBits: `8` | `7` | `6` | `5` = null,
    parity: none | even | mark | odd | space = null,
    portId: String = null,
    stopBits: `1` | `2` = null
  ): ISerialOptions = {
    val __obj = js.Dynamic.literal()
    if (baudRate != null) __obj.updateDynamic("baudRate")(baudRate.asInstanceOf[js.Any])
    if (dataBits != null) __obj.updateDynamic("dataBits")(dataBits.asInstanceOf[js.Any])
    if (parity != null) __obj.updateDynamic("parity")(parity.asInstanceOf[js.Any])
    if (portId != null) __obj.updateDynamic("portId")(portId.asInstanceOf[js.Any])
    if (stopBits != null) __obj.updateDynamic("stopBits")(stopBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISerialOptions]
  }
}

