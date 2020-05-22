package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnerPullnumber extends js.Object {
  var body: Required
  var comment_id: Required
  var owner: Required
  var pull_number: Required
  var repo: Required
}

object OwnerPullnumber {
  @scala.inline
  def apply(body: Required, comment_id: Required, owner: Required, pull_number: Required, repo: Required): OwnerPullnumber = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerPullnumber]
  }
}

