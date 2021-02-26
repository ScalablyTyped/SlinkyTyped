package typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyAccess
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service enables a filter developer to register a dialog to query for user options before the filter operation is performed.
  *
  * The user options are stored inside the {@link com.sun.star.document.MediaDescriptor} and can be queried from the {@link
  * com.sun.star.document.MediaDescriptor} by the component that implements {@link com.sun.star.document.XFilter} .
  *
  * The application will set the {@link com.sun.star.document.MediaDescriptor} using the interface {@link com.sun.star.beans.XPropertyAccess} and then
  * call {@link XExecutableDialog.execute()} .
  *
  * If that method returns `ExecutableDialogResults::OK` , the application will retrieve the changed {@link com.sun.star.document.MediaDescriptor} back
  * using the interface {@link com.sun.star.beans.XPropertyAccess} . The filter operation is than continued, using the new {@link
  * com.sun.star.document.MediaDescriptor} .
  *
  * Otherwise, the filter operation is canceled.
  * @since OOo 1.1.2
  */
@js.native
trait FilterOptionsDialog
  extends XPropertyAccess
     with XExecutableDialog
object FilterOptionsDialog {
  
  @scala.inline
  def apply(
    PropertyValues: SafeArray[PropertyValue],
    acquire: () => Unit,
    execute: () => Double,
    getPropertyValues: () => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPropertyValues: SeqEquiv[PropertyValue] => Unit,
    setTitle: String => Unit
  ): FilterOptionsDialog = {
    val __obj = js.Dynamic.literal(PropertyValues = PropertyValues.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), execute = js.Any.fromFunction0(execute), getPropertyValues = js.Any.fromFunction0(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPropertyValues = js.Any.fromFunction1(setPropertyValues), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[FilterOptionsDialog]
  }
}
