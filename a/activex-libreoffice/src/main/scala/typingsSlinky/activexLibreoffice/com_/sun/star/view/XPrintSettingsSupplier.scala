package typingsSlinky.activexLibreoffice.com_.sun.star.view

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers printing related settings, which affect document rendering, but are not related to the printer itself. */
@js.native
trait XPrintSettingsSupplier extends XInterface {
  /**
    * @returns a set of properties which are related to printing.
    * @see PrintSettings
    */
  val PrintSettings: XPropertySet = js.native
  /**
    * @returns a set of properties which are related to printing.
    * @see PrintSettings
    */
  def getPrintSettings(): XPropertySet = js.native
}

object XPrintSettingsSupplier {
  @scala.inline
  def apply(
    PrintSettings: XPropertySet,
    acquire: () => Unit,
    getPrintSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPrintSettingsSupplier = {
    val __obj = js.Dynamic.literal(PrintSettings = PrintSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPrintSettings = js.Any.fromFunction0(getPrintSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPrintSettingsSupplier]
  }
  @scala.inline
  implicit class XPrintSettingsSupplierOps[Self <: XPrintSettingsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrintSettings(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPrintSettings(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrintSettings")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

