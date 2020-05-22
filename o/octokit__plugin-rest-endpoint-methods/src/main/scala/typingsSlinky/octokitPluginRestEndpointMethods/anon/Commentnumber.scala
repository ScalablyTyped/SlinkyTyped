package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commentnumber extends js.Object {
  var comment_number: Required
  var content: EnumRequired
  var discussion_number: Required
  var team_id: Required
}

object Commentnumber {
  @scala.inline
  def apply(comment_number: Required, content: EnumRequired, discussion_number: Required, team_id: Required): Commentnumber = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commentnumber]
  }
}

