package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKeyNetworkEndpointGroup
import typingsSlinky.maximMazurokGapiClientCompute.anon.KeyNetworkEndpointGroup
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientCompute.anon.NetworkEndpointGroupOauthtoken
import typingsSlinky.maximMazurokGapiClientCompute.anon.OrderBy
import typingsSlinky.maximMazurokGapiClientCompute.anon.QuotaUserRequestIdResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalNetworkEndpointGroupsResource extends js.Object {
  
  def attachNetworkEndpoints(request: KeyNetworkEndpointGroup, body: GlobalNetworkEndpointGroupsAttachEndpointsRequest): Request[Operation] = js.native
  /** Attach a network endpoint to the specified network endpoint group. */
  def attachNetworkEndpoints(request: typingsSlinky.maximMazurokGapiClientCompute.anon.NetworkEndpointGroup): Request[Operation] = js.native
  
  /** Deletes the specified network endpoint group.Note that the NEG cannot be deleted if there are backend services referencing it. */
  def delete(): Request[Operation] = js.native
  def delete(request: KeyNetworkEndpointGroup): Request[Operation] = js.native
  
  def detachNetworkEndpoints(request: KeyNetworkEndpointGroup, body: GlobalNetworkEndpointGroupsDetachEndpointsRequest): Request[Operation] = js.native
  /** Detach the network endpoint from the specified network endpoint group. */
  def detachNetworkEndpoints(request: NetworkEndpointGroupOauthtoken): Request[Operation] = js.native
  
  /** Returns the specified network endpoint group. Gets a list of available network endpoint groups by making a list() request. */
  def get(): Request[NetworkEndpointGroup] = js.native
  def get(request: FieldsKeyNetworkEndpointGroup): Request[NetworkEndpointGroup] = js.native
  
  def insert(request: FieldsKey, body: NetworkEndpointGroup): Request[Operation] = js.native
  /** Creates a network endpoint group in the specified project using the parameters that are included in the request. */
  def insert(request: QuotaUserRequestIdResource): Request[Operation] = js.native
  
  /** Retrieves the list of network endpoint groups that are located in the specified project. */
  def list(): Request[NetworkEndpointGroupList] = js.native
  def list(request: MaxResults): Request[NetworkEndpointGroupList] = js.native
  
  /** Lists the network endpoints in the specified network endpoint group. */
  def listNetworkEndpoints(): Request[NetworkEndpointGroupsListNetworkEndpoints] = js.native
  def listNetworkEndpoints(request: OrderBy): Request[NetworkEndpointGroupsListNetworkEndpoints] = js.native
}
