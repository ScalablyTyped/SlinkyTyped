package typingsSlinky.activexLibreoffice.com_.sun.star.configuration.backend

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts changes when data from backend sources has changed.
  * @see XBackendChangesListener
  */
@js.native
trait XBackendChangesNotifier extends XInterface {
  
  /**
    * adds the specified listener to receive events when changes occurred.
    * @param aListener specifies the listener object.
    * @param component The name of the component the listener is monitoring changes for.
    */
  def addChangesListener(aListener: XBackendChangesListener, component: String): Unit = js.native
  
  /**
    * removes the specified listener.
    * @param aListener specifies the listener object.
    * @param component The name of the component the listener is monitoring changes for.
    */
  def removeChangesListener(aListener: XBackendChangesListener, component: String): Unit = js.native
}
object XBackendChangesNotifier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addChangesListener: (XBackendChangesListener, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChangesListener: (XBackendChangesListener, String) => Unit
  ): XBackendChangesNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction2(addChangesListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangesListener = js.Any.fromFunction2(removeChangesListener))
    __obj.asInstanceOf[XBackendChangesNotifier]
  }
  
  @scala.inline
  implicit class XBackendChangesNotifierOps[Self <: XBackendChangesNotifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddChangesListener(value: (XBackendChangesListener, String) => Unit): Self = this.set("addChangesListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveChangesListener(value: (XBackendChangesListener, String) => Unit): Self = this.set("removeChangesListener", js.Any.fromFunction2(value))
  }
}
