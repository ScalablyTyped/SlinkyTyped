package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltBackendServiceFields
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltBackendServiceFieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.BackendServiceFieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRegion
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionBackendServicesResource extends js.Object {
  
  /** Deletes the specified regional BackendService resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: AltBackendServiceFields): Request[Operation] = js.native
  
  /** Returns the specified regional BackendService resource. */
  def get(): Request[BackendService] = js.native
  def get(request: RegionUserIp): Request[BackendService] = js.native
  
  /** Gets the most recent health check results for this regional BackendService. */
  def getHealth(request: BackendServiceFieldsKey): Request[BackendServiceGroupHealth] = js.native
  def getHealth(request: RegionUserIp, body: ResourceGroupReference): Request[BackendServiceGroupHealth] = js.native
  
  /** Creates a regional BackendService resource in the specified project using the data included in the request. For more information, see  Backend services overview. */
  def insert(request: PrettyPrintProjectQuotaUserRegion): Request[Operation] = js.native
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: BackendService): Request[Operation] = js.native
  
  /** Retrieves the list of regional BackendService resources available to the specified project in the given region. */
  def list(): Request[BackendServiceList] = js.native
  def list(request: Filter): Request[BackendServiceList] = js.native
  
  /**
    * Updates the specified regional BackendService resource with the data included in the request. For more information, see  Understanding backend services This method supports PATCH
    * semantics and uses the JSON merge patch format and processing rules.
    */
  def patch(request: AltBackendServiceFieldsKey): Request[Operation] = js.native
  def patch(request: AltBackendServiceFields, body: BackendService): Request[Operation] = js.native
  
  /** Updates the specified regional BackendService resource with the data included in the request. For more information, see  Backend services overview. */
  def update(request: AltBackendServiceFieldsKey): Request[Operation] = js.native
  def update(request: AltBackendServiceFields, body: BackendService): Request[Operation] = js.native
}
