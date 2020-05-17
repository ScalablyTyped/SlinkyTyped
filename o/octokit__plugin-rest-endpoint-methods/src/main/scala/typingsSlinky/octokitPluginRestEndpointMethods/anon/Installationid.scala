package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Installationid extends js.Object {
  var installation_id: Required = js.native
  var repository_id: Required = js.native
}

object Installationid {
  @scala.inline
  def apply(installation_id: Required, repository_id: Required): Installationid = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Installationid]
  }
  @scala.inline
  implicit class InstallationidOps[Self <: Installationid] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withRepository_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

