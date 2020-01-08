package typingsSlinky.figma.figmaMod._Global_

import typingsSlinky.figma.figmaStrings.AUTO
import typingsSlinky.figma.figmaStrings.PERCENT
import typingsSlinky.figma.figmaStrings.PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.Anon_PERCENT
  - typings.figma.Anon_AUTO
*/
trait LineHeight extends js.Object

object LineHeight {
  @scala.inline
  def Anon_PERCENT(unit: PIXELS | PERCENT, value: Double): LineHeight = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineHeight]
  }
  @scala.inline
  def Anon_AUTO(unit: AUTO): LineHeight = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineHeight]
  }
}

