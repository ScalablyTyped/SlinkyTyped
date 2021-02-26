package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive events from a layout manager.
  * @see com.sun.star.frame.LayoutManager
  * @since OOo 2.0
  */
@js.native
trait XLayoutManagerEventBroadcaster extends XInterface {
  
  /**
    * adds a layout manager event listener to the object's listener list.
    * @param aLayoutManagerListener a listener that wants to receive events regarding user interface elements that are controlled by a layout manager.
    */
  def addLayoutManagerEventListener(aLayoutManagerListener: XLayoutManagerListener): Unit = js.native
  
  /**
    * removes a layout manager event listener from the object's listener list.
    * @param aLayoutManagerListener a listener that don't want to receive events regarding user interface elements that are controlled by a layout manager.
    */
  def removeLayoutManagerEventListener(aLayoutManagerListener: XLayoutManagerListener): Unit = js.native
}
object XLayoutManagerEventBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addLayoutManagerEventListener: XLayoutManagerListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeLayoutManagerEventListener: XLayoutManagerListener => Unit
  ): XLayoutManagerEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addLayoutManagerEventListener = js.Any.fromFunction1(addLayoutManagerEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLayoutManagerEventListener = js.Any.fromFunction1(removeLayoutManagerEventListener))
    __obj.asInstanceOf[XLayoutManagerEventBroadcaster]
  }
  
  @scala.inline
  implicit class XLayoutManagerEventBroadcasterMutableBuilder[Self <: XLayoutManagerEventBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLayoutManagerEventListener(value: XLayoutManagerListener => Unit): Self = StObject.set(x, "addLayoutManagerEventListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveLayoutManagerEventListener(value: XLayoutManagerListener => Unit): Self = StObject.set(x, "removeLayoutManagerEventListener", js.Any.fromFunction1(value))
  }
}
