package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOperationsResource extends js.Object {
  /** Retrieves an aggregated list of all operations. */
  def aggregatedList(request: Alt): Request[OperationAggregatedList]
  /** Deletes the specified Operations resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.Operation): Request[Unit]
  /** Retrieves the specified Operations resource. Get a list of operations by making a list() request. */
  def get(request: typingsSlinky.gapiClientCompute.anon.Operation): Request[Operation]
  /** Retrieves a list of Operation resources contained within the specified project. */
  def list(request: Alt): Request[OperationList]
}

object GlobalOperationsResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[OperationAggregatedList],
    delete: typingsSlinky.gapiClientCompute.anon.Operation => Request[Unit],
    get: typingsSlinky.gapiClientCompute.anon.Operation => Request[Operation],
    list: Alt => Request[OperationList]
  ): GlobalOperationsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GlobalOperationsResource]
  }
}

