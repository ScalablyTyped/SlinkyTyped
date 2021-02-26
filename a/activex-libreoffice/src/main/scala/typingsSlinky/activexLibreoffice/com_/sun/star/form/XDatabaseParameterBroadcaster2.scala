package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the possibility of receiving an event for configuration of parameters.
  *
  * Note that this interface provides exactly the same functionality as the {@link XDatabaseParameterBroadcaster} interface. It exists purely for
  * compatibility with the {@link com.sun.star.script.XEventAttacher.attachSingleEventListener()} : It expects the methods for adding and removing
  * listeners to follow a certain naming scheme, respective to the name of the listener which is being added/removed.
  * @see XDatabaseParameterBroadcaster
  * @see com.sun.star.script.XEventAttacher
  */
@js.native
trait XDatabaseParameterBroadcaster2 extends XDatabaseParameterBroadcaster {
  
  /**
    * registers an {@link XDatabaseParameterListener}
    *
    * This method behaves exactly as the {@link XDatabaseParameterBroadcaster.addParameterListener()} method inherited from the base interface.
    */
  def addDatabaseParameterListener(aListener: XDatabaseParameterListener): Unit = js.native
  
  /**
    * revokes an {@link XDatabaseParameterListener}
    *
    * This method behaves exactly as the {@link XDatabaseParameterBroadcaster.removeParameterListener()} method inherited from the base interface.
    */
  def removeDatabaseParameterListener(aListener: XDatabaseParameterListener): Unit = js.native
}
object XDatabaseParameterBroadcaster2 {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addDatabaseParameterListener: XDatabaseParameterListener => Unit,
    addParameterListener: XDatabaseParameterListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDatabaseParameterListener: XDatabaseParameterListener => Unit,
    removeParameterListener: XDatabaseParameterListener => Unit
  ): XDatabaseParameterBroadcaster2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addDatabaseParameterListener = js.Any.fromFunction1(addDatabaseParameterListener), addParameterListener = js.Any.fromFunction1(addParameterListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDatabaseParameterListener = js.Any.fromFunction1(removeDatabaseParameterListener), removeParameterListener = js.Any.fromFunction1(removeParameterListener))
    __obj.asInstanceOf[XDatabaseParameterBroadcaster2]
  }
  
  @scala.inline
  implicit class XDatabaseParameterBroadcaster2MutableBuilder[Self <: XDatabaseParameterBroadcaster2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDatabaseParameterListener(value: XDatabaseParameterListener => Unit): Self = StObject.set(x, "addDatabaseParameterListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveDatabaseParameterListener(value: XDatabaseParameterListener => Unit): Self = StObject.set(x, "removeDatabaseParameterListener", js.Any.fromFunction1(value))
  }
}
