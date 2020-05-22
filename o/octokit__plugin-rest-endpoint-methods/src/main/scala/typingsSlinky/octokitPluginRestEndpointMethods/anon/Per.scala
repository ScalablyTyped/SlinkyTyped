package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Per extends js.Object {
  var owner: Required
  var per: Enum
  var repo: Required
}

object Per {
  @scala.inline
  def apply(owner: Required, per: Enum, repo: Required): Per = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], per = per.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Per]
  }
}

