package typingsSlinky.maximMazurokGapiClientSasportal.gapi.client.sasportal

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSasportal.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientSasportal.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientSasportal.anon.OauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientSasportal.anon.PrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoliciesResource extends js.Object {
  
  def get(request: CallbackFields, body: SasPortalGetPolicyRequest): Request[SasPortalPolicy] = js.native
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def get(request: KeyOauthtoken): Request[SasPortalPolicy] = js.native
  
  def set(request: CallbackFields, body: SasPortalSetPolicyRequest): Request[SasPortalPolicy] = js.native
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def set(request: OauthtokenPrettyPrint): Request[SasPortalPolicy] = js.native
  
  def test(request: CallbackFields, body: SasPortalTestPermissionsRequest): Request[SasPortalTestPermissionsResponse] = js.native
  /** Returns permissions that a caller has on the specified resource. */
  def test(request: PrettyPrintQuotaUser): Request[SasPortalTestPermissionsResponse] = js.native
}
