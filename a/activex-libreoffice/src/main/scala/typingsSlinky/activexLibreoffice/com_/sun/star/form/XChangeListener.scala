package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the listener interface for receiving notifications about data changes.
  *
  * The concrete semantics of a change (i.e. the conditions for when a change event is fired) must be specified in the description of the service
  * broadcasting the change.
  * @see XChangeBroadcaster
  */
@js.native
trait XChangeListener extends XEventListener {
  
  /**
    * is invoked when the data of a component has been changed.
    * @param rEvent A descriptor specifying the source of the event.
    */
  def changed(rEvent: EventObject): Unit = js.native
}
object XChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    changed: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), changed = js.Any.fromFunction1(changed), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XChangeListener]
  }
  
  @scala.inline
  implicit class XChangeListenerMutableBuilder[Self <: XChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: EventObject => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction1(value))
  }
}
