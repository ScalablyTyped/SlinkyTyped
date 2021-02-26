package typingsSlinky.paper.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The KeyEvent object is received by the {@link Tool}'s keyboard
  * handlers {@link Tool#onKeyDown}, {@link Tool#onKeyUp}. The KeyEvent object is
  * the only parameter passed to these functions and contains information about
  * the keyboard event.
  */
@js.native
trait KeyEvent extends Event {
  
  /** 
    * The character representation of the key that caused this key event,
    * taking into account the current key-modifiers (e.g. shift, control,
    * caps-lock, etc.)
    */
  var character: String = js.native
  
  /** 
    * The key that caused this key event, either as a lower-case character or
    * special key descriptor.
    */
  var key: String = js.native
  
  /** 
    * The type of mouse event.
    */
  var `type`: String = js.native
}
object KeyEvent {
  
  @scala.inline
  def apply(
    character: String,
    key: String,
    modifiers: js.Any,
    preventDefault: () => Unit,
    stop: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: Double,
    `type`: String
  ): KeyEvent = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stop = js.Any.fromFunction0(stop), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyEvent]
  }
  
  @scala.inline
  implicit class KeyEventMutableBuilder[Self <: KeyEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
