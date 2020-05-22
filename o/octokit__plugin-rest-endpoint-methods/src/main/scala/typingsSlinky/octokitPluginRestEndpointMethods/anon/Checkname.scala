package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkname extends js.Object {
  var check_name: Type
  var filter: Enum
  var owner: Required
  var page: Type
  var per_page: Type
  var ref: Required
  var repo: Required
  var status: Enum
}

object Checkname {
  @scala.inline
  def apply(
    check_name: Type,
    filter: Enum,
    owner: Required,
    page: Type,
    per_page: Type,
    ref: Required,
    repo: Required,
    status: Enum
  ): Checkname = {
    val __obj = js.Dynamic.literal(check_name = check_name.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkname]
  }
}

