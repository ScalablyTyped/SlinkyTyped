package typingsSlinky.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.FieldsHl7V2StoreId
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Filter
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Hl7V2StoreId
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Name
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.OauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.OptionsrequestedPolicyVersion
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.Resource
import typingsSlinky.maximMazurokGapiClientHealthcare.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hl7V2StoresResource extends StObject {
  
  def create(request: FieldsHl7V2StoreId, body: Hl7V2Store): Request[Hl7V2Store] = js.native
  /** Creates a new HL7v2 store within the parent dataset. */
  def create(request: Hl7V2StoreId): Request[Hl7V2Store] = js.native
  
  /** Deletes the specified HL7v2 store and removes all messages that it contains. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets the specified HL7v2 store. */
  def get(): Request[Hl7V2Store] = js.native
  def get(request: Name): Request[Hl7V2Store] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /** Lists the HL7v2 stores in the given dataset. */
  def list(): Request[ListHl7V2StoresResponse] = js.native
  def list(request: Filter): Request[ListHl7V2StoresResponse] = js.native
  
  var messages: MessagesResource = js.native
  
  /** Updates the HL7v2 store. */
  def patch(request: OauthtokenPrettyPrint): Request[Hl7V2Store] = js.native
  def patch(request: UpdateMask, body: Hl7V2Store): Request[Hl7V2Store] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Resource, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Resource, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
