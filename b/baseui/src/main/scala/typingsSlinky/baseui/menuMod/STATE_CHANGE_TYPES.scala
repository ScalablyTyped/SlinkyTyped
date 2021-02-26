package typingsSlinky.baseui.menuMod

import typingsSlinky.baseui.baseuiStrings.character
import typingsSlinky.baseui.baseuiStrings.click
import typingsSlinky.baseui.baseuiStrings.enter_
import typingsSlinky.baseui.baseuiStrings.focus
import typingsSlinky.baseui.baseuiStrings.mouseEnter
import typingsSlinky.baseui.baseuiStrings.moveDown
import typingsSlinky.baseui.baseuiStrings.moveUp
import typingsSlinky.baseui.baseuiStrings.reset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait STATE_CHANGE_TYPES extends StObject {
  
  var character: typingsSlinky.baseui.baseuiStrings.character = js.native
  
  var click: typingsSlinky.baseui.baseuiStrings.click = js.native
  
  var enter: enter_ = js.native
  
  var focus: typingsSlinky.baseui.baseuiStrings.focus = js.native
  
  var mouseEnter: typingsSlinky.baseui.baseuiStrings.mouseEnter = js.native
  
  var moveDown: typingsSlinky.baseui.baseuiStrings.moveDown = js.native
  
  var moveUp: typingsSlinky.baseui.baseuiStrings.moveUp = js.native
  
  var reset: typingsSlinky.baseui.baseuiStrings.reset = js.native
}
object STATE_CHANGE_TYPES {
  
  @JSImport("baseui/menu", "STATE_CHANGE_TYPES")
  @js.native
  val ^ : STATE_CHANGE_TYPES = js.native
  
  @scala.inline
  implicit class STATE_CHANGE_TYPESMutableBuilder[Self <: STATE_CHANGE_TYPES] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: character): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: click): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnter(value: enter_): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: focus): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEnter(value: mouseEnter): Self = StObject.set(x, "mouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveDown(value: moveDown): Self = StObject.set(x, "moveDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUp(value: moveUp): Self = StObject.set(x, "moveUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: reset): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
  }
}
