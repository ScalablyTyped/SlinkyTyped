package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastreadatOwner extends js.Object {
  var last_read_at: Type
  var owner: Required
  var repo: Required
}

object LastreadatOwner {
  @scala.inline
  def apply(last_read_at: Type, owner: Required, repo: Required): LastreadatOwner = {
    val __obj = js.Dynamic.literal(last_read_at = last_read_at.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastreadatOwner]
  }
}

