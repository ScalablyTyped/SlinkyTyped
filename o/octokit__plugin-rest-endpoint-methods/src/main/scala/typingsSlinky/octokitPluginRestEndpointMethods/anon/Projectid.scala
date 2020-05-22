package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projectid extends js.Object {
  var name: Required
  var project_id: Required
}

object Projectid {
  @scala.inline
  def apply(name: Required, project_id: Required): Projectid = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projectid]
  }
}

