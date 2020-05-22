package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assignee extends js.Object {
  var assignee: Required
  var owner: Required
  var repo: Required
}

object Assignee {
  @scala.inline
  def apply(assignee: Required, owner: Required, repo: Required): Assignee = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignee]
  }
}

