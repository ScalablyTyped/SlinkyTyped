package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRecursive extends js.Object {
  var owner: AnonRequired = js.native
  var recursive: AnonEnum = js.native
  var repo: AnonRequired = js.native
  var tree_sha: AnonRequired = js.native
}

object AnonRecursive {
  @scala.inline
  def apply(owner: AnonRequired, recursive: AnonEnum, repo: AnonRequired, tree_sha: AnonRequired): AnonRecursive = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree_sha = tree_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecursive]
  }
  @scala.inline
  implicit class AnonRecursiveOps[Self <: AnonRecursive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursive(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree_sha(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree_sha")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

