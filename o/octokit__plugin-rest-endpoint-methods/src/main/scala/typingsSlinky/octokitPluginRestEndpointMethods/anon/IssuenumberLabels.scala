package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuenumberLabels extends js.Object {
  var issue_number: Required
  var labels: Type
  var number: Alias
  var owner: Required
  var repo: Required
}

object IssuenumberLabels {
  @scala.inline
  def apply(issue_number: Required, labels: Type, number: Alias, owner: Required, repo: Required): IssuenumberLabels = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuenumberLabels]
  }
}

