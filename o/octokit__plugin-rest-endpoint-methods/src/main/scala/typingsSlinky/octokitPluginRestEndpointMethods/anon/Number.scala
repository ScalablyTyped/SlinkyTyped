package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  var body: Required
  var issue_number: Required
  var number: Alias
  var owner: Required
  var repo: Required
}

object Number {
  @scala.inline
  def apply(body: Required, issue_number: Required, number: Alias, owner: Required, repo: Required): Number = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
}

