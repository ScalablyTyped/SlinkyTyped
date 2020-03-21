package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeploymentidOwner extends js.Object {
  var deployment_id: AnonRequired
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
}

object AnonDeploymentidOwner {
  @scala.inline
  def apply(
    deployment_id: AnonRequired,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    repo: AnonRequired
  ): AnonDeploymentidOwner = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeploymentidOwner]
  }
}

