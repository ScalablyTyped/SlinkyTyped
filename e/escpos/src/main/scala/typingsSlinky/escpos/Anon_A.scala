package typingsSlinky.escpos

import typingsSlinky.escpos.escposStrings.A
import typingsSlinky.escpos.escposStrings.ABV
import typingsSlinky.escpos.escposStrings.B
import typingsSlinky.escpos.escposStrings.BLW
import typingsSlinky.escpos.escposStrings.BTH
import typingsSlinky.escpos.escposStrings.OFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A extends js.Object {
  var font: A | B
  var height: Double
  var includeParity: Boolean
  /**
    * OFF, ABOVE, BELOW, BOTH
    *
    * @default BELOW
    */
  var position: OFF | ABV | BLW | BTH
  var width: Double
}

object Anon_A {
  @scala.inline
  def apply(
    font: A | B,
    height: Double,
    includeParity: Boolean,
    position: OFF | ABV | BLW | BTH,
    width: Double
  ): Anon_A = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], includeParity = includeParity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_A]
  }
}

