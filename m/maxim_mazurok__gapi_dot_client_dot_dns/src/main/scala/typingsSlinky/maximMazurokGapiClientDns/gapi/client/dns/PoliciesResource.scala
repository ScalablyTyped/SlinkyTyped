package typingsSlinky.maximMazurokGapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDns.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientDns.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientDns.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientDns.anon.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoliciesResource extends js.Object {
  
  def create(request: PrettyPrint, body: Policy): Request[Policy] = js.native
  /** Create a new Policy */
  def create(request: QuotaUser): Request[Policy] = js.native
  
  /** Delete a previously created Policy. Will fail if the policy is still being referenced by a network. */
  def delete(): Request[Unit] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientDns.anon.Policy): Request[Unit] = js.native
  
  /** Fetch the representation of an existing Policy. */
  def get(): Request[Policy] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientDns.anon.Policy): Request[Policy] = js.native
  
  /** Enumerate all Policies associated with a project. */
  def list(): Request[PoliciesListResponse] = js.native
  def list(request: MaxResults): Request[PoliciesListResponse] = js.native
  
  def patch(request: typingsSlinky.maximMazurokGapiClientDns.anon.Policy, body: Policy): Request[PoliciesPatchResponse] = js.native
  /** Apply a partial update to an existing Policy. */
  def patch(request: Resource): Request[PoliciesPatchResponse] = js.native
  
  def update(request: typingsSlinky.maximMazurokGapiClientDns.anon.Policy, body: Policy): Request[PoliciesUpdateResponse] = js.native
  /** Update an existing Policy. */
  def update(request: Resource): Request[PoliciesUpdateResponse] = js.native
}
