package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.QuotaUserRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutesResource extends js.Object {
  /** Deletes the specified Route resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.Route): Request[Operation]
  /** Returns the specified Route resource. Get a list of available routes by making a list() request. */
  def get(request: QuotaUserRoute): Request[Route]
  /** Creates a Route resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of Route resources available to the specified project. */
  def list(request: Alt): Request[RouteList]
}

object RoutesResource {
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientCompute.anon.Route => Request[Operation],
    get: QuotaUserRoute => Request[Route],
    insert: AltFields => Request[Operation],
    list: Alt => Request[RouteList]
  ): RoutesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RoutesResource]
  }
}

