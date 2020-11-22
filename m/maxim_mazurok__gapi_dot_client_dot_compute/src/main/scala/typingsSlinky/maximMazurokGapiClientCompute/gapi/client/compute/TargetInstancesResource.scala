package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.Fields
import typingsSlinky.maximMazurokGapiClientCompute.anon.PrettyPrintProjectQuotaUserRequestIdResourceUserIpZone
import typingsSlinky.maximMazurokGapiClientCompute.anon.QuotaUserTargetInstance
import typingsSlinky.maximMazurokGapiClientCompute.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetInstancesResource extends js.Object {
  
  /** Retrieves an aggregated list of target instances. */
  def aggregatedList(): Request[TargetInstanceAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[TargetInstanceAggregatedList] = js.native
  
  /** Deletes the specified TargetInstance resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetInstance): Request[Operation] = js.native
  
  /** Returns the specified TargetInstance resource. Gets a list of available target instances by making a list() request. */
  def get(): Request[TargetInstance] = js.native
  def get(request: QuotaUserTargetInstance): Request[TargetInstance] = js.native
  
  /** Creates a TargetInstance resource in the specified project and zone using the data included in the request. */
  def insert(request: PrettyPrintProjectQuotaUserRequestIdResourceUserIpZone): Request[Operation] = js.native
  def insert(request: UserIp, body: TargetInstance): Request[Operation] = js.native
  
  /** Retrieves a list of TargetInstance resources available to the specified project and zone. */
  def list(): Request[TargetInstanceList] = js.native
  def list(request: Fields): Request[TargetInstanceList] = js.native
}
