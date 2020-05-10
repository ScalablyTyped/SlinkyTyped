package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentsForPullRequestOutput extends js.Object {
  /**
    * An array of comment objects on the pull request.
    */
  var commentsForPullRequestData: js.UndefOr[CommentsForPullRequestData] = js.native
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetCommentsForPullRequestOutput {
  @scala.inline
  def apply(): GetCommentsForPullRequestOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCommentsForPullRequestOutput]
  }
  @scala.inline
  implicit class GetCommentsForPullRequestOutputOps[Self <: GetCommentsForPullRequestOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentsForPullRequestData(value: CommentsForPullRequestData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsForPullRequestData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentsForPullRequestData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsForPullRequestData")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

