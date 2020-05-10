package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAltAutoscaler
import typingsSlinky.gapiClientCompute.AnonAutoscalerFields
import typingsSlinky.gapiClientCompute.AnonFilter
import typingsSlinky.gapiClientCompute.AnonPrettyPrint
import typingsSlinky.gapiClientCompute.AnonPrettyPrintProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionAutoscalersResource extends js.Object {
  /** Deletes the specified autoscaler. */
  def delete(request: AnonAltAutoscaler): Request_[Operation] = js.native
  /** Returns the specified autoscaler. */
  def get(request: AnonAutoscalerFields): Request_[Autoscaler] = js.native
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation] = js.native
  /** Retrieves a list of autoscalers contained within the specified region. */
  def list(request: AnonFilter): Request_[RegionAutoscalerList] = js.native
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: AnonPrettyPrintProject): Request_[Operation] = js.native
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: AnonPrettyPrintProject): Request_[Operation] = js.native
}

object RegionAutoscalersResource {
  @scala.inline
  def apply(
    delete: AnonAltAutoscaler => Request_[Operation],
    get: AnonAutoscalerFields => Request_[Autoscaler],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[RegionAutoscalerList],
    patch: AnonPrettyPrintProject => Request_[Operation],
    update: AnonPrettyPrintProject => Request_[Operation]
  ): RegionAutoscalersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RegionAutoscalersResource]
  }
  @scala.inline
  implicit class RegionAutoscalersResourceOps[Self <: RegionAutoscalersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAltAutoscaler => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAutoscalerFields => Request_[Autoscaler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPrettyPrint => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[RegionAutoscalerList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonPrettyPrintProject => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonPrettyPrintProject => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

