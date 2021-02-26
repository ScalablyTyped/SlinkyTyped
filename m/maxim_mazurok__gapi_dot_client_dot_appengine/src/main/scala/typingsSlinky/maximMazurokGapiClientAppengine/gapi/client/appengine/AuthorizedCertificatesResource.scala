package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAppengine.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientAppengine.anon.Alt
import typingsSlinky.maximMazurokGapiClientAppengine.anon.AppsId
import typingsSlinky.maximMazurokGapiClientAppengine.anon.AuthorizedCertificatesId
import typingsSlinky.maximMazurokGapiClientAppengine.anon.Callback
import typingsSlinky.maximMazurokGapiClientAppengine.anon.Fields
import typingsSlinky.maximMazurokGapiClientAppengine.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizedCertificatesResource extends StObject {
  
  /** Uploads the specified SSL certificate. */
  def create(request: Accesstoken): Request[AuthorizedCertificate] = js.native
  def create(request: Alt, body: AuthorizedCertificate): Request[AuthorizedCertificate] = js.native
  
  /** Deletes the specified SSL certificate. */
  def delete(): Request[js.Object] = js.native
  def delete(request: AppsId): Request[js.Object] = js.native
  
  /** Gets the specified SSL certificate. */
  def get(): Request[AuthorizedCertificate] = js.native
  def get(request: AuthorizedCertificatesId): Request[AuthorizedCertificate] = js.native
  
  /** Lists all SSL certificates the user is authorized to administer. */
  def list(): Request[ListAuthorizedCertificatesResponse] = js.native
  def list(request: Callback): Request[ListAuthorizedCertificatesResponse] = js.native
  
  /**
    * Updates the specified SSL certificate. To renew a certificate and maintain its existing domain mappings, update certificate_data with a new certificate. The new certificate must be
    * applicable to the same domains as the original certificate. The certificate display_name may also be updated.
    */
  def patch(request: Fields): Request[AuthorizedCertificate] = js.native
  def patch(request: Key, body: AuthorizedCertificate): Request[AuthorizedCertificate] = js.native
}
