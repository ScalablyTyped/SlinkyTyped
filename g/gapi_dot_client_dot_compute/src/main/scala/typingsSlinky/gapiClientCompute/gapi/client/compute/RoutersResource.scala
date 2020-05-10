package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonFilter
import typingsSlinky.gapiClientCompute.AnonPrettyPrint
import typingsSlinky.gapiClientCompute.AnonRegionRouter
import typingsSlinky.gapiClientCompute.AnonRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutersResource extends js.Object {
  /** Retrieves an aggregated list of routers. */
  def aggregatedList(request: AnonAlt): Request_[RouterAggregatedList] = js.native
  /** Deletes the specified Router resource. */
  def delete(request: AnonRouter): Request_[Operation] = js.native
  /** Returns the specified Router resource. Get a list of available routers by making a list() request. */
  def get(request: AnonRegionRouter): Request_[Router] = js.native
  /** Retrieves runtime information of the specified router. */
  def getRouterStatus(request: AnonRegionRouter): Request_[RouterStatusResponse] = js.native
  /** Creates a Router resource in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation] = js.native
  /** Retrieves a list of Router resources available to the specified project. */
  def list(request: AnonFilter): Request_[RouterList] = js.native
  /**
    * Patches the specified Router resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and
    * processing rules.
    */
  def patch(request: AnonRouter): Request_[Operation] = js.native
  /** Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router. */
  def preview(request: AnonRegionRouter): Request_[RoutersPreviewResponse] = js.native
  /** Updates the specified Router resource with the data included in the request. */
  def update(request: AnonRouter): Request_[Operation] = js.native
}

object RoutersResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[RouterAggregatedList],
    delete: AnonRouter => Request_[Operation],
    get: AnonRegionRouter => Request_[Router],
    getRouterStatus: AnonRegionRouter => Request_[RouterStatusResponse],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[RouterList],
    patch: AnonRouter => Request_[Operation],
    preview: AnonRegionRouter => Request_[RoutersPreviewResponse],
    update: AnonRouter => Request_[Operation]
  ): RoutersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRouterStatus = js.Any.fromFunction1(getRouterStatus), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), preview = js.Any.fromFunction1(preview), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RoutersResource]
  }
  @scala.inline
  implicit class RoutersResourceOps[Self <: RoutersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[RouterAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonRouter => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonRegionRouter => Request_[Router]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRouterStatus(value: AnonRegionRouter => Request_[RouterStatusResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRouterStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPrettyPrint => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[RouterList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonRouter => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreview(value: AnonRegionRouter => Request_[RoutersPreviewResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonRouter => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

