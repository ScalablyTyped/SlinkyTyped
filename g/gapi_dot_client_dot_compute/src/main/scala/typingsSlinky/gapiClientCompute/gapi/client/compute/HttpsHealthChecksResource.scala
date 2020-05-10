package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonFieldsHttpsHealthCheck
import typingsSlinky.gapiClientCompute.AnonHttpsHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpsHealthChecksResource extends js.Object {
  /** Deletes the specified HttpsHealthCheck resource. */
  def delete(request: AnonHttpsHealthCheck): Request_[Operation] = js.native
  /** Returns the specified HttpsHealthCheck resource. Get a list of available HTTPS health checks by making a list() request. */
  def get(request: AnonFieldsHttpsHealthCheck): Request_[HttpsHealthCheck] = js.native
  /** Creates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Retrieves the list of HttpsHealthCheck resources available to the specified project. */
  def list(request: AnonAlt): Request_[HttpsHealthCheckList] = js.native
  /**
    * Updates a HttpsHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: AnonHttpsHealthCheck): Request_[Operation] = js.native
  /** Updates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def update(request: AnonHttpsHealthCheck): Request_[Operation] = js.native
}

object HttpsHealthChecksResource {
  @scala.inline
  def apply(
    delete: AnonHttpsHealthCheck => Request_[Operation],
    get: AnonFieldsHttpsHealthCheck => Request_[HttpsHealthCheck],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[HttpsHealthCheckList],
    patch: AnonHttpsHealthCheck => Request_[Operation],
    update: AnonHttpsHealthCheck => Request_[Operation]
  ): HttpsHealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[HttpsHealthChecksResource]
  }
  @scala.inline
  implicit class HttpsHealthChecksResourceOps[Self <: HttpsHealthChecksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonHttpsHealthCheck => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFieldsHttpsHealthCheck => Request_[HttpsHealthCheck]): Self = {
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
    def withList(value: AnonAlt => Request_[HttpsHealthCheckList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonHttpsHealthCheck => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonHttpsHealthCheck => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

