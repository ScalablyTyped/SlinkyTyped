package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRepo extends js.Object {
  var body: AnonRequired
  var comment_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonOwnerRepo {
  @scala.inline
  def apply(body: AnonRequired, comment_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonOwnerRepo = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerRepo]
  }
}

