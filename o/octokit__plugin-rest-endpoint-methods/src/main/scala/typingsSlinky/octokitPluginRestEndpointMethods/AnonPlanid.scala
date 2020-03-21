package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlanid extends js.Object {
  var direction: AnonEnum
  var page: AnonType
  var per_page: AnonType
  var plan_id: AnonRequired
  var sort: AnonEnum
}

object AnonPlanid {
  @scala.inline
  def apply(direction: AnonEnum, page: AnonType, per_page: AnonType, plan_id: AnonRequired, sort: AnonEnum): AnonPlanid = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], plan_id = plan_id.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPlanid]
  }
}

