package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URL
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides {@link XDispatch} objects for certain functions which are useful at the UI
  *
  * Such dispatch objects must be queried explicitly and used for queried purposes only. They can handle requests with guaranteed notifications ( {@link
  * XNotifyingDispatch} ) or with possible (but not guaranteed) notifications ( {@link XDispatch} ).
  * @see XNotifyingDispatch
  * @see XDispatch
  * @see XControlNotificationListener
  */
@js.native
trait DispatchProvider
  extends XDispatchProvider
     with XDispatchProviderInterception
object DispatchProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    registerDispatchProviderInterceptor: XDispatchProviderInterceptor => Unit,
    release: () => Unit,
    releaseDispatchProviderInterceptor: XDispatchProviderInterceptor => Unit
  ): DispatchProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1(registerDispatchProviderInterceptor), release = js.Any.fromFunction0(release), releaseDispatchProviderInterceptor = js.Any.fromFunction1(releaseDispatchProviderInterceptor))
    __obj.asInstanceOf[DispatchProvider]
  }
}
