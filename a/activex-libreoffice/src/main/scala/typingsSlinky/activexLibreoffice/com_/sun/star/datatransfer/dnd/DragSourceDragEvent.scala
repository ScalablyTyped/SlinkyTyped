package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link DragSourceDragEvent} is delivered from an object that implements the {@link XDragSourceContext} to the currently registered drag source
  * listener.
  *
  * It contains state regarding the current state of the operation to enable the operations initiator to provide the end user with the appropriate drag
  * over feedback.
  * @see com.sun.star.datatransfer.dnd.XDragSourceListener
  */
@js.native
trait DragSourceDragEvent extends DragSourceEvent {
  
  /**
    * The drag action selected by the current drop target.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DropAction: Double = js.native
  
  /**
    * The user's currently selected drop action.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var UserAction: Double = js.native
}
object DragSourceDragEvent {
  
  @scala.inline
  def apply(
    DragSource: XDragSource,
    DragSourceContext: XDragSourceContext,
    DropAction: Double,
    Source: XInterface,
    UserAction: Double
  ): DragSourceDragEvent = {
    val __obj = js.Dynamic.literal(DragSource = DragSource.asInstanceOf[js.Any], DragSourceContext = DragSourceContext.asInstanceOf[js.Any], DropAction = DropAction.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], UserAction = UserAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragSourceDragEvent]
  }
  
  @scala.inline
  implicit class DragSourceDragEventMutableBuilder[Self <: DragSourceDragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropAction(value: Double): Self = StObject.set(x, "DropAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAction(value: Double): Self = StObject.set(x, "UserAction", value.asInstanceOf[js.Any])
  }
}
