package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitGetTreeResponse extends js.Object {
  var sha: String = js.native
  var tree: js.Array[GitGetTreeResponseTreeItem] = js.native
  var truncated: Boolean = js.native
  var url: String = js.native
}

object GitGetTreeResponse {
  @scala.inline
  def apply(sha: String, tree: js.Array[GitGetTreeResponseTreeItem], truncated: Boolean, url: String): GitGetTreeResponse = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTreeResponse]
  }
  @scala.inline
  implicit class GitGetTreeResponseOps[Self <: GitGetTreeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: js.Array[GitGetTreeResponseTreeItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

