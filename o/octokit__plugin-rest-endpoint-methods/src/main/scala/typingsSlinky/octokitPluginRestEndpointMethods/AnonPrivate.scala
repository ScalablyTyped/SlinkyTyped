package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivate extends js.Object {
  var description: AnonType
  var name: AnonRequired
  var owner: AnonType
  var `private`: AnonType
  var template_owner: AnonRequired
  var template_repo: AnonRequired
}

object AnonPrivate {
  @scala.inline
  def apply(
    description: AnonType,
    name: AnonRequired,
    owner: AnonType,
    `private`: AnonType,
    template_owner: AnonRequired,
    template_repo: AnonRequired
  ): AnonPrivate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], template_owner = template_owner.asInstanceOf[js.Any], template_repo = template_repo.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrivate]
  }
}

