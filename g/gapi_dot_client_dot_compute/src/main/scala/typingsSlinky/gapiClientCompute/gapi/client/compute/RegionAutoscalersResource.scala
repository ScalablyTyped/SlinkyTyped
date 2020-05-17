package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.AltAutoscaler
import typingsSlinky.gapiClientCompute.anon.AutoscalerFields
import typingsSlinky.gapiClientCompute.anon.Filter
import typingsSlinky.gapiClientCompute.anon.PrettyPrint
import typingsSlinky.gapiClientCompute.anon.PrettyPrintProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionAutoscalersResource extends js.Object {
  /** Deletes the specified autoscaler. */
  def delete(request: AltAutoscaler): Request[Operation] = js.native
  /** Returns the specified autoscaler. */
  def get(request: AutoscalerFields): Request[Autoscaler] = js.native
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of autoscalers contained within the specified region. */
  def list(request: Filter): Request[RegionAutoscalerList] = js.native
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: PrettyPrintProject): Request[Operation] = js.native
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: PrettyPrintProject): Request[Operation] = js.native
}

object RegionAutoscalersResource {
  @scala.inline
  def apply(
    delete: AltAutoscaler => Request[Operation],
    get: AutoscalerFields => Request[Autoscaler],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[RegionAutoscalerList],
    patch: PrettyPrintProject => Request[Operation],
    update: PrettyPrintProject => Request[Operation]
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
    def withDelete(value: AltAutoscaler => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AutoscalerFields => Request[Autoscaler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: PrettyPrint => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Filter => Request[RegionAutoscalerList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: PrettyPrintProject => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: PrettyPrintProject => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

