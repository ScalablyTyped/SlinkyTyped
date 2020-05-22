package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerpageProjectid extends js.Object {
  var page: Type
  var per_page: Type
  var project_id: Required
}

object PerpageProjectid {
  @scala.inline
  def apply(page: Type, per_page: Type, project_id: Required): PerpageProjectid = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpageProjectid]
  }
}

