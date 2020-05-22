package typingsSlinky.ds18b20.mod

import typingsSlinky.ds18b20.ds18b20Strings.decimal
import typingsSlinky.ds18b20.ds18b20Strings.default
import typingsSlinky.ds18b20.ds18b20Strings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemperatureOptions extends js.Object {
  var parser: decimal | default | hex
}

object TemperatureOptions {
  @scala.inline
  def apply(parser: decimal | default | hex): TemperatureOptions = {
    val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemperatureOptions]
  }
}

