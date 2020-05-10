package typingsSlinky.backlogJs.mod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostPullRequestCommentsParams extends js.Object {
  var content: String = js.native
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
}

object PostPullRequestCommentsParams {
  @scala.inline
  def apply(content: String): PostPullRequestCommentsParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostPullRequestCommentsParams]
  }
  @scala.inline
  implicit class PostPullRequestCommentsParamsOps[Self <: PostPullRequestCommentsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifiedUserId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifiedUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifiedUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifiedUserId")(js.undefined)
        ret
    }
  }
  
}

