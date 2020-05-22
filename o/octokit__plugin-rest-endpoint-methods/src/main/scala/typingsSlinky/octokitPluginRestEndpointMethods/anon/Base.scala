package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var base: Required
  var body: Type
  var draft: Type
  var head: Required
  var maintainer_can_modify: Type
  var owner: Required
  var repo: Required
  var title: Required
}

object Base {
  @scala.inline
  def apply(
    base: Required,
    body: Type,
    draft: Type,
    head: Required,
    maintainer_can_modify: Type,
    owner: Required,
    repo: Required,
    title: Required
  ): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], maintainer_can_modify = maintainer_can_modify.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

