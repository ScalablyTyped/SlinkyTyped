package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltFailoverRatio
import typingsSlinky.maximMazurokGapiClientCompute.anon.FailoverRatio
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrintProjectQuotaUserRegionRequestIdResourceUserIp
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionTargetPool
import typingsSlinky.maximMazurokGapiClientCompute.anon.RequestIdResourceTargetPool
import typingsSlinky.maximMazurokGapiClientCompute.anon.RequestIdTargetPool
import typingsSlinky.maximMazurokGapiClientCompute.anon.ResourceTargetPool
import typingsSlinky.maximMazurokGapiClientCompute.anon.ResourceTargetPoolUserIp
import typingsSlinky.maximMazurokGapiClientCompute.anon.TargetPoolUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPoolsResource extends js.Object {
  
  def addHealthCheck(request: RequestIdTargetPool, body: TargetPoolsAddHealthCheckRequest): Request[Operation] = js.native
  /** Adds health check URLs to a target pool. */
  def addHealthCheck(request: typingsSlinky.maximMazurokGapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  
  def addInstance(request: RequestIdTargetPool, body: TargetPoolsAddInstanceRequest): Request[Operation] = js.native
  /** Adds an instance to a target pool. */
  def addInstance(request: ResourceTargetPool): Request[Operation] = js.native
  
  /** Retrieves an aggregated list of target pools. */
  def aggregatedList(): Request[TargetPoolAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[TargetPoolAggregatedList] = js.native
  
  /** Deletes the specified target pool. */
  def delete(): Request[Operation] = js.native
  def delete(request: RequestIdTargetPool): Request[Operation] = js.native
  
  /** Returns the specified target pool. Gets a list of available target pools by making a list() request. */
  def get(): Request[TargetPool] = js.native
  def get(request: RegionTargetPool): Request[TargetPool] = js.native
  
  def getHealth(request: RegionTargetPool, body: InstanceReference): Request[TargetPoolInstanceHealth] = js.native
  /** Gets the most recent health check results for each IP for the instance that is referenced by the given target pool. */
  def getHealth(request: TargetPoolUserIp): Request[TargetPoolInstanceHealth] = js.native
  
  /** Creates a target pool in the specified project and region using the data included in the request. */
  def insert(request: OauthtokenPrettyPrintProjectQuotaUserRegionRequestIdResourceUserIp): Request[Operation] = js.native
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: TargetPool): Request[Operation] = js.native
  
  /** Retrieves a list of target pools available to the specified project and region. */
  def list(): Request[TargetPoolList] = js.native
  def list(request: Filter): Request[TargetPoolList] = js.native
  
  /** Removes health check URL from a target pool. */
  def removeHealthCheck(request: RequestIdResourceTargetPool): Request[Operation] = js.native
  def removeHealthCheck(request: RequestIdTargetPool, body: TargetPoolsRemoveHealthCheckRequest): Request[Operation] = js.native
  
  def removeInstance(request: RequestIdTargetPool, body: TargetPoolsRemoveInstanceRequest): Request[Operation] = js.native
  /** Removes instance URL from a target pool. */
  def removeInstance(request: ResourceTargetPoolUserIp): Request[Operation] = js.native
  
  def setBackup(request: AltFailoverRatio, body: TargetReference): Request[Operation] = js.native
  /** Changes a backup target pool's configurations. */
  def setBackup(request: FailoverRatio): Request[Operation] = js.native
}
