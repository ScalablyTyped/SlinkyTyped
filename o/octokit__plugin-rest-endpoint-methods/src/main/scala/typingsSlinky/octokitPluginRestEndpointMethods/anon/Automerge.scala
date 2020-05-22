package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Automerge extends js.Object {
  var auto_merge: Type
  var description: Type
  var environment: Type
  var owner: Required
  var payload: Type
  var production_environment: Type
  var ref: Required
  var repo: Required
  var required_contexts: Type
  var task: Type
  var transient_environment: Type
}

object Automerge {
  @scala.inline
  def apply(
    auto_merge: Type,
    description: Type,
    environment: Type,
    owner: Required,
    payload: Type,
    production_environment: Type,
    ref: Required,
    repo: Required,
    required_contexts: Type,
    task: Type,
    transient_environment: Type
  ): Automerge = {
    val __obj = js.Dynamic.literal(auto_merge = auto_merge.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], production_environment = production_environment.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], required_contexts = required_contexts.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], transient_environment = transient_environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automerge]
  }
}

