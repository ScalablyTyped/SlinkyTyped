package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currentname extends js.Object {
  var color: Type
  var current_name: Required
  var description: Type
  var name: Type
  var owner: Required
  var repo: Required
}

object Currentname {
  @scala.inline
  def apply(
    color: Type,
    current_name: Required,
    description: Type,
    name: Type,
    owner: Required,
    repo: Required
  ): Currentname = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], current_name = current_name.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentname]
  }
}

