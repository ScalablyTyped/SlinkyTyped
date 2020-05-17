package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Ids
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUserProfilesResource extends js.Object {
  /** Gets one account user profile by ID. */
  def get(request: Fields): Request[AccountUserProfile] = js.native
  /** Inserts a new account user profile. */
  def insert(request: Key): Request[AccountUserProfile] = js.native
  /** Retrieves a list of account user profiles, possibly filtered. This method supports paging. */
  def list(request: Ids): Request[AccountUserProfilesListResponse] = js.native
  /** Updates an existing account user profile. This method supports patch semantics. */
  def patch(request: Fields): Request[AccountUserProfile] = js.native
  /** Updates an existing account user profile. */
  def update(request: Key): Request[AccountUserProfile] = js.native
}

object AccountUserProfilesResource {
  @scala.inline
  def apply(
    get: Fields => Request[AccountUserProfile],
    insert: Key => Request[AccountUserProfile],
    list: Ids => Request[AccountUserProfilesListResponse],
    patch: Fields => Request[AccountUserProfile],
    update: Key => Request[AccountUserProfile]
  ): AccountUserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountUserProfilesResource]
  }
  @scala.inline
  implicit class AccountUserProfilesResourceOps[Self <: AccountUserProfilesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Fields => Request[AccountUserProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[AccountUserProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Ids => Request[AccountUserProfilesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[AccountUserProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[AccountUserProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

