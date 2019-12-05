package typingsSlinky.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import typingsSlinky.gapiDotClientDotDfareporting.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesResource extends js.Object {
  /** Gets one user profile by ID. */
  def get(request: Anon_AltFieldsKey): Request[UserProfile]
  /** Retrieves list of user profiles for a user. */
  def list(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request[UserProfileList]
}

object UserProfilesResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKey => Request[UserProfile],
    list: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request[UserProfileList]
  ): UserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UserProfilesResource]
  }
}

