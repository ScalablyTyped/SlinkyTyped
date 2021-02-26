package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrintProjectQuotaUserRegionRequestIdResource
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionTargetHttpsProxy
import typingsSlinky.maximMazurokGapiClientCompute.anon.ResourceTargetHttpsProxy
import typingsSlinky.maximMazurokGapiClientCompute.anon.TargetHttpsProxyUserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionTargetHttpsProxiesResource extends StObject {
  
  /** Deletes the specified TargetHttpsProxy resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetHttpsProxy): Request[Operation] = js.native
  
  /** Returns the specified TargetHttpsProxy resource in the specified region. Gets a list of available target HTTP proxies by making a list() request. */
  def get(): Request[TargetHttpsProxy] = js.native
  def get(request: RegionTargetHttpsProxy): Request[TargetHttpsProxy] = js.native
  
  /** Creates a TargetHttpsProxy resource in the specified project and region using the data included in the request. */
  def insert(request: OauthtokenPrettyPrintProjectQuotaUserRegionRequestIdResource): Request[Operation] = js.native
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: TargetHttpsProxy): Request[Operation] = js.native
  
  /** Retrieves the list of TargetHttpsProxy resources available to the specified project in the specified region. */
  def list(): Request[TargetHttpsProxyList] = js.native
  def list(request: Filter): Request[TargetHttpsProxyList] = js.native
  
  /** Replaces SslCertificates for TargetHttpsProxy. */
  def setSslCertificates(request: ResourceTargetHttpsProxy): Request[Operation] = js.native
  def setSslCertificates(
    request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetHttpsProxy,
    body: RegionTargetHttpsProxiesSetSslCertificatesRequest
  ): Request[Operation] = js.native
  
  /** Changes the URL map for TargetHttpsProxy. */
  def setUrlMap(request: TargetHttpsProxyUserIp): Request[Operation] = js.native
  def setUrlMap(request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetHttpsProxy, body: UrlMapReference): Request[Operation] = js.native
}
