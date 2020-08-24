package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.FieldsHttpsHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpsHealthChecksResource extends js.Object {
  /** Deletes the specified HttpsHealthCheck resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.HttpsHealthCheck): Request[Operation] = js.native
  /** Returns the specified HttpsHealthCheck resource. Get a list of available HTTPS health checks by making a list() request. */
  def get(request: FieldsHttpsHealthCheck): Request[HttpsHealthCheck] = js.native
  /** Creates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of HttpsHealthCheck resources available to the specified project. */
  def list(request: Alt): Request[HttpsHealthCheckList] = js.native
  /**
    * Updates a HttpsHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: typingsSlinky.gapiClientCompute.anon.HttpsHealthCheck): Request[Operation] = js.native
  /** Updates a HttpsHealthCheck resource in the specified project using the data included in the request. */
  def update(request: typingsSlinky.gapiClientCompute.anon.HttpsHealthCheck): Request[Operation] = js.native
}

object HttpsHealthChecksResource {
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientCompute.anon.HttpsHealthCheck => Request[Operation],
    get: FieldsHttpsHealthCheck => Request[HttpsHealthCheck],
    insert: AltFields => Request[Operation],
    list: Alt => Request[HttpsHealthCheckList],
    patch: typingsSlinky.gapiClientCompute.anon.HttpsHealthCheck => Request[Operation],
    update: typingsSlinky.gapiClientCompute.anon.HttpsHealthCheck => Request[Operation]
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: typingsSlinky.gapiClientCompute.anon.HttpsHealthCheck => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: FieldsHttpsHealthCheck => Request[HttpsHealthCheck]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[HttpsHealthCheckList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: typingsSlinky.gapiClientCompute.anon.HttpsHealthCheck => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: typingsSlinky.gapiClientCompute.anon.HttpsHealthCheck => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

