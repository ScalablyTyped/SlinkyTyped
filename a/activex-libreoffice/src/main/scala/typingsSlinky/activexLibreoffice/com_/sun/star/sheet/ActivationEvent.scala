package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a change of the active sheet. The new active sheet is given with this event.
  * @since OOo 2.0
  */
@js.native
trait ActivationEvent extends EventObject {
  
  /** specifies the new active {@link Spreadsheet} . */
  var ActiveSheet: XSpreadsheet = js.native
}
object ActivationEvent {
  
  @scala.inline
  def apply(ActiveSheet: XSpreadsheet, Source: XInterface): ActivationEvent = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationEvent]
  }
  
  @scala.inline
  implicit class ActivationEventMutableBuilder[Self <: ActivationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveSheet(value: XSpreadsheet): Self = StObject.set(x, "ActiveSheet", value.asInstanceOf[js.Any])
  }
}
