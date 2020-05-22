package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltBackendService
import typingsSlinky.gapiClientCompute.anon.AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServicesResource extends js.Object {
  /** Retrieves the list of all BackendService resources, regional and global, available to the specified project. */
  def aggregatedList(request: Alt): Request[BackendServiceAggregatedList]
  /** Deletes the specified BackendService resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.BackendService): Request[Operation]
  /** Returns the specified BackendService resource. Get a list of available backend services by making a list() request. */
  def get(request: AltBackendService): Request[BackendService]
  /** Gets the most recent health check results for this BackendService. */
  def getHealth(request: AltBackendService): Request[BackendServiceGroupHealth]
  /**
    * Creates a BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to
    * keep in mind when creating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of BackendService resources available to the specified project. */
  def list(request: Alt): Request[BackendServiceList]
  /**
    * Patches the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: typingsSlinky.gapiClientCompute.anon.BackendService): Request[Operation]
  /**
    * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: typingsSlinky.gapiClientCompute.anon.BackendService): Request[Operation]
}

object BackendServicesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[BackendServiceAggregatedList],
    delete: typingsSlinky.gapiClientCompute.anon.BackendService => Request[Operation],
    get: AltBackendService => Request[BackendService],
    getHealth: AltBackendService => Request[BackendServiceGroupHealth],
    insert: AltFields => Request[Operation],
    list: Alt => Request[BackendServiceList],
    patch: typingsSlinky.gapiClientCompute.anon.BackendService => Request[Operation],
    update: typingsSlinky.gapiClientCompute.anon.BackendService => Request[Operation]
  ): BackendServicesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BackendServicesResource]
  }
}

