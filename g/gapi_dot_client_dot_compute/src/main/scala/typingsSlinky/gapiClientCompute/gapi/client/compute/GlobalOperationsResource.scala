package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalOperationsResource extends js.Object {
  /** Retrieves an aggregated list of all operations. */
  def aggregatedList(request: Alt): Request[OperationAggregatedList] = js.native
  /** Deletes the specified Operations resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.Operation): Request[Unit] = js.native
  /** Retrieves the specified Operations resource. Get a list of operations by making a list() request. */
  def get(request: typingsSlinky.gapiClientCompute.anon.Operation): Request[Operation] = js.native
  /** Retrieves a list of Operation resources contained within the specified project. */
  def list(request: Alt): Request[OperationList] = js.native
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
  @scala.inline
  implicit class GlobalOperationsResourceOps[Self <: GlobalOperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: Alt => Request[OperationAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: typingsSlinky.gapiClientCompute.anon.Operation => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: typingsSlinky.gapiClientCompute.anon.Operation => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[OperationList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

