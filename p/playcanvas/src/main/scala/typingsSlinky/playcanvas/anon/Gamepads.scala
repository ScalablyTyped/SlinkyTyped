package typingsSlinky.playcanvas.anon

import typingsSlinky.playcanvas.pc.GamePads
import typingsSlinky.playcanvas.pc.Keyboard
import typingsSlinky.playcanvas.pc.Mouse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gamepads extends StObject {
  
  var gamepads: js.UndefOr[GamePads] = js.native
  
  var keyboard: js.UndefOr[Keyboard] = js.native
  
  var mouse: js.UndefOr[Mouse] = js.native
}
object Gamepads {
  
  @scala.inline
  def apply(): Gamepads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gamepads]
  }
  
  @scala.inline
  implicit class GamepadsMutableBuilder[Self <: Gamepads] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGamepads(value: GamePads): Self = StObject.set(x, "gamepads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamepadsUndefined: Self = StObject.set(x, "gamepads", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Keyboard): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setMouse(value: Mouse): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
  }
}
