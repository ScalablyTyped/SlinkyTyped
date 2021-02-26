package typingsSlinky.reactTouch.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableProps extends StObject {
  
  var children: DraggableCallback = js.native
  
  /**
    * An object that defines the initial position of the draggable component.
    * You can pass any of the following styles to it
    * and they'll be updated and passed back out in the callback with every animation tick.
    */
  var style: DraggableStyle = js.native
}
object DraggableProps {
  
  @scala.inline
  def apply(children: /* argument */ DraggableCallbackArgument => ReactElement, style: DraggableStyle): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProps]
  }
  
  @scala.inline
  implicit class DraggablePropsMutableBuilder[Self <: DraggableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* argument */ DraggableCallbackArgument => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: DraggableStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
