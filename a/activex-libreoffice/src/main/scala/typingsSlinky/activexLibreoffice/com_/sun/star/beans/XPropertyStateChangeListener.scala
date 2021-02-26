package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** receives events which get fired whenever the state of a bound property is changed. */
@js.native
trait XPropertyStateChangeListener extends XEventListener {
  
  /**
    * is called when a bound property's state is changed.
    * @param aEvent describes the event source and the property that has changed.
    */
  def propertyStateChange(aEvent: PropertyStateChangeEvent): Unit = js.native
}
object XPropertyStateChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    propertyStateChange: PropertyStateChangeEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertyStateChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), propertyStateChange = js.Any.fromFunction1(propertyStateChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertyStateChangeListener]
  }
  
  @scala.inline
  implicit class XPropertyStateChangeListenerMutableBuilder[Self <: XPropertyStateChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyStateChange(value: PropertyStateChangeEvent => Unit): Self = StObject.set(x, "propertyStateChange", js.Any.fromFunction1(value))
  }
}
