package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBranchOwner extends js.Object {
  var branch: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonBranchOwner {
  @scala.inline
  def apply(branch: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonBranchOwner = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBranchOwner]
  }
}

