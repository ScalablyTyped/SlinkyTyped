package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAnalytics.anon.FilterId
import typingsSlinky.gapiClientAnalytics.anon.Maxresults
import typingsSlinky.gapiClientAnalytics.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiltersResource extends js.Object {
  /** Delete a filter. */
  def delete(request: FilterId): Request[Filter] = js.native
  /** Returns a filters to which the user has access. */
  def get(request: FilterId): Request[Filter] = js.native
  /** Create a new filter. */
  def insert(request: Oauthtoken): Request[Filter] = js.native
  /** Lists all filters for an account */
  def list(request: Maxresults): Request[Filters] = js.native
  /** Updates an existing filter. This method supports patch semantics. */
  def patch(request: FilterId): Request[Filter] = js.native
  /** Updates an existing filter. */
  def update(request: FilterId): Request[Filter] = js.native
}

object FiltersResource {
  @scala.inline
  def apply(
    delete: FilterId => Request[Filter],
    get: FilterId => Request[Filter],
    insert: Oauthtoken => Request[Filter],
    list: Maxresults => Request[Filters],
    patch: FilterId => Request[Filter],
    update: FilterId => Request[Filter]
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
    def withDelete(value: FilterId => Request[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: FilterId => Request[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Oauthtoken => Request[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Maxresults => Request[Filters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: FilterId => Request[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: FilterId => Request[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

