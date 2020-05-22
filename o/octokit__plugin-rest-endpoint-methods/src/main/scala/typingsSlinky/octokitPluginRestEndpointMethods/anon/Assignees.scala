package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assignees extends js.Object {
  var assignees: Type
  var issue_number: Required
  var number: Alias
  var owner: Required
  var repo: Required
}

object Assignees {
  @scala.inline
  def apply(assignees: Type, issue_number: Required, number: Alias, owner: Required, repo: Required): Assignees = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignees]
  }
}

