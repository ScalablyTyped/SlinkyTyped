package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchOwner extends js.Object {
  var branch: Required
  var owner: Required
  var repo: Required
}

object BranchOwner {
  @scala.inline
  def apply(branch: Required, owner: Required, repo: Required): BranchOwner = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchOwner]
  }
}

