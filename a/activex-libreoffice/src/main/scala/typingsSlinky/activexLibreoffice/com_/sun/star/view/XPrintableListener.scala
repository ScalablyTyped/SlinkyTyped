package typingsSlinky.activexLibreoffice.com_.sun.star.view

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives events about print job progress.
  *
  * {@link XPrintableListener} can be registered to {@link XPrintableBroadcaster} . Then, the client object will receive events about print progress.
  * @see XPrintableBroadcaster
  */
@js.native
trait XPrintableListener extends XEventListener {
  
  /**
    * informs the user of the new state in print progress.
    * @param Event contains the {@link XPrintable} having changed state and the new state.
    */
  def stateChanged(Event: PrintableStateEvent): Unit = js.native
}
object XPrintableListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    stateChanged: PrintableStateEvent => Unit
  ): XPrintableListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stateChanged = js.Any.fromFunction1(stateChanged))
    __obj.asInstanceOf[XPrintableListener]
  }
  
  @scala.inline
  implicit class XPrintableListenerMutableBuilder[Self <: XPrintableListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateChanged(value: PrintableStateEvent => Unit): Self = StObject.set(x, "stateChanged", js.Any.fromFunction1(value))
  }
}
