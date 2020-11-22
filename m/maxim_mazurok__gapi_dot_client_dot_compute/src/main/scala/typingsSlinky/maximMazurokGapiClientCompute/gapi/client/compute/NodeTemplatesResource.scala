package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.KeyNodeTemplate
import typingsSlinky.maximMazurokGapiClientCompute.anon.OptionsRequestedPolicyVersionPrettyPrint
import typingsSlinky.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRegion
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeTemplatesResource extends js.Object {
  
  /** Retrieves an aggregated list of node templates. */
  def aggregatedList(): Request[NodeTemplateAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[NodeTemplateAggregatedList] = js.native
  
  /** Deletes the specified NodeTemplate resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.NodeTemplate): Request[Operation] = js.native
  
  /** Returns the specified node template. Gets a list of available node templates by making a list() request. */
  def get(): Request[NodeTemplate] = js.native
  def get(request: KeyNodeTemplate): Request[NodeTemplate] = js.native
  
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsRequestedPolicyVersionPrettyPrint): Request[Policy] = js.native
  
  /** Creates a NodeTemplate resource in the specified project using the data included in the request. */
  def insert(request: ProjectQuotaUserRegion): Request[Operation] = js.native
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: NodeTemplate): Request[Operation] = js.native
  
  /** Retrieves a list of node templates available to the specified project. */
  def list(): Request[NodeTemplateList] = js.native
  def list(request: Filter): Request[NodeTemplateList] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: RegionResource, body: RegionSetPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: RegionResource, body: TestPermissionsRequest): Request[TestPermissionsResponse] = js.native
}
