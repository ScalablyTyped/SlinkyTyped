package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Callback
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.InstanceKey
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientSqladmin.anon.Sha1Fingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslCertsResource extends js.Object {
  
  def createEphemeral(request: Callback, body: SslCertsCreateEphemeralRequest): Request[SslCert] = js.native
  /**
    * Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use the certificate to
    * authenticate as themselves when connecting to the database.
    */
  def createEphemeral(request: InstanceKey): Request[SslCert] = js.native
  
  /** Deletes the SSL certificate. For First Generation instances, the certificate remains valid until the instance is restarted. */
  def delete(): Request[Operation] = js.native
  def delete(request: Sha1Fingerprint): Request[Operation] = js.native
  
  /** Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to initial creation. */
  def get(): Request[SslCert] = js.native
  def get(request: Sha1Fingerprint): Request[SslCert] = js.native
  
  def insert(request: Callback, body: SslCertsInsertRequest): Request[SslCertsInsertResponse] = js.native
  /** Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the instance is restarted. */
  def insert(request: KeyOauthtoken): Request[SslCertsInsertResponse] = js.native
  
  /** Lists all of the current SSL certificates for the instance. */
  def list(): Request[SslCertsListResponse] = js.native
  def list(request: Callback): Request[SslCertsListResponse] = js.native
}
