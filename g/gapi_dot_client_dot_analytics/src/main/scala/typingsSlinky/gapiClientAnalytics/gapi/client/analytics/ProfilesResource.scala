package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAnalytics.anon.PrettyPrint
import typingsSlinky.gapiClientAnalytics.anon.ProfileId
import typingsSlinky.gapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilesResource extends js.Object {
  /** Deletes a view (profile). */
  def delete(request: ProfileId): Request[Unit] = js.native
  /** Gets a view (profile) to which the user has access. */
  def get(request: ProfileId): Request[Profile] = js.native
  /** Create a new view (profile). */
  def insert(request: QuotaUser): Request[Profile] = js.native
  /** Lists views (profiles) to which the user has access. */
  def list(request: PrettyPrint): Request[Profiles] = js.native
  /** Updates an existing view (profile). This method supports patch semantics. */
  def patch(request: ProfileId): Request[Profile] = js.native
  /** Updates an existing view (profile). */
  def update(request: ProfileId): Request[Profile] = js.native
}

object ProfilesResource {
  @scala.inline
  def apply(
    delete: ProfileId => Request[Unit],
    get: ProfileId => Request[Profile],
    insert: QuotaUser => Request[Profile],
    list: PrettyPrint => Request[Profiles],
    patch: ProfileId => Request[Profile],
    update: ProfileId => Request[Profile]
  ): ProfilesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProfilesResource]
  }
  @scala.inline
  implicit class ProfilesResourceOps[Self <: ProfilesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: ProfileId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: ProfileId => Request[Profile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: QuotaUser => Request[Profile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: PrettyPrint => Request[Profiles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: ProfileId => Request[Profile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: ProfileId => Request[Profile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

