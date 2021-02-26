package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies an event from the mouse.
  * @see MouseEvent
  * @since OOo 2.0
  */
@js.native
trait EnhancedMouseEvent extends MouseEvent {
  
  /** contains the object on the location of the mouse. */
  var Target: XInterface = js.native
}
object EnhancedMouseEvent {
  
  @scala.inline
  def apply(
    Buttons: Double,
    ClickCount: Double,
    Modifiers: Double,
    PopupTrigger: Boolean,
    Source: XInterface,
    Target: XInterface,
    X: Double,
    Y: Double
  ): EnhancedMouseEvent = {
    val __obj = js.Dynamic.literal(Buttons = Buttons.asInstanceOf[js.Any], ClickCount = ClickCount.asInstanceOf[js.Any], Modifiers = Modifiers.asInstanceOf[js.Any], PopupTrigger = PopupTrigger.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedMouseEvent]
  }
  
  @scala.inline
  implicit class EnhancedMouseEventMutableBuilder[Self <: EnhancedMouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: XInterface): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
