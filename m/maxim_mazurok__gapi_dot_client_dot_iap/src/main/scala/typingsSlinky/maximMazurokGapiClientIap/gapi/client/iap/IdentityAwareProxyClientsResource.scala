package typingsSlinky.maximMazurokGapiClientIap.gapi.client.iap

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientIap.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientIap.anon.Alt
import typingsSlinky.maximMazurokGapiClientIap.anon.Callback
import typingsSlinky.maximMazurokGapiClientIap.anon.Fields
import typingsSlinky.maximMazurokGapiClientIap.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityAwareProxyClientsResource extends js.Object {
  
  /** Creates an Identity Aware Proxy (IAP) OAuth client. The client is owned by IAP. Requires that the brand for the project exists and that it is set for internal-only use. */
  def create(request: Accesstoken): Request[IdentityAwareProxyClient] = js.native
  def create(request: Alt, body: IdentityAwareProxyClient): Request[IdentityAwareProxyClient] = js.native
  
  /**
    * Deletes an Identity Aware Proxy (IAP) OAuth client. Useful for removing obsolete clients, managing the number of clients in a given project, and cleaning up after tests. Requires
    * that the client is owned by IAP.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Retrieves an Identity Aware Proxy (IAP) OAuth client. Requires that the client is owned by IAP. */
  def get(): Request[IdentityAwareProxyClient] = js.native
  def get(request: Callback): Request[IdentityAwareProxyClient] = js.native
  
  /** Lists the existing clients for the brand. */
  def list(): Request[ListIdentityAwareProxyClientsResponse] = js.native
  def list(request: Fields): Request[ListIdentityAwareProxyClientsResponse] = js.native
  
  def resetSecret(request: Callback, body: ResetIdentityAwareProxyClientSecretRequest): Request[IdentityAwareProxyClient] = js.native
  /** Resets an Identity Aware Proxy (IAP) OAuth client secret. Useful if the secret was compromised. Requires that the client is owned by IAP. */
  def resetSecret(request: Key): Request[IdentityAwareProxyClient] = js.native
}
