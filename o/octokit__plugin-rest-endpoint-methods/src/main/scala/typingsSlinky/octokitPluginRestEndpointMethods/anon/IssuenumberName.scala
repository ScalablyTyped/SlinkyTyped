package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuenumberName extends js.Object {
  var issue_number: Required
  var name: Required
  var number: Alias
  var owner: Required
  var repo: Required
}

object IssuenumberName {
  @scala.inline
  def apply(issue_number: Required, name: Required, number: Alias, owner: Required, repo: Required): IssuenumberName = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuenumberName]
  }
}

