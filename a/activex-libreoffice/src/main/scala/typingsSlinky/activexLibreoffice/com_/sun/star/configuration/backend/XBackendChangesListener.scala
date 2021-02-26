package typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notification from backend broadcaster objects.
  * @see XBackendChangesNotifier
  */
@js.native
trait XBackendChangesListener extends XEventListener {
  
  /**
    * is invoked when component data in backend source changes
    * @param Event Event indicating the component data change
    */
  def componentDataChanged(Event: ComponentChangeEvent): Unit = js.native
}
object XBackendChangesListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    componentDataChanged: ComponentChangeEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBackendChangesListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), componentDataChanged = js.Any.fromFunction1(componentDataChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBackendChangesListener]
  }
  
  @scala.inline
  implicit class XBackendChangesListenerMutableBuilder[Self <: XBackendChangesListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentDataChanged(value: ComponentChangeEvent => Unit): Self = StObject.set(x, "componentDataChanged", js.Any.fromFunction1(value))
  }
}
