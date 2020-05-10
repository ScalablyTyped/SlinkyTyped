package typingsSlinky.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KiiMqttInstallationResponse extends js.Object {
  var installationID: String = js.native
  var installationRegistrationID: String = js.native
}

object KiiMqttInstallationResponse {
  @scala.inline
  def apply(installationID: String, installationRegistrationID: String): KiiMqttInstallationResponse = {
    val __obj = js.Dynamic.literal(installationID = installationID.asInstanceOf[js.Any], installationRegistrationID = installationRegistrationID.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiMqttInstallationResponse]
  }
  @scala.inline
  implicit class KiiMqttInstallationResponseOps[Self <: KiiMqttInstallationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallationID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationRegistrationID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationRegistrationID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

