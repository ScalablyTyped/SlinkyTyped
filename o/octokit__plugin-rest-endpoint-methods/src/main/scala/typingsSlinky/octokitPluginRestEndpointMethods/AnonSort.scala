package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSort extends js.Object {
  var direction: AnonEnum
  var page: AnonType
  var per_page: AnonType
  var sort: AnonEnum
  var username: AnonRequired
}

object AnonSort {
  @scala.inline
  def apply(direction: AnonEnum, page: AnonType, per_page: AnonType, sort: AnonEnum, username: AnonRequired): AnonSort = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSort]
  }
}

