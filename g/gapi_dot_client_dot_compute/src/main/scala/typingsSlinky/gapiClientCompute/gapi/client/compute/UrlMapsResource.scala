package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.QuotaUserUrlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlMapsResource extends js.Object {
  /** Deletes the specified UrlMap resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.UrlMap): Request[Operation] = js.native
  /** Returns the specified UrlMap resource. Get a list of available URL maps by making a list() request. */
  def get(request: QuotaUserUrlMap): Request[UrlMap] = js.native
  /** Creates a UrlMap resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Initiates a cache invalidation operation, invalidating the specified path, scoped to the specified UrlMap. */
  def invalidateCache(request: typingsSlinky.gapiClientCompute.anon.UrlMap): Request[Operation] = js.native
  /** Retrieves the list of UrlMap resources available to the specified project. */
  def list(request: Alt): Request[UrlMapList] = js.native
  /**
    * Patches the specified UrlMap resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: typingsSlinky.gapiClientCompute.anon.UrlMap): Request[Operation] = js.native
  /** Updates the specified UrlMap resource with the data included in the request. */
  def update(request: typingsSlinky.gapiClientCompute.anon.UrlMap): Request[Operation] = js.native
  /** Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be run. Calling this method does NOT create the UrlMap. */
  def validate(request: QuotaUserUrlMap): Request[UrlMapsValidateResponse] = js.native
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
  @scala.inline
  implicit class UrlMapsResourceOps[Self <: UrlMapsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: typingsSlinky.gapiClientCompute.anon.UrlMap => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: QuotaUserUrlMap => Request[UrlMap]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setInvalidateCache(value: typingsSlinky.gapiClientCompute.anon.UrlMap => Request[Operation]): Self = this.set("invalidateCache", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[UrlMapList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: typingsSlinky.gapiClientCompute.anon.UrlMap => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: typingsSlinky.gapiClientCompute.anon.UrlMap => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setValidate(value: QuotaUserUrlMap => Request[UrlMapsValidateResponse]): Self = this.set("validate", js.Any.fromFunction1(value))
  }
  
}

