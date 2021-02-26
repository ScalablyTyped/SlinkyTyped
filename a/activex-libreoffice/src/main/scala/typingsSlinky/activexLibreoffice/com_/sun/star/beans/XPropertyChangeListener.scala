package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to receive PropertyChangeEvents whenever a bound property is changed. */
@js.native
trait XPropertyChangeListener extends XEventListener {
  
  /** is called when a bound property is changed. */
  def propertyChange(evt: PropertyChangeEvent): Unit = js.native
}
object XPropertyChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    propertyChange: PropertyChangeEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertyChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), propertyChange = js.Any.fromFunction1(propertyChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertyChangeListener]
  }
  
  @scala.inline
  implicit class XPropertyChangeListenerMutableBuilder[Self <: XPropertyChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyChange(value: PropertyChangeEvent => Unit): Self = StObject.set(x, "propertyChange", js.Any.fromFunction1(value))
  }
}
