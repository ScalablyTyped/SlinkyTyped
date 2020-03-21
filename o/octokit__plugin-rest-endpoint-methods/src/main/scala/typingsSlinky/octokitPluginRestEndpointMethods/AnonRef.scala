package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRef extends js.Object {
  var owner: AnonRequired
  var ref: AnonRequired
  var repo: AnonRequired
  var sha: AnonRequired
}

object AnonRef {
  @scala.inline
  def apply(owner: AnonRequired, ref: AnonRequired, repo: AnonRequired, sha: AnonRequired): AnonRef = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRef]
  }
}

