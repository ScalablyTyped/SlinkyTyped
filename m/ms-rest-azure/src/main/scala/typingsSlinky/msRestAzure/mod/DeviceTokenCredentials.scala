package typingsSlinky.msRestAzure.mod

import typingsSlinky.msRest.mod.ServiceClientCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "DeviceTokenCredentials")
@js.native
class DeviceTokenCredentials () extends ServiceClientCredentials {
  def this(options: DeviceTokenCredentialsOptions) = this()
  
  /**
    * Gets the token from the cache. If the token is expired or about to be expired then it gets the new access token.
    * @param  {function} callback  The callback in the form (err, result)
    * @return {function} callback
    *                       {Error} [err]  The error if any
    *                       {object} [tokenResponse] The tokenResponse (tokenType and accessToken are the two important properties). 
    */
  def getToken(callback: js.Function2[/* err */ js.Error, /* result */ TokenResponse, Unit]): Unit = js.native
}
