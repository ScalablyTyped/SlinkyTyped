package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonKey
import typingsSlinky.gapiClientDfareporting.AnonKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfilesResource extends js.Object {
  /** Gets one user profile by ID. */
  def get(request: AnonKey): Request_[UserProfile] = js.native
  /** Retrieves list of user profiles for a user. */
  def list(request: AnonKeyOauthtoken): Request_[UserProfileList] = js.native
}

object UserProfilesResource {
  @scala.inline
  def apply(get: AnonKey => Request_[UserProfile], list: AnonKeyOauthtoken => Request_[UserProfileList]): UserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserProfilesResource]
  }
  @scala.inline
  implicit class UserProfilesResourceOps[Self <: UserProfilesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonKey => Request_[UserProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKeyOauthtoken => Request_[UserProfileList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

