package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyOrg extends js.Object {
  var body: Required
  @JSName("org")
  var org_ : Required
  var `private`: Type
  var team_slug: Required
  var title: Required
}

object BodyOrg {
  @scala.inline
  def apply(body: Required, org_ : Required, `private`: Type, team_slug: Required, title: Required): BodyOrg = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyOrg]
  }
}

