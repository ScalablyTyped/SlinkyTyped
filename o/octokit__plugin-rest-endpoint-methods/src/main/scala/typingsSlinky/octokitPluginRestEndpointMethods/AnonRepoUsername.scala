package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRepoUsername extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var username: AnonRequired
}

object AnonRepoUsername {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, username: AnonRequired): AnonRepoUsername = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRepoUsername]
  }
}

