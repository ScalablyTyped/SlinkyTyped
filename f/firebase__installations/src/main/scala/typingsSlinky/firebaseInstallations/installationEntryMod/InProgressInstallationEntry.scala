package typingsSlinky.firebaseInstallations.installationEntryMod

import typingsSlinky.firebaseInstallations.firebaseInstallationsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InProgressInstallationEntry extends InstallationEntry {
  /** Firebase Installation ID */
  val fid: String = js.native
  /** Status of the Firebase Installation registration on the server. */
  val registrationStatus: `1` = js.native
  /**
    * Unix timestamp that shows the time when the current createInstallation
    * request was initiated.
    * Used for figuring out how long the registration status has been PENDING.
    */
  val registrationTime: Double = js.native
}

object InProgressInstallationEntry {
  @scala.inline
  def apply(fid: String, registrationStatus: `1`, registrationTime: Double): InProgressInstallationEntry = {
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any], registrationTime = registrationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[InProgressInstallationEntry]
  }
  @scala.inline
  implicit class InProgressInstallationEntryOps[Self <: InProgressInstallationEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistrationStatus(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistrationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

