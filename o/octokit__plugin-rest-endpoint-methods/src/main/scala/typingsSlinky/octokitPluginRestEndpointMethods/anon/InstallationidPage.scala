package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationidPage extends js.Object {
  var installation_id: Required = js.native
  var page: Type = js.native
  var per_page: Type = js.native
}

object InstallationidPage {
  @scala.inline
  def apply(installation_id: Required, page: Type, per_page: Type): InstallationidPage = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationidPage]
  }
  @scala.inline
  implicit class InstallationidPageOps[Self <: InstallationidPage] (val x: Self) extends AnyVal {
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
    def withPage(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPer_page(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

