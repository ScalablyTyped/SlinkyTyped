package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access the {@link FootnoteSettings} with the context (e.g. document). */
@js.native
trait XFootnotesSettingsSupplier extends XInterface {
  
  /** @returns {@link FootnoteSettings} of the object. */
  val FootnotesSettings: XPropertySet = js.native
  
  /** @returns {@link FootnoteSettings} of the object. */
  def getFootnotesSettings(): XPropertySet = js.native
}
object XFootnotesSettingsSupplier {
  
  @scala.inline
  def apply(
    FootnotesSettings: XPropertySet,
    acquire: () => Unit,
    getFootnotesSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFootnotesSettingsSupplier = {
    val __obj = js.Dynamic.literal(FootnotesSettings = FootnotesSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFootnotesSettings = js.Any.fromFunction0(getFootnotesSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFootnotesSettingsSupplier]
  }
  
  @scala.inline
  implicit class XFootnotesSettingsSupplierMutableBuilder[Self <: XFootnotesSettingsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFootnotesSettings(value: XPropertySet): Self = StObject.set(x, "FootnotesSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFootnotesSettings(value: () => XPropertySet): Self = StObject.set(x, "getFootnotesSettings", js.Any.fromFunction0(value))
  }
}
