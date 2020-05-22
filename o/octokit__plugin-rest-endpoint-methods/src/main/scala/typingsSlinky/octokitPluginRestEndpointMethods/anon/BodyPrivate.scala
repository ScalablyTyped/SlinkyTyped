package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyPrivate extends js.Object {
  var body: Required
  var `private`: Type
  var team_id: Required
  var title: Required
}

object BodyPrivate {
  @scala.inline
  def apply(body: Required, `private`: Type, team_id: Required, title: Required): BodyPrivate = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyPrivate]
  }
}

