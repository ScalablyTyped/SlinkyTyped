package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var owner: AnonRequired
  var path: AnonRequired
  var ref: AnonType
  var repo: AnonRequired
}

object AnonPath {
  @scala.inline
  def apply(owner: AnonRequired, path: AnonRequired, ref: AnonType, repo: AnonRequired): AnonPath = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath]
  }
}

