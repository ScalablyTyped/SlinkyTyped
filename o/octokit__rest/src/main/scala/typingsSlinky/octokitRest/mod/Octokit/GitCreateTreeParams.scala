package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCreateTreeParams extends js.Object {
  /**
    * The SHA1 of the tree you want to update with new data. If you don't set this, the commit will be created on top of everything; however, it will only contain your change, the rest of your files will show up as deleted.
    */
  var base_tree: js.UndefOr[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * Objects (of `path`, `mode`, `type`, and `sha`) specifying a tree structure.
    */
  var tree: js.Array[GitCreateTreeParamsTree] = js.native
}

object GitCreateTreeParams {
  @scala.inline
  def apply(owner: String, repo: String, tree: js.Array[GitCreateTreeParamsTree]): GitCreateTreeParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTreeParams]
  }
  @scala.inline
  implicit class GitCreateTreeParamsOps[Self <: GitCreateTreeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: js.Array[GitCreateTreeParamsTree]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase_tree(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase_tree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_tree")(js.undefined)
        ret
    }
  }
  
}

