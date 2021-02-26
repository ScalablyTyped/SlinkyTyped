package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XPrintSettingsSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XViewSettingsSupplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a service that provides access to the settings of a text module. */
@js.native
trait GlobalSettings
  extends XPrintSettingsSupplier
     with XViewSettingsSupplier
object GlobalSettings {
  
  @scala.inline
  def apply(
    PrintSettings: XPropertySet,
    ViewSettings: XPropertySet,
    acquire: () => Unit,
    getPrintSettings: () => XPropertySet,
    getViewSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): GlobalSettings = {
    val __obj = js.Dynamic.literal(PrintSettings = PrintSettings.asInstanceOf[js.Any], ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPrintSettings = js.Any.fromFunction0(getPrintSettings), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[GlobalSettings]
  }
}
