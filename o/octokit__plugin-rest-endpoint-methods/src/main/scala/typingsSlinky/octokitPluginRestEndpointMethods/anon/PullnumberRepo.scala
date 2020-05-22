package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullnumberRepo extends js.Object {
  var number: Alias
  var owner: Required
  var page: Type
  var per_page: Type
  var pull_number: Required
  var repo: Required
}

object PullnumberRepo {
  @scala.inline
  def apply(number: Alias, owner: Required, page: Type, per_page: Type, pull_number: Required, repo: Required): PullnumberRepo = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullnumberRepo]
  }
}

