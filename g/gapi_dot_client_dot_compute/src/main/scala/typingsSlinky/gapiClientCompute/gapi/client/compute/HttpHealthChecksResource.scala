package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.FieldsHttpHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpHealthChecksResource extends js.Object {
  /** Deletes the specified HttpHealthCheck resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck): Request[Operation] = js.native
  /** Returns the specified HttpHealthCheck resource. Get a list of available HTTP health checks by making a list() request. */
  def get(request: FieldsHttpHealthCheck): Request[HttpHealthCheck] = js.native
  /** Creates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of HttpHealthCheck resources available to the specified project. */
  def list(request: Alt): Request[HttpHealthCheckList] = js.native
  /**
    * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck): Request[Operation] = js.native
  /** Updates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def update(request: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck): Request[Operation] = js.native
}

object HttpHealthChecksResource {
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck => Request[Operation],
    get: FieldsHttpHealthCheck => Request[HttpHealthCheck],
    insert: AltFields => Request[Operation],
    list: Alt => Request[HttpHealthCheckList],
    patch: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck => Request[Operation],
    update: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck => Request[Operation]
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
    def withDelete(value: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: FieldsHttpHealthCheck => Request[HttpHealthCheck]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[HttpHealthCheckList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

