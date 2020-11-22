package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionTargetVpnGateway
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetVpnGatewaysResource extends js.Object {
  
  /** Retrieves an aggregated list of target VPN gateways. */
  def aggregatedList(): Request[TargetVpnGatewayAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[TargetVpnGatewayAggregatedList] = js.native
  
  /** Deletes the specified target VPN gateway. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetVpnGateway): Request[Operation] = js.native
  
  /** Returns the specified target VPN gateway. Gets a list of available target VPN gateways by making a list() request. */
  def get(): Request[TargetVpnGateway] = js.native
  def get(request: RegionTargetVpnGateway): Request[TargetVpnGateway] = js.native
  
  /** Creates a target VPN gateway in the specified project and region using the data included in the request. */
  def insert(request: AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId): Request[Operation] = js.native
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: TargetVpnGateway): Request[Operation] = js.native
  
  /** Retrieves a list of target VPN gateways available to the specified project and region. */
  def list(): Request[TargetVpnGatewayList] = js.native
  def list(request: Filter): Request[TargetVpnGatewayList] = js.native
}
