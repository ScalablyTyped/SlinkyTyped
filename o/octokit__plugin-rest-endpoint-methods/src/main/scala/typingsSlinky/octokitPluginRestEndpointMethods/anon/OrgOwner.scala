package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgOwner extends js.Object {
  @JSName("org")
  var org_ : Required
  var owner: Required
  var permission: Enum
  var repo: Required
  var team_slug: Required
}

object OrgOwner {
  @scala.inline
  def apply(org_ : Required, owner: Required, permission: Enum, repo: Required, team_slug: Required): OrgOwner = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgOwner]
  }
}

