package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonFieldsHealthCheck
import typingsSlinky.gapiClientCompute.AnonHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealthChecksResource extends js.Object {
  /** Deletes the specified HealthCheck resource. */
  def delete(request: AnonHealthCheck): Request_[Operation] = js.native
  /** Returns the specified HealthCheck resource. Get a list of available health checks by making a list() request. */
  def get(request: AnonFieldsHealthCheck): Request_[HealthCheck] = js.native
  /** Creates a HealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Retrieves the list of HealthCheck resources available to the specified project. */
  def list(request: AnonAlt): Request_[HealthCheckList] = js.native
  /**
    * Updates a HealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: AnonHealthCheck): Request_[Operation] = js.native
  /** Updates a HealthCheck resource in the specified project using the data included in the request. */
  def update(request: AnonHealthCheck): Request_[Operation] = js.native
}

object HealthChecksResource {
  @scala.inline
  def apply(
    delete: AnonHealthCheck => Request_[Operation],
    get: AnonFieldsHealthCheck => Request_[HealthCheck],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[HealthCheckList],
    patch: AnonHealthCheck => Request_[Operation],
    update: AnonHealthCheck => Request_[Operation]
  ): HealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[HealthChecksResource]
  }
  @scala.inline
  implicit class HealthChecksResourceOps[Self <: HealthChecksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonHealthCheck => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFieldsHealthCheck => Request_[HealthCheck]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[HealthCheckList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonHealthCheck => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonHealthCheck => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

