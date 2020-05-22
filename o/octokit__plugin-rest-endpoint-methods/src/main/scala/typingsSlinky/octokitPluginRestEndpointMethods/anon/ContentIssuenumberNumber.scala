package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentIssuenumberNumber extends js.Object {
  var content: Enum
  var issue_number: Required
  var number: Alias
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
}

object ContentIssuenumberNumber {
  @scala.inline
  def apply(
    content: Enum,
    issue_number: Required,
    number: Alias,
    owner: Required,
    page: Type,
    per_page: Type,
    repo: Required
  ): ContentIssuenumberNumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentIssuenumberNumber]
  }
}

