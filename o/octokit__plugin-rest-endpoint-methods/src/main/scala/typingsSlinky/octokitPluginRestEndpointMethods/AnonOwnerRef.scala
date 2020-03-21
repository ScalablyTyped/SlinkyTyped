package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRef extends js.Object {
  var owner: AnonRequired
  var ref: AnonRequired
  var repo: AnonRequired
}

object AnonOwnerRef {
  @scala.inline
  def apply(owner: AnonRequired, ref: AnonRequired, repo: AnonRequired): AnonOwnerRef = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerRef]
  }
}

