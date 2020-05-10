package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonLinkId
import typingsSlinky.gapiClientAnalytics.AnonMaxresults
import typingsSlinky.gapiClientAnalytics.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUserLinksResource extends js.Object {
  /** Removes a user from the given account. */
  def delete(request: AnonLinkId): Request_[Unit] = js.native
  /** Adds a new user to the given account. */
  def insert(request: AnonOauthtoken): Request_[EntityUserLink] = js.native
  /** Lists account-user links for a given account. */
  def list(request: AnonMaxresults): Request_[EntityUserLinks] = js.native
  /** Updates permissions for an existing user on the given account. */
  def update(request: AnonLinkId): Request_[EntityUserLink] = js.native
}

object AccountUserLinksResource {
  @scala.inline
  def apply(
    delete: AnonLinkId => Request_[Unit],
    insert: AnonOauthtoken => Request_[EntityUserLink],
    list: AnonMaxresults => Request_[EntityUserLinks],
    update: AnonLinkId => Request_[EntityUserLink]
  ): AccountUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountUserLinksResource]
  }
  @scala.inline
  implicit class AccountUserLinksResourceOps[Self <: AccountUserLinksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonLinkId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonOauthtoken => Request_[EntityUserLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxresults => Request_[EntityUserLinks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonLinkId => Request_[EntityUserLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

