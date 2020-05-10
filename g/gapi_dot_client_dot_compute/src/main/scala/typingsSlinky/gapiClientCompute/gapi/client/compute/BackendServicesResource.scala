package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltBackendService
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonBackendService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendServicesResource extends js.Object {
  /** Retrieves the list of all BackendService resources, regional and global, available to the specified project. */
  def aggregatedList(request: AnonAlt): Request_[BackendServiceAggregatedList] = js.native
  /** Deletes the specified BackendService resource. */
  def delete(request: AnonBackendService): Request_[Operation] = js.native
  /** Returns the specified BackendService resource. Get a list of available backend services by making a list() request. */
  def get(request: AnonAltBackendService): Request_[BackendService] = js.native
  /** Gets the most recent health check results for this BackendService. */
  def getHealth(request: AnonAltBackendService): Request_[BackendServiceGroupHealth] = js.native
  /**
    * Creates a BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to
    * keep in mind when creating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Retrieves the list of BackendService resources available to the specified project. */
  def list(request: AnonAlt): Request_[BackendServiceList] = js.native
  /**
    * Patches the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: AnonBackendService): Request_[Operation] = js.native
  /**
    * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: AnonBackendService): Request_[Operation] = js.native
}

object BackendServicesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[BackendServiceAggregatedList],
    delete: AnonBackendService => Request_[Operation],
    get: AnonAltBackendService => Request_[BackendService],
    getHealth: AnonAltBackendService => Request_[BackendServiceGroupHealth],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[BackendServiceList],
    patch: AnonBackendService => Request_[Operation],
    update: AnonBackendService => Request_[Operation]
  ): BackendServicesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BackendServicesResource]
  }
  @scala.inline
  implicit class BackendServicesResourceOps[Self <: BackendServicesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[BackendServiceAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonBackendService => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAltBackendService => Request_[BackendService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHealth(value: AnonAltBackendService => Request_[BackendServiceGroupHealth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHealth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[BackendServiceList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonBackendService => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonBackendService => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

