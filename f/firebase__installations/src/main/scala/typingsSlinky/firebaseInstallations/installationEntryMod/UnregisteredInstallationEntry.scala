package typingsSlinky.firebaseInstallations.installationEntryMod

import typingsSlinky.firebaseInstallations.firebaseInstallationsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnregisteredInstallationEntry extends InstallationEntry {
  /** Firebase Installation ID */
  val fid: String = js.native
  /** Status of the Firebase Installation registration on the server. */
  val registrationStatus: `0` = js.native
}

object UnregisteredInstallationEntry {
  @scala.inline
  def apply(fid: String, registrationStatus: `0`): UnregisteredInstallationEntry = {
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnregisteredInstallationEntry]
  }
  @scala.inline
  implicit class UnregisteredInstallationEntryOps[Self <: UnregisteredInstallationEntry] (val x: Self) extends AnyVal {
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
    def withRegistrationStatus(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

