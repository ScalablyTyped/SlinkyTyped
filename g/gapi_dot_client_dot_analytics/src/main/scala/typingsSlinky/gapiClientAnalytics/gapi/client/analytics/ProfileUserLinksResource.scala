package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonProfileId
import typingsSlinky.gapiClientAnalytics.AnonStartindex
import typingsSlinky.gapiClientAnalytics.AnonWebPropertyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileUserLinksResource extends js.Object {
  /** Removes a user from the given view (profile). */
  def delete(request: AnonWebPropertyId): Request_[Unit] = js.native
  /** Adds a new user to the given view (profile). */
  def insert(request: AnonProfileId): Request_[EntityUserLink] = js.native
  /** Lists profile-user links for a given view (profile). */
  def list(request: AnonStartindex): Request_[EntityUserLinks] = js.native
  /** Updates permissions for an existing user on the given view (profile). */
  def update(request: AnonWebPropertyId): Request_[EntityUserLink] = js.native
}

object ProfileUserLinksResource {
  @scala.inline
  def apply(
    delete: AnonWebPropertyId => Request_[Unit],
    insert: AnonProfileId => Request_[EntityUserLink],
    list: AnonStartindex => Request_[EntityUserLinks],
    update: AnonWebPropertyId => Request_[EntityUserLink]
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
    def withDelete(value: AnonWebPropertyId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonProfileId => Request_[EntityUserLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonStartindex => Request_[EntityUserLinks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonWebPropertyId => Request_[EntityUserLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

