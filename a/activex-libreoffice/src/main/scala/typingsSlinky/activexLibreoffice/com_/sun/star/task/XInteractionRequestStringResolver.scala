package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.Optional
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Obtains human readable strings from an {@link XInteractionRequest} . */
@js.native
trait XInteractionRequestStringResolver extends XInterface {
  
  /**
    * Obtains a string containing a human readable message from an informational interaction request.
    *
    * An informational interaction request contains not more than one interaction continuation (user has no choice; request is just informational). The
    * supplies continuation must either be a {@link XInteractionAbort} or {@link XInteractionApprove}
    * @param Request the interaction request for that the message shall be obtained.
    * @returns the message string or an empty com::sun::star::beans::Optional.
    */
  def getStringFromInformationalRequest(Request: XInteractionRequest): Optional[String] = js.native
}
object XInteractionRequestStringResolver {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getStringFromInformationalRequest: XInteractionRequest => Optional[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInteractionRequestStringResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getStringFromInformationalRequest = js.Any.fromFunction1(getStringFromInformationalRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInteractionRequestStringResolver]
  }
  
  @scala.inline
  implicit class XInteractionRequestStringResolverMutableBuilder[Self <: XInteractionRequestStringResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStringFromInformationalRequest(value: XInteractionRequest => Optional[String]): Self = StObject.set(x, "getStringFromInformationalRequest", js.Any.fromFunction1(value))
  }
}
