package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.FieldsHttpHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHealthChecksResource extends js.Object {
  /** Deletes the specified HttpHealthCheck resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck): Request[Operation]
  /** Returns the specified HttpHealthCheck resource. Get a list of available HTTP health checks by making a list() request. */
  def get(request: FieldsHttpHealthCheck): Request[HttpHealthCheck]
  /** Creates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of HttpHealthCheck resources available to the specified project. */
  def list(request: Alt): Request[HttpHealthCheckList]
  /**
    * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck): Request[Operation]
  /** Updates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def update(request: typingsSlinky.gapiClientCompute.anon.HttpHealthCheck): Request[Operation]
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
}

