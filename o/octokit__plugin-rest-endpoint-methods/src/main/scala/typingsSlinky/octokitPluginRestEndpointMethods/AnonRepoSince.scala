package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRepoSince extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var since: AnonType
}

object AnonRepoSince {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, since: AnonType): AnonRepoSince = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRepoSince]
  }
}

