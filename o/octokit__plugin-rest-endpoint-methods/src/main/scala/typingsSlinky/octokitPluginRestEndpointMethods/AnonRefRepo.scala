package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRefRepo extends js.Object {
  var owner: AnonRequired
  var ref: AnonType
  var repo: AnonRequired
}

object AnonRefRepo {
  @scala.inline
  def apply(owner: AnonRequired, ref: AnonType, repo: AnonRequired): AnonRefRepo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRefRepo]
  }
}

