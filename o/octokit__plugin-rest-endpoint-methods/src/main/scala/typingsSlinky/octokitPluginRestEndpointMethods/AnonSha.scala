package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSha extends js.Object {
  var gist_id: AnonRequired
  var sha: AnonRequired
}

object AnonSha {
  @scala.inline
  def apply(gist_id: AnonRequired, sha: AnonRequired): AnonSha = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSha]
  }
}

