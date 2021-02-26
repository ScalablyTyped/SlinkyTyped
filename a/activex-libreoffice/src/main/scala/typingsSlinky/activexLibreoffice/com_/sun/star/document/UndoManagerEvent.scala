package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is an event sent by an {@link XUndoManager} implementation when the Undo/Redo stacks of the manager are modified.
  * @see XUndoManager
  * @see XUndoManagerListener
  * @see XUndoAction
  * @since OOo 3.4
  */
@js.native
trait UndoManagerEvent
  extends typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject {
  
  /**
    * the title of the undo action which is described by the event
    * @see XUndoAction.Title
    */
  var UndoActionTitle: String = js.native
  
  /**
    * denotes the number of Undo contexts which are open, and not yet closed, at the time the event is fired.
    * @see XUndoManager.enterUndoContext
    */
  var UndoContextDepth: Double = js.native
}
object UndoManagerEvent {
  
  @scala.inline
  def apply(Source: XInterface, UndoActionTitle: String, UndoContextDepth: Double): UndoManagerEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], UndoActionTitle = UndoActionTitle.asInstanceOf[js.Any], UndoContextDepth = UndoContextDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoManagerEvent]
  }
  
  @scala.inline
  implicit class UndoManagerEventMutableBuilder[Self <: UndoManagerEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUndoActionTitle(value: String): Self = StObject.set(x, "UndoActionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndoContextDepth(value: Double): Self = StObject.set(x, "UndoContextDepth", value.asInstanceOf[js.Any])
  }
}
