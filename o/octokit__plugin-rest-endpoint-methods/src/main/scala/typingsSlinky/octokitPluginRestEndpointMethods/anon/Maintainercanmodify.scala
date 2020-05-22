package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maintainercanmodify extends js.Object {
  var base: Type
  var body: Type
  var maintainer_can_modify: Type
  var number: Alias
  var owner: Required
  var pull_number: Required
  var repo: Required
  var state: Enum
  var title: Type
}

object Maintainercanmodify {
  @scala.inline
  def apply(
    base: Type,
    body: Type,
    maintainer_can_modify: Type,
    number: Alias,
    owner: Required,
    pull_number: Required,
    repo: Required,
    state: Enum,
    title: Type
  ): Maintainercanmodify = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], maintainer_can_modify = maintainer_can_modify.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maintainercanmodify]
  }
}

