package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamslugTitle extends js.Object {
  var body: Type
  var discussion_number: Required
  @JSName("org")
  var org_ : Required
  var team_slug: Required
  var title: Type
}

object TeamslugTitle {
  @scala.inline
  def apply(body: Type, discussion_number: Required, org_ : Required, team_slug: Required, title: Type): TeamslugTitle = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamslugTitle]
  }
}

