package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Targeturl extends js.Object {
  var context: Type
  var description: Type
  var owner: Required
  var repo: Required
  var sha: Required
  var state: EnumRequired
  var target_url: Type
}

object Targeturl {
  @scala.inline
  def apply(
    context: Type,
    description: Type,
    owner: Required,
    repo: Required,
    sha: Required,
    state: EnumRequired,
    target_url: Type
  ): Targeturl = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targeturl]
  }
}

