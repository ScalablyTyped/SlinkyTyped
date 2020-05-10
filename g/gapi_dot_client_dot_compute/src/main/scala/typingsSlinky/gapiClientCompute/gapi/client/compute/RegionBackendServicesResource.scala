package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonBackendServiceFields
import typingsSlinky.gapiClientCompute.AnonFilter
import typingsSlinky.gapiClientCompute.AnonPrettyPrint
import typingsSlinky.gapiClientCompute.AnonProjectQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionBackendServicesResource extends js.Object {
  /** Deletes the specified regional BackendService resource. */
  def delete(request: AnonBackendServiceFields): Request_[Operation] = js.native
  /** Returns the specified regional BackendService resource. */
  def get(request: AnonProjectQuotaUser): Request_[BackendService] = js.native
  /** Gets the most recent health check results for this regional BackendService. */
  def getHealth(request: AnonProjectQuotaUser): Request_[BackendServiceGroupHealth] = js.native
  /**
    * Creates a regional BackendService resource in the specified project using the data included in the request. There are several restrictions and
    * guidelines to keep in mind when creating a regional backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: AnonPrettyPrint): Request_[Operation] = js.native
  /** Retrieves the list of regional BackendService resources available to the specified project in the given region. */
  def list(request: AnonFilter): Request_[BackendServiceList] = js.native
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: AnonBackendServiceFields): Request_[Operation] = js.native
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: AnonBackendServiceFields): Request_[Operation] = js.native
}

object RegionBackendServicesResource {
  @scala.inline
  def apply(
    delete: AnonBackendServiceFields => Request_[Operation],
    get: AnonProjectQuotaUser => Request_[BackendService],
    getHealth: AnonProjectQuotaUser => Request_[BackendServiceGroupHealth],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[BackendServiceList],
    patch: AnonBackendServiceFields => Request_[Operation],
    update: AnonBackendServiceFields => Request_[Operation]
  ): RegionBackendServicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RegionBackendServicesResource]
  }
  @scala.inline
  implicit class RegionBackendServicesResourceOps[Self <: RegionBackendServicesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonBackendServiceFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonProjectQuotaUser => Request_[BackendService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHealth(value: AnonProjectQuotaUser => Request_[BackendServiceGroupHealth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHealth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPrettyPrint => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[BackendServiceList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonBackendServiceFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonBackendServiceFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

