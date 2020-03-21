package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatusid extends js.Object {
  var deployment_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
  var status_id: AnonRequired
}

object AnonStatusid {
  @scala.inline
  def apply(deployment_id: AnonRequired, owner: AnonRequired, repo: AnonRequired, status_id: AnonRequired): AnonStatusid = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status_id = status_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStatusid]
  }
}

