package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The description of an interaction request. */
@js.native
trait XInteractionRequest extends XInterface {
  
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  val Continuations: SafeArray[XInteractionContinuation] = js.native
  
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  val Request: js.Any = js.native
  
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  def getContinuations(): SafeArray[XInteractionContinuation] = js.native
  
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  def getRequest(): js.Any = js.native
}
object XInteractionRequest {
  
  @scala.inline
  def apply(
    Continuations: SafeArray[XInteractionContinuation],
    Request: js.Any,
    acquire: () => Unit,
    getContinuations: () => SafeArray[XInteractionContinuation],
    getRequest: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInteractionRequest = {
    val __obj = js.Dynamic.literal(Continuations = Continuations.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContinuations = js.Any.fromFunction0(getContinuations), getRequest = js.Any.fromFunction0(getRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInteractionRequest]
  }
  
  @scala.inline
  implicit class XInteractionRequestMutableBuilder[Self <: XInteractionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuations(value: SafeArray[XInteractionContinuation]): Self = StObject.set(x, "Continuations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContinuations(value: () => SafeArray[XInteractionContinuation]): Self = StObject.set(x, "getContinuations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequest(value: () => js.Any): Self = StObject.set(x, "getRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequest(value: js.Any): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
  }
}
