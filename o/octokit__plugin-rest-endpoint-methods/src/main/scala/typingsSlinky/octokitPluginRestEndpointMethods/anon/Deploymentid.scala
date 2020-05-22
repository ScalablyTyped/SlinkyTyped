package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deploymentid extends js.Object {
  var deployment_id: Required
  var owner: Required
  var repo: Required
}

object Deploymentid {
  @scala.inline
  def apply(deployment_id: Required, owner: Required, repo: Required): Deploymentid = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deploymentid]
  }
}

