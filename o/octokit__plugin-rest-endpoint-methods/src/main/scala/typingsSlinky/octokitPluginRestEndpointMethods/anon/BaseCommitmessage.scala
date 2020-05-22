package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCommitmessage extends js.Object {
  var base: Required
  var commit_message: Type
  var head: Required
  var owner: Required
  var repo: Required
}

object BaseCommitmessage {
  @scala.inline
  def apply(base: Required, commit_message: Type, head: Required, owner: Required, repo: Required): BaseCommitmessage = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], commit_message = commit_message.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCommitmessage]
  }
}

