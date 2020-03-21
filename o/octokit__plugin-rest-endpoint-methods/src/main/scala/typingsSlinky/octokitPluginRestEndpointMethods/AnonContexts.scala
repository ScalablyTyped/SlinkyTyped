package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContexts extends js.Object {
  var branch: AnonRequired
  var contexts: AnonMapTo
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonContexts {
  @scala.inline
  def apply(branch: AnonRequired, contexts: AnonMapTo, owner: AnonRequired, repo: AnonRequired): AnonContexts = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContexts]
  }
}

