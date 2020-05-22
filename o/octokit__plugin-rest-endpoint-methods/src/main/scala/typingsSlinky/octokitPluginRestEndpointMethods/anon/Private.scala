package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Private extends js.Object {
  var description: Type
  var name: Required
  var owner: Type
  var `private`: Type
  var template_owner: Required
  var template_repo: Required
}

object Private {
  @scala.inline
  def apply(
    description: Type,
    name: Required,
    owner: Type,
    `private`: Type,
    template_owner: Required,
    template_repo: Required
  ): Private = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], template_owner = template_owner.asInstanceOf[js.Any], template_repo = template_repo.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Private]
  }
}

