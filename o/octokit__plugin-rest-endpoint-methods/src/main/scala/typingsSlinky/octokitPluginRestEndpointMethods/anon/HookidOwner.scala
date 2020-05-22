package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookidOwner extends js.Object {
  var hook_id: Required
  var owner: Required
  var repo: Required
}

object HookidOwner {
  @scala.inline
  def apply(hook_id: Required, owner: Required, repo: Required): HookidOwner = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookidOwner]
  }
}

