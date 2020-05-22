package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentIssuenumber extends js.Object {
  var content: EnumRequired
  var issue_number: Required
  var number: Alias
  var owner: Required
  var repo: Required
}

object ContentIssuenumber {
  @scala.inline
  def apply(content: EnumRequired, issue_number: Required, number: Alias, owner: Required, repo: Required): ContentIssuenumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentIssuenumber]
  }
}

