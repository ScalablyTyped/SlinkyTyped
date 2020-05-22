package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.AUTO
import typingsSlinky.figma.figmaStrings.PERCENT
import typingsSlinky.figma.figmaStrings.PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.anon.Unit
  - typingsSlinky.figma.anon.`0`
*/
trait LineHeight extends js.Object

object LineHeight {
  @scala.inline
  def Unit(unit: PIXELS | PERCENT, value: Double): LineHeight = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
  @scala.inline
  def `0`(unit: AUTO): LineHeight = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
}

