package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the interface for receiving notifications about reset events.
  *
  * The listener is called if a component implementing the {@link XReset} interface performs a reset. ;  Order of events: a reset is triggered on a
  * componentthe component calls XReset::approveReset() on all its listenersif all listeners approve the reset operation, the data is resetthe component
  * calls XReset::resetted() on all its listeners
  * @see XReset
  */
@js.native
trait XResetListener extends XEventListener {
  
  /**
    * is invoked before a component is reset.
    * @param rEvent the event happened.
    * @returns `TRUE` when reset was approved, `FALSE` when the reset operation should be canceled.
    */
  def approveReset(rEvent: EventObject): Boolean = js.native
  
  /**
    * is invoked when a component has been reset.
    * @param rEvent the event happened.
    */
  def resetted(rEvent: EventObject): Unit = js.native
}
object XResetListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveReset: EventObject => Boolean,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resetted: EventObject => Unit
  ): XResetListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveReset = js.Any.fromFunction1(approveReset), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetted = js.Any.fromFunction1(resetted))
    __obj.asInstanceOf[XResetListener]
  }
  
  @scala.inline
  implicit class XResetListenerMutableBuilder[Self <: XResetListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproveReset(value: EventObject => Boolean): Self = StObject.set(x, "approveReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetted(value: EventObject => Unit): Self = StObject.set(x, "resetted", js.Any.fromFunction1(value))
  }
}
