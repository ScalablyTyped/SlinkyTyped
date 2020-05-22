package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autoinactive extends js.Object {
  var auto_inactive: Type
  var deployment_id: Required
  var description: Type
  var environment: Enum
  var environment_url: Type
  var log_url: Type
  var owner: Required
  var repo: Required
  var state: EnumRequired
  var target_url: Type
}

object Autoinactive {
  @scala.inline
  def apply(
    auto_inactive: Type,
    deployment_id: Required,
    description: Type,
    environment: Enum,
    environment_url: Type,
    log_url: Type,
    owner: Required,
    repo: Required,
    state: EnumRequired,
    target_url: Type
  ): Autoinactive = {
    val __obj = js.Dynamic.literal(auto_inactive = auto_inactive.asInstanceOf[js.Any], deployment_id = deployment_id.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environment_url = environment_url.asInstanceOf[js.Any], log_url = log_url.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoinactive]
  }
}

