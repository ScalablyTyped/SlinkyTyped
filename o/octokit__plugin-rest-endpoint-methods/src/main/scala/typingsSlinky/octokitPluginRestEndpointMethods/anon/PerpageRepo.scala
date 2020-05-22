package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerpageRepo extends js.Object {
  var issue_number: Required
  var number: Alias
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
}

object PerpageRepo {
  @scala.inline
  def apply(issue_number: Required, number: Alias, owner: Required, page: Type, per_page: Type, repo: Required): PerpageRepo = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpageRepo]
  }
}

