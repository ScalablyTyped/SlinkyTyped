package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardianInvitationsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardiansCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema.UserProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfilesCollection extends js.Object {
  var GuardianInvitations: js.UndefOr[GuardianInvitationsCollection] = js.native
  var Guardians: js.UndefOr[GuardiansCollection] = js.native
  // Returns a user profile.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access
  // this user profile, if no profile exists with the requested ID, or for
  // access errors.
  def get(userId: String): UserProfile = js.native
}

object UserProfilesCollection {
  @scala.inline
  def apply(get: String => UserProfile): UserProfilesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[UserProfilesCollection]
  }
  @scala.inline
  implicit class UserProfilesCollectionOps[Self <: UserProfilesCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: String => UserProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGuardianInvitations(value: GuardianInvitationsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GuardianInvitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardianInvitations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GuardianInvitations")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardians(value: GuardiansCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Guardians")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardians: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Guardians")(js.undefined)
        ret
    }
  }
  
}

