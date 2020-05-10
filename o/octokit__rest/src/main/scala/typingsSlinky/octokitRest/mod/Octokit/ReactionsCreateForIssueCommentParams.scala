package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.Plussign1
import typingsSlinky.octokitRest.octokitRestStrings.`-1`
import typingsSlinky.octokitRest.octokitRestStrings.confused
import typingsSlinky.octokitRest.octokitRestStrings.eyes
import typingsSlinky.octokitRest.octokitRestStrings.heart
import typingsSlinky.octokitRest.octokitRestStrings.hooray
import typingsSlinky.octokitRest.octokitRestStrings.laugh
import typingsSlinky.octokitRest.octokitRestStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactionsCreateForIssueCommentParams extends js.Object {
  var comment_id: Double = js.native
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the issue comment.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ReactionsCreateForIssueCommentParams {
  @scala.inline
  def apply(
    comment_id: Double,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    owner: String,
    repo: String
  ): ReactionsCreateForIssueCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForIssueCommentParams]
  }
  @scala.inline
  implicit class ReactionsCreateForIssueCommentParamsOps[Self <: ReactionsCreateForIssueCommentParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

