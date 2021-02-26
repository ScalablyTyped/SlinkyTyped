package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XEnhancedMouseClickHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to add and remove EnhancedMouseClickHandler
  * @since OOo 2.0
  */
@js.native
trait XEnhancedMouseClickBroadcaster extends XInterface {
  
  /**
    * allows a component supporting the XEnhancedMouseClickHandler interface to register as listener. The component will be notified with a
    * EnhancedMouseEvent every time the mouse is clicked in the spreadsheet
    * @param aListener the component that is to be added as listener
    * @see XEnhancedMouseClickHandler
    * @see EnhancedMouseEvent The interfaces in the EnhancedMouseEvent can be XCell or XShape
    * @see XShape
    * @see XCell
    */
  def addEnhancedMouseClickHandler(aListener: XEnhancedMouseClickHandler): Unit = js.native
  
  /**
    * removes a previously registered listener.
    * @param aListener the component that is to be removed
    */
  def removeEnhancedMouseClickHandler(aListener: XEnhancedMouseClickHandler): Unit = js.native
}
object XEnhancedMouseClickBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEnhancedMouseClickHandler: XEnhancedMouseClickHandler => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEnhancedMouseClickHandler: XEnhancedMouseClickHandler => Unit
  ): XEnhancedMouseClickBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEnhancedMouseClickHandler = js.Any.fromFunction1(addEnhancedMouseClickHandler), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEnhancedMouseClickHandler = js.Any.fromFunction1(removeEnhancedMouseClickHandler))
    __obj.asInstanceOf[XEnhancedMouseClickBroadcaster]
  }
  
  @scala.inline
  implicit class XEnhancedMouseClickBroadcasterMutableBuilder[Self <: XEnhancedMouseClickBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEnhancedMouseClickHandler(value: XEnhancedMouseClickHandler => Unit): Self = StObject.set(x, "addEnhancedMouseClickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEnhancedMouseClickHandler(value: XEnhancedMouseClickHandler => Unit): Self = StObject.set(x, "removeEnhancedMouseClickHandler", js.Any.fromFunction1(value))
  }
}
