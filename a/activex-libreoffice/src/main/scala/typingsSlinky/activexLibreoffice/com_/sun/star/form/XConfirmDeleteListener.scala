package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.RowChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to register a component for confirming deletions of rows in a {@link com.sun.star.form.component.DataForm} .
  * @see XConfirmDeleteBroadcaster
  */
@js.native
trait XConfirmDeleteListener extends XEventListener {
  
  /**
    * is invoked when the current record of a database form will be deleted.
    * @param aEvent A descriptor specifying the deletion request.
    * @returns `TRUE` when the row can be deleted, otherwise `FALSE` .
    */
  def confirmDelete(aEvent: RowChangeEvent): Boolean = js.native
}
object XConfirmDeleteListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    confirmDelete: RowChangeEvent => Boolean,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConfirmDeleteListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), confirmDelete = js.Any.fromFunction1(confirmDelete), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConfirmDeleteListener]
  }
  
  @scala.inline
  implicit class XConfirmDeleteListenerOps[Self <: XConfirmDeleteListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfirmDelete(value: RowChangeEvent => Boolean): Self = this.set("confirmDelete", js.Any.fromFunction1(value))
  }
}
