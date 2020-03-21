package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameOwner extends js.Object {
  var body: AnonType
  var name: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonNameOwner {
  @scala.inline
  def apply(body: AnonType, name: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonNameOwner = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameOwner]
  }
}

