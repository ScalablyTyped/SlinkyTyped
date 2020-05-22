package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strict extends js.Object {
  var branch: Required
  var contexts: Type
  var owner: Required
  var repo: Required
  var strict: Type
}

object Strict {
  @scala.inline
  def apply(branch: Required, contexts: Type, owner: Required, repo: Required, strict: Type): Strict = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strict]
  }
}

