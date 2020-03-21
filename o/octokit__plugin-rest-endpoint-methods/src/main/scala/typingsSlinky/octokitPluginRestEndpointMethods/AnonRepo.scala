package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRepo extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonRepo {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired): AnonRepo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRepo]
  }
}

