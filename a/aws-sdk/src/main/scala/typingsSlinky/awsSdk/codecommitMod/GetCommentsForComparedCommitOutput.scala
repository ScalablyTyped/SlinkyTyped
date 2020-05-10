package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentsForComparedCommitOutput extends js.Object {
  /**
    * A list of comment objects on the compared commit.
    */
  var commentsForComparedCommitData: js.UndefOr[CommentsForComparedCommitData] = js.native
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetCommentsForComparedCommitOutput {
  @scala.inline
  def apply(): GetCommentsForComparedCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCommentsForComparedCommitOutput]
  }
  @scala.inline
  implicit class GetCommentsForComparedCommitOutputOps[Self <: GetCommentsForComparedCommitOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentsForComparedCommitData(value: CommentsForComparedCommitData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsForComparedCommitData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentsForComparedCommitData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentsForComparedCommitData")(js.undefined)
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

