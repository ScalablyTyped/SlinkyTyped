package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var environment: Type
  var owner: Required
  var page: Type
  var per_page: Type
  var ref: Type
  var repo: Required
  var sha: Type
  var task: Type
}

object Environment {
  @scala.inline
  def apply(
    environment: Type,
    owner: Required,
    page: Type,
    per_page: Type,
    ref: Type,
    repo: Required,
    sha: Type,
    task: Type
  ): Environment = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
}

