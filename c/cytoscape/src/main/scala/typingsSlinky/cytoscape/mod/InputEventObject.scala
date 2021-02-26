package typingsSlinky.cytoscape.mod

import org.scalajs.dom.raw.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputEventObject extends AbstractEventObject {
  
  /** originalEvent : the original user input device event object */
  var originalEvent: MouseEvent = js.native
  
  /** position : indicates the model position of the event */
  var position: Position = js.native
  
  /** renderedPosition : indicates the rendered position of the event */
  var renderedPosition: Position = js.native
}
object InputEventObject {
  
  @scala.inline
  def apply(
    cy: Core,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    namespace: String,
    originalEvent: MouseEvent,
    position: Position,
    preventDefault: () => Unit,
    renderedPosition: Position,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: js.Any,
    timeStamp: Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
  ): InputEventObject = {
    val __obj = js.Dynamic.literal(cy = cy.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), namespace = namespace.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), renderedPosition = renderedPosition.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEventObject]
  }
  
  @scala.inline
  implicit class InputEventObjectMutableBuilder[Self <: InputEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedPosition(value: Position): Self = StObject.set(x, "renderedPosition", value.asInstanceOf[js.Any])
  }
}
