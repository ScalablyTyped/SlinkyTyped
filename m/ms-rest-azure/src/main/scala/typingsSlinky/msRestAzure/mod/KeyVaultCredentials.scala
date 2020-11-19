package typingsSlinky.msRestAzure.mod

import typingsSlinky.msRest.mod.ServiceCallback
import typingsSlinky.msRest.mod.ServiceClientCredentials
import typingsSlinky.msRest.mod.WebResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "KeyVaultCredentials")
@js.native
class KeyVaultCredentials protected () extends ServiceClientCredentials {
  def this(
    authenticator: js.Function2[/* challenge */ js.Object, /* callback */ js.Any, _],
    credentials: js.Object
  ) = this()
  
  def addChallengeToCache(webResource: WebResource, chalenge: js.Object): Unit = js.native
  
  def createSigningFilter(): js.Function3[
    /* resource */ WebResource, 
    /* next */ js.Function, 
    /* callback */ ServiceCallback[_], 
    _
  ] = js.native
  
  def getCachedChallenge(webResource: WebResource): js.Object = js.native
  
  def handleUnauthorized(
    webResource: WebResource,
    next: js.Function,
    err: js.Error,
    response: js.Object,
    body: js.Any,
    callback: ServiceCallback[_]
  ): js.Any = js.native
}
