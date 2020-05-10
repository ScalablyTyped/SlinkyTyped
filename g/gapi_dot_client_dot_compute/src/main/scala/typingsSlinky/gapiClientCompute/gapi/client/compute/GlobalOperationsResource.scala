package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalOperationsResource extends js.Object {
  /** Retrieves an aggregated list of all operations. */
  def aggregatedList(request: AnonAlt): Request_[OperationAggregatedList] = js.native
  /** Deletes the specified Operations resource. */
  def delete(request: AnonOperation): Request_[Unit] = js.native
  /** Retrieves the specified Operations resource. Get a list of operations by making a list() request. */
  def get(request: AnonOperation): Request_[Operation] = js.native
  /** Retrieves a list of Operation resources contained within the specified project. */
  def list(request: AnonAlt): Request_[OperationList] = js.native
}

object GlobalOperationsResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[OperationAggregatedList],
    delete: AnonOperation => Request_[Unit],
    get: AnonOperation => Request_[Operation],
    list: AnonAlt => Request_[OperationList]
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
    def withAggregatedList(value: AnonAlt => Request_[OperationAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonOperation => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOperation => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[OperationList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

