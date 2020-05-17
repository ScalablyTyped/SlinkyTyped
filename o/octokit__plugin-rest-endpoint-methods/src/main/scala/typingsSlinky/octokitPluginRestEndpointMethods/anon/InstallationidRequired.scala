package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationidRequired extends js.Object {
  var installation_id: Required = js.native
}

object InstallationidRequired {
  @scala.inline
  def apply(installation_id: Required): InstallationidRequired = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationidRequired]
  }
  @scala.inline
  implicit class InstallationidRequiredOps[Self <: InstallationidRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallation_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installation_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

