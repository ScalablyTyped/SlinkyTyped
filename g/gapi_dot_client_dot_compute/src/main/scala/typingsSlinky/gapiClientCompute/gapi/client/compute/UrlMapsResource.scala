package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.QuotaUserUrlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMapsResource extends js.Object {
  /** Deletes the specified UrlMap resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.UrlMap): Request[Operation]
  /** Returns the specified UrlMap resource. Get a list of available URL maps by making a list() request. */
  def get(request: QuotaUserUrlMap): Request[UrlMap]
  /** Creates a UrlMap resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Initiates a cache invalidation operation, invalidating the specified path, scoped to the specified UrlMap. */
  def invalidateCache(request: typingsSlinky.gapiClientCompute.anon.UrlMap): Request[Operation]
  /** Retrieves the list of UrlMap resources available to the specified project. */
  def list(request: Alt): Request[UrlMapList]
  /**
    * Patches the specified UrlMap resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: typingsSlinky.gapiClientCompute.anon.UrlMap): Request[Operation]
  /** Updates the specified UrlMap resource with the data included in the request. */
  def update(request: typingsSlinky.gapiClientCompute.anon.UrlMap): Request[Operation]
  /** Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap. */
  def validate(request: QuotaUserUrlMap): Request[UrlMapsValidateResponse]
}

object UrlMapsResource {
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientCompute.anon.UrlMap => Request[Operation],
    get: QuotaUserUrlMap => Request[UrlMap],
    insert: AltFields => Request[Operation],
    invalidateCache: typingsSlinky.gapiClientCompute.anon.UrlMap => Request[Operation],
    list: Alt => Request[UrlMapList],
    patch: typingsSlinky.gapiClientCompute.anon.UrlMap => Request[Operation],
    update: typingsSlinky.gapiClientCompute.anon.UrlMap => Request[Operation],
    validate: QuotaUserUrlMap => Request[UrlMapsValidateResponse]
  ): UrlMapsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), invalidateCache = js.Any.fromFunction1(invalidateCache), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[UrlMapsResource]
  }
}

