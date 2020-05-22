package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuenumberNumber extends js.Object {
  var issue_number: Required
  var number: Alias
  var owner: Required
  var repo: Required
}

object IssuenumberNumber {
  @scala.inline
  def apply(issue_number: Required, number: Alias, owner: Required, repo: Required): IssuenumberNumber = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuenumberNumber]
  }
}

