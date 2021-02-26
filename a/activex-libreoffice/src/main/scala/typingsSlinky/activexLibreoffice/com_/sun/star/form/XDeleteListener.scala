package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the listener interface for receiving "approveDelete" and "deleted" events posted by a database form.
  *
  * "approveDelete" may be used to abort a deletion of the current data record.
  *
  * Please do **not** use anymore, this interface is superseded by {@link com.sun.star.form.XConfirmDeleteListener} .
  * @deprecated Deprecated
  */
@js.native
trait XDeleteListener extends XEventListener {
  
  /** is invoked when the current record of the database form will be deleted. */
  def approveDelete(aEvent: EventObject): Boolean = js.native
  
  /** is invoked when a database form has finished the delete processing and the data has been successfully deleted from the datasource. */
  def deleted(aEvent: EventObject): Unit = js.native
}
object XDeleteListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveDelete: EventObject => Boolean,
    deleted: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDeleteListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveDelete = js.Any.fromFunction1(approveDelete), deleted = js.Any.fromFunction1(deleted), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDeleteListener]
  }
  
  @scala.inline
  implicit class XDeleteListenerMutableBuilder[Self <: XDeleteListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproveDelete(value: EventObject => Boolean): Self = StObject.set(x, "approveDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleted(value: EventObject => Unit): Self = StObject.set(x, "deleted", js.Any.fromFunction1(value))
  }
}
