package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPerpageProjectid extends js.Object {
  var page: AnonType
  var per_page: AnonType
  var project_id: AnonRequired
}

object AnonPerpageProjectid {
  @scala.inline
  def apply(page: AnonType, per_page: AnonType, project_id: AnonRequired): AnonPerpageProjectid = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPerpageProjectid]
  }
}

