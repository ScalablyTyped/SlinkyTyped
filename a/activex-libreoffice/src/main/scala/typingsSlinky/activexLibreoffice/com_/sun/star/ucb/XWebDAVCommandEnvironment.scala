package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.StringPair
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A command environment that can be used to deal with WebDAV/HTTP specific commands. */
@js.native
trait XWebDAVCommandEnvironment extends XCommandEnvironment {
  
  /**
    * This method gets called while assembling an WebDAV/HTTP request. The returned headername-headervalue pairs will be appended to the list of request
    * headers before the request is dispatched.
    * @param aURI The request URI.
    * @param eMethod The WebDAV/HTTP method ("GET","PUT","MKCOL",...) as defined in WebDAVHTTPMethod.
    * @returns A sequence of header name, header value pairs. The header names must be the plain names and contain no trailing ":".
    */
  def getUserRequestHeaders(aURI: String, eMethod: WebDAVHTTPMethod): SafeArray[StringPair] = js.native
}
object XWebDAVCommandEnvironment {
  
  @scala.inline
  def apply(
    InteractionHandler: XInteractionHandler,
    ProgressHandler: XProgressHandler,
    acquire: () => Unit,
    getInteractionHandler: () => XInteractionHandler,
    getProgressHandler: () => XProgressHandler,
    getUserRequestHeaders: (String, WebDAVHTTPMethod) => SafeArray[StringPair],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XWebDAVCommandEnvironment = {
    val __obj = js.Dynamic.literal(InteractionHandler = InteractionHandler.asInstanceOf[js.Any], ProgressHandler = ProgressHandler.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInteractionHandler = js.Any.fromFunction0(getInteractionHandler), getProgressHandler = js.Any.fromFunction0(getProgressHandler), getUserRequestHeaders = js.Any.fromFunction2(getUserRequestHeaders), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XWebDAVCommandEnvironment]
  }
  
  @scala.inline
  implicit class XWebDAVCommandEnvironmentMutableBuilder[Self <: XWebDAVCommandEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetUserRequestHeaders(value: (String, WebDAVHTTPMethod) => SafeArray[StringPair]): Self = StObject.set(x, "getUserRequestHeaders", js.Any.fromFunction2(value))
  }
}
