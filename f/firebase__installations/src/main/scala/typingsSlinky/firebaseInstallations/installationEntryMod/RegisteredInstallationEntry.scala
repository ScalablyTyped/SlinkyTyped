package typingsSlinky.firebaseInstallations.installationEntryMod

import typingsSlinky.firebaseInstallations.firebaseInstallationsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisteredInstallationEntry extends InstallationEntry {
  /** Firebase Installation Authentication Token. */
  val authToken: AuthToken = js.native
  /** Firebase Installation ID */
  val fid: String = js.native
  /**
    * Refresh Token returned from the server.
    * Used for authenticating generateAuthToken requests.
    */
  val refreshToken: String = js.native
  /** Status of the Firebase Installation registration on the server. */
  val registrationStatus: `2` = js.native
}

object RegisteredInstallationEntry {
  @scala.inline
  def apply(authToken: AuthToken, fid: String, refreshToken: String, registrationStatus: `2`): RegisteredInstallationEntry = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], fid = fid.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredInstallationEntry]
  }
  @scala.inline
  implicit class RegisteredInstallationEntryOps[Self <: RegisteredInstallationEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthToken(value: AuthToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistrationStatus(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

