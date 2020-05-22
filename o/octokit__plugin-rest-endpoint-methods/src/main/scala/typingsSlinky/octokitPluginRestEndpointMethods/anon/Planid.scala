package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Planid extends js.Object {
  var direction: Enum
  var page: Type
  var per_page: Type
  var plan_id: Required
  var sort: Enum
}

object Planid {
  @scala.inline
  def apply(direction: Enum, page: Type, per_page: Type, plan_id: Required, sort: Enum): Planid = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], plan_id = plan_id.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Planid]
  }
}

