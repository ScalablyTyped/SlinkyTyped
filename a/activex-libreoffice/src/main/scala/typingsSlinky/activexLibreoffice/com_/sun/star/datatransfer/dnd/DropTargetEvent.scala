package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class is the base class for {@link DropTargetDragEvent} and {@link DropTargetDropEvent} .
  *
  * To access the {@link XDropTarget} that originated this event, use the {@link com.sun.star.lang.EventObject.Source} member of this object.
  */
@js.native
trait DropTargetEvent extends EventObject {
  
  /** UNO specification does not allow empty struct definitions. */
  var Dummy: Double = js.native
}
object DropTargetEvent {
  
  @scala.inline
  def apply(Dummy: Double, Source: XInterface): DropTargetEvent = {
    val __obj = js.Dynamic.literal(Dummy = Dummy.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetEvent]
  }
  
  @scala.inline
  implicit class DropTargetEventMutableBuilder[Self <: DropTargetEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDummy(value: Double): Self = StObject.set(x, "Dummy", value.asInstanceOf[js.Any])
  }
}
