package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draft extends js.Object {
  var base: Required
  var draft: Type
  var head: Required
  var issue: Required
  var maintainer_can_modify: Type
  var owner: Required
  var repo: Required
}

object Draft {
  @scala.inline
  def apply(
    base: Required,
    draft: Type,
    head: Required,
    issue: Required,
    maintainer_can_modify: Type,
    owner: Required,
    repo: Required
  ): Draft = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], maintainer_can_modify = maintainer_can_modify.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draft]
  }
}

