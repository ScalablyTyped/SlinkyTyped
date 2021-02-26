package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Reference Resolved Broadcaster.
  *
  * This interface is used to manipulate reference resolved listener.
  */
@js.native
trait XReferenceResolvedBroadcaster extends XInterface {
  
  /**
    * Adds a new reference resolved listener for a element collector.
    *
    * When the element collector has completely collected that element, this listener will receive a notification.
    * @param referenceId the id of the element collector for which the new listener is added
    * @param listener the listener to be added
    */
  def addReferenceResolvedListener(referenceId: Double, listener: XReferenceResolvedListener): Unit = js.native
  
  /**
    * Removes a listener from a element collector.
    *
    * When a listener is removed, it will not receive notification when collection completes.
    * @param referenceId the id of the element collector from which the listener is removed
    * @param listener the listener to be removed
    */
  def removeReferenceResolvedListener(referenceId: Double, listener: XReferenceResolvedListener): Unit = js.native
}
object XReferenceResolvedBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addReferenceResolvedListener: (Double, XReferenceResolvedListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeReferenceResolvedListener: (Double, XReferenceResolvedListener) => Unit
  ): XReferenceResolvedBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addReferenceResolvedListener = js.Any.fromFunction2(addReferenceResolvedListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeReferenceResolvedListener = js.Any.fromFunction2(removeReferenceResolvedListener))
    __obj.asInstanceOf[XReferenceResolvedBroadcaster]
  }
  
  @scala.inline
  implicit class XReferenceResolvedBroadcasterMutableBuilder[Self <: XReferenceResolvedBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddReferenceResolvedListener(value: (Double, XReferenceResolvedListener) => Unit): Self = StObject.set(x, "addReferenceResolvedListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveReferenceResolvedListener(value: (Double, XReferenceResolvedListener) => Unit): Self = StObject.set(x, "removeReferenceResolvedListener", js.Any.fromFunction2(value))
  }
}
