package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.OauthtokenOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionOperationsResource extends js.Object {
  
  /** Deletes the specified region-specific Operations resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: OauthtokenOperation): Request[Unit] = js.native
  
  /** Retrieves the specified region-specific Operations resource. */
  def get(): Request[Operation] = js.native
  def get(request: OauthtokenOperation): Request[Operation] = js.native
  
  /** Retrieves a list of Operation resources contained within the specified region. */
  def list(): Request[OperationList] = js.native
  def list(request: Filter): Request[OperationList] = js.native
  
  def wait(request: OauthtokenOperation): Request[Operation] = js.native
}
