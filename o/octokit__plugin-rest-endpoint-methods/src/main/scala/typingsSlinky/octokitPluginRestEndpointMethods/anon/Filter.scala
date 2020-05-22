package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var check_name: Type
  var check_suite_id: Required
  var filter: Enum
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
  var status: Enum
}

object Filter {
  @scala.inline
  def apply(
    check_name: Type,
    check_suite_id: Required,
    filter: Enum,
    owner: Required,
    page: Type,
    per_page: Type,
    repo: Required,
    status: Enum
  ): Filter = {
    val __obj = js.Dynamic.literal(check_name = check_name.asInstanceOf[js.Any], check_suite_id = check_suite_id.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

