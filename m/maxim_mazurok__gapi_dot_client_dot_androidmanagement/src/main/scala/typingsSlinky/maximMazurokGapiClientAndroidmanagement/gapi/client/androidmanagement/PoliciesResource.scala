package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.Alt
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientAndroidmanagement.anon.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoliciesResource extends js.Object {
  
  /** Deletes a policy. This operation is only permitted if no devices are currently referencing the policy. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets a policy. */
  def get(): Request[Policy] = js.native
  def get(request: Alt): Request[Policy] = js.native
  
  /** Lists policies for a given enterprise. */
  def list(): Request[ListPoliciesResponse] = js.native
  def list(request: Oauthtoken): Request[ListPoliciesResponse] = js.native
  
  def patch(request: PrettyPrint, body: Policy): Request[Policy] = js.native
  /** Updates or creates a policy. */
  def patch(request: Resource): Request[Policy] = js.native
}
