package typingsSlinky.firmata.mod

import typingsSlinky.firmata.firmataNumbers.`0x00`
import typingsSlinky.firmata.firmataNumbers.`0x01`
import typingsSlinky.firmata.firmataNumbers.`0x02`
import typingsSlinky.firmata.firmataNumbers.`0x03`
import typingsSlinky.firmata.firmataNumbers.`0x04`
import typingsSlinky.firmata.firmataNumbers.`0x05`
import typingsSlinky.firmata.firmataNumbers.`0x06`
import typingsSlinky.firmata.firmataNumbers.`0x07`
import typingsSlinky.firmata.firmataNumbers.`0x08`
import typingsSlinky.firmata.firmataNumbers.`0x0A`
import typingsSlinky.firmata.firmataNumbers.`0x0B`
import typingsSlinky.firmata.firmataNumbers.`0x10`
import typingsSlinky.firmata.firmataNumbers.`0x75`
import typingsSlinky.firmata.firmataNumbers.`0x7F`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L449-L464
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firmata.firmataNumbers.`0x00`
  - typingsSlinky.firmata.firmataNumbers.`0x01`
  - typingsSlinky.firmata.firmataNumbers.`0x02`
  - typingsSlinky.firmata.firmataNumbers.`0x03`
  - typingsSlinky.firmata.firmataNumbers.`0x04`
  - typingsSlinky.firmata.firmataNumbers.`0x05`
  - typingsSlinky.firmata.firmataNumbers.`0x06`
  - typingsSlinky.firmata.firmataNumbers.`0x07`
  - typingsSlinky.firmata.firmataNumbers.`0x08`
  - typingsSlinky.firmata.firmataNumbers.`0x0A`
  - typingsSlinky.firmata.firmataNumbers.`0x0B`
  - typingsSlinky.firmata.firmataNumbers.`0x7F`
  - typingsSlinky.firmata.firmataNumbers.`0x75`
  - typingsSlinky.firmata.firmataNumbers.`0x10`
*/
trait PIN_MODE extends js.Object

object PIN_MODE {
  @scala.inline
  def ANALOG: `0x02` = 0x02.asInstanceOf[`0x02`]
  @scala.inline
  def I2C: `0x06` = 0x06.asInstanceOf[`0x06`]
  @scala.inline
  def IGNORE: `0x7F` = 0x7F.asInstanceOf[`0x7F`]
  @scala.inline
  def INPUT: `0x00` = 0x00.asInstanceOf[`0x00`]
  @scala.inline
  def ONEWIRE: `0x07` = 0x07.asInstanceOf[`0x07`]
  @scala.inline
  def OUTPUT: `0x01` = 0x01.asInstanceOf[`0x01`]
  @scala.inline
  def PING_READ: `0x75` = 0x75.asInstanceOf[`0x75`]
  @scala.inline
  def PULLUP: `0x0B` = 0x0B.asInstanceOf[`0x0B`]
  @scala.inline
  def PWM: `0x03` = 0x03.asInstanceOf[`0x03`]
  @scala.inline
  def SERIAL: `0x0A` = 0x0A.asInstanceOf[`0x0A`]
  @scala.inline
  def SERVO: `0x04` = 0x04.asInstanceOf[`0x04`]
  @scala.inline
  def SHIFT: `0x05` = 0x05.asInstanceOf[`0x05`]
  @scala.inline
  def STEPPER: `0x08` = 0x08.asInstanceOf[`0x08`]
  @scala.inline
  def UNKNOWN: `0x10` = 0x10.asInstanceOf[`0x10`]
}

