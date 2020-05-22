package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckrunidOwner extends js.Object {
  var check_run_id: Required
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
}

object CheckrunidOwner {
  @scala.inline
  def apply(check_run_id: Required, owner: Required, page: Type, per_page: Type, repo: Required): CheckrunidOwner = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckrunidOwner]
  }
}

