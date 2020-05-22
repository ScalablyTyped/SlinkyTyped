package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Affiliation extends js.Object {
  var affiliation: Enum
  var page: Type
  var per_page: Type
  var project_id: Required
}

object Affiliation {
  @scala.inline
  def apply(affiliation: Enum, page: Type, per_page: Type, project_id: Required): Affiliation = {
    val __obj = js.Dynamic.literal(affiliation = affiliation.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affiliation]
  }
}

