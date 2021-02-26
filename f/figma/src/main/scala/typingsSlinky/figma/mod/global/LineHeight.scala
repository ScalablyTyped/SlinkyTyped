package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.AUTO
import typingsSlinky.figma.figmaStrings.PERCENT
import typingsSlinky.figma.figmaStrings.PIXELS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.anon.Unit
  - typingsSlinky.figma.anon.`0`
*/
trait LineHeight extends StObject
object LineHeight {
  
  @scala.inline
  def `0`(unit: AUTO): typingsSlinky.figma.anon.`0` = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.anon.`0`]
  }
  
  @scala.inline
  def Unit(unit: PIXELS | PERCENT, value: Double): typingsSlinky.figma.anon.Unit = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.anon.Unit]
  }
}
