package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdResource
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientCompute.anon.QuotaUserTargetGrpcProxy
import typingsSlinky.maximMazurokGapiClientCompute.anon.ResourceTargetGrpcProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGrpcProxiesResource extends js.Object {
  
  /** Deletes the specified TargetGrpcProxy in the given scope */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetGrpcProxy): Request[Operation] = js.native
  
  /** Returns the specified TargetGrpcProxy resource in the given scope. */
  def get(): Request[TargetGrpcProxy] = js.native
  def get(request: QuotaUserTargetGrpcProxy): Request[TargetGrpcProxy] = js.native
  
  /** Creates a TargetGrpcProxy in the specified project in the given scope using the parameters that are included in the request. */
  def insert(request: AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdResource): Request[Operation] = js.native
  def insert(request: FieldsKey, body: TargetGrpcProxy): Request[Operation] = js.native
  
  /** Lists the TargetGrpcProxies for a project in the given scope. */
  def list(): Request[TargetGrpcProxyList] = js.native
  def list(request: MaxResults): Request[TargetGrpcProxyList] = js.native
  
  /** Patches the specified TargetGrpcProxy resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules. */
  def patch(request: ResourceTargetGrpcProxy): Request[Operation] = js.native
  def patch(request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetGrpcProxy, body: TargetGrpcProxy): Request[Operation] = js.native
}
