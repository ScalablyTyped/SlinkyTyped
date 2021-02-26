package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKeyNetworkEndpointGroupOauthtoken
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.KeyNetworkEndpointGroupOauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRegionRequestIdResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionNetworkEndpointGroupsResource extends StObject {
  
  /** Deletes the specified network endpoint group. Note that the NEG cannot be deleted if it is configured as a backend of a backend service. */
  def delete(): Request[Operation] = js.native
  def delete(request: FieldsKeyNetworkEndpointGroupOauthtoken): Request[Operation] = js.native
  
  /** Returns the specified network endpoint group. Gets a list of available network endpoint groups by making a list() request. */
  def get(): Request[NetworkEndpointGroup] = js.native
  def get(request: KeyNetworkEndpointGroupOauthtokenPrettyPrint): Request[NetworkEndpointGroup] = js.native
  
  /** Creates a network endpoint group in the specified project using the parameters that are included in the request. */
  def insert(request: PrettyPrintProjectQuotaUserRegionRequestIdResource): Request[Operation] = js.native
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: NetworkEndpointGroup): Request[Operation] = js.native
  
  /** Retrieves the list of regional network endpoint groups available to the specified project in the given region. */
  def list(): Request[NetworkEndpointGroupList] = js.native
  def list(request: Filter): Request[NetworkEndpointGroupList] = js.native
}
