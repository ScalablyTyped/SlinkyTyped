package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPartners.AnonFields
import typingsSlinky.gapiClientPartners.AnonKey
import typingsSlinky.gapiClientPartners.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  /** Creates a user's company relation. Affiliates the user to a company. */
  def createCompanyRelation(request: AnonKey): Request_[CompanyRelation] = js.native
  /** Deletes a user's company relation. Unaffiliaites the user from a company. */
  def deleteCompanyRelation(request: AnonKey): Request_[js.Object] = js.native
  /** Gets a user. */
  def get(request: AnonOauthtoken): Request_[User] = js.native
  /**
    * Updates a user's profile. A user can only update their own profile and
    * should only be called within the context of a logged in user.
    */
  def updateProfile(request: AnonFields): Request_[UserProfile] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    createCompanyRelation: AnonKey => Request_[CompanyRelation],
    deleteCompanyRelation: AnonKey => Request_[js.Object],
    get: AnonOauthtoken => Request_[User],
    updateProfile: AnonFields => Request_[UserProfile]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(createCompanyRelation = js.Any.fromFunction1(createCompanyRelation), deleteCompanyRelation = js.Any.fromFunction1(deleteCompanyRelation), get = js.Any.fromFunction1(get), updateProfile = js.Any.fromFunction1(updateProfile))
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateCompanyRelation(value: AnonKey => Request_[CompanyRelation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCompanyRelation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteCompanyRelation(value: AnonKey => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCompanyRelation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[User]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateProfile(value: AnonFields => Request_[UserProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProfile")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

