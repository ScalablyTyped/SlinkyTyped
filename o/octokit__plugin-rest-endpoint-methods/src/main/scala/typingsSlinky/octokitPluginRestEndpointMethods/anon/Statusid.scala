package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statusid extends js.Object {
  var deployment_id: Required
  var owner: Required
  var repo: Required
  var status_id: Required
}

object Statusid {
  @scala.inline
  def apply(deployment_id: Required, owner: Required, repo: Required, status_id: Required): Statusid = {
    val __obj = js.Dynamic.literal(deployment_id = deployment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status_id = status_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statusid]
  }
}

