package typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to notify listeners about dialog-closed events.
  *
  * Registered listeners will be notified with a {@link DialogClosedEvent} when a {@link XAsynchronousExecutableDialog} is closed.
  * @see XAsynchronousExecutableDialog
  * @see DialogClosedEvent
  */
@js.native
trait XDialogClosedListener extends XEventListener {
  
  /**
    * A client receives this event if a dialog is closed.
    * @param aEvent of type {@link DialogClosedEvent} that describes the event
    * @see EndDialogEvent
    */
  def dialogClosed(aEvent: DialogClosedEvent): Unit = js.native
}
object XDialogClosedListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    dialogClosed: DialogClosedEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDialogClosedListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dialogClosed = js.Any.fromFunction1(dialogClosed), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDialogClosedListener]
  }
  
  @scala.inline
  implicit class XDialogClosedListenerMutableBuilder[Self <: XDialogClosedListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialogClosed(value: DialogClosedEvent => Unit): Self = StObject.set(x, "dialogClosed", js.Any.fromFunction1(value))
  }
}
