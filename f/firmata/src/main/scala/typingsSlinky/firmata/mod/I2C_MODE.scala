package typingsSlinky.firmata.mod

import typingsSlinky.firmata.firmataNumbers.`0`
import typingsSlinky.firmata.firmataNumbers.`1`
import typingsSlinky.firmata.firmataNumbers.`2`
import typingsSlinky.firmata.firmataNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L466-L471
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firmata.firmataNumbers.`0`
  - typingsSlinky.firmata.firmataNumbers.`1`
  - typingsSlinky.firmata.firmataNumbers.`2`
  - typingsSlinky.firmata.firmataNumbers.`3`
*/
trait I2C_MODE extends js.Object

object I2C_MODE {
  @scala.inline
  def CONTINUOUS_READ: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def READ: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def STOP_READING: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def WRITE: `0` = 0.asInstanceOf[`0`]
}

