package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitOwner extends js.Object {
  var limit: EnumRequired
  var owner: Required
  var repo: Required
}

object LimitOwner {
  @scala.inline
  def apply(limit: EnumRequired, owner: Required, repo: Required): LimitOwner = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitOwner]
  }
}

