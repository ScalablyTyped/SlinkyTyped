package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * additional interfaces for dispatch objects: allow to execute with return value
  * @see XDispatch
  * @since OOo 2.0
  */
@js.native
trait XSynchronousDispatch extends XInterface {
  
  /**
    * dispatches a URL synchronously and offers a return values
    *
    * After getting a dispatch object as a result of a queryDispatch call, this interface can be used to dispatch the URL synchronously and with a return
    * value.
    * @param URL full parsed URL which describe the feature which should be dispatched (executed)
    * @param Arguments optional arguments for this request They depend on the real implementation of the dispatch object.
    */
  def dispatchWithReturnValue(URL: URL, Arguments: SeqEquiv[PropertyValue]): js.Any = js.native
}
object XSynchronousDispatch {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    dispatchWithReturnValue: (URL, SeqEquiv[PropertyValue]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSynchronousDispatch = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dispatchWithReturnValue = js.Any.fromFunction2(dispatchWithReturnValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSynchronousDispatch]
  }
  
  @scala.inline
  implicit class XSynchronousDispatchMutableBuilder[Self <: XSynchronousDispatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispatchWithReturnValue(value: (URL, SeqEquiv[PropertyValue]) => js.Any): Self = StObject.set(x, "dispatchWithReturnValue", js.Any.fromFunction2(value))
  }
}
