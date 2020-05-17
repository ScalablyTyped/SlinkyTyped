package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to access the text fields used in this context (e.g. this document).
  * @see com.sun.star.sheet.SpreadsheetDocument
  * @see TextDocument
  */
@js.native
trait XTextFieldsSupplier extends XInterface {
  /** @returns the collection of {@link TextFieldMaster} instances which are defined in this context (i.e. this document). */
  val TextFieldMasters: XNameAccess = js.native
  /** @returns the collection of {@link TextField} instances in this context (i.e. this document). */
  val TextFields: XEnumerationAccess = js.native
  /** @returns the collection of {@link TextFieldMaster} instances which are defined in this context (i.e. this document). */
  def getTextFieldMasters(): XNameAccess = js.native
  /** @returns the collection of {@link TextField} instances in this context (i.e. this document). */
  def getTextFields(): XEnumerationAccess = js.native
}

object XTextFieldsSupplier {
  @scala.inline
  def apply(
    TextFieldMasters: XNameAccess,
    TextFields: XEnumerationAccess,
    acquire: () => Unit,
    getTextFieldMasters: () => XNameAccess,
    getTextFields: () => XEnumerationAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextFieldsSupplier = {
    val __obj = js.Dynamic.literal(TextFieldMasters = TextFieldMasters.asInstanceOf[js.Any], TextFields = TextFields.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTextFieldMasters = js.Any.fromFunction0(getTextFieldMasters), getTextFields = js.Any.fromFunction0(getTextFields), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextFieldsSupplier]
  }
  @scala.inline
  implicit class XTextFieldsSupplierOps[Self <: XTextFieldsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextFieldMasters(value: XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextFieldMasters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextFields(value: XEnumerationAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTextFieldMasters(value: () => XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextFieldMasters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextFields(value: () => XEnumerationAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextFields")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

