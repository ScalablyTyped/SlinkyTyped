package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltAutoscaler
import typingsSlinky.maximMazurokGapiClientCompute.anon.AltAutoscalerFields
import typingsSlinky.maximMazurokGapiClientCompute.anon.AutoscalerFields
import typingsSlinky.maximMazurokGapiClientCompute.anon.AutoscalerFieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionRequestIdResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionAutoscalersResource extends js.Object {
  
  /** Deletes the specified autoscaler. */
  def delete(): Request[Operation] = js.native
  def delete(request: AltAutoscaler): Request[Operation] = js.native
  
  /** Returns the specified autoscaler. */
  def get(): Request[Autoscaler] = js.native
  def get(request: AutoscalerFields): Request[Autoscaler] = js.native
  
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: Autoscaler): Request[Operation] = js.native
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: RegionRequestIdResource): Request[Operation] = js.native
  
  /** Retrieves a list of autoscalers contained within the specified region. */
  def list(): Request[RegionAutoscalerList] = js.native
  def list(request: Filter): Request[RegionAutoscalerList] = js.native
  
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    */
  def patch(request: AltAutoscalerFields): Request[Operation] = js.native
  def patch(request: AutoscalerFieldsKey, body: Autoscaler): Request[Operation] = js.native
  
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: AltAutoscalerFields): Request[Operation] = js.native
  def update(request: AutoscalerFieldsKey, body: Autoscaler): Request[Operation] = js.native
}
