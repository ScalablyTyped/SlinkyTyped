package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to be notified when errors in a database form happen.
  *
  * Each time an exception is triggered by a database form, the error event is posted to the error listeners. This event may be used to configure the
  * error handling of a database form.
  *
  * Please do **not** use anymore, this interface is superseded by {@link com.sun.star.sdb.XSQLErrorListener} .
  * @deprecated Deprecated
  */
@js.native
trait XErrorListener extends XEventListener {
  
  /** is invoked when a database action performed by a database form raises an exception. */
  def errorOccured(aEvent: ErrorEvent): Unit = js.native
}
object XErrorListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    errorOccured: ErrorEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XErrorListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), errorOccured = js.Any.fromFunction1(errorOccured), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XErrorListener]
  }
  
  @scala.inline
  implicit class XErrorListenerMutableBuilder[Self <: XErrorListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorOccured(value: ErrorEvent => Unit): Self = StObject.set(x, "errorOccured", js.Any.fromFunction1(value))
  }
}
