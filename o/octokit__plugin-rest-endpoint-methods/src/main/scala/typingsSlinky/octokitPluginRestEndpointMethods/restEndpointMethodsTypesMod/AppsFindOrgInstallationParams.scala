package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsFindOrgInstallationParams extends js.Object {
  @JSName("org")
  var org_ : String
}

object AppsFindOrgInstallationParams {
  @scala.inline
  def apply(org_ : String): AppsFindOrgInstallationParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsFindOrgInstallationParams]
  }
}

