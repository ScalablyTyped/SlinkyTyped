package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltFieldsKeyOauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsInstanceTemplate
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientCompute.anon.OauthtokenOptionsRequestedPolicyVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceTemplatesResource extends StObject {
  
  /**
    * Deletes the specified instance template. Deleting an instance template is permanent and cannot be undone. It is not possible to delete templates that are already in use by a managed
    * instance group.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.InstanceTemplate): Request[Operation] = js.native
  
  /** Returns the specified instance template. Gets a list of available instance templates by making a list() request. */
  def get(): Request[InstanceTemplate] = js.native
  def get(request: FieldsInstanceTemplate): Request[InstanceTemplate] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OauthtokenOptionsRequestedPolicyVersion): Request[Policy] = js.native
  
  /**
    * Creates an instance template in the specified project using the data that is included in the request. If you are creating a new template to update an existing instance group, your
    * new instance template must use the same network or, if applicable, the same subnetwork as the original template.
    */
  def insert(request: AltFieldsKeyOauthtokenPrettyPrint): Request[Operation] = js.native
  def insert(request: FieldsKey, body: InstanceTemplate): Request[Operation] = js.native
  
  /** Retrieves a list of instance templates that are contained within the specified project. */
  def list(): Request[InstanceTemplateList] = js.native
  def list(request: MaxResults): Request[InstanceTemplateList] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: KeyOauthtokenPrettyPrint, body: GlobalSetPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: KeyOauthtokenPrettyPrint, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
