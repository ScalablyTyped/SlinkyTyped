package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHead extends js.Object {
  var base: Required
  var head: Required
  var owner: Required
  var repo: Required
}

object BaseHead {
  @scala.inline
  def apply(base: Required, head: Required, owner: Required, repo: Required): BaseHead = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHead]
  }
}

