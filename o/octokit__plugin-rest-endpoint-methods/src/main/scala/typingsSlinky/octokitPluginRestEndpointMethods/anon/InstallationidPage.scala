package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallationidPage extends js.Object {
  var installation_id: Required
  var page: Type
  var per_page: Type
}

object InstallationidPage {
  @scala.inline
  def apply(installation_id: Required, page: Type, per_page: Type): InstallationidPage = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationidPage]
  }
}

