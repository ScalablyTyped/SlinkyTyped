package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadonly extends js.Object {
  var key: AnonRequired
  var owner: AnonRequired
  var read_only: AnonType
  var repo: AnonRequired
  var title: AnonType
}

object AnonReadonly {
  @scala.inline
  def apply(key: AnonRequired, owner: AnonRequired, read_only: AnonType, repo: AnonRequired, title: AnonType): AnonReadonly = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReadonly]
  }
}

