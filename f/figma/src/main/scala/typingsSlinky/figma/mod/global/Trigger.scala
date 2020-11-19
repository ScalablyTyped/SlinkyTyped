package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.AFTER_TIMEOUT
import typingsSlinky.figma.figmaStrings.MOUSE_DOWN
import typingsSlinky.figma.figmaStrings.MOUSE_ENTER
import typingsSlinky.figma.figmaStrings.MOUSE_LEAVE
import typingsSlinky.figma.figmaStrings.MOUSE_UP
import typingsSlinky.figma.figmaStrings.ON_CLICK
import typingsSlinky.figma.figmaStrings.ON_DRAG
import typingsSlinky.figma.figmaStrings.ON_HOVER
import typingsSlinky.figma.figmaStrings.ON_PRESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.anon.`1`
  - typingsSlinky.figma.anon.Timeout
  - typingsSlinky.figma.anon.Delay
*/
trait Trigger extends js.Object
object Trigger {
  
  @scala.inline
  def `1`(`type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
  
  @scala.inline
  def Timeout(timeout: Double, `type`: AFTER_TIMEOUT): Trigger = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
  
  @scala.inline
  def Delay(delay: Double, `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): Trigger = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
}
