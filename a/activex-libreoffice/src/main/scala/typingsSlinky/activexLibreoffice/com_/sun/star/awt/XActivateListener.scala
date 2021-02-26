package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive activate events.
  * @see XFocusListener
  * @see XTopWindowListener
  */
@js.native
trait XActivateListener extends XEventListener {
  
  /**
    * is invoked when a window is activated.
    *
    * A window is activated if a child or itself got the focus.
    * @see XFocusListener.focusGained
    */
  def windowActivated(e: EventObject): Unit = js.native
  
  /**
    * is invoked when a window is deactivated.
    *
    * A window is deactivated if a child or itself lost the focus.
    * @see XFocusListener.focusLost
    */
  def windowDeactivated(e: EventObject): Unit = js.native
}
object XActivateListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    windowActivated: EventObject => Unit,
    windowDeactivated: EventObject => Unit
  ): XActivateListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), windowActivated = js.Any.fromFunction1(windowActivated), windowDeactivated = js.Any.fromFunction1(windowDeactivated))
    __obj.asInstanceOf[XActivateListener]
  }
  
  @scala.inline
  implicit class XActivateListenerMutableBuilder[Self <: XActivateListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowActivated(value: EventObject => Unit): Self = StObject.set(x, "windowActivated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWindowDeactivated(value: EventObject => Unit): Self = StObject.set(x, "windowDeactivated", js.Any.fromFunction1(value))
  }
}
