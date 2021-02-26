package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** the listener interface for receiving "errorOccured" events posted by any database object. */
@js.native
trait XSQLErrorListener extends XEventListener {
  
  /**
    * invoked when a database error occurs, just before a {@link com.sun.star.sdbc.SQLException} is thrown to the application.
    * @param aEvent the event which occurred
    */
  def errorOccured(aEvent: SQLErrorEvent): Unit = js.native
}
object XSQLErrorListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    errorOccured: SQLErrorEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSQLErrorListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), errorOccured = js.Any.fromFunction1(errorOccured), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSQLErrorListener]
  }
  
  @scala.inline
  implicit class XSQLErrorListenerMutableBuilder[Self <: XSQLErrorListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorOccured(value: SQLErrorEvent => Unit): Self = StObject.set(x, "errorOccured", js.Any.fromFunction1(value))
  }
}
