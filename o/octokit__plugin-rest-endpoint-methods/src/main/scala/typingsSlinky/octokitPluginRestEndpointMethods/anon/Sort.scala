package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sort extends js.Object {
  var direction: Enum
  var page: Type
  var per_page: Type
  var sort: Enum
  var username: Required
}

object Sort {
  @scala.inline
  def apply(direction: Enum, page: Type, per_page: Type, sort: Enum, username: Required): Sort = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sort]
  }
}

