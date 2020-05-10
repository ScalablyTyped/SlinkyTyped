package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonPrettyPrint
import typingsSlinky.gapiClientAnalytics.AnonProfileId
import typingsSlinky.gapiClientAnalytics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilesResource extends js.Object {
  /** Deletes a view (profile). */
  def delete(request: AnonProfileId): Request_[Unit] = js.native
  /** Gets a view (profile) to which the user has access. */
  def get(request: AnonProfileId): Request_[Profile] = js.native
  /** Create a new view (profile). */
  def insert(request: AnonQuotaUser): Request_[Profile] = js.native
  /** Lists views (profiles) to which the user has access. */
  def list(request: AnonPrettyPrint): Request_[Profiles] = js.native
  /** Updates an existing view (profile). This method supports patch semantics. */
  def patch(request: AnonProfileId): Request_[Profile] = js.native
  /** Updates an existing view (profile). */
  def update(request: AnonProfileId): Request_[Profile] = js.native
}

object ProfilesResource {
  @scala.inline
  def apply(
    delete: AnonProfileId => Request_[Unit],
    get: AnonProfileId => Request_[Profile],
    insert: AnonQuotaUser => Request_[Profile],
    list: AnonPrettyPrint => Request_[Profiles],
    patch: AnonProfileId => Request_[Profile],
    update: AnonProfileId => Request_[Profile]
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
    def withDelete(value: AnonProfileId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonProfileId => Request_[Profile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[Profile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPrettyPrint => Request_[Profiles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonProfileId => Request_[Profile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonProfileId => Request_[Profile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

