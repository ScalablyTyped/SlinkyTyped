package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRegionRequestIdResourceUserIp
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionUrlMap
import typingsSlinky.maximMazurokGapiClientCompute.anon.ResourceUrlMap
import typingsSlinky.maximMazurokGapiClientCompute.anon.UrlMapUserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionUrlMapsResource extends StObject {
  
  /** Deletes the specified UrlMap resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.UrlMap): Request[Operation] = js.native
  
  /** Returns the specified UrlMap resource. Gets a list of available URL maps by making a list() request. */
  def get(): Request[UrlMap] = js.native
  def get(request: RegionUrlMap): Request[UrlMap] = js.native
  
  /** Creates a UrlMap resource in the specified project using the data included in the request. */
  def insert(request: PrettyPrintProjectQuotaUserRegionRequestIdResourceUserIp): Request[Operation] = js.native
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: UrlMap): Request[Operation] = js.native
  
  /** Retrieves the list of UrlMap resources available to the specified project in the specified region. */
  def list(): Request[UrlMapList] = js.native
  def list(request: Filter): Request[UrlMapList] = js.native
  
  /** Patches the specified UrlMap resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules. */
  def patch(request: ResourceUrlMap): Request[Operation] = js.native
  def patch(request: typingsSlinky.maximMazurokGapiClientCompute.anon.UrlMap, body: UrlMap): Request[Operation] = js.native
  
  /** Updates the specified UrlMap resource with the data included in the request. */
  def update(request: ResourceUrlMap): Request[Operation] = js.native
  def update(request: typingsSlinky.maximMazurokGapiClientCompute.anon.UrlMap, body: UrlMap): Request[Operation] = js.native
  
  def validate(request: RegionUrlMap, body: RegionUrlMapsValidateRequest): Request[UrlMapsValidateResponse] = js.native
  /** Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap. */
  def validate(request: UrlMapUserIp): Request[UrlMapsValidateResponse] = js.native
}
