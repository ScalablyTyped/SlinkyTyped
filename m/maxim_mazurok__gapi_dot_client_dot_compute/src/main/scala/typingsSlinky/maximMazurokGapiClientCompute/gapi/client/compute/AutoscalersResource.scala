package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.Fields
import typingsSlinky.maximMazurokGapiClientCompute.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientCompute.anon.RequestId
import typingsSlinky.maximMazurokGapiClientCompute.anon.Resource
import typingsSlinky.maximMazurokGapiClientCompute.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscalersResource extends js.Object {
  
  /** Retrieves an aggregated list of autoscalers. */
  def aggregatedList(): Request[AutoscalerAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[AutoscalerAggregatedList] = js.native
  
  /** Deletes the specified autoscaler. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Autoscaler): Request[Operation] = js.native
  
  /** Returns the specified autoscaler resource. Gets a list of available autoscalers by making a list() request. */
  def get(): Request[Autoscaler] = js.native
  def get(request: QuotaUser): Request[Autoscaler] = js.native
  
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: RequestId): Request[Operation] = js.native
  def insert(request: UserIp, body: Autoscaler): Request[Operation] = js.native
  
  /** Retrieves a list of autoscalers contained within the specified zone. */
  def list(): Request[AutoscalerList] = js.native
  def list(request: Fields): Request[AutoscalerList] = js.native
  
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    */
  def patch(request: Resource): Request[Operation] = js.native
  def patch(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Zone, body: Autoscaler): Request[Operation] = js.native
  
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: Resource): Request[Operation] = js.native
  def update(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Zone, body: Autoscaler): Request[Operation] = js.native
}
