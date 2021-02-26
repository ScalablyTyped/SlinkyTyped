package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * can be implemented to listen and probably veto actions to be performed on components.
  *
  * An example for an action would be the click of a CommandButton.
  * @see XApproveActionBroadcaster
  * @see com.sun.star.form.component.CommandButton
  * @see com.sun.star.form.control.CommandButton
  */
@js.native
trait XApproveActionListener extends XEventListener {
  
  /**
    * is invoked when an action is performed.
    * @param aEvent A descriptor specifying the source of the event.
    * @returns `TRUE` when the action is permitted, otherwise `FALSE` .
    */
  def approveAction(aEvent: EventObject): Boolean = js.native
}
object XApproveActionListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveAction: EventObject => Boolean,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XApproveActionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveAction = js.Any.fromFunction1(approveAction), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XApproveActionListener]
  }
  
  @scala.inline
  implicit class XApproveActionListenerMutableBuilder[Self <: XApproveActionListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproveAction(value: EventObject => Boolean): Self = StObject.set(x, "approveAction", js.Any.fromFunction1(value))
  }
}
