package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientCompute.anon.ProjectString
import typingsSlinky.maximMazurokGapiClientCompute.anon.QuotaUserTargetSslProxy
import typingsSlinky.maximMazurokGapiClientCompute.anon.RequestIdResourceTargetSslProxy
import typingsSlinky.maximMazurokGapiClientCompute.anon.ResourceTargetSslProxy
import typingsSlinky.maximMazurokGapiClientCompute.anon.ResourceTargetSslProxyUserIp
import typingsSlinky.maximMazurokGapiClientCompute.anon.TargetSslProxyUserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetSslProxiesResource extends StObject {
  
  /** Deletes the specified TargetSslProxy resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetSslProxy): Request[Operation] = js.native
  
  /** Returns the specified TargetSslProxy resource. Gets a list of available target SSL proxies by making a list() request. */
  def get(): Request[TargetSslProxy] = js.native
  def get(request: QuotaUserTargetSslProxy): Request[TargetSslProxy] = js.native
  
  def insert(request: FieldsKey, body: TargetSslProxy): Request[Operation] = js.native
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: ProjectString): Request[Operation] = js.native
  
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(): Request[TargetSslProxyList] = js.native
  def list(request: MaxResults): Request[TargetSslProxyList] = js.native
  
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: ResourceTargetSslProxy): Request[Operation] = js.native
  def setBackendService(
    request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetSslProxy,
    body: TargetSslProxiesSetBackendServiceRequest
  ): Request[Operation] = js.native
  
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: TargetSslProxyUserIp): Request[Operation] = js.native
  def setProxyHeader(
    request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetSslProxy,
    body: TargetSslProxiesSetProxyHeaderRequest
  ): Request[Operation] = js.native
  
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: RequestIdResourceTargetSslProxy): Request[Operation] = js.native
  def setSslCertificates(
    request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetSslProxy,
    body: TargetSslProxiesSetSslCertificatesRequest
  ): Request[Operation] = js.native
  
  /**
    * Sets the SSL policy for TargetSslProxy. The SSL policy specifies the server-side support for SSL features. This affects connections between clients and the SSL proxy load balancer.
    * They do not affect the connection between the load balancer and the backends.
    */
  def setSslPolicy(request: ResourceTargetSslProxyUserIp): Request[Operation] = js.native
  def setSslPolicy(request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetSslProxy, body: SslPolicyReference): Request[Operation] = js.native
}
