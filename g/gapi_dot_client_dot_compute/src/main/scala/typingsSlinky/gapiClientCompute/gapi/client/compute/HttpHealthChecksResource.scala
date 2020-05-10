package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonFieldsHttpHealthCheck
import typingsSlinky.gapiClientCompute.AnonHttpHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpHealthChecksResource extends js.Object {
  /** Deletes the specified HttpHealthCheck resource. */
  def delete(request: AnonHttpHealthCheck): Request_[Operation] = js.native
  /** Returns the specified HttpHealthCheck resource. Get a list of available HTTP health checks by making a list() request. */
  def get(request: AnonFieldsHttpHealthCheck): Request_[HttpHealthCheck] = js.native
  /** Creates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Retrieves the list of HttpHealthCheck resources available to the specified project. */
  def list(request: AnonAlt): Request_[HttpHealthCheckList] = js.native
  /**
    * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: AnonHttpHealthCheck): Request_[Operation] = js.native
  /** Updates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def update(request: AnonHttpHealthCheck): Request_[Operation] = js.native
}

object HttpHealthChecksResource {
  @scala.inline
  def apply(
    delete: AnonHttpHealthCheck => Request_[Operation],
    get: AnonFieldsHttpHealthCheck => Request_[HttpHealthCheck],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[HttpHealthCheckList],
    patch: AnonHttpHealthCheck => Request_[Operation],
    update: AnonHttpHealthCheck => Request_[Operation]
  ): HttpHealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[HttpHealthChecksResource]
  }
  @scala.inline
  implicit class HttpHealthChecksResourceOps[Self <: HttpHealthChecksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonHttpHealthCheck => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFieldsHttpHealthCheck => Request_[HttpHealthCheck]): Self = {
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
    def withList(value: AnonAlt => Request_[HttpHealthCheckList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonHttpHealthCheck => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonHttpHealthCheck => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

