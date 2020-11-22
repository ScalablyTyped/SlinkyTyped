package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalOperationsResource extends js.Object {
  
  /** Retrieves an aggregated list of all operations. */
  def aggregatedList(): Request[OperationAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[OperationAggregatedList] = js.native
  
  /** Deletes the specified Operations resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Operation): Request[Unit] = js.native
  
  /** Retrieves the specified Operations resource. Gets a list of operations by making a `list()` request. */
  def get(): Request[Operation] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Operation): Request[Operation] = js.native
  
  /** Retrieves a list of Operation resources contained within the specified project. */
  def list(): Request[OperationList] = js.native
  def list(request: MaxResults): Request[OperationList] = js.native
  
  def wait(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Operation): Request[Operation] = js.native
}
