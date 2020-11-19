package typingsSlinky.atom.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialKeybindingMatchEvent extends js.Object {
  
  /** DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element = js.native
  
  /** The string of keystrokes that matched the binding. */
  var keystrokes: String = js.native
  
  /** The KeyBindings that the keystrokes partially matched. */
  var partiallyMatchedBindings: js.Array[KeyBinding] = js.native
}
object PartialKeybindingMatchEvent {
  
  @scala.inline
  def apply(keyboardEventTarget: Element, keystrokes: String, partiallyMatchedBindings: js.Array[KeyBinding]): PartialKeybindingMatchEvent = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any], partiallyMatchedBindings = partiallyMatchedBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialKeybindingMatchEvent]
  }
  
  @scala.inline
  implicit class PartialKeybindingMatchEventOps[Self <: PartialKeybindingMatchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyboardEventTarget(value: Element): Self = this.set("keyboardEventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeystrokes(value: String): Self = this.set("keystrokes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartiallyMatchedBindingsVarargs(value: KeyBinding*): Self = this.set("partiallyMatchedBindings", js.Array(value :_*))
    
    @scala.inline
    def setPartiallyMatchedBindings(value: js.Array[KeyBinding]): Self = this.set("partiallyMatchedBindings", value.asInstanceOf[js.Any])
  }
}
