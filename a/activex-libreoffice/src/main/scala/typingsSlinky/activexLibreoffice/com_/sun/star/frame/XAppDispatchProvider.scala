package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URL
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.2 */
@js.native
trait XAppDispatchProvider
  extends XDispatchInformationProvider
     with XDispatchProvider
object XAppDispatchProvider {
  
  @scala.inline
  def apply(
    SupportedCommandGroups: SafeArray[Double],
    acquire: () => Unit,
    getConfigurableDispatchInformation: Double => SafeArray[DispatchInformation],
    getSupportedCommandGroups: () => SafeArray[Double],
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAppDispatchProvider = {
    val __obj = js.Dynamic.literal(SupportedCommandGroups = SupportedCommandGroups.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getConfigurableDispatchInformation = js.Any.fromFunction1(getConfigurableDispatchInformation), getSupportedCommandGroups = js.Any.fromFunction0(getSupportedCommandGroups), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAppDispatchProvider]
  }
}
