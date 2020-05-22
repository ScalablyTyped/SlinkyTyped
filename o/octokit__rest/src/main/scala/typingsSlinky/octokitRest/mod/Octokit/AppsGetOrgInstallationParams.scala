package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsGetOrgInstallationParams extends js.Object {
  @JSName("org")
  var org_ : String
}

object AppsGetOrgInstallationParams {
  @scala.inline
  def apply(org_ : String): AppsGetOrgInstallationParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetOrgInstallationParams]
  }
}

