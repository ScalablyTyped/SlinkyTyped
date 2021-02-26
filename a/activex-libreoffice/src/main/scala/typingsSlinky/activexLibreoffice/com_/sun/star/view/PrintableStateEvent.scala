package typingsSlinky.activexLibreoffice.com_.sun.star.view

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the print progress of an {@link XPrintable} .
  *
  * {@link com.sun.star.lang.EventObject.Source} contains the {@link XPrintable} having changed its state
  *
  * .
  */
@js.native
trait PrintableStateEvent extends EventObject {
  
  var State: PrintableState = js.native
}
object PrintableStateEvent {
  
  @scala.inline
  def apply(Source: XInterface, State: PrintableState): PrintableStateEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintableStateEvent]
  }
  
  @scala.inline
  implicit class PrintableStateEventMutableBuilder[Self <: PrintableStateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: PrintableState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
