package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the root event class for all component-level input events.
  *
  * Input events are delivered to listeners before they are processed normally by the source where they originated.
  * @see WindowEvent
  */
@js.native
trait InputEvent extends EventObject {
  
  /**
    * contains the modifier keys which were pressed while the event occurred.
    *
    * Zero or more constants from the {@link com.sun.star.awt.KeyModifier} group.
    */
  var Modifiers: Double = js.native
}
object InputEvent {
  
  @scala.inline
  def apply(Modifiers: Double, Source: XInterface): InputEvent = {
    val __obj = js.Dynamic.literal(Modifiers = Modifiers.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEvent]
  }
  
  @scala.inline
  implicit class InputEventMutableBuilder[Self <: InputEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifiers(value: Double): Self = StObject.set(x, "Modifiers", value.asInstanceOf[js.Any])
  }
}
