package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMembershipInOrgParams extends js.Object {
  @JSName("org")
  var org_ : String
  var team_slug: String
  var username: String
}

object TeamsGetMembershipInOrgParams {
  @scala.inline
  def apply(org_ : String, team_slug: String, username: String): TeamsGetMembershipInOrgParams = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetMembershipInOrgParams]
  }
}

