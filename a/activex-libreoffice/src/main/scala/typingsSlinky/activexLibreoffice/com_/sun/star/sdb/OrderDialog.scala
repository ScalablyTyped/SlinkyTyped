package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface could be incomplete since I derived it from its places of use.
  * @since LibreOffice 4.1
  */
@js.native
trait OrderDialog extends XExecutableDialog {
  
  def createDefault(): Unit = js.native
  
  def createWithQuery(QueryComposer: XSingleSelectQueryComposer, RowSet: XPropertySet): Unit = js.native
}
object OrderDialog {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDefault: () => Unit,
    createWithQuery: (XSingleSelectQueryComposer, XPropertySet) => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): OrderDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDefault = js.Any.fromFunction0(createDefault), createWithQuery = js.Any.fromFunction2(createWithQuery), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[OrderDialog]
  }
  
  @scala.inline
  implicit class OrderDialogMutableBuilder[Self <: OrderDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDefault(value: () => Unit): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateWithQuery(value: (XSingleSelectQueryComposer, XPropertySet) => Unit): Self = StObject.set(x, "createWithQuery", js.Any.fromFunction2(value))
  }
}
