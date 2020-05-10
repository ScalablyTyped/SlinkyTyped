package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClassroom.AnonQuotaUserUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfilesResource extends js.Object {
  var guardianInvitations: GuardianInvitationsResource = js.native
  var guardians: GuardiansResource = js.native
  /**
    * Returns a user profile.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access
    * this user profile, if no profile exists with the requested ID, or for
    * access errors.
    */
  def get(): Request_[UserProfile] = js.native
  def get(request: AnonQuotaUserUploadType): Request_[UserProfile] = js.native
}

