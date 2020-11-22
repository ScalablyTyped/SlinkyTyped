package typingsSlinky.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSecretmanager.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientSecretmanager.anon.Callback
import typingsSlinky.maximMazurokGapiClientSecretmanager.anon.Fields
import typingsSlinky.maximMazurokGapiClientSecretmanager.anon.Key
import typingsSlinky.maximMazurokGapiClientSecretmanager.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionsResource extends js.Object {
  
  /** Accesses a SecretVersion. This call returns the secret data. `projects/∗/secrets/∗/versions/latest` is an alias to the `latest` SecretVersion. */
  def access(): Request[AccessSecretVersionResponse] = js.native
  def access(request: Accesstoken): Request[AccessSecretVersionResponse] = js.native
  
  def destroy(request: Accesstoken, body: DestroySecretVersionRequest): Request[SecretVersion] = js.native
  /** Destroys a SecretVersion. Sets the state of the SecretVersion to DESTROYED and irrevocably destroys the secret data. */
  def destroy(request: Callback): Request[SecretVersion] = js.native
  
  def disable(request: Accesstoken, body: DisableSecretVersionRequest): Request[SecretVersion] = js.native
  /** Disables a SecretVersion. Sets the state of the SecretVersion to DISABLED. */
  def disable(request: Fields): Request[SecretVersion] = js.native
  
  def enable(request: Accesstoken, body: EnableSecretVersionRequest): Request[SecretVersion] = js.native
  /** Enables a SecretVersion. Sets the state of the SecretVersion to ENABLED. */
  def enable(request: Key): Request[SecretVersion] = js.native
  
  /** Gets metadata for a SecretVersion. `projects/∗/secrets/∗/versions/latest` is an alias to the `latest` SecretVersion. */
  def get(): Request[SecretVersion] = js.native
  def get(request: Accesstoken): Request[SecretVersion] = js.native
  
  /** Lists SecretVersions. This call does not return secret data. */
  def list(): Request[ListSecretVersionsResponse] = js.native
  def list(request: Oauthtoken): Request[ListSecretVersionsResponse] = js.native
}
