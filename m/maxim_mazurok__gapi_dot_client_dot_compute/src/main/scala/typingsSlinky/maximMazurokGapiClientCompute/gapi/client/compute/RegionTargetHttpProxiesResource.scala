package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.KeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionTargetHttpProxy
import typingsSlinky.maximMazurokGapiClientCompute.anon.ResourceTargetHttpProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionTargetHttpProxiesResource extends js.Object {
  
  /** Deletes the specified TargetHttpProxy resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetHttpProxy): Request[Operation] = js.native
  
  /** Returns the specified TargetHttpProxy resource in the specified region. Gets a list of available target HTTP proxies by making a list() request. */
  def get(): Request[TargetHttpProxy] = js.native
  def get(request: RegionTargetHttpProxy): Request[TargetHttpProxy] = js.native
  
  /** Creates a TargetHttpProxy resource in the specified project and region using the data included in the request. */
  def insert(request: KeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId): Request[Operation] = js.native
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: TargetHttpProxy): Request[Operation] = js.native
  
  /** Retrieves the list of TargetHttpProxy resources available to the specified project in the specified region. */
  def list(): Request[TargetHttpProxyList] = js.native
  def list(request: Filter): Request[TargetHttpProxyList] = js.native
  
  /** Changes the URL map for TargetHttpProxy. */
  def setUrlMap(request: ResourceTargetHttpProxy): Request[Operation] = js.native
  def setUrlMap(request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetHttpProxy, body: UrlMapReference): Request[Operation] = js.native
}
