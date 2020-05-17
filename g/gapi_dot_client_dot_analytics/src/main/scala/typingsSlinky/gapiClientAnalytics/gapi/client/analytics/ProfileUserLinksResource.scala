package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAnalytics.anon.ProfileId
import typingsSlinky.gapiClientAnalytics.anon.Startindex
import typingsSlinky.gapiClientAnalytics.anon.WebPropertyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileUserLinksResource extends js.Object {
  /** Removes a user from the given view (profile). */
  def delete(request: WebPropertyId): Request[Unit] = js.native
  /** Adds a new user to the given view (profile). */
  def insert(request: ProfileId): Request[EntityUserLink] = js.native
  /** Lists profile-user links for a given view (profile). */
  def list(request: Startindex): Request[EntityUserLinks] = js.native
  /** Updates permissions for an existing user on the given view (profile). */
  def update(request: WebPropertyId): Request[EntityUserLink] = js.native
}

object ProfileUserLinksResource {
  @scala.inline
  def apply(
    delete: WebPropertyId => Request[Unit],
    insert: ProfileId => Request[EntityUserLink],
    list: Startindex => Request[EntityUserLinks],
    update: WebPropertyId => Request[EntityUserLink]
  ): ProfileUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProfileUserLinksResource]
  }
  @scala.inline
  implicit class ProfileUserLinksResourceOps[Self <: ProfileUserLinksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: WebPropertyId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: ProfileId => Request[EntityUserLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Startindex => Request[EntityUserLinks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: WebPropertyId => Request[EntityUserLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

