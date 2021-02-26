package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardEvent extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/keyboard-event
  /**
    * whether an Alt key was used in an accelerator to trigger the Event
    */
  var altKey: js.UndefOr[Boolean] = js.native
  
  /**
    * whether the Control key was used in an accelerator to trigger the Event
    */
  var ctrlKey: js.UndefOr[Boolean] = js.native
  
  /**
    * whether a meta key was used in an accelerator to trigger the Event
    */
  var metaKey: js.UndefOr[Boolean] = js.native
  
  /**
    * whether a Shift key was used in an accelerator to trigger the Event
    */
  var shiftKey: js.UndefOr[Boolean] = js.native
  
  /**
    * whether an accelerator was used to trigger the event as opposed to another user
    * gesture like mouse click
    */
  var triggeredByAccelerator: js.UndefOr[Boolean] = js.native
}
object KeyboardEvent {
  
  @scala.inline
  def apply(): KeyboardEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardEvent]
  }
  
  @scala.inline
  implicit class KeyboardEventMutableBuilder[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    
    @scala.inline
    def setTriggeredByAccelerator(value: Boolean): Self = StObject.set(x, "triggeredByAccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggeredByAcceleratorUndefined: Self = StObject.set(x, "triggeredByAccelerator", js.undefined)
  }
}
