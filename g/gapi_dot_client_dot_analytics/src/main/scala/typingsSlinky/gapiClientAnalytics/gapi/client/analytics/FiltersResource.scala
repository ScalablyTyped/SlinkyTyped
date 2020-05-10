package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonFilterId
import typingsSlinky.gapiClientAnalytics.AnonMaxresults
import typingsSlinky.gapiClientAnalytics.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiltersResource extends js.Object {
  /** Delete a filter. */
  def delete(request: AnonFilterId): Request_[Filter] = js.native
  /** Returns a filters to which the user has access. */
  def get(request: AnonFilterId): Request_[Filter] = js.native
  /** Create a new filter. */
  def insert(request: AnonOauthtoken): Request_[Filter] = js.native
  /** Lists all filters for an account */
  def list(request: AnonMaxresults): Request_[Filters] = js.native
  /** Updates an existing filter. This method supports patch semantics. */
  def patch(request: AnonFilterId): Request_[Filter] = js.native
  /** Updates an existing filter. */
  def update(request: AnonFilterId): Request_[Filter] = js.native
}

object FiltersResource {
  @scala.inline
  def apply(
    delete: AnonFilterId => Request_[Filter],
    get: AnonFilterId => Request_[Filter],
    insert: AnonOauthtoken => Request_[Filter],
    list: AnonMaxresults => Request_[Filters],
    patch: AnonFilterId => Request_[Filter],
    update: AnonFilterId => Request_[Filter]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FiltersResource]
  }
  @scala.inline
  implicit class FiltersResourceOps[Self <: FiltersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonFilterId => Request_[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFilterId => Request_[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonOauthtoken => Request_[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxresults => Request_[Filters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFilterId => Request_[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFilterId => Request_[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

