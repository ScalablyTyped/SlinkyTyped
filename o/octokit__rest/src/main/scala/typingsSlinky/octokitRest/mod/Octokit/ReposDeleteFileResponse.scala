package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposDeleteFileResponse extends js.Object {
  var commit: ReposDeleteFileResponseCommit = js.native
  var content: Null = js.native
}

object ReposDeleteFileResponse {
  @scala.inline
  def apply(commit: ReposDeleteFileResponseCommit, content: Null): ReposDeleteFileResponse = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteFileResponse]
  }
  @scala.inline
  implicit class ReposDeleteFileResponseOps[Self <: ReposDeleteFileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit(value: ReposDeleteFileResponseCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

