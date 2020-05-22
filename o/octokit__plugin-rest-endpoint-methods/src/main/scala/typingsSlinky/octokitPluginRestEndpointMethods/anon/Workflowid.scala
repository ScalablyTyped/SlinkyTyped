package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workflowid extends js.Object {
  var owner: Required
  var repo: Required
  var workflow_id: Required
}

object Workflowid {
  @scala.inline
  def apply(owner: Required, repo: Required, workflow_id: Required): Workflowid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workflowid]
  }
}

