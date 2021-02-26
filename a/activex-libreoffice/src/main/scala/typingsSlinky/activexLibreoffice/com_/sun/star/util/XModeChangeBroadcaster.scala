package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts changes in an object's internal mode.
  * @see XModeSelector
  * @see XModeChangeListener
  * @see XModeChangeApproveListener
  * @since OOo 1.1.2
  */
@js.native
trait XModeChangeBroadcaster extends XInterface {
  
  /**
    * adds the given listener to the list of components to be notified when the mode is about to change.
    * @throws com::sun::star::lang::NoSupportException if the component does not allow vetoing mode changes
    */
  def addModeChangeApproveListener(rxListener: XModeChangeApproveListener): Unit = js.native
  
  /** adds the given listener to the list of components to be notified when the mode changes. */
  def addModeChangeListener(rxListener: XModeChangeListener): Unit = js.native
  
  /**
    * remove the given listener from the list of components to be notified when the mode is about to change.
    * @throws com::sun::star::lang::NoSupportException if the component does not allow vetoing mode changes
    */
  def removeModeChangeApproveListener(rxListener: XModeChangeApproveListener): Unit = js.native
  
  /** removes the given listener from the list of components to be notified when the mode changes. */
  def removeModeChangeListener(rxListener: XModeChangeListener): Unit = js.native
}
object XModeChangeBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addModeChangeApproveListener: XModeChangeApproveListener => Unit,
    addModeChangeListener: XModeChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeModeChangeApproveListener: XModeChangeApproveListener => Unit,
    removeModeChangeListener: XModeChangeListener => Unit
  ): XModeChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addModeChangeApproveListener = js.Any.fromFunction1(addModeChangeApproveListener), addModeChangeListener = js.Any.fromFunction1(addModeChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModeChangeApproveListener = js.Any.fromFunction1(removeModeChangeApproveListener), removeModeChangeListener = js.Any.fromFunction1(removeModeChangeListener))
    __obj.asInstanceOf[XModeChangeBroadcaster]
  }
  
  @scala.inline
  implicit class XModeChangeBroadcasterMutableBuilder[Self <: XModeChangeBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddModeChangeApproveListener(value: XModeChangeApproveListener => Unit): Self = StObject.set(x, "addModeChangeApproveListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddModeChangeListener(value: XModeChangeListener => Unit): Self = StObject.set(x, "addModeChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveModeChangeApproveListener(value: XModeChangeApproveListener => Unit): Self = StObject.set(x, "removeModeChangeApproveListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveModeChangeListener(value: XModeChangeListener => Unit): Self = StObject.set(x, "removeModeChangeListener", js.Any.fromFunction1(value))
  }
}
