package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentidOwner extends js.Object {
  var deployment_id: Required
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
}

object DeploymentidOwner {
  @scala.inline
  def apply(deployment_id: Required, owner: Required, page: Type, per_page: Type, repo: Required): DeploymentidOwner = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentidOwner]
  }
}

