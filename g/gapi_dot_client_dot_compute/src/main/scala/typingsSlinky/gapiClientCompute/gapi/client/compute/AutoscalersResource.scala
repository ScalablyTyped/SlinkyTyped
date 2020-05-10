package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAutoscaler
import typingsSlinky.gapiClientCompute.AnonFields
import typingsSlinky.gapiClientCompute.AnonProject
import typingsSlinky.gapiClientCompute.AnonQuotaUser
import typingsSlinky.gapiClientCompute.AnonRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoscalersResource extends js.Object {
  /** Retrieves an aggregated list of autoscalers. */
  def aggregatedList(request: AnonAlt): Request_[AutoscalerAggregatedList] = js.native
  /** Deletes the specified autoscaler. */
  def delete(request: AnonAutoscaler): Request_[Operation] = js.native
  /** Returns the specified autoscaler resource. Get a list of available autoscalers by making a list() request. */
  def get(request: AnonProject): Request_[Autoscaler] = js.native
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: AnonQuotaUser): Request_[Operation] = js.native
  /** Retrieves a list of autoscalers contained within the specified zone. */
  def list(request: AnonFields): Request_[AutoscalerList] = js.native
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: AnonRequestId): Request_[Operation] = js.native
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: AnonRequestId): Request_[Operation] = js.native
}

object AutoscalersResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[AutoscalerAggregatedList],
    delete: AnonAutoscaler => Request_[Operation],
    get: AnonProject => Request_[Autoscaler],
    insert: AnonQuotaUser => Request_[Operation],
    list: AnonFields => Request_[AutoscalerList],
    patch: AnonRequestId => Request_[Operation],
    update: AnonRequestId => Request_[Operation]
  ): AutoscalersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AutoscalersResource]
  }
  @scala.inline
  implicit class AutoscalersResourceOps[Self <: AutoscalersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[AutoscalerAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAutoscaler => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonProject => Request_[Autoscaler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[AutoscalerList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonRequestId => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonRequestId => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

