package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnerRepo extends js.Object {
  var body: Required
  var comment_id: Required
  var owner: Required
  var repo: Required
}

object OwnerRepo {
  @scala.inline
  def apply(body: Required, comment_id: Required, owner: Required, repo: Required): OwnerRepo = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerRepo]
  }
}

