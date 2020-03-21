package typingsSlinky.msRestAzure.mod

import typingsSlinky.msRest.mod.ServiceClientCredentials
import typingsSlinky.msRest.mod.WebResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure", "ApplicationTokenCredentials")
@js.native
class ApplicationTokenCredentials protected () extends ServiceClientCredentials {
  def this(clientId: String, domain: String, secret: String) = this()
  def this(clientId: String, domain: String, secret: String, options: AzureTokenCredentialsOptions) = this()
  /**
    * Gets the token.
    * @param  {function} callback  The callback in the form (err, result)
    * @return {function} callback
    *                       {Error} [err]  The error if any
    *                       {object} [tokenResponse] The tokenResponse (tokenType and accessToken are the two important properties). 
    */
  def getToken(callback: js.Function2[/* err */ js.Error, /* result */ TokenResponse, Unit]): Unit = js.native
  /**
    * Signs a request with the Authentication header.
    *
    * @param {WebResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    */
  /* CompleteClass */
  override def signRequest(webResource: WebResource, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

