package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notifications about data being restored.
  *
  * Such a notification is typically sent when the user cancels updating the current record of a database form without saving the data. After restoring,
  * the user operates on the original data.
  *
  * Please do **not** use anymore, this interface is deprecated, and superseded by functionality from the {@link com.sun.star.form.component.DataForm} and
  * {@link com.sun.star.sdb.RowSet} services
  * @deprecated Deprecated
  */
@js.native
trait XRestoreListener extends XEventListener {
  
  /** is invoked when a modified record has been restored */
  def restored(aEvent: EventObject): Unit = js.native
}
object XRestoreListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    restored: EventObject => Unit
  ): XRestoreListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), restored = js.Any.fromFunction1(restored))
    __obj.asInstanceOf[XRestoreListener]
  }
  
  @scala.inline
  implicit class XRestoreListenerOps[Self <: XRestoreListener] (val x: Self) extends AnyVal {
    
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
    def setRestored(value: EventObject => Unit): Self = this.set("restored", js.Any.fromFunction1(value))
  }
}
