package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for receiving "rowsChanged" events posted by, for example, a row set. */
@js.native
trait XRowsChangeListener extends XEventListener {
  
  /**
    * is called when rows are inserted, updated, or deleted.
    * @param event contains information about the event
    */
  def rowsChanged(event: RowsChangeEvent): Unit = js.native
}
object XRowsChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    rowsChanged: RowsChangeEvent => Unit
  ): XRowsChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), rowsChanged = js.Any.fromFunction1(rowsChanged))
    __obj.asInstanceOf[XRowsChangeListener]
  }
  
  @scala.inline
  implicit class XRowsChangeListenerMutableBuilder[Self <: XRowsChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowsChanged(value: RowsChangeEvent => Unit): Self = StObject.set(x, "rowsChanged", js.Any.fromFunction1(value))
  }
}
