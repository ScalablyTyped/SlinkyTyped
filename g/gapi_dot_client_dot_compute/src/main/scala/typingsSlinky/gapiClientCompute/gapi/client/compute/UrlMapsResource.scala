package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonQuotaUserUrlMap
import typingsSlinky.gapiClientCompute.AnonUrlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlMapsResource extends js.Object {
  /** Deletes the specified UrlMap resource. */
  def delete(request: AnonUrlMap): Request_[Operation] = js.native
  /** Returns the specified UrlMap resource. Get a list of available URL maps by making a list() request. */
  def get(request: AnonQuotaUserUrlMap): Request_[UrlMap] = js.native
  /** Creates a UrlMap resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Initiates a cache invalidation operation, invalidating the specified path, scoped to the specified UrlMap. */
  def invalidateCache(request: AnonUrlMap): Request_[Operation] = js.native
  /** Retrieves the list of UrlMap resources available to the specified project. */
  def list(request: AnonAlt): Request_[UrlMapList] = js.native
  /**
    * Patches the specified UrlMap resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: AnonUrlMap): Request_[Operation] = js.native
  /** Updates the specified UrlMap resource with the data included in the request. */
  def update(request: AnonUrlMap): Request_[Operation] = js.native
  /** Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap. */
  def validate(request: AnonQuotaUserUrlMap): Request_[UrlMapsValidateResponse] = js.native
}

object UrlMapsResource {
  @scala.inline
  def apply(
    delete: AnonUrlMap => Request_[Operation],
    get: AnonQuotaUserUrlMap => Request_[UrlMap],
    insert: AnonAltFields => Request_[Operation],
    invalidateCache: AnonUrlMap => Request_[Operation],
    list: AnonAlt => Request_[UrlMapList],
    patch: AnonUrlMap => Request_[Operation],
    update: AnonUrlMap => Request_[Operation],
    validate: AnonQuotaUserUrlMap => Request_[UrlMapsValidateResponse]
  ): UrlMapsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), invalidateCache = js.Any.fromFunction1(invalidateCache), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[UrlMapsResource]
  }
  @scala.inline
  implicit class UrlMapsResourceOps[Self <: UrlMapsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonUrlMap => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonQuotaUserUrlMap => Request_[UrlMap]): Self = {
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
    def withInvalidateCache(value: AnonUrlMap => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateCache")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[UrlMapList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonUrlMap => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonUrlMap => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidate(value: AnonQuotaUserUrlMap => Request_[UrlMapsValidateResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

