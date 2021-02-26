package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a notifier for changes of XCommandInfos.
  * @author Kai Sommerfeld
  * @see CommandInfoChangeEvent
  * @see XCommandInfoChangeListener
  * @version 1.0
  */
@js.native
trait XCommandInfoChangeNotifier extends XInterface {
  
  /**
    * registers a listener for CommandInfoChangeEvents.
    * @param Listener the listener to add.
    */
  def addCommandInfoChangeListener(Listener: XCommandInfoChangeListener): Unit = js.native
  
  /**
    * removes a listener for CommandInfoChangeEvents.
    * @param Listener the listener to remove.
    */
  def removeCommandInfoChangeListener(Listener: XCommandInfoChangeListener): Unit = js.native
}
object XCommandInfoChangeNotifier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addCommandInfoChangeListener: XCommandInfoChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCommandInfoChangeListener: XCommandInfoChangeListener => Unit
  ): XCommandInfoChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addCommandInfoChangeListener = js.Any.fromFunction1(addCommandInfoChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCommandInfoChangeListener = js.Any.fromFunction1(removeCommandInfoChangeListener))
    __obj.asInstanceOf[XCommandInfoChangeNotifier]
  }
  
  @scala.inline
  implicit class XCommandInfoChangeNotifierMutableBuilder[Self <: XCommandInfoChangeNotifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCommandInfoChangeListener(value: XCommandInfoChangeListener => Unit): Self = StObject.set(x, "addCommandInfoChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveCommandInfoChangeListener(value: XCommandInfoChangeListener => Unit): Self = StObject.set(x, "removeCommandInfoChangeListener", js.Any.fromFunction1(value))
  }
}
