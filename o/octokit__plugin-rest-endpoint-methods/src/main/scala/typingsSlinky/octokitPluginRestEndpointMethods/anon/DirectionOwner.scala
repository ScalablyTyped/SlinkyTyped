package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionOwner extends js.Object {
  var direction: Enum
  var owner: Required
  var repo: Required
  var since: Type
  var sort: Enum
}

object DirectionOwner {
  @scala.inline
  def apply(direction: Enum, owner: Required, repo: Required, since: Type, sort: Enum): DirectionOwner = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionOwner]
  }
}

