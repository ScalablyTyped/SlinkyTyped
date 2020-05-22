package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCheckPublicMembershipParams extends js.Object {
  @JSName("org")
  var org_ : String
  var username: String
}

object OrgsCheckPublicMembershipParams {
  @scala.inline
  def apply(org_ : String, username: String): OrgsCheckPublicMembershipParams = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCheckPublicMembershipParams]
  }
}

