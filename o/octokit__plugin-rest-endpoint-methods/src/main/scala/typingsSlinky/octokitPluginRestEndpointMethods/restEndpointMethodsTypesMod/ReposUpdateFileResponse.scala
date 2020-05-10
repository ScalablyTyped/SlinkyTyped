package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateFileResponse extends js.Object {
  var commit: ReposUpdateFileResponseCommit = js.native
  var content: ReposUpdateFileResponseContent = js.native
}

object ReposUpdateFileResponse {
  @scala.inline
  def apply(commit: ReposUpdateFileResponseCommit, content: ReposUpdateFileResponseContent): ReposUpdateFileResponse = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateFileResponse]
  }
  @scala.inline
  implicit class ReposUpdateFileResponseOps[Self <: ReposUpdateFileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit(value: ReposUpdateFileResponseCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: ReposUpdateFileResponseContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

